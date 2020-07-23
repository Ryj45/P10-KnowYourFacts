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
public class frag2 extends Fragment {

    Button btnChange;
    LinearLayout ll2;

    public frag2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_frag2, container, false);
        btnChange = v.findViewById(R.id.btnChangeColor2);
        ll2 = v.findViewById(R.id.ll2);

        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ll2.setBackgroundColor(Color.parseColor("#EFE9DB"));
            }
        });

        return inflater.inflate(R.layout.fragment_frag2, container, false);
    }
}
