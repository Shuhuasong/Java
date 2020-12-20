package KTV_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicTask {

    public static void main(String[] args) {
        List musics = new ArrayList();

        Scanner scan = new Scanner(System.in);
        int num = 0;
        while(true){
            System.out.println(musics);
            System.out.println("Please input the operation code: 0-add  1-move first  2-forward 3-exit");
            num = scan.nextInt();
            switch(num){
                case 0:
                    add(musics);
                    break;
                case 1:
                    firstMusic(musics);
                    break;
                case 2:
                    forward(musics);
                    break;
                case 3:
                    exit();
            }
        }
    }

    public static void add(List musics){

        System.out.println("Please input the name of music: ");
        Scanner scan = new Scanner(System.in);
        String music = scan.next();
        musics.add(music);
    }

    public static void firstMusic(List musics){
        System.out.println("Please input the name of music");
        Scanner scan = new Scanner(System.in);
        String music = scan.next();
        musics.remove(music);
        musics.add(0, music);
    }

    public static void forward(List musics){
        System.out.println("Please input the name of music");
        Scanner scan = new Scanner(System.in);
        String music = scan.next();
        int index = musics.indexOf(music);
        if(index==0){
            return;
        }
        musics.remove(music);
        musics.add(index-1, music);
    }

    public static void exit(){
        System.exit(0);
    }
}
