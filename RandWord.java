
import java.util.Random;
public class RandWord
{
    String[] wordList = new String [127];
    
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
        wordList[52] = "THE HANGED MAN";
        wordList[53] = "HANG-MAN";
        wordList[54] = "THE QUEEN IS DEAD";
        wordList[55] = "CALIGULA";
        wordList[56] = "THE WHEEL OF FORTUNE";
        wordList[57] = "BERNIE SANDERS";
        wordList[58] = "MACBOOK PRO";
        wordList[59] = "SYKES-PICOT";
        wordList[60] = "GOLDRUSH";
        wordList[61] = "TORONTO BLUEJAYS";
        wordList[62] = "SMASH MOUTH";
        wordList[63] = "FREE FRANCE";
        wordList[64] = "DELAWARE";
        wordList[65] = "PENNSYLVANIA";
        wordList[66] = "NEW JERSEY";
        wordList[67] = "GEORGIA";
        wordList[68] = "CONNECTICUT";
        wordList[69] = "MASSACHUSETTS";
        wordList[70] = "MARYLAND";
        wordList[71] = "SOUTH CAROLINA";
        wordList[72] = "NEW HAMPSHIRE";
        wordList[73] = "VIRGINIA";
        wordList[74] = "NEW YORK";
        wordList[75] = "NORTH CAROLINA";
        wordList[76] = "RHODE ISLAND";
        wordList[77] = "VERMONT";
        wordList[78] = "KENTUCKY";
        wordList[79] = "TENNESSEE";
        wordList[80] = "OHIO";
        wordList[81] = "LOUISIANA";
        wordList[82] = "INDIANA";
        wordList[83] = "MISSISSIPPI";
        wordList[84] = "ILLINOIS";
        wordList[85] = "ALABAMA";
        wordList[86] = "MAINE";
        wordList[87] = "MISSOURI";
        wordList[88] = "ARKANSAS";
        wordList[89] = "MICHIGAN";
        wordList[90] = "FLORIDA";
        wordList[91] = "TEXAS";
        wordList[92] = "IOWA";
        wordList[93] = "WISCONSIN";
        wordList[94] = "CALIFORNIA";
        wordList[95] = "MINNESOTA";
        wordList[96] = "OREGON";
        wordList[97] = "KANSAS";
        wordList[98] = "WEST VIRGINIA";
        wordList[99] = "NEVADA";
        wordList[100] = "NEBRASKA";
        wordList[101] = "COLORADO";
        wordList[102] = "NORTH DAKOTA";
        wordList[103] = "SOUTH DAKOTA";
        wordList[104] = "MONTANA";
        wordList[105] = "WASHINGTON";
        wordList[106] = "IDAHO";
        wordList[107] = "WYOMING";
        wordList[108] = "UTAH";
        wordList[109] = "OKLAHOMA";
        wordList[110] = "NEW MEXICO";
        wordList[111] = "ARIZONA";
        wordList[112] = "ALASKA";
        wordList[113] = "HAWAII";
        wordList[114] = "ONTARIO";
        wordList[115] = "QUEBEC";
        wordList[116] = "NOVA SCOTIA";
        wordList[117] = "NEW BRUNSWICK";
        wordList[118] = "MANITOBA";
        wordList[119] = "NORTHWEST TERRITORIES";
        wordList[120] = "BRITISH COLUMBIA";
        wordList[121] = "PRINCE EDWARD ISLAND";
        wordList[122] = "THE YUKON";
        wordList[123] = "SASKATCHEWAN";
        wordList[124] = "ALBERTA";
        wordList[125] = "NEWFOUNDLAND";
        wordList[126] = "NUNAVUT";
        
        Random rand = new Random();

        int  n = rand.nextInt(127) + 1;
        return wordList[n-1];
    }
}

