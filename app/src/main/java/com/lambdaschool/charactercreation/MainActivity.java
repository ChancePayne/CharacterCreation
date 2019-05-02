package com.lambdaschool.charactercreation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        populateImages();
    }

    private void populateImages() {
        // row 0 - hold
        ((ImageView)findViewById(R.id.image_0_1)).setImageDrawable(getDrawable(R.drawable.axe_t));
        ((ImageView)findViewById(R.id.image_0_2)).setImageDrawable(getDrawable(R.drawable.book_t));
        ((ImageView)findViewById(R.id.image_0_3)).setImageDrawable(getDrawable(R.drawable.dinner_t));
        ((ImageView)findViewById(R.id.image_0_4)).setImageDrawable(getDrawable(R.drawable.first_t));
        // row 1 - protect
        ((ImageView)findViewById(R.id.image_1_1)).setImageDrawable(getDrawable(R.drawable.armor_body_t));
        ((ImageView)findViewById(R.id.image_1_2)).setImageDrawable(getDrawable(R.drawable.armor_t));
        ((ImageView)findViewById(R.id.image_1_3)).setImageDrawable(getDrawable(R.drawable.hat_t));
        ((ImageView)findViewById(R.id.image_1_4)).setImageDrawable(getDrawable(R.drawable.helmet_t));
        // row 2 - goal
        ((ImageView)findViewById(R.id.image_2_1)).setImageDrawable(getDrawable(R.drawable.crown_t));
        ((ImageView)findViewById(R.id.image_2_2)).setImageDrawable(getDrawable(R.drawable.feathers_t));
        ((ImageView)findViewById(R.id.image_2_3)).setImageDrawable(getDrawable(R.drawable.gold_t));
        ((ImageView)findViewById(R.id.image_2_4)).setImageDrawable(getDrawable(R.drawable.heart_t));
        // row 3 - skill
        ((ImageView)findViewById(R.id.image_3_1)).setImageDrawable(getDrawable(R.drawable.target_t));
        ((ImageView)findViewById(R.id.image_3_2)).setImageDrawable(getDrawable(R.drawable.dialog_t));
        ((ImageView)findViewById(R.id.image_3_3)).setImageDrawable(getDrawable(R.drawable.war_t));
        ((ImageView)findViewById(R.id.image_3_4)).setImageDrawable(getDrawable(R.drawable.fix_t));
        // row 4 - food
        ((ImageView)findViewById(R.id.image_4_1)).setImageDrawable(getDrawable(R.drawable.food_t));
        ((ImageView)findViewById(R.id.image_4_2)).setImageDrawable(getDrawable(R.drawable.carrot_t));
        ((ImageView)findViewById(R.id.image_4_3)).setImageDrawable(getDrawable(R.drawable.beer_t));
        ((ImageView)findViewById(R.id.image_4_4)).setImageDrawable(getDrawable(R.drawable.lollipop_t));
        // row 5 - allegiance
        ((ImageView)findViewById(R.id.image_5_1)).setImageDrawable(getDrawable(R.drawable.baner_t));
        ((ImageView)findViewById(R.id.image_5_2)).setImageDrawable(getDrawable(R.drawable.flag_02_t));
        ((ImageView)findViewById(R.id.image_5_3)).setImageDrawable(getDrawable(R.drawable.flag_t));
        ((ImageView)findViewById(R.id.image_5_4)).setImageDrawable(getDrawable(R.drawable.portal_t));
    }
}
