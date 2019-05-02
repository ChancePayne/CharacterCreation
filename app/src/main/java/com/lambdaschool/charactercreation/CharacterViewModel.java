package com.lambdaschool.charactercreation;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class CharacterViewModel extends ViewModel {
    private MutableLiveData<int[]> data;
    private CharacterRepository    repository;

    public LiveData<int[]> getCharacter() {
        if (data == null) {
            loadData();
        }
        return data;
    }

    private void loadData() {
        repository = new CharacterRepository();
        data = repository.getData();
    }

    public void updateData(int index, int value) {
        data.setValue(repository.updateData(index, value));
    }
}
