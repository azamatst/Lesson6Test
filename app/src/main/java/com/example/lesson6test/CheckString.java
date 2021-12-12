package com.example.lesson6test;

import android.content.Context;

public class CheckString {

    Context context;

    public CheckString(Context context) {
        this.context = context;
    }

    public boolean checkUrl(String url){
        return url.equals(context.getString(R.string.url));
    }
}
