package com.example.myfirstapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

            Button button = (Button) findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View View) {
                    EditText f = (EditText) findViewById(R.id.fetch);
                    TextView res = (TextView) findViewById(R.id.output);

                    int range = Integer.parseInt(f.getText().toString());
                    Random r = new Random();
                    int rand_no = r.nextInt(range - 0) + 0;
                    res.setText(rand_no + "");

                }

        });

    }
}
