package fantasticworlds;

public class Utility
{
    public static boolean numberInRange(int number, int minimum, int maximum)
    {
        if(number >= minimum && number <= maximum)
            return true;
        else 
            return false;
    }
}