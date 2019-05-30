package com.example.alertapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SigninActivity extends AppCompatActivity {
    TextView textView, textView2;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        s = "big";
        final Intent intent = getIntent();

        textView = findViewById(R.id.signIn_btn);
        textView2 = findViewById(R.id.signIn_to_signUp_btn);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getBaseContext(),SignupActivity.class);
                startActivity(intent1);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (intent.getExtras().getString("check").equals("big")) {
                    Intent intent = new Intent(getBaseContext(), MainActivityBig.class);
                    startActivity(intent);
                } else if (intent.getExtras().getString("check").equals("small")){
                    Intent intent = new Intent(getBaseContext(), MainActivitySmall.class);
                    startActivity(intent);
                } else if (s.equals("big")) {
                    Toast.makeText(getBaseContext(),"회원가입을 먼저 해주세요.",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
