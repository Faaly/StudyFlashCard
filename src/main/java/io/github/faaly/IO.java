package io.github.faaly;

import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner;             // Import the Scanner class to read text files
import java.util.ArrayList;
import java.io.Console;
import java.io.File;                  // Import File Class

public class IO 
{


    public IO ()
    {

    }

    public String[] ReadFromFile(String path)
    {   
        ArrayList<String> lines = new ArrayList<>();
        File file = new File(path);
        
        try (Scanner fileReader = new Scanner(file)) 
        {
            while (fileReader.hasNextLine()) 
            {
                lines.add(fileReader.nextLine());
            }
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("> ERROR: File: "+ path + " not found!\n" + e.getMessage());
        }

        if(lines.isEmpty())
        {
            lines.add("> ERROR: FileData of " + path + " empty!");
        }

        return lines.toArray(new String[0]);
    }

    // public String InputString(String output)
    // {
    //     System.out.println(output);
    //     String input = System.console().readLine();
    //     if(input.isEmpty() || input == null || input.isBlank())
    //     {
    //         throw new Exception("ERROR: Input is invalid!");
    //     }

    //     return input;
    // }

    public Boolean UserWillExit(String output)
    {
        System.out.println(output);
        String input = System.console().readLine();
        char a = input.charAt(0);
        if(a == 'y'|| a == 'Y'){
            return true;
        }
        return false;
    }


}

