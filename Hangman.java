import java.util.Arrays;
/**
 * Write a description of class Hangman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
    public class Hangman
{
    String word;
    char[] guessed;
    int wrongGuesses = 0;

    public Hangman()
    {
        word = "television";
    }

   public void letterCheck(char x)
    {
       String temp = word;
       int[] indexes = new int[word.length()];
       for (int i=0; i < word.length(); )
       {
            indexes[i] = temp.indexOf(x);
            if (temp.indexOf(x) > -1) i = temp.indexOf(x);
            else i++; 
       }
       int sum = 0;
       for (int i=0; i < word.length(); i++)
       {
           if (indexes[i] > -1)
           {
                sum++;
                break;
           }
       }
       if (sum == 0)
            wrongGuesses++;
    }


   public boolean[] used = new boolean[123];
   
   public void letterUsed (char x)
   {
       
       used[x] = true;
       
       
       for (int i = 97; i < 123; i++)
       {
           if (used[i])
           {
             char a = (char)i;
           System.out.print(a + " "); 
        }
        }
       
    }
    public void newGame ()
    {
        Arrays.fill(used, false);
        for (int i = 97; i < 123; i++)
       System.out.println(used[i]);
    }
}