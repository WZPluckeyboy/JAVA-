package com.bit.game;
import java.util.Random;
import java.util.Scanner;
public class computer {
   private String name;
    private int score;

    public computer(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getScore(){
        return score;
    }

    public void addScore() {
        this.score++;
    }

    //出拳
    public String fist() {
        Random random = new Random ( );
        int n = random.nextInt ( 3 ) + 1;//生成随机数
        String str = null;
        switch (n) {
            case 1:
                System.out.println ( name + ":" + "出石头" );
                str = "石头";
                break;
            case 2:
                str = "剪刀";
                System.out.println ( name + ":" + "出剪刀" );
                break;
            case 3:
                str = "布";
                System.out.println ( name + ":" + "出布" );
                break;
        }
        return str;
    }
}




