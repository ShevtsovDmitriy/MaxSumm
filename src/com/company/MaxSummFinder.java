package com.company;

import java.util.Random;


public class MaxSummFinder {

    private int[] series;
    private int size = 0;
    private  int maxNum = 0;

    public void findMaxSumm(){

    }

    private void getArr(){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String buf;
        System.out.print("Generate automatically?");

        if (scanner.nextLine().equals("yes")){
            do {
                System.out.print("Enter size");
                buf = scanner.nextLine();
            } while ((size = Integer.parseInt(buf)) <= 0);
            series = new int[size];
            do {
                System.out.print("Enter max num");
                buf = scanner.nextLine();
            } while ((maxNum = Integer.parseInt(buf)) <= 0);
            Random rnd = new Random();
            for (int i = 0; i < size; i++) {
                series[i] = rnd.nextInt(maxNum);
            }
            return;
        }
        System.out.print("Enter series");
        buf = scanner.nextLine();
        String[] s = buf.split(" ");
        size = s.length;
        series = new int[size];
        for (int i = 0; i < size; i++) {
            series[i] = Integer.parseInt(s[i]);
        }


    }

}
