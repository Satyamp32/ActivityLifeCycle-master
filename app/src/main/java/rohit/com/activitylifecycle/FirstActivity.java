package rohit.com.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = "FirstActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Log.d(TAG, "onCreate: Called");

        Button mGotoNextButton = findViewById(R.id.button_goto_next);
        mGotoNextButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId()== R.id.button_goto_next){
            Intent mGotoNextIntent = new Intent(this, SecondActivity.class);
            startActivity(mGotoNextIntent);
        }

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: Called");
    }
}
