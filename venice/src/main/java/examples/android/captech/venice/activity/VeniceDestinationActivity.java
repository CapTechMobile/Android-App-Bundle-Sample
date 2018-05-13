package examples.android.captech.venice.activity;

import examples.android.captech.traveldestinationsapp.activity.DestinationActivity;
import examples.android.captech.traveldestinationsapp.model.DestinationModel;
import examples.android.captech.venice.R;

public class VeniceDestinationActivity extends DestinationActivity {

    public static final String destination_extra = "destination_extra";

    // Quick workaround necessary to demonstrate loading resources from this feature model
    @Override
    public DestinationModel onDestinationModelLoad(DestinationModel destinationModel) {
        destinationModel.setDestinationImageResourceIds(new int[]{R.drawable.venice_1,
                R.drawable.venice_2,
                R.drawable.venice_3});
        destinationModel.setDescriptionResourceId(R.string.venice_description);
        return destinationModel;
    }
}
