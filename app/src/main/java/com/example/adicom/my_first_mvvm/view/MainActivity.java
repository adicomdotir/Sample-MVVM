package com.example.adicom.my_first_mvvm.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.adicom.my_first_mvvm.R;
import com.example.adicom.my_first_mvvm.databinding.ActivityMainBinding;
import com.example.adicom.my_first_mvvm.viewmodel.UserViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        UserViewModel userViewModel = UserViewModel()
    }
}
