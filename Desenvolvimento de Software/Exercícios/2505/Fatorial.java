public class Fatorial {
    
    public static int calcular (int n) throws IllegalArgumentException{
        if (n < 0){
            throw new IllegalArgumentException(String.format("Não existe fatorial de número negativo: %d", n));
        }
        int fat = 1;
        for (int i = n; i > 0; i--){
            fat *= i;
        }
        return fat;
    }
}
