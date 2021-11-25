package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strArray = new String[n];
        System.out.println("Nhập thông tin cho các phần tử");
        for (int i = 0; i < strArray.length; i++) {
            System.out.printf("Thông tin của phần tử %d là: ", i);
            strArray[i] = sc.next();
        }
        System.out.println("\nThông tin được in ra màn hình như sau");
        printArray(strArray);

        int sum = 0;
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].contains("Java")) {
                sum = sum + 1;
            }
        }
        System.out.println("\nSố lần “Java” xuất hiện trong mảng là: " + sum);

        System.out.println("\nNhập vào từ bàn phím chuỗi bất kỳ: ");
        String yourArray = sc.next();
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].equals(yourArray)) {
                System.out.println("Chuỗi đó ở vị trí thứ: " + i);
            }
        }
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
