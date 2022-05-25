import java.util.Scanner;

public class ConsoleUtil {
    public static int lerInt(String msg) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println(msg);
            while (true) {
                try {                
                    String str = input.next();
                    int n = Integer.parseInt(str);
                    return n;
                } catch (NumberFormatException ex) {
                    System.out.println("Valor invalido!");
                }
            }
        } finally {
            input.close();
        }
    }
}
