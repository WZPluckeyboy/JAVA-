package com.bit.game;
import java.util.Scanner;
public class Game {
    private person people;
    private computer computer;
    public Game(){
        people=new person("bit");
        computer=new computer("小乖乖");
    }
        public void playThreeTime() {
        int count =0;
        while(count<3){
            String pFist=people.fist();
            String cFist=computer.fist();
            if(pFist.equals("石头") && cFist.equals("剪刀")
                    ||pFist.equals("剪刀") && cFist.equals("布") ||
                    pFist.equals("布") && cFist.equals("石头")) {
                System.out.println(people.getName()+" 此局获胜");
                people.addScore();
            }
            else if(pFist.equals(cFist)) {
                System.out.println("此局平局");
            }
            else{
                System.out.println("alpha获胜");
                computer.addScore();
            }
            count++;
        }
        }
        public void getResult() {
            int pScore = people.getScore();
            int cScore = computer.getScore();
            if(pScore > cScore) {
                System.out.println(people.getName() + "：最终结果赢了");
            }else if(pScore == cScore){
                System.out.println("平局");
            }else{
                System.out.println(computer.getName() + "：最终结果赢了");
            }
            System.out.println(people.getName()+":"+computer.getName()+
                    "===>"+people.getScore()+":"+computer.getScore());

        }
        public void start() {
            while(true) {
                playThreeTime();
                getResult();
                System.out.println("是否继续？");
                Scanner scanner = new Scanner(System.in);
                String str = scanner.next();
                if (str.equals("是")) {
                    continue;
                }else{
                    break;
                }
            }

        }
    }


