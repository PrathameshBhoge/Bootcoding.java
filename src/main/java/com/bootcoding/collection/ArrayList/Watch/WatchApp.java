package main.java.com.bootcoding.collection.ArrayList.Watch;

import java.util.ArrayList;

public class WatchApp {
    public static void main(String[] args) {
        ArrayList <watch> watches=new ArrayList<>();
        watches.add(new watch("pink",700,"leather"));
        watches.add(new watch("black",200,"steel"));
        watches.add(new watch("brown",300,"plastic"));
        for(int i=0;i< watches.size();i++){
            System.out.println(watches.get(i));
        }
        System.out.println();
        ArrayList<WallWatch> WatchWall=new ArrayList<>();
        WatchWall.add(new WallWatch("red",900,"plastic"));
        WatchWall.add(new WallWatch("yellow",5000,"silver"));
        WatchWall.add(new WallWatch("Black",2500,"katam"));
        for(int i=0;i< WatchWall.size();i++){
            System.out.println(WatchWall.get(i));
        }
        System.out.println();
        ArrayList<wristWatch> hand=new ArrayList<>();
        hand.add(new wristWatch("Digital",7000,"alloy"));
        hand.add(new wristWatch("round",900,"plastic"));
        for(int i=0;i<hand.size();i++){
            System.out.println(hand.get(i));

        }
    }
}
