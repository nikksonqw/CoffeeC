package com.example.coffee.ui.sampledata;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class sampledataViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public sampledataViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Моё игнатьев алексей");
    }

    public LiveData<String> getText() {
        return mText;
    }
}