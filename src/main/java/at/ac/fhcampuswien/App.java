package at.ac.fhcampuswien;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {

    // Implement all methods as public static
    public static void oneMonthCalendar(int totalDays, int firstDay) {
        boolean lastUmbruch = false;
        for (int i = 2; i <= firstDay; i++) {
            System.out.print("   ");
        }
        for (int i = 1; i < totalDays + 1; i++){
            if (i < 10 ) {
                System.out.print(" " + i + " ");
            }
            else {
                System.out.print(i + " ");
                lastUmbruch = true;
            }
            if ((i + (firstDay - 1)) % 7 == 0){
                System.out.println();
                lastUmbruch = false;
            }

        }
        if (lastUmbruch) {
            System.out.println();
        }

    }

    public static void guessingGame(int numberToGuess) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        for (int i = 0; i <= 9; i++) {
            System.out.print("Guess number " + counter + ": ");
            int number = scanner.nextInt();
            counter++;

        if (number == numberToGuess) {
            System.out.println("You won wisenheimer!");
            break;
        }
        else if (number < numberToGuess && i != 9) {
            System.out.println("The number AI picked is higher than your guess.");
            }
        else if (number > numberToGuess && i != 9){
            System.out.println("The number AI picked is lower than your guess.");
        } else if (i == 9) {
            System.out.println("You lost! Have you ever heard of divide & conquer?");
        }

        }

        }
    public static int randomNumberBetweenOneAndHundred(){
        double random = Math.random();
        double x = random*100;
        return (int)x + 1; // 1-100 statt 0 - 99
    }


    public static boolean swapArrays(int[] array1, int[] array2){



        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++){
            array1[i] = array1[i] + array2[i];
            array2[i] = array1[i] - array2[i];
            array1[i] = array1[i] - array2[i];


        }
        for(int i=0;i<array1.length;i++)
            System.out.println(array1[i]);


        return true;


    }

    public static long[] lcg (long Seed){
        long m = (long) Math.pow(2, 31);
        long c = 12345;
        long a = 1103515245;

        long[] array = new long[10];
        array[0] = (a*Seed+c) % m;
        for (int i = 0; i <9; i++){
            array[i+1] =  (a * array[i] + c) % m;

        }
        System.out.println(Arrays.toString(array));
        return array;


    }


    public static String camelCase(String text){
        char[] chars = text.toCharArray();

        StringBuilder newText = new StringBuilder();
        boolean firstLetter = true;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                if (firstLetter) {
                    chars[i] -= 32;
                    firstLetter = false;
                }
                newText.append(chars[i]);
            } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
                if (!firstLetter) {
                    chars[i] += 32;
                }
                firstLetter = false;
                newText.append(chars[i]);
            } else if (chars[i] == ' ') {
                firstLetter = true;
            }
        }
        return newText.toString();


    }

    public static int checkDigit(int[] code){
        int sum = 0;
        int gewichtung = 2;
        for (int i = 0; i < code.length; i++){
            gewichtung = i + 2;
            int produkte = gewichtung * code[i];
            sum = sum + produkte;

            /*code[i] *= (i+2);
            sum += code[i];
            besser
            */

        }
        sum = sum % 11;
        int pruefziffer = 11 - sum;

        if (pruefziffer == 10) {
            pruefziffer = 0;
        }
            else if (pruefziffer == 11) {
                pruefziffer = 5;
            }
        System.out.println(pruefziffer);
        return pruefziffer;


    }


    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
        /*guessingGame(50);
        System.out.println();

        int y = randomNumberBetweenOneAndHundred();
        guessingGame(y);
        System.out.println();

        swapArrays(new int [] {1,2,3,4,5,},new int[]{100, 99, 60, 44, 2});


        lcg(0);

        checkDigit(new int[] {3,5,6,7,4,8,2});

         */
        oneMonthCalendar(28, 1);

    }

}