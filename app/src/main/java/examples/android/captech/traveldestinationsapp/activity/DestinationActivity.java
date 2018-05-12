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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination);

        int destinationIndex = getIntent().getIntExtra(destination_extra, 0);

        DestinationModel destinationModel
                = ((TravelDestinationsApplication)getApplication()).getAppModel().getDestinatations()[destinationIndex];

        ViewPager cityImagesViewPager = findViewById(R.id.cityImagesViewPager);
        TextView cityTextView = findViewById(R.id.cityTextView);
        TextView continentTextView = findViewById(R.id.continentTextView);
        TextView languageTextView = findViewById(R.id.languageTextView);
        TextView populationAndAreaTextView = findViewById(R.id.populationAndAreaTextView);
        TextView densityTextView = findViewById(R.id.densityTextView);
        TextView descriptionTextView = findViewById(R.id.descriptionTextView);

        DestinationImagesViewPagerAdapter destinationImagesViewPagerAdapter
                = new DestinationImagesViewPagerAdapter(getApplicationContext(), destinationModel.getDestinationImageResourceIds());

        cityImagesViewPager.setAdapter(destinationImagesViewPagerAdapter);
        cityTextView.setText(destinationModel.getCity() + ", " + destinationModel.getCountry());
        continentTextView.setText("Continent: " + destinationModel.getContinent());
        languageTextView.setText("Language: " + destinationModel.getLanguage());
        populationAndAreaTextView.setText("Population: " + destinationModel.getPopulation() + ", Area: " + destinationModel.getArea());
        densityTextView.setText("Density: " + destinationModel.getDensity());
        descriptionTextView.setText(getApplicationContext().getString(destinationModel.getDescriptionResourceId()));

        getSupportActionBar().setTitle(destinationModel.getCity());
    }
}
