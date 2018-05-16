package examples.android.captech.traveldestinationsapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.tasks.OnFailureListener;
import com.google.android.play.core.tasks.OnSuccessListener;

import examples.android.captech.traveldestinationsapp.R;
import examples.android.captech.traveldestinationsapp.adapter.HomeRecyclerAdapter;
import examples.android.captech.traveldestinationsapp.adapter.HorizontalDividerDecoration;
import examples.android.captech.traveldestinationsapp.application.TravelDestinationsApplication;

public class HomeActivity extends AppCompatActivity implements HomeRecyclerAdapter.OnItemClickListener {

    private SplitInstallManager splitInstallManager = null;

    private RecyclerView homeRecyclerView;
    private View loadingLayout;
    private View loadingErrorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Creates an instance of SplitInstallManager for the dynamic feature module
        splitInstallManager =
                SplitInstallManagerFactory.create(getApplicationContext());

        homeRecyclerView = findViewById(R.id.homeRecyclerView);
        loadingLayout = findViewById(R.id.loadingLayout);
        loadingErrorLayout = findViewById(R.id.loadingErrorLayout);

        HomeRecyclerAdapter homeRecyclerAdapter = new HomeRecyclerAdapter(getApplicationContext(), this,
                ((TravelDestinationsApplication)getApplication()).getAppModel().getDestinatations());
        homeRecyclerView.setAdapter(homeRecyclerAdapter);
        homeRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        homeRecyclerView.addItemDecoration(new HorizontalDividerDecoration(this, R.color.colorGray));

        getSupportActionBar().setTitle("Travel Destinations");
    }

    @Override
    public void onItemClick(final int position) {
        if (position == 16) {
            // Venice has been clicked, load the dynamic venice module

            // Creates a request to install the venice module
            SplitInstallRequest request =
                    SplitInstallRequest
                            .newBuilder()
                            // You can download multiple on demand modules per
                            // request by invoking the following method for each
                            // module you want to install.
                            .addModule("venice")
                            .build();

            // We are about to install the module; show progress indicator
            showLoadingFeature();

            splitInstallManager
                    .startInstall(request)
                    .addOnSuccessListener(new OnSuccessListener<Integer>() {
                        @Override
                        public void onSuccess(Integer integer) {
                            // Successful download; navigate to the Venice destination
                            hideLoadingFeature();
                            navigateToVenice(position);
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(Exception e) {
                            // Failed download; let the user know
                            showLoadingFeatureError();
                        }
                    });
        } else {
            Intent intent = new Intent(this, DestinationActivity.class);
            intent.putExtra(DestinationActivity.destination_extra, position);
            startActivity(intent);
        }
    }

    private void navigateToVenice(int position) {
        Intent intent = new Intent().setClassName(getPackageName(), "examples.android.captech.venice.activity.VeniceDestinationActivity");
        intent.putExtra("destination_extra", position);
        startActivity(intent);
    }

    private void showLoadingFeature() {
        homeRecyclerView.setVisibility(View.GONE);
        loadingLayout.setVisibility(View.VISIBLE);
        loadingErrorLayout.setVisibility(View.GONE);
    }

    private void showLoadingFeatureError() {
        homeRecyclerView.setVisibility(View.GONE);
        loadingLayout.setVisibility(View.GONE);
        loadingErrorLayout.setVisibility(View.VISIBLE);
    }

    private void hideLoadingFeature() {
        homeRecyclerView.setVisibility(View.VISIBLE);
        loadingLayout.setVisibility(View.GONE);
        loadingErrorLayout.setVisibility(View.GONE);
    }

}
