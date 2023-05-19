package sg.edu.rp.c346.id22024852.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ModuleActivity1 extends AppCompatActivity {

    TextView tvModule1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module1);

        tvModule1 = findViewById(R.id.textView1);
        String value = getIntent().getStringExtra("value");
        tvModule1.setText(value);
    }
}