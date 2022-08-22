package com.jjj.test;

import java.util.Arrays;
import java.util.Scanner;

public class SuanFa {
    /**
     *
     * 冒泡排序
     * @param a
     */
    public  static  void  adc(int[] a){
        for (int i =0;i<a.length-1;i++){
            for (int j=0;j<a.length-i-1;j++){
                if (a[j]>a[j+1]){
                    int temp =a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }

        }
    }

    public static void main(String[] args) {
        int [] a= {1,2,40,20,32,23,4,3323,23,};
        System.out.println(Arrays.toString(a));
        adc(a);
        System.out.println(Arrays.toString(a));

        for (int x: a) {
            System.out.println(x);
        }

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()){
            int str1 = scanner.nextInt();
            int [] b = new int[10];
            b[0]=str1;
            b[1]=str1;
            b[2]=str1;

            /**
             * 如何从控制台输入n个值的-并排序出来
             */

            System.out.println(Arrays.toString(b));

        }
        scanner.close();

    }



}
