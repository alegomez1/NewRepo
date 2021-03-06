import java.util.Scanner;
public class testingPartTwo {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {

        replaceAs();

    }

    public static double jaro(String s, String t){
        int sLength = s.length();
        int tLength= t.length();

        if (sLength == 0 && tLength == 0) return 1;

        int match_distance = Integer.max(sLength, tLength) / 2 -1;

        boolean[] s_matches = new boolean[sLength];
        boolean[] t_matches = new boolean[tLength];

        int matches = 0;
        int transpositions = 0;

        for (int i = 0; i < sLength; i++){
            int start = Integer.max(0, i-match_distance);
            int end = Integer.min(i+match_distance+1, tLength);

            for (int j = start; j < end; j++){
                if (t_matches[j]) continue;
                if (s.charAt(i) != t.charAt(j)) continue;
                s_matches[i] = true;
                t_matches[j] = true;
                matches++;
                break;
            }
        }

        if (match_distance == 0) return 0;

        int k = 0;
        for (int i = 0; i < sLength; i++) {
            if (!s_matches[i]) continue;
            while (!t_matches[k]) k++;
            if (s.charAt(i) != t.charAt(k)) transpositions++;
            k++;
        }

        return (((double)matches / sLength) +
                ((double)matches / tLength) +
                (((double)matches - transpositions/2.0) / matches)) / 3.0;


    }

    public static void replaceAs(){
        System.out.println("Enter a word or phrase");

        String userInput = kb.nextLine();

        System.out.println(userInput.replace('a', 'x'));

    }

}
