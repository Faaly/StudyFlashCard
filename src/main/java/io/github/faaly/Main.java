package io.github.faaly;


import java.util.Random;

public class Main 
{
    public static void main(String[] args) 
    {
        IO utility = new IO();
        String fileNameQuestion = "Questions.txt";
        String fileNameAnswer = "Answers.txt";
        String[] fileDataQuestion = utility.ReadFromFile(fileNameQuestion);
        String[] fileDataAnswer = utility.ReadFromFile(fileNameAnswer);

        boolean exit = false;
        do 
        {
            Random rand = new Random();
            int n = rand.nextInt(fileDataQuestion.length);
            
        
            System.out.println(fileDataQuestion[n]  +  "\n\nIf you're ready, please hit enter.");
            System.console().readLine();
            System.out.println(fileDataAnswer[n]);
            
            exit = utility.UserWillExit("Quit? (Y/N)");
        } 
        while (!exit);
    }
}