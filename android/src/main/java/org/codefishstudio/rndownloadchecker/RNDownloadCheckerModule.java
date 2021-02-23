package org.codefishstudio.rndownloadchecker;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RNDownloadCheckerModule extends ReactContextBaseJavaModule {

    public static final String RNDOWNLOAD_CHECKER = "RNDownloadChecker";
    private static ReactApplicationContext reactContext = null;


    public RNDownloadCheckerModule(ReactApplicationContext context) {
        super(context);
        reactContext = context;
    }

    @Override
    public String getName() {
        return RNDOWNLOAD_CHECKER;
    }


    @ReactMethod
    public boolean verifyInstallerId() {
        // A list with valid installers package name
        List<String> validInstallers = new ArrayList<>(Arrays.asList("com.android.vending", "com.google.android.feedback"));

        // The package name of the app that has installed your app
        final String installer = reactContext.getPackageManager().getInstallerPackageName(reactContext.getPackageName());

        // true if your app has been downloaded from Play Store
        return installer != null && validInstallers.contains(installer);
    }

}