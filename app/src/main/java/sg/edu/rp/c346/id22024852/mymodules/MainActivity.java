package sg.edu.rp.c346.id22024852.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvMod1;
    TextView tvMod2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMod1 = findViewById(R.id.textViewC346);
        tvMod2 = findViewById(R.id.textViewC203);

        tvMod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleActivity1.class);
                intent.putExtra("value", "Module Name: C346 \n" +
                        "Academic Year: 2020 \n" +
                        "Semester: 1 \n" +
                        "Module Credit: 4 \n" +
                        "Venue: W66M");
                startActivity(intent);
            }
        });

        tvMod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleActivity2.class);
                intent.putExtra("value", "Module Name: C203 \n" +
                        "Academic Year: 2023 \n" +
                        "Semester: 2 \n" +
                        "Module Credit: 4 \n" +
                        "Venue: W66M");
                startActivity(intent);
            }
        });

    }

}