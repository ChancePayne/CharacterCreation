package com.lambdaschool.charactercreation;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.content.Context;

public class CharacterViewModel extends ViewModel {
    private MutableLiveData<int[]> data;
    private CharacterRepository    repository;

    public LiveData<int[]> getCharacter(Context context) {
        if (data == null) {
            loadData(context);
        }
        return data;
    }

    private void loadData(Context context) {
        repository = new CharacterRepository(context);
        data = repository.getData();
    }

    public void updateData(int index, int value) {
        data.setValue(repository.updateData(index, value));
    }
}
