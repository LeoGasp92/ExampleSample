package advanced.tasks.advancedquiz;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    private static ArrayList<Question> questions = new ArrayList<>();
   // Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char again = 'y';
        char option = 'p';

        while (again == 'y'){
            System.out.println("Please choose the quiz topic.");
            System.out.println("1 - Capitals.");
            System.out.println("2 - Books.");
            System.out.println("3 - Rivers.");

            System.out.print("Topic : ");
            int input = scanner.nextInt();

            System.out.println("Do you want to play or add new question ? p/a");
            scanner.nextLine(); // fix bug

            option = scanner.nextLine().charAt(0);

            if(option == 'p'){
                System.out.println("Loading quiz...");
                try{
                    Thread.sleep(2000);
                }catch(Exception e){
                    System.out.println(e);
                }
                init(input);
                System.out.println("Quiz loaded !");
                loop();


            }else if (option == 'a'){
                addQuestion(input);
            }else{
                System.out.println("Invalid Input !");
            }
            System.out.println("Go again ? y/n");
            again = scanner.nextLine().charAt(0);
        }
    }
    private static void init(int number){
        try{
            List<String> lines = Files.readAllLines(Paths.get("Data/quiz" + number + ".txt"));

            int numberOfLinesPerQuestion = Integer.parseInt(lines.get(0)) + 1;// to convert String to int

            for(int i = 1 ; i < lines.size(); i += numberOfLinesPerQuestion){
                Question q; // empty object

                if(numberOfLinesPerQuestion == 4){
                    q = new Question(lines.get(i), lines.get(i+1),lines.get(i+2),lines.get(i+3));
                }else{
                    q = new Question(lines.get(i), lines.get(i+1),lines.get(i+2), lines.get(i+3), lines.get(i+4));
                }
                questions.add(q);
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e);
            System.out.println("Unable to load file ! ");
            System.exit(5);
        }
    }

    private static void loop(){
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int negativeScore = 0;

        while(questions.size() > 0 ){
            Question currentQuestion = questions.remove(0);
            System.out.println(currentQuestion.getText());

            for (int i = 0 ; i < currentQuestion.getAnswers().length; i++){
                System.out.println((i+1) + ") " + currentQuestion.getAnswers()[i]);
            }
            System.out.println("Answer : ");
            int input = scanner.nextInt();

            if(input < 0 || input > currentQuestion.getAnswers().length){
                System.out.println("Invalid Input !");
                System.exit(10);
            }
            if(currentQuestion.getRightAnswer().equals(currentQuestion.getAnswers()[input-1])){
                System.out.println(">>> Correct.\n");
                score++;
            }else{
                System.out.println(">>> Incorrect.\n");
                negativeScore++;
            }

        }
        System.out.println("You got " + score + " correct answers"+ " & " + negativeScore + " incorrect answers.\n");

    }

    private static void addQuestion(int number){
        Scanner scanner = new Scanner(System.in);
        Question q = new Question();

        System.out.println("Please enter question : ");
        String text = scanner.nextLine();
        q.setText(text);

        try{
            List<String> lines = Files.readAllLines(Paths.get("Data/quiz" + number + ".txt"));
            String[] answers = new String[Integer.parseInt(lines.get(0))];

            System.out.println("Please enter 1st answer as correct one: ");

            for(int i = 0; i < answers.length; i++){
                System.out.println("Please enter "+ (i+1) + " answer.");
                answers[i] = scanner.nextLine();
            }
            q.setAnswers(answers);

            File file = new File("Data/quiz" + number + ".txt");
            FileWriter fr = new FileWriter(file,true);
            BufferedWriter br = new BufferedWriter(fr);

            //Writing in file in new line question text
            br.write("\n" + q.getText());
            for(int i = 0; i < q.getAnswers().length; i++){
                br.write("\n" + q.getAnswers()[i]);
            }
            br.close();
            fr.close();

        }catch(Exception e){
            System.out.println(e);
        }




    }
}











/*
public class Game {


    private static ArrayList<Question> questions = new ArrayList<>();

    public static void main(String[] args) {


        char again = 'y';
        char option = 'p';
        Scanner scanner = new Scanner(System.in);
        while (again == 'y'){
            System.out.println("Please choose quiz topic : ");
            System.out.println("1 - Capitals");
            System.out.println("2 - Books");
            System.out.println("3 - Rivers");
            System.out.println("Topic : ");
            int input = scanner.nextInt();
            System.out.println("Do you want to play or add new question ? p/a");
            scanner.nextLine(); //Line fix
            option = scanner.nextLine().charAt(0);

            if(option == 'p'){
                System.out.println("Loading quiz ...");
                try{
                    Thread.sleep(3000);
                }catch(Exception e){
                    System.out.println(e);
                }
                init(input);
                System.out.println("Quiz Loaded !");
                loop();
            } else if (option == 'a') {
                addQuestion(input);
            }else {
                System.out.println("Invalid Input ! ");
            }
            System.out.println("Do you want to do something again ? y/n ");
            again = scanner.nextLine().charAt(0);
            }
        }
        //init(3);
       // loop();
      /*  System.out.println(questions.get(0).getText());
        System.out.println(questions.get(0).getRightAnswer());
        System.out.println(questions.get(2).getText());
        System.out.println(questions.get(2).getRightAnswer());*/

/*

    private static void init(int number){
        try{
            List<String> lines = Files.readAllLines(Paths.get("Data/quiz" + number + ".txt"));
           int numberOfLinesPerQuestion = Integer.parseInt(lines.get(0)) + 1;
           for(int i = 1; i < lines.size(); i += numberOfLinesPerQuestion ){
               Question q;
               if(numberOfLinesPerQuestion == 4){
                   q = new Question(lines.get(i),lines.get(i+1), lines.get(i+2),lines.get(i+3));
               }else{
                   q = new Question(lines.get(i),lines.get(i+1),lines.get(i+2),lines.get(i+3),lines.get(i+4));
               }
               questions.add(q);
           }
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Unable to load file. ");
            System.exit(5);
        }

    }

    private static void loop(){
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        while(questions.size() > 0 ){
            Question currentQuestion = questions.remove(0);
            System.out.println(currentQuestion.getText());

            for (int i = 0; i < currentQuestion.getAnswers().length; i++){
                System.out.println(i + 1 + ")" + currentQuestion.getAnswers()[i]);//this wil help us print out the array
            }
            System.out.println("Answer : ");
            int input = scanner.nextInt();

            if(input < 0 || input> currentQuestion.getAnswers().length){
                System.out.println("Input is Invalid. ");
                System.exit(10);
            }
            if(currentQuestion.getRightAnswer().equals(currentQuestion.getAnswers()[input-1])){
                System.out.println("Correct answer. \n");
                score ++;

            }else{
                System.out.println("Incorrect answer. \n");
            }
        }
        System.out.println("You have " + score + " correct answers. ");
    }

    private static void addQuestion(int number){
        Scanner scanner = new Scanner(System.in);
        Question q = new Question();
        System.out.println("Please enter a new question : ");
        String text = scanner.nextLine();
        q.setText(text);
        try{
            List<String> lines = Files.readAllLines(Paths.get("Data/quiz" + number + ".txt"));
            String[] answers =new String[Integer.parseInt(lines.get(0))];
            System.out.println("Please enter 1. answer as the correct one. ");
            for(int i = 0 ; i< answers.length ; i++){
                System.out.println("Please enter " + (i+1) + ". answer");
                answers[i] = scanner.nextLine();
            }
            q.setAnswers(answers);
            File file = new File("Data/quiz" + number + ".txt") ;
            FileWriter fr = new FileWriter(file , true);
            BufferedWriter br = new BufferedWriter(fr);
            br.write("\n"+ q.getText()); // Writing in file in new line question text
            for(int i = 0; i < q.getAnswers().length; i++){
                br.write("\n" + q.getAnswers()[i]);
            }
            br.close();
            fr.close();

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
*/