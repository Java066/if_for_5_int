package com.company;

import java.net.SocketOption;
import java.net.SocketPermission;
import java.security.KeyStore;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    private static Object bool;
    private static Object True;
    private static boolean False;

    public static void main(String[] args) {
        // код для норм людей
        /*
        Scanner in =new Scanner(System.in);
        System.out.print("quantity of variables:");
        int val = in.nextInt();
        int x=0;
        int[] var;
        var = new int[val];
        for(int a=0;a<val;a++){
            int enter = in.nextInt();
            var[a] = enter;
            if (var[a]>x){
                x = var[a];
            }

        }
        System.out.println(x);
        */
        //код для норм людей


        // есть ошибка нужно найти
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("a:");
        int a = in.nextInt();
        System.out.print("b:");
        int b = in.nextInt();
        System.out.print("c:");
        int c = in.nextInt();
        System.out.print("d:");
        int d = in.nextInt();
        System.out.print("e:");
        int e = in.nextInt();

        int findMax = (int) Math.pow(-2,32);
        if (a>findMax) {
            findMax = a;
        }
        if (b>findMax) {
            findMax = b;
        }
        if (c>findMax) {
            findMax = c;
        }
        if (d>findMax) {
            findMax = d;
        }
        if (e>findMax) {
            findMax = e;
        }
        int g = findMax;
            if (g == a){
            System.out.println("a");
            }
            if (g == b){
                System.out.println("b");
            }
            if (g == c){
                System.out.println("c");
            }
            if (g == d){
                System.out.println("d");
            }
            if (g == e){
                System.out.println("e");
            }

        }
       /* // это для отбитых
       if (a > b) {
            if (b > c) {
                if (c > d) {
                    if (d > e) {
                        System.out.println("a");
                    }
                }
            }
        } // a b c d e
        if (a > c) {
            if (c > b) {
                if (b > d) {
                    if (d > e) {
                        System.out.println("a");
                    }
                }
            }
        } // a c b d e
        if (a > d) {
            if (d > b) {
                if (b > c) {
                    if (c > e) {
                        System.out.println("a");
                    }
                }
            }

        } // a d b c e
        if (a > e) {
            if (e > b) {
                if (b > c) {
                    if (c > d) {
                        System.out.println("a");
                    }
                }
            }
        } // a e b c d
        if (a > b) {
            if (b>d){
                if (d>c){
                    if (c>e){
                        System.out.println("a");
                    }
                }
            }
        } // a b d c e




        if (b>a){
            if (a>c){
                if (c>d){
                    if (d>e){
                        System.out.println("b");
                    }
                }

            }
        }
        if (c>a){
            if (a>b){
                if (b>d){
                    if (d>e){
                        System.out.println("c");
                    }
                }
            }
        }
        if (d>a){
            if (a>b){
                if (b>c){
                    if (c>e){
                        System.out.println("d");
                    }
                }
            }
        }
        if (e>a){
            if (a>b){
                if (b>c){
                    if (c>d){
                        System.out.println("e");
                    }
                }
            }
        }

    // не ну эт бесконечною, я пас
        } */
        /* Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a>5){
            System.out.println("a>5");
        }
        else {
            System.out.println("a<5");
        } */
        /*Scanner in = new Scanner(System.in);
        System.out.println("a:");
        int a = in.nextInt();
        System.out.println("b:");
        int b = in.nextInt();
        System*/

        // u чел который гадали
        // j загаданное число
       /* boolean Answer = true;
        int j = 8;
        int i;
        for (i=0;i<3;i++){
            Scanner in = new Scanner(System.in);
            int u = in.nextInt();
            if (u>0&&u<11) {
                if (u < j) {
                    System.out.println("мало");
                }
                if (u > j) {
                    System.out.println("много");
                }
                if (u == j) {
                    Answer = (boolean) false;
                    i = 5;
                }
            }
            else{
                System.out.println("вне диапозона");
                i = 0;
            }

        }
            if (Answer==false){
                System.out.println("поздраляю ты угадал");
            }
            if (Answer==true){
                System.out.println("не угадал");

            }

        for (int i=0; i<10; i++){
            System.out.println(i);
        Scanner in = new Scanner(System.in);
        String log = "login";
        String password = "123";

        boolean java = true;

        do{
            String logR= in.nextLine();
            String passwordR= in.nextLine();
            if (log.equals(logR) && password.equals(passwordR)){
                java = false;
            }
            else{
                System.out.println("again");
            }
        }while (java);
        System.out.println("1+1");
        System.out.println("a)1");
        System.out.println("b)2");
        System.out.println("c)3");
        String ans1;
        String ans2;
        String ans3;
        String ans4;
        String ans5;
        String ans6;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int Main = 3;
        int i = 3;
        Scanner in = new Scanner(System.in);
        while (Main > 0) {

            while (i > 0) {
                System.out.println("осталось " + (i) + " попыток");
                ans1 = in.nextLine();
                switch (ans1) {
                    case "a":
                        System.out.println("#1");
                        i--;
                        Main --;
                        break;
                    case "b":
                        System.out.println("правильно");
                        i = -1;
                        b = 3;
                        System.out.println("Вопрос№2: 5!= ");
                        System.out.println("a)25");
                        System.out.println("b)125");
                        System.out.println("c)120");
                        break;
                    case "c":
                        System.out.println("#3");
                        i--;
                        Main--;
                        break;
                    default:
                        System.out.println("Ans[a;c]");
                        break;


                }
                ;

            }

            while (b > 0) {
                ans2 = in.nextLine();
                switch (ans2) {
                    case "a":
                        System.out.println("#1");
                        b--;
                        Main --;
                        break;
                    case "b":
                        System.out.println("#2");
                        b--;
                        Main --;
                        break;
                    case "c":
                        System.out.println("правильно");
                        b = -1;
                        c = 3;
                        System.out.println("Вопрос№3: 5!= ");
                        System.out.println("a)25");
                        System.out.println("b)125");
                        System.out.println("c)120");
                        break;

                    default:
                        System.out.println("Ans[a;c]");
                        break;
                }
            }
            while (c > 0) {
                ans3 = in.nextLine();
                switch (ans3) {
                    case "a":
                        System.out.println("#1");
                        b--;
                        Main --;
                        break;
                    case "b":
                        System.out.println("#2");
                        b--;
                        Main --;
                        break;
                    case "c":
                        System.out.println("правильно");
                        c = -1;
                        d = 3;
                        System.out.println("Вопрос№4: 5!= ");
                        System.out.println("a)25");
                        System.out.println("b)125");
                        System.out.println("c)120");
                        break;

                    default:
                        System.out.println("Ans[a;c]");
                        break;
                }
            }
            while (d > 0) {
                ans4 = in.nextLine();
                switch (ans4) {
                    case "a":
                        System.out.println("#1");
                        b--;
                        Main --;
                        break;
                    case "b":
                        System.out.println("#2");
                        b--;
                        Main --;
                        break;
                    case "c":
                        System.out.println("правильно");
                        d = -1;
                        e = 3;
                        System.out.println("Вопрос№5: 5!= ");
                        System.out.println("a)25");
                        System.out.println("b)125");
                        System.out.println("c)120");
                        break;

                    default:
                        System.out.println("Ans[a;c]");
                        break;
                }
            }
            while (e > 0) {
                ans5 = in.nextLine();
                switch (ans5) {
                    case "a":
                        System.out.println("#1");
                        b--;
                        Main --;
                        break;
                    case "b":
                        System.out.println("#2");
                        b--;
                        Main --;
                        break;
                    case "c":
                        System.out.println("правильно");
                        e = -1;
                        f = 3;
                        System.out.println("Вопрос№6: 5!= ");
                        System.out.println("a)25");
                        System.out.println("b)125");
                        System.out.println("c)120");
                        break;

                    default:
                        System.out.println("Ans[a;c]");
                        break;
                }
            }
            while (f > 0) {
                ans6 = in.nextLine();
                switch (ans6) {
                    case "a":
                        System.out.println("#1");
                        b--;
                        Main --;
                        break;
                    case "b":
                        System.out.println("#2");
                        b--;
                        Main --;
                        break;
                    case "c":
                        System.out.println("правильно");
                        f = -1;
                        Main = -1;

                        break;

                    default:
                        System.out.println("Ans[a;c]");
                        break;
                }
            }
        }

        */
       /*
        int i;
        int b;
        int output;
        for (i=1;i<11;i++){
            System.out.println("");
            int array[] = new int[]{1,2,3,4,5,6,7,8,9,10};
            for (b=1;b<11;b++){
                output = i * array[b-1];
                System.out.print(output+" ");
            }

        }

        */
       // task is to hack password: 1234 using cycles or whenever you can mention.
        /*
         Scanner in = new Scanner(System.in);
        String mass1[]= new String[5];
        String mass2[]= new String[5];
        String mass3[]= new String[10];
        for(int i=2;i<12;i++){

            String a = in.nextLine();
            mass3[i]=a;
            }
        for(int i=2;i<12;i=i+2){
            int j=i/2;
            mass2[j]=mass3[i];
        }
        for(int i=2;i<12;i=i+2){
            mass2[j]=mass3[i];
        }

           /* int i=0;
            while(i<11){
            if(i%2==0){
                mass2[i]=mass3[i];
                i++;
            }
            if(i%2==1){
                mass1[i]=mass3[i];
                i++;
            }
        }
            for (int a=0;a<5;a++){
                System.out.println(mass2[a]);
                System.out.println(mass1[a]);
            }
        System.out.println(0%2);
            int i=0;
            int v=0;
            while(i<10){
                i++;
                String a = in.nextLine();
                if (i%2==0){
                     mass1[v]=a;
                     System.out.println(mass1);
                }
                else{
                    mass2[v]=a;
                    System.out.println(mass2);
                    v++;
                }
            }
            for(int a=0;a<6;a++){
                System.out.println(mass1[a]);
                System.out.println(mass2[a]);
            }

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int mass[]= new int[n];
        for (int a=0;a< mass.length;a++){
            int b = in.nextInt();
            mass[a]=b;
        }
        for (int a=0;a< mass.length;a++){
            int k=a*2;
            System.out.println(mass[k]);
        }

         */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int mass[]= new int[n];
        for (int a=0;a< mass.length;a++){
            int b = in.nextInt();
            mass[a]=b;
            //System.out.println(mass[a]);
        }
        for(int a=0;a < mass.length;a++){
            if (mass[n-1]>mass[a]){
                System.out.println(mass[a]);
                break;
            }
        }

    }
}









