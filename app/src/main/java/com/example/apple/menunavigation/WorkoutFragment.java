package com.example.apple.menunavigation;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutFragment extends Fragment {


    public WorkoutFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_workout, container, false);
        Button one = (Button)rootView.findViewById(R.id.b1);
        final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.water);
        one.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp.start();
            }
        });
        Button two = (Button)rootView.findViewById(R.id.b2);
        two.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp.pause();
            }
        });

        Button AAA = (Button)rootView.findViewById(R.id.a1);
        final MediaPlayer mo = MediaPlayer.create(getActivity(), R.raw.fb);
        AAA.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mo.start();
            }
        });
        Button BBB = (Button)rootView.findViewById(R.id.a2);
        BBB.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mo.pause();
            }
        });

        // Inflate the layout for this fragment

        return rootView;
    }

}
