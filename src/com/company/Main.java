package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.setOut;

public class Main {


    public static void main(String[] args) throws Exception {
        {
            System.out.println("Введите числа, что бы закончить введите -2 и Enter:");

            Scanner s = new Scanner(in);
            String b = "";
            String[] nums = s.nextLine().split(" ");

            for (String a : nums) {
                if (a.length() == 3) {
                    if (a.charAt(0) != a.charAt(1) && a.charAt(2) != a.charAt(1) && a.charAt(0) != a.charAt(2))
                        b += a + " ";

                }
            }


            System.out.println("" + b);
        }
    }
}




//    Scanner sr = new Scanner(System.in);
//
//System.out.print("Введите целое число и нажмите Enter: ");
//
//        if(sr.hasNextInt()) {
//        int number = sr.nextInt();
//        String category = (number % 2) == 0 ? "Четное" : "Нечетное";
//
//        System.out.println(category + " число: " + number);
//        } else {
//        System.out.println("Не целое число");
//        }
//        }
//        }


//
//    Scanner s = new Scanner(System.in);
//    int sum = 0;
//    String stroka;
//while (true) {
//        stroka = s.next();
//        sum += Integer.parseInt(stroka);
//        if (stroka.equals("-2")) {
//        break;
//        }
//        }
//
//        System.out.println(sum);
//
//        }}




//    public static void main(String[] args) {
//        System.out.println("Введите пaрль Enter:");
//        Scanner scan = new Scanner(System.in);
//        String name = scan.next();
//        scan.close();
//        if(name.equals("611")){
//            System.out.println("Ok");
//        }
//        else
//        {
//            System.out.println("Неа, лол!");
//        }
//    }
//}



//for (int i = 0; i < quantity; i++) {
//        rndNumbers[i] = rnd.nextInt();
//        System.out.print(rndNumbers[i]);
//        }
//        }


//System.out.println("Введите количество выводимых чисел и нжмите Enter");
//
//        Scanner scan = new Scanner(System.in);
//        Random rnd = new Random();
//        int quantity = scan.nextInt();
//        int[] rndNumbers = new int[quantity];
//        for (int i = 0; i < quantity; i++) {
//        rndNumbers[i] = rnd.nextInt();
//        System.out.println(rndNumbers[i]);
//        }
//
//
//        }
//        }
//
//        Или :
//        System.out.println("Введите количество выводимых чисел и нжмите Enter");
//
//        Scanner scan = new Scanner(System.in);
//        Random rnd = new Random();
//        int quantity = scan.nextInt();
//        int[] rndNumbers = new int[quantity];
//        for (int i = 0; i < quantity; i++) {
//        rndNumbers[i] = rnd.nextInt();
//        System.out.println(rndNumbers[i]);
//        }


//System.out.println("Введите днные и нжмите Enter:");
//
//        int[] array1 = new int[2];
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        for (int i=0;i<array1.length;i++){
//        array1[i]=Integer.parseInt(reader.readLine());
//        }
//        for (int i=array1.length-1;i>=0;i--){
//        System.out.println(array1[i]);
//        }
//
//        }
//        }}


//System.out.println("Введите вше имя и нжмите <Enter>");
//        Scanner scan= new Scanner(System.in);
//        String name=j();
//        System.out.println("Привет," + name);
//
//        }}
