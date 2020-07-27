package com.Artur;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//         int x = 98;
//         int y = 0;
//        System.out.println(divideBYL(x, y));
//        System.out.println(divideEAFP(x, y));
//        System.out.println(divid(x, y));

        int x = getIntEAFP();
        System.out.println("x is " + x);
    }

    private static int getInt(){
        Scanner s = new Scanner(System.in);
        System.out.print("enter an integer: ");
        return s.nextInt();
    }

    private static int getIntLYBYL(){
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.print("enter an integer: ");
        String input = s.next();
        for(int i =0 ; i < input.length(); i++){
            if(!Character.isDigit(input.charAt(i))){
                isValid = false;
                break;
            }
        }
        if(isValid){
            return Integer.parseInt(input);
        }
        return 0;
    }

    private static int getIntEAFP(){
        Scanner s = new Scanner(System.in);
        System.out.print("enter an integer: ");
        try {
            return s.nextInt();
        }catch (InputMismatchException e){
            return 0;
        }
    }


    public static int divideBYL(int x, int y){
        if (y !=0){
            return x / y;
        }else{
            return 0;
        }

    }

    private static int divideEAFP(int x, int y){
        try{
            return x / y;
        }catch (ArithmeticException e){
            return 0;
        }
    }

    private static int divid(int x, int y){
        return x / y;
    }

}
