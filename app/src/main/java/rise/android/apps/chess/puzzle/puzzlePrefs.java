package rise.android.chess.puzzle;

import android.os.Bundle;

import rise.android.chess.MyPreferenceActivity;
import rise.android.chess.R;

public class puzzlePrefs extends MyPreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.puzzleprefs);

    }
}

