import java.util.Scanner;

public class io {
    private static Scanner scanner = new Scanner(System.in, "UTF-8").useDelimiter("\n");

    static public String getText() {
        return getTexto("Enter text: ").trim().toLowerCase();  
    }
    
    static public String getTexto(String message) {
        System.out.print(message);
        return scanner.next();
    }
}
