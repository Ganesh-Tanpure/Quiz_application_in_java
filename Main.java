package Quizapplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Quiz q = new Quiz();
        q.logic();
    }
}

class Quiz{

    Scanner sc = new Scanner(System.in);
    int correctAnswer = 0;
    int wrongAnswer = 0;
    int totalCount = 0;

    public void logic(){
        System.out.println();
        Questions q1 = new Questions("Which Statement is true about Java?","A. Java is a sequence-dependent programming langague","B. Java is a code dependent programming langague","C. java is a platform-dependent programming langague","D. Java is a platform-independent programming langague");
        Questions q2 = new Questions("What is the extension of java code files?","A. txt","B. Pdf","C. sql","D. java");
        Questions q3 = new Questions("Who invented java programming langague?","A. Guido van Rossum","B. James Gosling","C. Dennis Ritchie","D. Bjarne Stroustrup");
        Questions q4 = new Questions("Which one of the following is not a java feature?","A. Object oriented","B. Use of pointers","C. Portable","D. Dynamic and Extensible");
        Questions q5 = new Questions("Which of these cannot be used for a variable name in java?","A. Identifier & Keyword", "B. Identifier","C. Keyword","D. None of the above");

        Map<Questions,Character> hmap = new HashMap<>();
        hmap.put(q1,'D');
        hmap.put(q2,'D');
        hmap.put(q3,'B');
        hmap.put(q4,'B');
        hmap.put(q5,'C');

        for (Map.Entry<Questions,Character> map:hmap.entrySet()){
            System.out.println(map.getKey().getQuestion());
            System.out.println(map.getKey().getOption1());
            System.out.println(map.getKey().getOption2());
            System.out.println(map.getKey().getOption3());
            System.out.println(map.getKey().getOption4());

            System.out.println("Enter your answer: ");
            Character ans = sc.next().charAt(0);


            int cans = Character.compare(ans,map.getValue());
            if (cans == 0) {
                System.out.println("Correct");
                correctAnswer++;
                totalCount++;
            }else {
                System.out.println("Wrong");
                wrongAnswer++;
            }

        }

        System.out.println();
        System.out.println("----------Result-----------");
        System.out.println("Total Questions : " +hmap.size());
        System.out.println("Correct Answer: " +correctAnswer);
        System.out.println("Wrong Answer: " +wrongAnswer);
        System.out.println("Score: " +totalCount+ " Out of "+hmap.size());

    }
}
