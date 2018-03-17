package com.unidad3.gio.stylecheckbox;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    //declaro los componentes graficos; un edittext y dos chekbox
    EditText txtdos;
    CheckBox chbN,chbC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// busco los componentes y los asigno
     txtdos=(EditText)findViewById(R.id.txtdos);
     chbN=(CheckBox)findViewById(R.id.chbN);
     chbC=(CheckBox)findViewById(R.id.chbC);
//asignamos los eventos de los chek box
chbN.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
         if(chbN.isChecked()){
             txtdos.setTypeface(null,Typeface.BOLD);
         }
         else{
             txtdos.setTypeface(null,Typeface.NORMAL);
         }
    }
});
chbC.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        if (chbC.isChecked()){
            txtdos.setTypeface(null,Typeface.ITALIC);
        }
        else{
            txtdos.setTypeface(null,Typeface.NORMAL);
        }
    }
});


    }


}
