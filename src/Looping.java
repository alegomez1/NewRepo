public class Looping {

    public static void main(String[] args) {

        for(int i=0; i<10; i++) {
            System.out.println("Number is: " + i);
        }

        //while looping

        int x = 10;
        while (x >=0) {
            System.out.println("The number: " + x  +" is still greater  than or equal to zero");
            x--;
        }

        // do while looping

        int y = 10;
        do
        {
            System.out.println("Number: " + y + " is still greater than or equal to zero");
            y --;
        } while (y >= 0);

    }
}
