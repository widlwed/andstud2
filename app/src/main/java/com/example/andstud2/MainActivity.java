package com.example.andstud2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        });
        Button btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity3.class);
            startActivity(intent);
        });
        Button btn3 = findViewById(R.id.button3);
        btn3.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity4.class);
            startActivity(intent);
        });
        Button btn4 = findViewById(R.id.button4);
        btn4.setOnClickListener(v -> {
            finish();
        });
    }
}