import java.util.Scanner;

public class Driver{

    public static void main(String[] args){
        //Today we are learning about Objects, Classes, and a little bit of OOP

        //Why because we are cool and love to learn new stuffs!
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a language: English, Chinese, Spanish, Hindi");
        String language = sc.nextLine();

        ChatBotService chatService1 = new ChatBotService();
        // Type       referenceName = new ChatBotConstructor 
        chatService1.cbslanguage = language;
        
        String result = chatService1.helloMessage();
        System.out.println(result);

        String exitresult = chatService1.goodMessage();
        System.out.println(exitresult);

        // System.out.println("Enter another value for another language");
        language = sc.nextLine();

        ChatBotService chatService2 = new ChatBotService();
        chatService2.cbslanguage = language;

        String result2 = chatService2.helloMessage();
        System.out.println(result2);

        String exitResult2 = chatService2.goodMessage();
        System.out.println(exitResult2);

        sc.close();



    }

}