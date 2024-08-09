package servicos;
import java.util.Scanner;
public class LerReal {
    /**
     * @Luiz-EUARDO1987
     * @see . ler numero double.
     */
    static Scanner ler = new Scanner(System.in);
    public static double lerNumeroReal()
    {
        double realValidado = 0;
                try
                {
                    realValidado = ler.nextDouble();
                }catch(Exception e)
                {
                    System.out.println("Entrada inválida. Por favor, digite um número real válido");
                    ler.next(); // Descartar entrada inválida
                }
                finally
                {
                    ler.nextLine(); //limpar buffer de entrada
                }
            return realValidado;
        
    }
}
