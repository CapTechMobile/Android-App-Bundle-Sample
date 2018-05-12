package examples.android.captech.traveldestinationsapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import examples.android.captech.traveldestinationsapp.R;
import examples.android.captech.traveldestinationsapp.adapter.HomeRecyclerAdapter;
import examples.android.captech.traveldestinationsapp.adapter.HorizontalDividerDecoration;
import examples.android.captech.traveldestinationsapp.application.TravelDestinationsApplication;

public class HomeActivity extends AppCompatActivity implements HomeRecyclerAdapter.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        RecyclerView homeRecyclerView = findViewById(R.id.homeRecyclerView);

        HomeRecyclerAdapter homeRecyclerAdapter = new HomeRecyclerAdapter(getApplicationContext(), this,
                ((TravelDestinationsApplication)getApplication()).getAppModel().getDestinatations());
        homeRecyclerView.setAdapter(homeRecyclerAdapter);
        homeRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        homeRecyclerView.addItemDecoration(new HorizontalDividerDecoration(this, R.color.colorPrimaryDark));

        getSupportActionBar().setTitle("Travel Destinations");
    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(this, DestinationActivity.class);
        intent.putExtra(DestinationActivity.destination_extra, position);
        startActivity(intent);
    }

}
