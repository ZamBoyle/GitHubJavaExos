package util;

import java.util.Scanner;

public class UserInput {
    public static  Scanner scanner = new Scanner(System.in);

    public static enum AnswerType {
        STRING,
        INT,
        FLOAT
    }

    public static String AskStr(String question) {
        return (String) AskSomething(question, AnswerType.STRING);
    }

    public static int AskInt(String question) {
        return (int) AskSomething(question, AnswerType.INT);
    }

    public static float AskFloat(String question) {
        return (float) AskSomething(question, AnswerType.FLOAT);
    }

    private static Object AskSomething(String question, AnswerType answerType) {
        System.out.print(question);
        Object answer = null;

        switch (answerType) {
            case STRING :
                answer = scanner.nextLine();    
                break;
            case INT:
                answer = scanner.nextInt();
                scanner.nextLine();
                break;
            case FLOAT:
                answer = scanner.nextFloat();
                scanner.nextLine();            
                break;
            default:
                break;
        }
        return answer;
    }
}