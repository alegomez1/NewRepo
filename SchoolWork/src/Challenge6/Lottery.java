package Challenge6;
import java.util.Random;
import java.util.Scanner;

public class Lottery {

    static int[] lotteryNumbers = new int[6];
    static int[] userLotteryPicks = new int[6];

    static int num1, num2, num3, num4, num5, num6;
    static int userNum1,userNum2,userNum3,userNum4,userNum5,userNum6;

    public Lottery() {
        Random myRan = new Random();

        this.num1 = myRan.nextInt(3) + 1;
        this.num2 = myRan.nextInt(3) + 1;
        this.num3 = myRan.nextInt(3) + 1;
        this.num4 = myRan.nextInt(3) + 1;
        this.num5 = myRan.nextInt(3) + 1;
        this.num6 = myRan.nextInt(3) + 1;

//        num1 = lotteryNumbers[0];
//        num2 = lotteryNumbers[1];
//        num3 = lotteryNumbers[2];
//        num4 = lotteryNumbers[3];
//        num5 = lotteryNumbers[4];
//        num6 = lotteryNumbers[5];

        setNum1(num1);
        setNum2(num2);
        setNum3(num3);
        setNum4(num4);
        setNum5(num5);
        setNum6(num6);

    }


    /*
     * This method is used to get input from the user
     * The user is asked to enter 6 lottery numbers ranging from 1-60
     * It 'cheats' by first displaying what the numbers the constructor generated are
     * It does this by using an enhanced for loop to print each element of the lotteryNumbers array
     * Then, it runs a loop 6 times to get input from the user for their 6 lottery number guesses
     * Each guess is stored in the array at index i
     */
    public static void getUserPicks() {
        Scanner keyboard = new Scanner(System.in);

        System.out.printf("The numbers already generated are:\n%d\n%d\n%d\n%d\n%d\n%d\n", num1, num2, num3, num4, num5, num6);

        System.out.println("Please enter your 6 lottery number choices\nNumbers from 1-60");

        int userNumber;
        for (int i = 0; i<6; i++){
            System.out.println("Enter a unique number");
            userNumber = keyboard.nextInt();
            userLotteryPicks[i] = userNumber;
        }

        setUserNum1(userLotteryPicks[0]);
        setUserNum2(userLotteryPicks[1]);
        setUserNum3(userLotteryPicks[2]);
        setUserNum4(userLotteryPicks[3]);
        setUserNum5(userLotteryPicks[4]);
        setUserNum6(userLotteryPicks[5]);


    }

    public static int checkLotteryMatch(){

        int counter = 0;

        for (int i =0; i < 6; i++){

            for (int j =0; j<6; j++){

                if (userLotteryPicks[i] == lotteryNumbers[j]){
                    counter++;
                }
            }


        }

        return counter;
    }





    public static int[] getLotteryNumbers() {
        return lotteryNumbers;
    }

    public static void setLotteryNumbers(int[] lotteryNumbers) {
        Lottery.lotteryNumbers = lotteryNumbers;
    }

    public static int[] getUserLotteryPicks() {
        return userLotteryPicks;
    }

    public static void setUserLotteryPicks(int[] userLotteryPicks) {
        Lottery.userLotteryPicks = userLotteryPicks;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int getNum4() {
        return num4;
    }

    public void setNum4(int num4) {
        this.num4 = num4;
    }

    public int getNum5() {
        return num5;
    }

    public void setNum5(int num5) {
        this.num5 = num5;
    }

    public int getNum6() {
        return num6;
    }

    public void setNum6(int num6) {
        this.num6 = num6;
    }

    public static int getUserNum1() {
        return userNum1;
    }

    public static void setUserNum1(int userNum1) {
        Lottery.userNum1 = userNum1;
    }

    public static int getUserNum2() {
        return userNum2;
    }

    public static void setUserNum2(int userNum2) {
        Lottery.userNum2 = userNum2;
    }

    public static int getUserNum3() {
        return userNum3;
    }

    public static void setUserNum3(int userNum3) {
        Lottery.userNum3 = userNum3;
    }

    public static int getUserNum4() {
        return userNum4;
    }

    public static void setUserNum4(int userNum4) {
        Lottery.userNum4 = userNum4;
    }

    public static int getUserNum5() {
        return userNum5;
    }

    public static void setUserNum5(int userNum5) {
        Lottery.userNum5 = userNum5;
    }

    public static int getUserNum6() {
        return userNum6;
    }

    public static void setUserNum6(int userNum6) {
        Lottery.userNum6 = userNum6;
    }
}
