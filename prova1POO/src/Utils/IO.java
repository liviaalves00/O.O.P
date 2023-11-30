package Utils;
import java.util.Scanner;

public class IO {
    private static Scanner scanner = new Scanner(System.in, "UTF-8").useDelimiter("\n");

    static public String getTexto(String mensagem){
        System.out.println(mensagem);
        return scanner.next();
    }
    static public int getInt(String message) {
        int value = Integer.parseInt(getTexto(message));
        return value;
    }

    static public void closeScanner(){
        scanner.close();
    }
    public static String getString(String string) {
        System.out.println(string);
        return scanner.next();
    }
    public static double getDouble(String string) {
        double valor = Double.parseDouble(getString(string));
        return valor;
    }
    public static void println(String string) {
         System.out.println(string);
    }

   
    
    
}
