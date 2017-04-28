import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Character;
public class Hangman2
{
    String[] wordList = new String [52];
    String word;
    boolean[] guessed;
    int wrongGuesses = 0;
    int maxGuesses = 10;
    boolean[] used = new boolean[91];
    String status;
   
    
   
   public Hangman2()
    {
        word = randWord();
        guessed = new boolean[word.length()];
        
        for(int i = 0; i < word.length(); i++)
        {
            guessed[i] = false;
        }
        letterCheck(' ');
        
    }
    public String randWord ()
    {
        RandWord word = new RandWord();
        
        return word.words();
    }
    public void gallows ()
    {
        Gallows gallow = new Gallows(wrongGuesses);
        System.out.println(gallow);
    }
   public void solveWord(String x)
    {
        if (x.equals(word))
        System.out.println(word);
    }
    public void letterCheck(char x)
    {
        x = Character.toUpperCase(x);
        if (usedCheck(x))
        System.out.println("enter a different letter!");
        else
       {
            for(int i = 0; i < word.length(); i++)
            {
                if(word.charAt(i) == x)
                {
                    guessed[i] = true;
                }
                 
                    
                }
            if (!(word.contains(Character.toString(x))))
                wrongGuesses++;
                letterUsed(x);
        }
        gallows();
        System.out.print("\r");
        printWord();
        printUsed();
    }
    
    public void printWord()
    {
        for(int i = 0; i < word.length(); i++)
        {
            if(guessed[i])            
                System.out.print(word.charAt(i) + " ");
            else
                System.out.print("_ ");
        }
    }
    
    private void letterUsed (char x)
    {
       used[x] = true;
       
       
    }
    private void printUsed ()
    {
        System.out.println("");
        for (int i = 65; i < 91; i++)
       {
           if (used[i])
           {
             char a = (char)i;
           System.out.print(a + " "); 
        }
        }
    }
    private boolean usedCheck (char x)
    {
        if (used[x])
        return true;
        else
        return false;
    }
    public void newGame ()
    {
        Arrays.fill(used, false);
        for (int i = 65; i < 91; i++)
            System.out.println(used[i]);
    }
    
    public int checkGame() // returns 1 if a win, -1 if a loss, 0 if game is in proggress
    {
        int count = 0;
        for (int i = 0; i < word.length(); i++)
        {
            if (guessed[i])
                count++;
        }
        if (count == word.length())
            return 1; // win
        else if (wrongGuesses >= maxGuesses)
            return -1; // loss
        else
            return 0; // in progress (neither)
    }
}
