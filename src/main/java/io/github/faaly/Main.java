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
        {   for(int i = 0; i < 10; i++)
            {
            Random rand = new Random();
            int n = rand.nextInt(fileDataQuestion.length);
            
        
            System.out.println("\n\nFrage: " + fileDataQuestion[n]  +  "\n\nThink about it, then please hit enter.");
            System.console().readLine();
            System.out.println("Antwort: " + fileDataAnswer[n] + "\n\n");

            System.out.println("If you're ready for the next question, please hit enter");
            System.console().readLine();
            Utility.clearConsoleScreen();
            System.out.print(Utility.clearConsoleScreenByAnsi(1, 1));

            }
            
            exit = utility.UserWillExit("Quit? (Y/N)");
        } 
        while (!exit);
    }
}