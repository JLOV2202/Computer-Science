public class App {
    public static void main(String[] args) {
        int num = ConsoleUtil.lerInt("Informe um valor inteiro: ");
        try {
            int fat = Fatorial.calcular(num);
            System.out.printf("%d! = %d", num, fat);
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        }
        
    }
}
