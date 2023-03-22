package com.example.calculadoradehoras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText HI, MI, HF, MF;
    TextView minuto, hora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        HI = findViewById(R.id.HI);
        MI = findViewById(R.id.MI);
        HF = findViewById(R.id.HF);
        MF = findViewById(R.id.MF);
        hora = findViewById(R.id.RH);
        minuto = findViewById(R.id.RM);

    }
    public void SOMA(View v){
        String hora1 = HI.getText().toString();
        int hora1int = Integer.parseInt(hora1);

        String hora2 = HF.getText().toString();
        int hora2int = Integer.parseInt(hora2);

        String minuto1 = MI.getText().toString();
        int minuto1int = Integer.parseInt(minuto1);

        String minuto2 = MF.getText().toString();
        int minuto2int = Integer.parseInt(minuto2);

        int RH = hora1int + hora2int;
        int RM = minuto1int + minuto2int;
        while (RM>59){
            RM -=60;
            RH++;
        }
        minuto.setText(RM+"");
        hora.setText(RH+"");

    }
    public void SUB(View v) {
        String hora1 = HI.getText().toString();
        int hora1int = Integer.parseInt(hora1);

        String hora2 = HF.getText().toString();
        int hora2int = Integer.parseInt(hora2);

        String minuto1 = MI.getText().toString();
        int minuto1int = Integer.parseInt(minuto1);

        String minuto2 = MF.getText().toString();
        int minuto2int = Integer.parseInt(minuto2);

       while (hora1int>0){
           hora1int--;
           minuto1int+=60;
       }
       while (hora2int>0){
           hora2int--;
           minuto2int+=60;
       }
       int RH = 0;
       int RM = minuto1int-minuto2int;

       if (minuto2int>minuto1int){
           RM = minuto2int-minuto1int;
       }
        while (RM>59){
            RM -=60;
            RH++;

        }


        minuto.setText(RM+"");
        hora.setText(RH+"");
    }
}