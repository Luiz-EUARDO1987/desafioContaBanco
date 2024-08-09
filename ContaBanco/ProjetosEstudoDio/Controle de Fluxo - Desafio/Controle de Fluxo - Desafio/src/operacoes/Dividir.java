package operacoes;

import servicos.LerInteiro;
import servicos.LerReal;
import servicos.LimparTela;

public class Dividir {
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
            dividendo = LerInteiro.lerNumeroInteiro();
            LimparTela.limparTela();
            System.out.println("Digite o divisor");
            divisor = LerInteiro.lerNumeroInteiro();
            LimparTela.limparTela();
            try
            {
                resultado = dividendo / divisor;
                validação = true;
            }catch(Exception e)
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
            dividendo = LerReal.lerNumeroReal();
            LimparTela.limparTela();
            System.out.println("Digite o divisor");
            divisor = LerReal.lerNumeroReal();
            LimparTela.limparTela();
            try
            {
                resultado = dividendo / divisor;
                validação = true;
            }catch(Exception e)
            {
                System.out.println("O divisor deve ser diferente de zero");
            }
        }
        return resultado;
    }
}
