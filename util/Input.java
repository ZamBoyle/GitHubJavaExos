package util;

import java.util.Scanner;

public class Input {
    static enum AnswerType {
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
        Scanner scanner = new Scanner(System.in);
        System.out.print(question);
        Object answer = null;

        if (answerType.equals(AnswerType.STRING)) {
            answer = scanner.nextLine();
        } else if (answerType.equals(AnswerType.INT)) {
            answer = scanner.nextInt();
        } else if (answerType.equals(AnswerType.FLOAT)) {
            answer = scanner.nextFloat();
        }
        return answer;
    }
}
