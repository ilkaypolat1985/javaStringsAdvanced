import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String message = "It is very good";

        System.out.println(message);

        // Replaces character with the new one and returns the resultant
        String newMessage = message.replace(' ', '-');
        System.out.println(newMessage);

        // Returns one part of the message
        System.out.println(message.substring(6));
        System.out.println(message.substring(6, 10));

        // Splits the message according to given argument
        for(String word: message.split(" ")){
            System.out.println(word);
        }

        System.out.println(message.toLowerCase(Locale.ENGLISH));
        System.out.println(message.toUpperCase(Locale.ENGLISH));

        // Trims the log
        String log = " blabla bla bla bla";
        System.out.println(log.trim());
    }
}
