package com.app.samplecrudgreendao.home;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.app.samplecrudgreendao.R;
import com.app.samplecrudgreendao.create.CreateActivity;
import com.app.samplecrudgreendao.utils.database.TblPengeluaran;

import butterknife.BindView;
public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.login)
    Button login;

    private static Button login_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login_button = (Button)findViewById(R.id.login);
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home=new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(home);
                finish();

            }
        });

    }
}
