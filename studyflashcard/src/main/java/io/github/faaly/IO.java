package io.github.faaly;

import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner;             // Import the Scanner class to read text files
import java.util.ArrayList;
import java.io.File;                  // Import File Class

public class IO 
{

    /*
    * - read from file mit parameter filepath/filename
    * - exceptions werfen
    * - filedata return als string-array
    */

    public IO ()
    {

    }

    public static String[] ReadFromFile(String path)
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
}
