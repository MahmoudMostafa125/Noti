package com.silicon.noti;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {

    Button button;
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String token = FirebaseInstanceId.getInstance().getToken();
        mContext = this;

        // Log and toast
        String msg = getString(R.string.msg_token_fmt, token);
        Log.e("MSG", msg);
        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();


        button = findViewById(R.id.no);
      /*  button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });*/

        if (getIntent().getExtras() != null) {
            Log.e("sdsd", getIntent().getExtras().getString("message"));
        }
    }

}
