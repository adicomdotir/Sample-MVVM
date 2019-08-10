package com.example.adicom.my_first_mvvm.viewmodel;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.adicom.my_first_mvvm.BR;
import com.example.adicom.my_first_mvvm.model.User;

/**
 * Created by adicom on 8/10/19.
 */

public class UserViewModel extends BaseObservable {
    private String name;
    private String phone;

    public UserViewModel(User user) {
        this.name = user.getName();
        this.phone = user.getPhone();
    }

    public UserViewModel(Context context) {}

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
