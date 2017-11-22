package com.example.andres.restaurante;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class AcercaDe extends Fragment {


    public AcercaDe() {
        // Required empty public constructor
    }

    private FragmentActivity fragmentActivity;
    View view;

    Button btnAcercaDe;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_acerca_de, container, false);

        btnAcercaDe = (Button) view.findViewById(R.id.btnSalir);

        return view;
    }

    public void salir(View view){
        fragmentActivity.finish();}


}
