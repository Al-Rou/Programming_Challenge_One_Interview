import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class GM {
    public static void main(String[] args) {
        //Asking the user to enter their sentence
        System.out.println("Enter a sentence: ");
        Scanner in = new Scanner(System.in);
        //The sentence is read
        String inputSentence = in.nextLine();
        //To store all words separately, a list is defined
        List<String> listOfWords = new ArrayList<>();
        //Words are separated here
        String auxiliary = "";
        for (int i = 0; i < inputSentence.length(); i++)
        {
            if(inputSentence.charAt(i) != ' ')
            {
                auxiliary += inputSentence.charAt(i);
            }
            else {
                listOfWords.add(auxiliary);
                auxiliary = "";
            }
        }
        //The last word has to be added
        listOfWords.add(auxiliary);
        //Words are printed out backwards
        for (int j = listOfWords.size()-1; j >= 0; j--)
        {
            System.out.print(listOfWords.get(j) + " ");
        }
    }
}
