package com.example.test1;

import android.os.Bundle;
import android.util.Log;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    public static String avg= "heiheihei";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.d(avg,"onCreate()");
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.login), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d(avg,"执行了onStart方法");
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d(avg,"执行了onPause方法");
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d(avg,"执行了onResume方法");
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d(avg,"执行了onStop方法");
    }
    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d(avg,"执行了onRestart方法");
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d(avg,"执行了onDestroy方法");
    }
}