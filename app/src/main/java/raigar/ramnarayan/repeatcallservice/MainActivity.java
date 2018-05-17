package raigar.ramnarayan.repeatcallservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Intent intent = new Intent(MainActivity.this, TimerService.class);
        startService(intent);
        Log.v("MainActivity", "Created");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Intent intent = new Intent(MainActivity.this, TimerService.class);
        stopService(intent);
        Log.v("MainActivity", "Stopped");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Intent intent = new Intent(MainActivity.this, TimerService.class);
        stopService(intent);
        finish();
    }
}
