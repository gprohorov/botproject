package org.goiteens;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ChatBot {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        String botAnswer = process(message);
        System.out.println(botAnswer);
    }
    

    
    public static String process(String message) {
        if (isHelloMessage(message)) {
            String botName = "ChatBot";
            return "Приветствую,   я - " + botName;
        }

        return "  Не понял ";
    }


    private static boolean isHelloMessage(String message) {
        message = message.toLowerCase();

        String helloWord1 = "привет";
        String helloWord2 = "здравствуй";

        return message.contains(helloWord1) || message.contains(helloWord2);
    }
}
