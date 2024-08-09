package operacoes;
import servicos.LerInteiro;
import servicos.LerReal;
import servicos.LimparTela;
import servicos.Pausar;
public class Subtrir {
     /**
     * @Luiz-EUARDO1987
     * @see . subtrai dois números inteiros
    */ 
    public static int subtrai()
    {
        int resto = 0;
        int numero1 =0, numero2 = 0;
        boolean validar = false;
        while(!validar)
        {

            System.out.println("Digite o primeiro numero");
            numero1 = LerInteiro.lerNumeroInteiro();
            LimparTela.limparTela();
            System.out.println("Digite o segundo numero");
            numero2 = LerInteiro.lerNumeroInteiro();
            LimparTela.limparTela();
            try {
                resto = numero1 - numero2;
                validar = true;
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Por favor, Digite um numero inteiro");
                Pausar.pause(); 
                LimparTela.limparTela();
            }
        }
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
        boolean validar = false;
        while(!validar)
        {
            System.out.println("Digite o primeiro numero");
            numero1 = LerReal.lerNumeroReal();
            LimparTela.limparTela();
            System.out.println("Digite o segundo numero");
            numero2 = LerReal.lerNumeroReal();
            LimparTela.limparTela();
            resto = numero1 - numero2;
            try {
                resto = numero1 - numero2;
                validar = true;
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Por favor, Digite um numero real");
                Pausar.pause();
                LimparTela.limparTela();
            }
        }
        return resto;
    }
}
