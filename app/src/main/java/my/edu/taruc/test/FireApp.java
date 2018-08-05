package my.edu.taruc.test;

import android.app.Application;
import com.firebase.client.Firebase;

/**
 * Created by User on 5/8/2018.
 */

public class FireApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
