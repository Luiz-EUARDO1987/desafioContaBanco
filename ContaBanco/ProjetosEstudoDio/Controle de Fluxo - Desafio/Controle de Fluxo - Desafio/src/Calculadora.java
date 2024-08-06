import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author Luiz Eduardo de Jesus
 */
public class Calculadora 
{
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) 
    {
        int opcao = 0;
        do
        {


        }while(opcao != 0);
    }
    /**
     * 
     * @return retorna um inteiro depois de validar e tratar exceções
     */
    public static int lerNumeroInteiro()
    {
        int inteiroValidado =0;
        boolean validação = false;
        while (!validação) {
            try
            {
                inteiroValidado = ler.nextInt();
                validação = true;
            } catch(InputMismatchException e)
                {
                    System.out.println("Entrada inválida. Por favor, digite um número inteiro válido.");//saída da exceção.
                    ler.next(); // Descartar entrada inválida

                }
            finally
            {
                ler.nextLine();//limpar buffer de entrada
            }
        }
        return inteiroValidado;
    } 
    /**
     * @Luiz-EUARDO1987
     * @see . ler numero double.
     */
    public static double lerNumeroReal()
    {
        double realValidado = 0;
        boolean validação = false;
        while (!validação) 
        {
            try
            {
                realValidado = ler.nextDouble();
                validação = true;
            }catch(Exception e)
            {
                System.out.println("Entrada inválida. Por favor, digite um número real válido");
                ler.next(); // Descartar entrada inválida
            }
            finally
            {
                ler.nextLine(); //limpar buffer de entrada
            }
        }
        return realValidado;
    }
     /**
     * @see limparTela limpar a tela do terminal.
     * @return void
     * @Luiz-EUARDO1987
     */
    public static void limparTela()
    {
        try 
        {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    /**
     * @Luiz-EUARDO1987
     * @see . Pause para ler o programa.
     */
    public static void pause()
    {
        try
        {
            Thread.sleep(5000);
        } catch(Exception e)
        {
            System.out.println("Erro ao pausar o programa.");
        }
    }
    /**
     * @Luiz-EUARDO1987
     * @see . soma dois numero inteiros
     */
    public static int soma()
    {
        int soma = 0;
        int numero1 =0, numero2 = 0;
        System.out.println("Digite o primeiro numero ?");
        numero1 = lerNumeroInteiro();
        limparTela();
        System.out.println("Digite o segundo numero");
        numero2 = lerNumeroInteiro();
        limparTela();
        soma = numero1 + numero2;
        return soma;
    }
      /**
     * @Luiz-EUARDO1987
     * @see . soma dois números reais. 
     */
    public static double soma2()
    {
        double soma = 0;
        double numero1 =0, numero2 = 0;
        System.out.println("Digite o primeiro numero");
        numero1 = lerNumeroInteiro();
        limparTela();
        System.out.println("Digite o segundo numero");
        numero2 = lerNumeroInteiro();
        limparTela();
        soma = numero1 + numero2;
        return soma;
    }
    /**
     * @Luiz-EUARDO1987
     * @see . subtrai dois números inteiros
    */ 
    public static int subtrai()
    {
        int resto = 0;
        int numero1 =0, numero2 = 0;
        System.out.println("Digite o primeiro numero");
        numero1 = lerNumeroInteiro();
        limparTela();
        System.out.println("Digite o segundo numero");
        numero2 = lerNumeroInteiro();
        limparTela();
        resto = numero1 - numero2;
        return resto;
    }
     /**
     * @Luiz-EUARDO1987
     * @see . subtrai2 dois números reais
    */ 
    public static double subtrai2()
    {
        double resto = 0;
        double numero1 =0, numero2 = 0;
        System.out.println("Digite o primeiro numero");
        numero1 = lerNumeroInteiro();
        limparTela();
        System.out.println("Digite o segundo numero");
        numero2 = lerNumeroInteiro();
        limparTela();
        resto = numero1 - numero2;
        return resto;
    }
    /**
     * @Luiz-EUARDO1987
     * @see . multiplica dois numero inteiros diferentes de zero
    */
    public static int multiplica()
    {
        int produto = 0;
        int numero1 =0, numero2 = 0;
        boolean validação = false;
        while(!validação)
        {
        System.out.println("Digite o primeiro numero");
        numero1 = lerNumeroInteiro();
        limparTela();
        System.out.println("Digite o segundo numero");
        numero2 = lerNumeroInteiro();
        limparTela();
        if(numero1 != 0 && numero2 !=0)
        {
            produto = numero1 * numero2;
            validação = true;
        }else
        {
            System.out.println("Os números devem ser diferentes de zero");
        }
        }
        return produto;
    }
    /**
     * @Luiz-EUARDO1987
     * @see . multiplica dois numero reais diferentes de zero
    */
    public static double multiplica2()
    {
        double produto = 0;
        double numero1 =0, numero2 = 0;
        boolean validação = false;
        while(!validação)
        {
        System.out.println("Digite o primeiro numero");
        numero1 = lerNumeroInteiro();
        limparTela();
        System.out.println("Digite o segundo numero");
        numero2 = lerNumeroInteiro();
        limparTela();
        if(numero1 != 0 && numero2 !=0)
        {
            produto = numero1 * numero2;
            validação = true;
        }else
        {
            System.out.println("Os números devem ser diferentes de zero");
        }
        }
        return produto;
    }
    /**
     * @Luiz-EUARDO1987
     * @see . faz uma divisão entre dois números inteiros
     */
    public static int divide(){
        int dividendo = 0, divisor = 0;
        int resultado = 0;
        boolean validação = false;
        while(!validação)
        {
            System.out.println("Digite o dividendo");
            dividendo = lerNumeroInteiro();
            limparTela();
            System.out.println("Digite o divisor");
            divisor = lerNumeroInteiro();
            limparTela();
            if(divisor != 0)
            {
                resultado = dividendo / divisor;
                validação = true;
            }else
            {
                System.out.println("O divisor deve ser diferente de zero");
            }
        }
        return resultado;
    }

    /**
    * @Luiz-EUARDO1987
    * @see . faz uma divisão entre dois números reais
    */
    public static double divide2()
    {
        double dividendo = 0, divisor = 0;
        double resultado = 0;
        boolean validação = false;
        while(!validação)
        {
            System.out.println("Digite o dividendo");
            dividendo = lerNumeroInteiro();
            limparTela();
            System.out.println("Digite o divisor");
            divisor = lerNumeroInteiro();
            limparTela();
            if(divisor != 0)
            {
                resultado = dividendo / divisor;
                validação = true;
            }else
            {
                System.out.println("O divisor deve ser diferente de zero");
            }
        }
        return resultado;
    }
}
