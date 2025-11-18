package io.github.faaly;

public class Utility 
{
    public static String CSI = "\u001b[";

    public static String CLEAR_SCREEN = CSI+"2J";

    public static void clearConsoleScreen()
    {
        try
        {
            System.out.print("\033[H\033[2J");
            System.out.flush();

        } catch (final Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static String clearConsoleScreenByAnsi(int row, int col)
    {
        return CSI+row+";"+col+"H";
    }

}
