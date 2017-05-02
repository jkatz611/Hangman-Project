
/**
 * Write a description of class play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class play
{
    
    
    public static void main (String[] args)
    {
        Hangman2 game = new Hangman2();
        Scanner scan = new Scanner(System.in);
        
        String word = new String();
   
        System.out.println("HANGMAN: by Jonathan, Quentin, Sarah, Aiden & Kayla."); //name of the game
        System.out.println("Version 0.6 \u00A9 2017."); // version # and copyright
        
        int playerNum = 4;
        int wordNum = 0;
        String playAgain = "";
        int p1WR = 0;
        int p2WR = 0;
        int twoPlayCount = 0;
        while(playerNum !=0 || playerNum != 1 || playerNum != 2 || playerNum != 3)
        {
            
          System.out.println("Enter a 0 for instructions, 1 for a 1 person game, 2 for a 2 person game, or 3 to quit.");
          playerNum = scan.nextInt();
          if (playerNum == 0)
          {
              System.out.println("1 Player Mode:");
              System.out.println("Play against the computer! Every time you guess a letter right, it will fill in a blank.");
              System.out.println("If you guess a letter wrong, a body part will appear on the hangman.");
              System.out.println("All guessed letters will appear under the word so you don't guess the same one twice.");
              System.out.println("2 Player Mode:");
              System.out.println("Play against a friend! Same rules, but your friend choses the word instead of the computer.");
              
            }
            if (playerNum == 3)
            System.exit(0);
          
          if(playerNum==1)
         {
           
         }            
         else if(playerNum == 2)
          {
            System.out.println("One player turn around, while the other player types words.");
            System.out.println("How many words (1 to 5)?");
            wordNum = scan.nextInt();
            
            if (wordNum > 1)
            { String[] words = new String [wordNum];
                
                for (int j = 1; j < wordNum + 1; j++)
                {
                System.out.println("Type in word " + j );
                words[j-1] = scan.next();
               }  
               for (int k = 0; k < wordNum; k++)
               {
                   word = word + " " + words[k];
                }
                System.out.print(word);
           }
            else
            {
            
                System.out.println("type a word");
            word = scan.next();
          }
            
           word = word.toUpperCase();
            game.gamesWord(word);
            System.out.println("\fTell the other player to turn around.");
            
         }
         
         if (playerNum == 1 || playerNum == 2)
         {
         int check = 0;
         String input;
         String input2 = "";
         while (check == 0)
         {
            System.out.println("");
            System.out.println("Type a letter, then press ENTER, or type in solve if you want to guess the answer");
             input = scan.next();
             input = input.toUpperCase();
            if (input.equals("SOLVE"))
            {
                if (wordNum > 1)
                {
                String[] inputs = new String [wordNum];
                
                for (int j = 1; j < wordNum + 1; j++)
                {
                System.out.println("Guess the word " + j );
                inputs[j-1] = scan.next();
               }  
               for (int k = 0; k < wordNum; k++)
               {    
                   input2 = input2 + " " + inputs[k];
                }
                System.out.println(input2);
                game.solveWord(input2);
            }
                else
                {System.out.println("What is your guess?");
                input = scan.next();
                game.solveWord(input);
                
               }
                check = game.checkGame();
            }
            
            else if (!(input.equals("SOLVE")))
                {
                    char letter = input.charAt(0);
            game.letterCheck(letter);
            check = game.checkGame();
           }
            if (check == 1)
            {
                System.out.println("");
                System.out.println("YOU WIN!");
                if (playerNum == 2)
                {
                    twoPlayCount++;
                    if (twoPlayCount % 2 != 0)
                    
                        p1WR++;
                    
                    if (twoPlayCount % 2 == 0)
                        p2WR++;
                    if (p1WR > p2WR)
                    System.out.println("Player 1 has won " + p1WR + " out of " + twoPlayCount + " games!");
                    if (p2WR > p1WR)
                    System.out.println("Player 1 has won " + p2WR + " out of " + twoPlayCount + " games!");
                }
                System.out.println("Do you want to play again? (Y/N)");
                playAgain = scan.next();
                if (playAgain.equals("y"))
                break;
                else
                System.exit(0);
            }
            if (check == -1)
            {
                System.out.println("GAME OVER");
                word = game.word;
                System.out.println("the answer was " + word);
                 if (playerNum == 2)
                {
                    twoPlayCount++;
                    if (twoPlayCount % 2 != 0)
                    
                        p1WR++;
                    
                    if (twoPlayCount % 2 == 0)
                        p2WR++;
                        if (p1WR > p2WR)
                    System.out.println("Player 1 has won " + p1WR + " out of " + twoPlayCount + " games!");
                    if (p2WR > p1WR)
                    System.out.println("Player 1 has won " + p2WR + " out of " + twoPlayCount + " games!");
                }
                System.out.println("Do you want to play again? (Y/N)");
                playAgain = scan.next();
                if (playAgain.equals("y"))
                break;
                else
                System.exit(0);
            }
          }
          playerNum=4;
        }
        }
        
    }
}


