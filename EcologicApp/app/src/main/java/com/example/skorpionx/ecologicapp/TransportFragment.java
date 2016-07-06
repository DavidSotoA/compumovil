package com.example.skorpionx.ecologicapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class TransportFragment extends Fragment {
    final static String TAG="TransportFragment";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Get the view from fragmenttab1.xml
        View view = inflater.inflate(R.layout.fragment_transport, container, false);
        RadioGroup rdgGrupo = (RadioGroup) view.findViewById(R.id.rdgGrupo);



        rdgGrupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.extra) {
                    Log.d(TAG,"extra");
                } else if (checkedId == R.id.premium) {
                    Log.d(TAG,"premium");
                } else if (checkedId == R.id.diesel) {
                    Log.d(TAG,"diesel");
                }else if (checkedId == R.id.corriente){
                    Log.d(TAG,"corriente");
                }

            }

        });
        return view;
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.extra:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.premium:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.diesel:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.corriente:
                if (checked)
                    // Ninjas rule
                    break;
        }
    }
}
