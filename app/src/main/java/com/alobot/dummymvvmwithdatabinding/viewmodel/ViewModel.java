package com.alobot.dummymvvmwithdatabinding.viewmodel;

public interface ViewModel {
    void onCreate();

    void onPause();

    void onResume();

    void onDestroy();
}