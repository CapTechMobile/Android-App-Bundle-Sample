package examples.android.captech.traveldestinationsapp.activity;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import examples.android.captech.traveldestinationsapp.R;
import examples.android.captech.traveldestinationsapp.adapter.DestinationImagesViewPagerAdapter;
import examples.android.captech.traveldestinationsapp.application.TravelDestinationsApplication;
import examples.android.captech.traveldestinationsapp.model.DestinationModel;

public class DestinationActivity extends AppCompatActivity {

    public static final String destination_extra = "destination_extra";

    private ViewPager cityImagesViewPager;
    private TextView cityTextView;
    private TextView countryTextView;
    private TextView continentTextView;
    private TextView languageTextView;
    private TextView populationTextView;
    private TextView densityTextView;
    private TextView descriptionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination);

        int destinationIndex = getIntent().getIntExtra(destination_extra, 0);

        DestinationModel destinationModel
                = ((TravelDestinationsApplication)getApplication()).getAppModel().getDestinatations()[destinationIndex];

        cityImagesViewPager = findViewById(R.id.cityImagesViewPager);
        cityTextView = findViewById(R.id.cityTextView);
        countryTextView = findViewById(R.id.countryTextView);
        continentTextView = findViewById(R.id.continentTextView);
        languageTextView = findViewById(R.id.languageTextView);
        populationTextView = findViewById(R.id.populationTextView);
        densityTextView = findViewById(R.id.densityTextView);
        descriptionTextView = findViewById(R.id.descriptionTextView);

        DestinationImagesViewPagerAdapter destinationImagesViewPagerAdapter
                = new DestinationImagesViewPagerAdapter(getApplicationContext(), destinationModel.getDestinationImageResourceIds());

        cityImagesViewPager.setAdapter(destinationImagesViewPagerAdapter);
        cityTextView.setText(destinationModel.getCity());
        countryTextView.setText(destinationModel.getCountry());
        continentTextView.setText(destinationModel.getContinent());
        languageTextView.setText(destinationModel.getLanguage());
        populationTextView.setText(destinationModel.getPopulation());
        densityTextView.setText(destinationModel.getDensity());
        descriptionTextView.setText(getApplicationContext().getString(destinationModel.getDescriptionResourceId()));

        getSupportActionBar().setTitle(destinationModel.getCity());
    }
}
