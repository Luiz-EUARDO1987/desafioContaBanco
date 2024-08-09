package operacoes;
import servicos.LerInteiro;
import servicos.LerReal;
import servicos.LimparTela;
import servicos.Pausar;
public class Somar {
      /**
     * @return 
     * @Luiz-EUARDO1987
     * @see . soma dois numero inteiros
     */
    public static int soma()
    {
        int soma = 0;
        int numero1 =0, numero2 = 0;
        boolean validacao = false;
        while(!validacao)
        {

            System.out.println("Digite o primeiro numero");
            numero1 = LerInteiro.lerNumeroInteiro();
            LimparTela.limparTela();
            System.out.println("Digite o segundo numero");
            numero2 = LerInteiro.lerNumeroInteiro();
            LimparTela.limparTela();
            try {
                soma = numero1 + numero2;
                validacao = true;
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Por favor, Digite numero inteiro.");
                Pausar.pause();
                LimparTela.limparTela();
            }
            
        }
		return soma;
        
    }
      /**
     * @Luiz-EUARDO1987
     * @see . soma dois números reais. 
     */
    public static double soma2()
    {
        Double soma02 = 0.;
        Double numero1, numero2;
        boolean validacao = false;
        while(!validacao)
        {

            System.out.println("Digite o primeiro numero");
            numero1 = LerReal.lerNumeroReal();
            LimparTela.limparTela();
            System.out.println("Digite o segundo numero");
            numero2 = LerReal.lerNumeroReal();
            LimparTela.limparTela();
            try {
                soma02 = numero1 + numero2;
                validacao = true;
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Por favor, Digite numero real.");
                Pausar.pause();
                LimparTela.limparTela();
            }
        }
		return soma02;
        
    }
}
