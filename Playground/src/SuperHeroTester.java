import java.util.Scanner;

public class SuperHeroTester {

    public static void main(String[] args) {

        getDataFromUser();
        determineSuperHeroIdentity();
    }

    public static void getDataFromUser()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstName = keyboard.nextLine();
        System.out.println("What is your last name?");
        String lastName = keyboard.nextLine();
        System.out.println("What is your super power?");
        String superPower = keyboard.nextLine();
        System.out.println("What is your favorite color?");
        String favoriteColor = keyboard.nextLine();

       SuperHeroDomain aSuperHero = new SuperHeroDomain(firstName, lastName, superPower, favoriteColor);

    }

    public static void determineSuperHeroIdentity()
    {
// Adding this here allows the symbols inside aSuperHero to be resolved
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstName = keyboard.nextLine();
        System.out.println("What is your last name?");
        String lastName = keyboard.nextLine();
        System.out.println("What is your super power?");
        String superPower = keyboard.nextLine();
        System.out.println("What is your favorite color?");
        String favoriteColor = keyboard.nextLine();

        SuperHeroDomain aSuperHero = new SuperHeroDomain(firstName, lastName, superPower, favoriteColor);

        // SuperHeroDomain aSuperHero = new SuperHeroDomain(firstName, lastName, superPower, favoriteColor);


        System.out.println(aSuperHero);

        if (aSuperHero.getFavoriteColor().equalsIgnoreCase("red"))
        {
            System.out.println("You must be Spiderman!");
        }
        else if (aSuperHero.getFavoriteColor().equalsIgnoreCase("green"))
        {
            System.out.println("You must be Green Goblin!");
        }
        else if (aSuperHero.getFavoriteColor().equalsIgnoreCase("black"))
        {
            System.out.println("You must be Batman");
        }
        else if (aSuperHero.getFavoriteColor().equalsIgnoreCase("blue"))
        {
            System.out.println("You must be Captain America");
        }
        else if (aSuperHero.getFavoriteColor().equalsIgnoreCase("purple"))
        {
            System.out.println("You must be Magneto");
        }
        else
        {
            System.out.println("You are a Mystery Super Hero...");
        }

    }

}
