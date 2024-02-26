package com.example.renk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout arka_plan ;
    EditText birinci_text , ikinci_text , sonuc ;
    Button uygula ;

    CheckBox kirmizi_checkbox , mavi_checkbox , yesil_checkbox ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arka_plan = findViewById(R.id.bg);

        birinci_text = findViewById(R.id.k_ad);

        ikinci_text = findViewById(R.id.k_soyad);

        kirmizi_checkbox = findViewById(R.id.red);
        mavi_checkbox = findViewById(R.id.blue);
        yesil_checkbox = findViewById(R.id.green);



        sonuc = findViewById(R.id.output);

        sonuc.setEnabled(false);
        uygula = findViewById(R.id.button);
        uygula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ad=birinci_text.getText().toString();
                String soyad=ikinci_text.getText().toString();
                String cikti=ad+" "+soyad;
                sonuc.setText(cikti);
            }
        });

        kirmizi_checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    mavi_checkbox.setEnabled(false);
                    yesil_checkbox.setEnabled(false);
                    arka_plan.setBackground(new ColorDrawable(Color.RED));

                } else {
                    mavi_checkbox.setEnabled(true);
                    yesil_checkbox.setEnabled(true);
                    arka_plan.setBackground(new ColorDrawable(Color.WHITE));

                }
            }
        });

        mavi_checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    kirmizi_checkbox.setEnabled(false);
                    yesil_checkbox.setEnabled(false);
                    arka_plan.setBackground(new ColorDrawable(Color.BLUE));

                } else {
                    kirmizi_checkbox.setEnabled(true);
                    yesil_checkbox.setEnabled(true);
                    arka_plan.setBackground(new ColorDrawable(Color.WHITE));

                }
            }
        });

        yesil_checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    mavi_checkbox.setEnabled(false);
                    kirmizi_checkbox.setEnabled(false);
                    arka_plan.setBackground(new ColorDrawable(Color.GREEN));
                } else {
                    mavi_checkbox.setEnabled(true);
                    kirmizi_checkbox.setEnabled(true);
                    arka_plan.setBackground(new ColorDrawable(Color.WHITE));

                }
            }
        });

    }
}

