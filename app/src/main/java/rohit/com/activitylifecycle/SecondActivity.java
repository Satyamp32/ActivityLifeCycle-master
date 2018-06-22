package rohit.com.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
         private Button mButtonGotoNext;
    private static final String TAG = "SecondActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(TAG, "onCreate: Called");

        mButtonGotoNext = findViewById(R.id.button_goto_next);
        mButtonGotoNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()== R.id.button_goto_next){
            Intent mGotoNextIntent = new Intent(this, FirstActivity.class);
            startActivity(mGotoNextIntent);
        }
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: Called" );
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: Called ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: Called ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: Called ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: Called ");
    }
}
