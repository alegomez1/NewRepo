import java.util.Random;
import java.util.Scanner;

// https://www.w3resource.com/java-exercises/basic/index.php

public class testing {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {

        baconCipher();


    }

    public static void challenge37(){

        System.out.println("Enter a sentence");
        char[] letters = kb.nextLine().toCharArray();
        for (int i = letters.length-1; i>=0; i--){
            System.out.print(letters[i]);
        }
    }

    //Write a Java program to count the letters, spaces, numbers and other characters of an input string
    public static void challenge38(){

        int letterCount =0;
        int spaceCount=0;
        int numberCount=0;
        int otherCount=0;

        System.out.println("Enter a sentence with numbers and period too");
        char[] sentence = kb.nextLine().toCharArray();

        for (int i = 0; i<sentence.length; i++){
            if (Character.isLetter(sentence[i])){
                letterCount++;
            }
            else if (Character.isSpaceChar(sentence[i])){
                spaceCount++;
            }
            else if (Character.isDigit(sentence[i])){
                numberCount++;
            }
            else {
                otherCount++;
            }
        }
        System.out.printf("Letters: %d" +
                "\nNumbers: %d" +
                "\nSpaces: %d" +
                "\nOther: %d", letterCount, numberCount, spaceCount, otherCount);
    }

    //Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn
    public static void challenge44(int number){
        int firstNumber, secondNumber, thirdNumber, sum;
        firstNumber = number;
        secondNumber = number * 11;
        thirdNumber = number * 111;
        sum = firstNumber + secondNumber + thirdNumber;

        System.out.printf("%d + %d + %d = %d", firstNumber, secondNumber, thirdNumber, sum);
    }

    public static void sentenceCounter(){

        int letterCounter=0;
        int numberCounter=0;
        int spaceCounter =0;
        int otherCounter =0;

        System.out.println("Please enter a sentence");
        char[] sentenceArray = kb.nextLine().toCharArray();

        for (int i = 0; i < sentenceArray.length; i++){

            if (Character.isDigit(sentenceArray[i])){
                numberCounter ++;

            }
            else if (Character.isSpaceChar(sentenceArray[i])){
                spaceCounter++;
            }
            else if (Character.isLetter(sentenceArray[i])){
                letterCounter++;
            }else otherCounter++;
        }

        System.out.printf("Letters: %d\n" +
                "Numbers: %d\n" +
                "Spaces %d\n" +
                "Other: %d\n", letterCounter, numberCounter, spaceCounter, otherCounter);
    }

    public static void a99BottlesOfBeer() {
        for (int i = 99; i > 0; i--) {
            if (i != 1) {
                System.out.printf(
                        "%d bottles of beer on the wall\n" +
                                "%d bottles of beer\n" +
                                "Take one down, pass it around\n" +
                                "%d bottles of beer on the wall\n\n", i, i, i - 1);
            } else {
                System.out.printf(
                        "%d bottle of beer on the wall\n" +
                                "%d bottle of beer\n" +
                                "Take one down, pass it around\n" +
                                "No more bottles of beer on the wall\n\n", i, i);
            }
        }
    }

    public static void AplusB(int firstNumber, int secondNumber){
        if ((firstNumber >= -1000 && secondNumber >=-1000) && (firstNumber <= 1000 && secondNumber <= 1000) ){
            int sum = firstNumber + secondNumber;
            System.out.println(sum);
        } else
            System.out.println("Those numbers are out of the range");

    }

    public static void baconCipher(){
        System.out.println("Welcome to the Bacon cipher!\n");
        System.out.println("Please enter a word or phrase to be encrypted");
        char[] userInput = kb.nextLine().toCharArray();
        String enryptedWord = "";


        for (int i = 0; i<userInput.length; i++){
            if (userInput[i] == 'A' || userInput[i] == 'a'){
                enryptedWord += "AAAAA ";
            }
            else if (userInput[i] == ' '){
                enryptedWord += "/ ";
            }
            else if (userInput[i] == 'B' || userInput[i] == 'b'){
                enryptedWord += "AAAAB ";
            }
            else if (userInput[i] == 'C' || userInput[i] == 'c'){
                enryptedWord += "AAABA ";
            }
            else if (userInput[i] == 'D' || userInput[i] == 'd'){
                enryptedWord += "AAABB ";
            }
            else if (userInput[i] == 'E' || userInput[i] == 'e'){
                enryptedWord += "AABAA ";
            }
            else if (userInput[i] == 'F' || userInput[i] == 'f'){
                enryptedWord += "AABAB ";
            }
            else if (userInput[i] == 'G' || userInput[i] == 'g'){
                enryptedWord += "AABBA ";
            }
        }

        System.out.println(enryptedWord);

    }




}





