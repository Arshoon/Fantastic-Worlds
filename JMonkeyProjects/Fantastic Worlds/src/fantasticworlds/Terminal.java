package fantasticworlds;

public class Terminal
{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    private static String getTextColor(TextColor color)
    {
        String textColor = "";
        
        switch(color)
        {
            case black: textColor = ANSI_BLACK; break;
            case blue: textColor = ANSI_BLUE; break;
            case cyan: textColor = ANSI_CYAN; break;
            case green: textColor = ANSI_GREEN; break;
            case purple: textColor = ANSI_PURPLE; break;
            case red: textColor = ANSI_RED; break;
            case white: textColor = ANSI_WHITE; break;
            case yellow: textColor = ANSI_YELLOW; break;            
        }
        
        return textColor;
    }
    
    public static void write(String text)
    {
        System.out.print(text);
    }
    
    public static void writeLine(String text)
    {
        System.out.println(text);
    }
    
    public static void writeWithColor(String text, TextColor color)
    {
        System.out.print(getTextColor(color) + text + ANSI_RESET);
    }
    
    public static void writeLineWithColor(String text, TextColor color)
    {
        System.out.println(getTextColor(color) + text + ANSI_RESET);
    }
}