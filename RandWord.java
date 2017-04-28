
import java.util.Random;
public class RandWord
{
    String[] wordList = new String [52];
    public RandWord()
    {
        words();
    }
    
    public String words ()
    {
        wordList[0] = "TELEVISION";
        wordList[1] = "FLAMINGO";
        wordList[2] = "MANGO";
        wordList[3] = "KARATE";
        wordList[4] = "VEGAN";
        wordList[5] = "DINGWALL";
        wordList[6] = "COPPER";
        wordList[7] = "FATHER";
        wordList[8] = "COLOURS";
        wordList[9] = "LASER";
        wordList[10] = "ESCARGOT";
        wordList[11] = "BOMB";
        wordList[12] = "JONATHAN";
        wordList[13] = "SARAH";
        wordList[14] = "AIDAN";
        wordList[15] = "KAYLA";
        wordList[16] = "QUENTIN";
        wordList[17] = "JAMIESON";
        wordList[18] = "GALAXY";
        wordList[19] = "BOOKWORM";
        wordList[20] = "ONTARIO";
        wordList[21] = "MONGOOSE";
        wordList[22] = "COMPUTER";
        wordList[23] = "MONITOR";
        wordList[24] = "KEYBOARD";
        wordList[25] = "CHICKPEA";
        wordList[26] = "MICROWAVE";
        wordList[27] = "MOTHERBOARD";
        wordList[28] = "HELMET";
        wordList[29] = "LAWYER";
        wordList[30] = "GOVERNMENT";
        wordList[31] = "WIZARD";
        wordList[32] = "SUBWAY";
        wordList[33] = "STRETCH";
        wordList[34] = "EGLINTON";
        wordList[35] = "BATTERY";
        wordList[36] = "TERMINATOR";
        wordList[37] = "VODKA";
        wordList[38] = "STRENGTH";
        wordList[39] = "PUZZLE";
        wordList[40] = "CHARIOT";
        wordList[41] = "PRIESTESS";
        wordList[42] = "OXYGEN";
        wordList[43] = "KAYAK";
        wordList[44] = "KITTEN";
        wordList[45] = "JERUSALEM";
        wordList[46] = "DAMASCUS";
        wordList[47] = "SINGAPORE";
        wordList[48] = "UKRAINE";
        wordList[49] = "KATRINA";
        wordList[50] = "PURGATORY";
        wordList[51] = "ORANGUTAN";
        
        
        Random rand = new Random();

        int  n = rand.nextInt(52) + 1;
        return wordList[n-1];
    }
}

