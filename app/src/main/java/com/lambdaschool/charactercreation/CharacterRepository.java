package com.lambdaschool.charactercreation;

import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.content.SharedPreferences;

public class CharacterRepository {
    public static final String PREFS_KEY = "default";
    public static final String PREFS_DATA_KEY = "values";
    public static final String DEF_VALUE = "0,0,0,0,0,0";
    public static final int NUM_ROWS = 6;
    private int[] data;
    private Context context;

    public CharacterRepository(Context context) {
        data = new int[NUM_ROWS];
        this.context = context;
    }

    public MutableLiveData<int[]> getData() {
        MutableLiveData<int[]> liveData = new MutableLiveData<>();

        // retrieve data from storage (local database, network storage)
        data = readSharedPreferences();

        liveData.setValue(data);
        return liveData;
    }

    private int[] readSharedPreferences() {
        final SharedPreferences preferences = context.getSharedPreferences(PREFS_KEY, Context.MODE_PRIVATE);
        final String            valueString = preferences.getString(PREFS_DATA_KEY, DEF_VALUE);
        final String[]          values      = valueString.split(",");
        final int[] intValues = new int[NUM_ROWS];
        for(int i = 0; i < values.length; ++i) {
            intValues[i] = Integer.parseInt(values[i]);
        }
        return intValues;
    }

    public int[] updateData(int index, int value) {
        data[index] = value;

        // store data persistently (local database, network storage)
        storeSharedPreferences(data);

        return data;
    }

    private void storeSharedPreferences(int[] intValues) {
        final SharedPreferences preferences = context.getSharedPreferences(PREFS_KEY, Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = preferences.edit();

        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < intValues.length; ++i) {
            builder.append(intValues[i]).append(",");
        }
        builder.deleteCharAt(builder.length() - 1);

        editor.putString(PREFS_DATA_KEY, builder.toString());
        editor.apply();
    }
}
