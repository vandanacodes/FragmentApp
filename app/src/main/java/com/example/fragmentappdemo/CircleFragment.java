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

public class CircleFragment extends Fragment {
 EditText editTextRadius;
 Button buttonCircleArea;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //load the UI Xml layout of fragment using inflator
        View fragmentView = inflater.inflate(R.layout.fragment_circle_layout , container , false);
        editTextRadius = fragmentView.findViewById(R.id.editTextRadius);
        buttonCircleArea = fragmentView.findViewById(R.id.buttonCircleArea);
        buttonCircleArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = editTextRadius.getText().toString();
                float radius = Float.parseFloat(str1);
                float area = 3.141f * radius*radius;

                Toast.makeText(getContext(), "Area of Circle =" +area, Toast.LENGTH_SHORT).show();

                //get object ref of Hosting activity of this fragment. It is MainActivity here
                MainActivity  activity = (MainActivity) getActivity();
                activity.setAreaResult("AreaOfCircle="+area);
            }
        });
        return fragmentView;

    }
}
