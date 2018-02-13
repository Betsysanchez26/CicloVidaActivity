package com.example.betsysanchez.ciclovidaactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView salida;
    ArrayList<String> lista;
    ArrayAdapter<String> adap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista=new ArrayList<String>();
        lista.add("OnCreate()"+'\n'+"Recibe  una llamada cuabndo se crea la actividad por primera vez");
        lista.add("OnStart()"+'\n'+"Recibe una llamada justo antes de que la actividad se vuelva visible para el usuario");
        lista.add("OnResume()"+'\n'+"Recibe una llamada justo antes de que la actividad comience a interactiar con el usuario");
        lista.add("OnPause()"+'\n'+"Recibe una llamada cuando el sistema está a punto de reanudar otra actividad");
        lista.add("OnStop()"+'\n'+"Recibe una llamada cuando la actividad no está visible para el usuario");
        lista.add("OnDestroy()"+'\n'+"Recibe una llamada antes de que se destruya la actividad");
        adap=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,lista);
        salida=findViewById(R.id.list_view);
        salida.setAdapter(adap);



    }
}
