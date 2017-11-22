package com.example.andres.restaurante;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TabHost;
import android.content.res.Resources;


public class PedidosFragment extends Fragment {

    View view;

    Button btnAcerca;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.pedidos_fragment, container, false);
        Resources res=getResources();


        TabHost tabs=(TabHost)view.findViewById(R.id.tabHost);
        tabs.setup();

        TabHost.TabSpec spec=tabs.newTabSpec("tab1");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Pedidos", res.getDrawable(R.drawable.ic_menu_camera));
        tabs.addTab(spec);

        spec=tabs.newTabSpec("tab2");
        spec.setContent(R.id.tab2);
         spec.setIndicator("Menu", res.getDrawable(R.drawable.ic_menu_camera));
        tabs.addTab(spec);

        spec=tabs.newTabSpec("tab3");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Otros", res.getDrawable(R.drawable.ic_menu_camera));
        tabs.addTab(spec);


        btnAcerca=(Button)view.findViewById(R.id.btnAcercaDe);

    return view;
    }



}
