package com.appcrops.fragmentsample;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Fragment1 extends Fragment {
    private OnFragment1Listener mListener;

    public Fragment1() {
        // Required empty public constructor
        super();
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment1, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button showFrag2Btn = (Button) getActivity().findViewById(R.id.show_fragment2);
        if (getActivity() instanceof OnFragment1Listener) {
            mListener = (OnFragment1Listener)getActivity();
        }
        showFrag2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mListener != null) {
                    mListener.showItem(0);
                }
            }
        });
    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    public interface OnFragment1Listener {
        // TODO: Update argument type and name
        void showItem(int id);
    }

}
