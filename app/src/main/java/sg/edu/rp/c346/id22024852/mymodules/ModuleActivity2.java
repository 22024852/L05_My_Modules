package sg.edu.rp.c346.id22024852.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ModuleActivity2 extends AppCompatActivity {

    TextView tvModule2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module2);

        tvModule2 = findViewById(R.id.textView2);
        String value = getIntent().getStringExtra("value");
        tvModule2.setText(value);

    }
}