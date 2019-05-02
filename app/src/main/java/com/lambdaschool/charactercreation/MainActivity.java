package com.lambdaschool.charactercreation;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView[][] images; // add this
    private int[] selected;

    private CharacterViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        images = new ImageView[4][6]; // add this
        selected = new int[6];

        populateImages();

        viewModel = ViewModelProviders.of(this).get(CharacterViewModel.class);
        viewModel.getCharacter(this).observe(this, new Observer<int[]>() {
            @Override
            public void onChanged(@Nullable int[] ints) {
                for(int i = 0; i < images.length; ++i) {
                    for(int j = 0; j < images[i].length; ++j) {
                        images[i][j].setBackgroundColor(Color.WHITE);
                    }
                }

                for(int n = 0; n < ints.length; ++n) {
                    if(ints[n] != 0) {
                        ((ImageView) findViewById(ints[n])).setBackgroundColor(Color.MAGENTA);
                    }
                }
            }
        });

    }

    private void populateImages() {
        // row 0 - hold
        images[0][0] = ((ImageView)findViewById(R.id.image_0_1));
        images[0][0].setImageDrawable(getDrawable(R.drawable.axe_t));
        images[0][0].setOnClickListener(this);

        images[1][0] = ((ImageView)findViewById(R.id.image_0_2));
        images[1][0].setImageDrawable(getDrawable(R.drawable.book_t));
        images[1][0].setOnClickListener(this);

        images[2][0] = ((ImageView)findViewById(R.id.image_0_3));
        images[2][0].setImageDrawable(getDrawable(R.drawable.dinner_t));
        images[2][0].setOnClickListener(this);

        images[3][0] = ((ImageView)findViewById(R.id.image_0_4));
        images[3][0].setImageDrawable(getDrawable(R.drawable.first_t));
        images[3][0].setOnClickListener(this);

        // row 1 - protect
        images[0][1] = ((ImageView)findViewById(R.id.image_1_1));
        images[0][1].setImageDrawable(getDrawable(R.drawable.armor_body_t));
        images[0][1].setOnClickListener(this);

        images[1][1] = ((ImageView)findViewById(R.id.image_1_2));
        images[1][1].setImageDrawable(getDrawable(R.drawable.armor_t));
        images[1][1].setOnClickListener(this);

        images[2][1] = ((ImageView)findViewById(R.id.image_1_3));
        images[2][1].setImageDrawable(getDrawable(R.drawable.hat_t));
        images[2][1].setOnClickListener(this);

        images[3][1] = ((ImageView)findViewById(R.id.image_1_4));
        images[3][1].setImageDrawable(getDrawable(R.drawable.helmet_t));
        images[3][1].setOnClickListener(this);

        // row 2 - goal
        images[0][2] = ((ImageView)findViewById(R.id.image_2_1));
        images[0][2].setImageDrawable(getDrawable(R.drawable.crown_t));
        images[0][2].setOnClickListener(this);

        images[1][2] = ((ImageView)findViewById(R.id.image_2_2));
        images[1][2].setImageDrawable(getDrawable(R.drawable.feathers_t));
        images[1][2].setOnClickListener(this);

        images[2][2] = ((ImageView)findViewById(R.id.image_2_3));
        images[2][2].setImageDrawable(getDrawable(R.drawable.gold_t));
        images[2][2].setOnClickListener(this);

        images[3][2] = ((ImageView)findViewById(R.id.image_2_4));
        images[3][2].setImageDrawable(getDrawable(R.drawable.heart_t));
        images[3][2].setOnClickListener(this);

        // row 3 - skill
        images[0][3] = ((ImageView)findViewById(R.id.image_3_1));
        images[0][3].setImageDrawable(getDrawable(R.drawable.target_t));
        images[0][3].setOnClickListener(this);

        images[1][3] = ((ImageView)findViewById(R.id.image_3_2));
        images[1][3].setImageDrawable(getDrawable(R.drawable.dialog_t));
        images[1][3].setOnClickListener(this);

        images[2][3] = ((ImageView)findViewById(R.id.image_3_3));
        images[2][3].setImageDrawable(getDrawable(R.drawable.war_t));
        images[2][3].setOnClickListener(this);

        images[3][3] = ((ImageView)findViewById(R.id.image_3_4));
        images[3][3].setImageDrawable(getDrawable(R.drawable.fix_t));
        images[3][3].setOnClickListener(this);

        // row 4 - food
        images[0][4] = ((ImageView)findViewById(R.id.image_4_1));
        images[0][4].setImageDrawable(getDrawable(R.drawable.food_t));
        images[0][4].setOnClickListener(this);

        images[1][4] = ((ImageView)findViewById(R.id.image_4_2));
        images[1][4].setImageDrawable(getDrawable(R.drawable.carrot_t));
        images[1][4].setOnClickListener(this);

        images[2][4] = ((ImageView)findViewById(R.id.image_4_3));
        images[2][4].setImageDrawable(getDrawable(R.drawable.beer_t));
        images[2][4].setOnClickListener(this);

        images[3][4] = ((ImageView)findViewById(R.id.image_4_4));
        images[3][4].setImageDrawable(getDrawable(R.drawable.lollipop_t));
        images[3][4].setOnClickListener(this);

        // row 5 - allegiance
        images[0][5] = ((ImageView)findViewById(R.id.image_5_1));
        images[0][5].setImageDrawable(getDrawable(R.drawable.baner_t));
        images[0][5].setOnClickListener(this);

        images[1][5] = ((ImageView)findViewById(R.id.image_5_2));
        images[1][5].setImageDrawable(getDrawable(R.drawable.flag_02_t));
        images[1][5].setOnClickListener(this);

        images[2][5] = ((ImageView)findViewById(R.id.image_5_3));
        images[2][5].setImageDrawable(getDrawable(R.drawable.flag_t));
        images[2][5].setOnClickListener(this);

        images[3][5] = ((ImageView)findViewById(R.id.image_5_4));
        images[3][5].setImageDrawable(getDrawable(R.drawable.portal_t));
        images[3][5].setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.image_0_1:
            case R.id.image_0_2:
            case R.id.image_0_3:
            case R.id.image_0_4:
//                selected[0] = v.getId();
                viewModel.updateData(0, v.getId());
                break;
            case R.id.image_1_1:
            case R.id.image_1_2:
            case R.id.image_1_3:
            case R.id.image_1_4:
//                selected[1] = v.getId();
                viewModel.updateData(1, v.getId());
                break;
            case R.id.image_2_1:
            case R.id.image_2_2:
            case R.id.image_2_3:
            case R.id.image_2_4:
//                selected[2] = v.getId();
                viewModel.updateData(2, v.getId());
                break;
            case R.id.image_3_1:
            case R.id.image_3_2:
            case R.id.image_3_3:
            case R.id.image_3_4:
//                selected[3] = v.getId();
                viewModel.updateData(3, v.getId());
                break;
            case R.id.image_4_1:
            case R.id.image_4_2:
            case R.id.image_4_3:
            case R.id.image_4_4:
//                selected[4] = v.getId();
                viewModel.updateData(4, v.getId());
                break;
            case R.id.image_5_1:
            case R.id.image_5_2:
            case R.id.image_5_3:
            case R.id.image_5_4:
//                selected[5] = v.getId();
                viewModel.updateData(5, v.getId());
                break;
        }

    }
}
