package com.example.fragmentappdemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.fragmentappdemo.databinding.ActivityMainBinding;

import java.text.BreakIterator;

public class rectangleFragment extends Fragment {
    EditText editTextLenghth , editTextBreadth;
    Button buttonRectArea;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View fragmentView = inflater.inflate(R.layout.fragment_rectangle_lauout , container , false);
       editTextBreadth = fragmentView.findViewById(R.id.editTextBreadth);
       editTextLenghth = fragmentView.findViewById(R.id.editTextLength);
       buttonRectArea = fragmentView.findViewById(R.id.buttonRectArea);
        buttonRectArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float len = Float.parseFloat(editTextLenghth.getText().toString());
                float bre = Float.parseFloat(editTextBreadth.getText().toString());
                float area = len*bre;
                Toast.makeText(getContext(), "Area oof Rectangle = "+area, Toast.LENGTH_SHORT).show();

                //get object ref of Hosting activity of this fragment. It is MainActivity here
                MainActivity  activity = (MainActivity) getActivity();
                activity.setAreaResult("Area of Rectangle="+area);
            }
        });

        return fragmentView;
    }
}
