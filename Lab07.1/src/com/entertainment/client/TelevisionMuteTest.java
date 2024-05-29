package com.entertainment.client;

import com.entertainment.Television;

class TelevisionMuteTest {
    public static void main(String[] args) {
        Television tv = new Television();

        tv.setVolume(-1);
        System.out.println(tv);

        tv.setVolume(0);
        System.out.println(tv);

        tv.setVolume(100); //should set Volume to 100.
        System.out.println(tv);

        tv.setVolume(101);
        System.out.println(tv);

        tv.mute(); //should mute tv
        System.out.println(tv);

        tv.mute(); //should unmute and set volume back to 100.
        System.out.println(tv);

        tv.mute();  //should mute
        System.out.println(tv);

        tv.mute(); //should unmute
        System.out.println(tv);

        tv.setVolume(50);  //should set volume to 50
        System.out.println(tv);
    }
}