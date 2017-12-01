package fantasticworlds.system;

import java.util.Random;

public class Dice
{
    private static Random dicebag = new Random();
    
    public static int dVariable(int low, int high)
    {
        return dicebag.nextInt(high) + low;
    }
}