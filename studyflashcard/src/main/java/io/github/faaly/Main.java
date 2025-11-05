package io.github.faaly;

public class Main 
{
    public static void main(String[] args) 
    {
        
        String fileName = "Demofile.txt";
        String[] fileData = IO.ReadFromFile(fileName);
        for (String line : fileData)
        {
            System.out.println(line);
        }
        System.console().readLine();
    }

}