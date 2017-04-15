package com.example.alan.ipncard_alumno;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

/*Esta parte es correspondiente al proyecto de IPNCard, en especial lo que se desarrollo fue el perfil de usuario,
* cabe destacar que solo es el puro esqueleto, listo para conectar con WS, el resto de mi equipo hizo el catalogo, FAQ`s, contactanos
* y el login con BD*/


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();

        TabHost tabs=(TabHost)findViewById(android.R.id.tabhost);
        tabs.setup();

        TabHost.TabSpec spec=tabs.newTabSpec("mitab1");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Perfil");
        tabs.addTab(spec);

        spec=tabs.newTabSpec("mitab2");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Ajustes");
        tabs.addTab(spec);

        spec=tabs.newTabSpec("mitab3");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Historial");
        tabs.addTab(spec);

        tabs.setCurrentTab(0);
    }
}
