package operacoes;
import servicos.LerInteiro;
import servicos.LerReal;
import servicos.LimparTela;
import servicos.Pausar;
public class Multiplicar {
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
            numero1 = LerInteiro.lerNumeroInteiro();
            LimparTela.limparTela();
            System.out.println("Digite o segundo numero");
            numero2 = LerInteiro.lerNumeroInteiro();
            LimparTela.limparTela();
            if(numero1 != 0 && numero2 !=0)
            {
                try {
                    produto = numero1 * numero2;
                    validação = true;
                } catch (Exception e) {
                    System.out.println("Os números devem ser diferentes de zero");
                    Pausar.pause();
                    LimparTela.limparTela();
                }
            }else
            {
                System.out.printf("Os número deve diferir de zero");
                Pausar.pause();
                LimparTela.limparTela();
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
        System.out.println("Digite o primeiro número real");
        numero1 = LerReal.lerNumeroReal();
        LimparTela.limparTela();
        System.out.println("Digite o segundo número real");
        numero2 = LerReal.lerNumeroReal();
        LimparTela.limparTela();
        if(numero1 != 0 && numero2 !=0)
        {
            try {
                produto = numero1 * numero2;
                validação = true;
            } catch (Exception e) {
                System.out.println("Os números devem ser tipo real");
                Pausar.pause();
                LimparTela.limparTela();
            }
        }else
        {
            System.out.println("Os números devem ser diferentes de zero");
            Pausar.pause();
            LimparTela.limparTela();
        }
        }
        return produto;
    }
}
