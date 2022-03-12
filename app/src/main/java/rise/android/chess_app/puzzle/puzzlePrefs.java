package rise.android.chess_app.puzzle;

import android.os.Bundle;

import rise.android.chess_app.MyPreferenceActivity;
import rise.android.chess_app.R;

public class puzzlePrefs extends MyPreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.puzzleprefs);

    }
}

