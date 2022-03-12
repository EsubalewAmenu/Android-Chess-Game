package rise.android.chess_app;

import android.os.Bundle;

import rise.android.chess_app.R;

public class mainPrefs extends MyPreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.mainprefs);

    }
}

