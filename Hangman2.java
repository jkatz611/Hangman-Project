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
    int maxGuesses = 9;
    boolean[] used = new boolean[91];
    String status;
    int p1orp2;
    String p2Word;
    int solveSafety = 0;

   public void gamesWord(String p2)
   {
        word = p2;
        guessed = new boolean[word.length()];
        
    }
   public Hangman2()
    {
        
        word = randWord();
        
        
        if (word.contains(Character.toString(' ')))
        wrongGuesses++; //weird fix for issue with words with spaces
        guessed = new boolean[word.length()];
        
        Arrays.fill(guessed, false);
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
        
    }
   public void solveWord(String x)
    {
        x = x.toUpperCase();
        if (x.equals(word))
        {
            for(int i = 0; i < word.length(); i++)
            {
                if(word.charAt(i) != 32 && word.charAt(i) != 39 && word.charAt(i) != 45)
                {
                    guessed[i] = true;
                }
                  
                }
                gallows();
                printWord();
            }
        if (!(x.equals(word)))
        {
            System.out.println("That's the wrong answer!");
            if (solveSafety > 1)
            wrongGuesses++;
            solveSafety++;
        }
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
                gallows();
                printWord();
                printUsed();
        }
        
    }
    
    public void printWord()
    {
        for(int i = 0; i < word.length(); i++)
        {
            if(guessed[i])            
                System.out.print(word.charAt(i) + " ");
             
            else if (word.charAt(i) == 32)
                System.out.print(" ");
           else if (word.charAt(i) == 45)
                System.out.print("- ");
            else if (word.charAt(i) == 39)
                System.out.print("' ");
            else
                System.out.print("_ ");
        }
    }
    
    public void letterUsed (char x)
    {
       used[x] = true;
       
       
    }
    public void printUsed ()
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
        System.out.println("");
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
            if (word.charAt(i) == 32)
                count++;
            if (word.charAt(i) == 45)
                count++;
            if (word.charAt(i) == 39)
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
