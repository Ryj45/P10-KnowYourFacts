package c347.rp.edu.sg.p10_knowyourfacts;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class frag1 extends Fragment {

     Button btnChange;
     LinearLayout ll1;

    public frag1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_frag1, container, false);
        btnChange = v.findViewById(R.id.btnChangeColor1);
        ll1 = v.findViewById(R.id.ll1);


        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ll1.setBackgroundColor(Color.parseColor("#E3EBB8"));
                Log.d("Change Color", "123456");
            }
        });

        return inflater.inflate(R.layout.fragment_frag1, container, false);
    }
}
