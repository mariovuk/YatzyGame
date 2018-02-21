package com.example.mariovuksic.yatzygame.view;

/**
 * Created by mariovuksic on 2018-01-20.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mariovuksic.yatzygame.R;
import com.example.mariovuksic.yatzygame.game.Game;
import com.example.mariovuksic.yatzygame.game.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);





        game.play();
    }
}
