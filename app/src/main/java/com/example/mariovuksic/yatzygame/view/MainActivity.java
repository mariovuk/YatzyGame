package com.example.mariovuksic.yatzygame.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mariovuksic.yatzygame.R;
import com.example.mariovuksic.yatzygame.game.Game;
import com.example.mariovuksic.yatzygame.game.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Scanner scan = new Scanner(System.in);

        System.out.println("How many players ?");
        int nbPlayers = scan.nextInt();
        scan.nextLine();

        while (nbPlayers < 1) {
            nbPlayers = scan.nextInt();
            scan.nextLine();
        }

        ArrayList<Player> players = new ArrayList<Player>();
        System.out.println("Add a name for each player :");

        for (int i = 0; i < nbPlayers; i++) {
            players.add(new Player(scan.nextLine()));
        }


        Game game = new Game(players);
        game.play();
    }
}
