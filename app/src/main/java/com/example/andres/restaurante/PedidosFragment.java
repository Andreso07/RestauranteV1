package com.example.andres.restaurante;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class PedidosFragment extends Fragment {


    private final int[] BOTONESMENU={R.id.tIPedido, R.id.tIMenu, R.id.tIMesa, R.id.tIOtro};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.pedidos_fragment, container, false);

    }


}
