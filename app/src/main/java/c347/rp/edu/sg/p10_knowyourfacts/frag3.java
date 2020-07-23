package c347.rp.edu.sg.p10_knowyourfacts;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class frag3 extends Fragment {

    Button btnChange;
    LinearLayout ll3;

    public frag3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_frag3, container, false);
        btnChange = v.findViewById(R.id.btnChangeColor3);
        ll3 = v.findViewById(R.id.ll3);

        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ll3.setBackgroundColor(Color.parseColor("#EDB18B"));
            }
        });

        return inflater.inflate(R.layout.fragment_frag3, container, false);
    }
}
