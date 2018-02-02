package com.example.lex.testcourse;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by lex on 2/3/18.
 */

public class SplashActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
