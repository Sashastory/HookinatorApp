package mobile.sashadev.firebaseapp;

import android.app.Application;

/**
 * Created by Александр on 04.06.2017.
 */

public class FirebaseApplication extends Application {

    private static FirebaseApplication myInstance;

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
