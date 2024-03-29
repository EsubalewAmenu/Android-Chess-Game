package rise.android.chess_app.puzzle;

import rise.android.chess_app.HtmlActivity;
import rise.android.chess_app.MyBaseActivity;
import rise.android.chess_app.R;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.*;
import android.content.SharedPreferences;

public class puzzle extends MyBaseActivity {
	
    /** instances for the view and game of chess **/
	private ChessViewPuzzle _chessView;
    public static final String TAG = "puzzle";

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.puzzle);

        this.makeActionOverflowMenuShown();

        _chessView = new ChessViewPuzzle(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.puzzle_topmenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        Intent intent;
        switch (item.getItemId()) {
            case R.id.action_help:
                intent = new Intent();
                intent.setClass(puzzle.this, HtmlActivity.class);
                intent.putExtra(HtmlActivity.HELP_MODE, "help_puzzle");
                startActivity(intent);
                return true;
            case R.id.action_prefs:
                intent = new Intent();
                intent.setClass(puzzle.this, puzzlePrefs.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
	/**
	 * 
	 */
    @Override
    protected void onResume() {
        
    	Log.i("puzzle", "onResume");
    	
		SharedPreferences prefs = this.getPrefs();

        _chessView.OnResume(prefs);
        _chessView.updateState();
	
        super.onResume();
        //
    }


    @Override
    protected void onPause() {
        
        SharedPreferences.Editor editor = this.getPrefs().edit();
        _chessView.OnPause(editor);

        editor.commit();
        
        super.onPause();
    }
    @Override
    protected void onDestroy(){
    	_chessView.OnDestroy();
    	super.onDestroy();
    }

    public void flipBoard(){
    	_chessView.flipBoard();
    }
}