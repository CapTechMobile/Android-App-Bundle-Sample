package examples.android.captech.traveldestinationsapp.application;

import android.app.Application;

import examples.android.captech.traveldestinationsapp.model.AppModel;

public class TravelDestinationsApplication extends Application {

    private AppModel appModel;

    public AppModel getAppModel() {
        if (appModel == null) {
            appModel = new AppModel();
        }
        return appModel;
    }

}
