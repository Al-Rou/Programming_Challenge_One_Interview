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
        /*if (!inputSentence.equals(""))
        {
            System.out.println(inputSentence.length());
            for (int z = 0; z < inputSentence.length(); z++)
            {
                System.out.println(inputSentence.charAt(z));
            }
            System.out.println(inputSentence.charAt(0));
            System.out.println(inputSentence.charAt(1));
            System.out.println(inputSentence.charAt(2));
            System.out.println(inputSentence.charAt(3));
            System.out.println(inputSentence.charAt(4));
            System.out.println(inputSentence.charAt(5));
            if (inputSentence.charAt(2) == ' ')
            {
                System.out.println("YES");
            }
            return;
        }
        else
        {
            System.out.println("NO");
        }*/
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
        listOfWords.add(auxiliary);
        for (int j = listOfWords.size()-1; j >= 0; j--)
        {
            System.out.print(listOfWords.get(j) + " ");
        }
    }
}
