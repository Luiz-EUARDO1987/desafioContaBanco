package servicos;

import java.util.InputMismatchException;
import java.util.Scanner;
public class LerInteiro {

     /**
     * 
     * @return retorna um inteiro depois de validar e tratar exceções
     */
    static Scanner ler = new Scanner(System.in);  
    public static int lerNumeroInteiro()
    {
        int inteiroValidado =0;
        
            try
            {
                inteiroValidado = ler.nextInt();
            } catch(InputMismatchException e)
            {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro válido.");//saída da exceção.
                ler.nextLine(); // Descartar entrada inválida
                Pausar.pause();
                LimparTela.limparTela();
            }
            finally
            {
              ler.nextLine();//limpar buffer de entrada
            }
        return inteiroValidado;
    } 
}
