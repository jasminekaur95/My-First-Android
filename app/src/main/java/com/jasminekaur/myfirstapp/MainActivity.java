package com.jasminekaur.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.jasminekaur.myfirstapp.MESSAGE";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        EditText editText = (EditText) findViewById(R.id.editText2);

        String message = editText.getText().toString();

        Intent intent = new Intent(this, DisplayMessageActivity.class);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

        Log.d("TEST", "This is a log!");

    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
