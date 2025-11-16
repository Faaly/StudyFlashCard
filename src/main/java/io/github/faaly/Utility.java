package io.github.faaly;

public class Utility 
{
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

}
