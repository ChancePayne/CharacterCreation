package com.lambdaschool.charactercreation;

import android.arch.lifecycle.MutableLiveData;

public class CharacterRepository {
    private static int[] data;

    public CharacterRepository() {
        data = new int[6];
    }

    public MutableLiveData<int[]> getData() {
        MutableLiveData<int[]> liveData = new MutableLiveData<>();
        liveData.setValue(data);
        return liveData;
    }

    public int[] updateData(int index, int value) {
        data[index] = value;
        return data;
    }
}
