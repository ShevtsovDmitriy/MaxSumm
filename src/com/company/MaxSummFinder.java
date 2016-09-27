package com.company;

import java.util.Random;


public class MaxSummFinder {

    private int[] series;
    private int size = 0;
    private int maxNum = 0;
    private int[][] dp;


    public void findMaxSumm(){
        getArr();
        dp = new int[size][maxNum];
        for (int i = 0; i < maxNum; i++) {
            if (series[0] <= i+1) dp[0][i] = series[0];
            else dp[0][i] = 0;
        }
        printDP();
        for (int i = 1; i < size; i++) {
            for (int j = 1; j < maxNum; j++) {

            }
        }
    }

    private void getArr(){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String buf;
        System.out.print("Generate automatically?\n");

        if (scanner.nextLine().equals("yes")){
            do {
                System.out.print("Enter size\n");
                buf = scanner.nextLine();
            } while ((size = Integer.parseInt(buf)) <= 0);
            series = new int[size];
            do {
                System.out.print("Enter max num\n");
                buf = scanner.nextLine();
            } while ((maxNum = Integer.parseInt(buf)) <= 0);
            Random rnd = new Random();
            for (int i = 0; i < size; i++) {
                series[i] = rnd.nextInt(maxNum);
            }
            return;
        }
        System.out.print("Enter series\n");
        buf = scanner.nextLine();
        String[] s = buf.split(" ");
        size = s.length;
        series = new int[size];
        for (int i = 0; i < size; i++) {
            series[i] = Integer.parseInt(s[i]);
        }
    }

    private int getMaxOfColumn(int column, int row){
        int max = 0;
        for (int i = 0; i < row; i++) {
            if (dp[column][i] > max) max = dp[column][i];
        }
        return max;
    }

    private void printDP(){
        for (int i = 0; i < size; i++) {
            System.out.print(series[i]);
            System.out.print(" ");
        }
        System.out.print("\n");
        System.out.print("\n");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < maxNum; j++) {
                System.out.print(dp[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }



}
