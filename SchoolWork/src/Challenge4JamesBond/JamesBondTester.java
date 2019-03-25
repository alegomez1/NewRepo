
package Challenge4JamesBond;


public class JamesBondTester {
    public static void main(String[] args)
    {
        //Add a do-while loop that keeps looping while the user
        //enters either 1 or 2.
        int menuOption = displayMenu();
        switch(menuOption)
        {
            case 1:
                encryptPassword();
                break;
            case 2:
                decryptPassword();
                break;
            case 3:
                selfDestruct();
                break;
        }

    }

    public static int displayMenu()
    {
        //Display the menu to show:
        // 1.  Encrypt a Password?
        // 2.  Decrypt a Password?
        // 3.  Stop Spying...
        //Get input from user and store in a local variable
        //loop to validate value entered as 1, 2, or 3
        //and if not, keep looping and asking user to enter valid value
        //return value entered
        return 0;   //temporary
    }

    public static void encryptPassword()
    {
        //1.  Ask user for for to encrypt
        //2.  Instantiate the PasswordEncryption object, passing
        //    it the word and a boolean value of true, meaning encrypt
        //3.  Display the encrypted word to the user.
        //4.  Extra Credit: Before displaying encrypted word,
        //    ask user to guess the encrypted word.  If user guesses
        //    correctly, state "Successfully encrypted…mission accomplished"
        //    If user did not guess correctly, state "Unsuccessfully encrypted...Danger, danger!”

    }

    public static void decryptPassword()
    {   //1.  Ask user for encrypted word to decrypt
        //2.  Instantiate the PasswordEncryption object, passing
        //    it the word and a boolean value of false, meaning decrypt
        //3.  Display the decrypted word to the user.
        //4.  Extra Credit: Before displaying decrypted word,
        //    ask user to guess the decrypted word.  If user guesses
        //    correctly, state "Successfully decrypted…mission accomplished"
        //    If user did not guess correctly, state "Unsuccessfully decrypted...Danger, danger!”


    }

    public static void selfDestruct()
    {
        //Advise the user that this program will self-destruct in 5 seconds
        //5 - 4 - 3 - 2 - 1 - 0 Boom!

    }

}