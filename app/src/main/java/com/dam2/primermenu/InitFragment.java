package com.dam2.primermenu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class InitFragment extends Fragment {
    View view;
    Button btnAbrir;
    TextView txtPrueba;
    public InitFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_init, container, false);
        getActivity().setTitle("Inicio");
        view.findViewById(R.id.txtprueba);
        view.findViewById(R.id.btnAbrir).setOnClickListener(e -> {
            txtPrueba.setText("funciona");
        });
        return view;
    }



}