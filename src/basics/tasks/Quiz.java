package basics.tasks;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {


        String[][] quizArray = new String[4][4];
        int[] answer = {3, 1, 2, 2};
        int numberOfAnswers = answer.length;
        int score = 0;
        int wrongAnswers = 0;
        //int scorePercentage = (score/(numberOfAnswers)) * 100;


        Scanner scanner = new Scanner(System.in);


        quizArray[0][0] = "Capital city of Australia?";
        quizArray[0][1] = "Sydney";
        quizArray[0][2] = "Melbourne";
        quizArray[0][3] = "Canberra";
        // correct answer is canberra

        quizArray[1][0] = "Capital city of USA?";
        quizArray[1][1] = "Washington";
        quizArray[1][2] = "New York";
        quizArray[1][3] = "Dallas";
        // correct answer is Washington

        quizArray[2][0] = "Capital city of Brazil?";
        quizArray[2][1] = "Rio de Janeiro";
        quizArray[2][2] = "Brasilia";
        quizArray[2][3] = "San paulo";
        // correct answer is Brasilia

        quizArray[3][0] = "Capital city of Canada?";
        quizArray[3][1] = "Montreal";
        quizArray[3][2] = "Ottawa";
        quizArray[3][3] = "Calgary";
        // correct answer is Ottawa

        for (int i = 0; i < quizArray.length; i++) {
            System.out.println(quizArray[i][0]); // printing question


            for (int j = 1 ; j < quizArray[i].length;j++){
                System.out.println("\t\t"+ j +"."+ quizArray[i][j]); // printing answers
            }
            System.out.print("\nAnswer (1-3): ");
            int answerInput = scanner.nextInt();

            if(answerInput == answer[i]){
                System.out.println("Correct\n--------\n--------");
                score ++;
            }else{
                System.out.println("False\n--------\n--------");

                wrongAnswers++;
            }
        }

        System.out.println("You answered correct to " + score + " questions.");
        System.out.println("You have " + wrongAnswers + " wrong answers.");

        //scorePercentage = (score/(numberOfAnswers)) * 100;

        System.out.println("You scored = " + (score * 100/numberOfAnswers)+ "%");
    }
}
