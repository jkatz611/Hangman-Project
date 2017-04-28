
/**
 * Write a description of class Gallows here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gallows
{
    // instance variables - replace the example below with your own
    
    public  Gallows(int switchy)
    { 
        switch (switchy) {
            case 1: gall0();
                    System.out.print("\r");
                    break;
            case 2: gall1();
                    break;
            case 3: gall2();
                    break;
            case 4: gall3();
                    break;
            case 5: gall4();
                    break;
            case 6: gall5();
                    break;
            case 7: gall6();
                    break;
            case 8: gall7();
                    break;
            case 9: gall8();
                    break;
        }
    }
    public void test(int switchy)
    { 
        
            if (switchy == 1)
            gall0();
                    
              if (switchy == 2)
              gall1();
                    
              if (switchy == 3)
              gall2();
                    
              if (switchy == 4)
              gall3();
                    
             if (switchy == 5)
             gall4();
                    
              if (switchy ==6)
              gall5();
                    
              if (switchy == 7)
              gall6();
                    
              if (switchy == 8)
              gall7();
                    
             if (switchy == 9)
             gall8();
                    
        
    }
    public void gall0()
    {
        System.out.println("\f==========|");
        System.out.println("| |       |");
        System.out.println("| |");
        System.out.println("| |");
        System.out.println("| |");
        System.out.println("| | __");
        System.out.println("| |___|");
    }
    public void gall1()
    {
        System.out.println("\f==========|");
        System.out.println("| |       |");
        System.out.println("| |       O");
        System.out.println("| |");
        System.out.println("| |");
        System.out.println("| | __");
        System.out.println("| |___|");
    }
    public void gall2()
    {
        System.out.println("\f==========|");
        System.out.println("| |       |");
        System.out.println("| |       O");
        System.out.println("| |       |");
        System.out.println("| |");
        System.out.println("| | __");
        System.out.println("| |___|");
    }
    public void gall3()
    {
        System.out.println("\f==========|");
        System.out.println("| |       |");
        System.out.println("| |       O");
        System.out.println("| |       |");
        System.out.println("| |      /");
        System.out.println("| | __");
        System.out.println("| |___|");
    }
    public void gall4()
    {
        System.out.println("\f==========|");
        System.out.println("| |       |");
        System.out.println("| |       O");
        System.out.println("| |       |");
        System.out.println("| |      / \\");
        System.out.println("| | __");
        System.out.println("| |___|");
    }
    public void gall5()
    {
        System.out.println("\f==========|");
        System.out.println("| |       |");
        System.out.println("| |      \\O");
        System.out.println("| |       |");
        System.out.println("| |      / \\");
        System.out.println("| | __");
        System.out.println("| |___|");
    }
    public void gall6()
    {
        System.out.println("\f==========|");
        System.out.println("| |       |");
        System.out.println("| |      \\O/");
        System.out.println("| |       |");
        System.out.println("| |      / \\");
        System.out.println("| | __");
        System.out.println("| |___|");
    }
    public void gall7()
    {
        System.out.println("\f==========|");
        System.out.println("| |       |");
        System.out.println("| |\"Help\"\\O/");
        System.out.println("| |       |");
        System.out.println("| |      / \\");
        System.out.println("| | __");
        System.out.println("| |___|");
    }
    public void gall8()
    {
        System.out.println("\f==========|");
        System.out.println("| |       |");
        System.out.println("| |\"Game\"\\O/");
        System.out.println("| |\"Over\" |");
        System.out.println("| |      / \\");
        System.out.println("| | __");
        System.out.println("| |___|");
    }
}
