import operacoes.*;
import servicos.*;
/**
 * @author Luiz Eduardo de Jesus
 */
public class Calculadora 
{
    
    public static void main(String[] args) 
    {
        boolean validacao = false;
        do// loop infinito até a condição ser satisfeita.
        {
            int inteiroReal =0;
            do 
            {
                
                System.out.println("Seja bem vindo a calculadora");
                System.out.println("1 - operações com numeros inteiros");
                System.out.println("2 - operações com numeros reais");
                System.out.println("3 - sair");
                inteiroReal = LerInteiro.lerNumeroInteiro();
                LimparTela.limparTela();
            }while(inteiroReal < 1 && inteiroReal > 3);
            switch (inteiroReal) // escolha entre numero inteiro, reais ou sair
            {
                case 1://inteiro
                    int opcao = 0;
                    do
                    {
                        System.out.println("1 - somar");
                        System.out.println("2 - subtrair");
                        System.out.println("3 - multiplicar");
                        System.out.println("4 - dividir");
                        opcao = LerInteiro.lerNumeroInteiro();
                        LimparTela.limparTela();
                    }while (opcao < 1 && opcao > 3);

                    switch (opcao) //operação com numeros inteiros
                    {

                        case 1://soma
                            int soma = Somar.soma();
                            System.out.printf("soma: %d",soma);
                            Pausar.pause();
                            LimparTela.limparTela();
                            break;
                            //-----
                        case 2://subtração
                            int subtracao = Subtrir.subtrai();
                            System.out.printf("Resto: %d",subtracao);
                            Pausar.pause();
                            LimparTela.limparTela();
                            break;
                        //--------
                        case 3://multiplicação
                        int multiplicacao = Multiplicar.multiplica();
                        System.out.printf("produto: %d",multiplicacao);
                        Pausar.pause();
                        LimparTela.limparTela();
                            break;
                        //--------
                        case 4://divisão
                        int divisao = Dividir.divide();
                        System.out.printf("produto: %d",divisao);
                        Pausar.pause();
                        LimparTela.limparTela();
                            break;
                        default://erro
                        System.out.println("Escolha uma opção válida");
                        Pausar.pause();
                        LimparTela.limparTela();
                            break;
                    }
                    break;
                case 2://real
                int opcao2 = 0;
                do
                {
                    System.out.println("1 - somar");
                    System.out.println("2 - subtrair");
                    System.out.println("3 - multiplicar");
                    System.out.println("4 - dividir");
                    opcao2 = LerInteiro.lerNumeroInteiro();
                    LimparTela.limparTela();
                }while (opcao2 <1 && opcao2 >4);

                switch (opcao2) //operação com numeros inteiros
                {
                    case 1://soma
                        double soma2 = Somar.soma2();
                        System.out.printf("soma: %.2f",soma2);
                        Pausar.pause();
                        LimparTela.limparTela();
                        break;
                        //-----
                    case 2://subtração
                        double subtracao = Subtrir.subtrai2();
                        System.out.printf("resto: %.2f",subtracao);
                        Pausar.pause();
                        LimparTela.limparTela();
                        break;
                    //--------
                    case 3://multiplicação
                    double multiplicacao = Multiplicar.multiplica2();
                    System.out.printf("Produto: %.2f",multiplicacao);
                    Pausar.pause();
                    LimparTela.limparTela();
                        break;
                    //--------
                    case 4://divisão
                    double divisao = Dividir.divide2();
                    System.out.printf("produto: %.2f",divisao);
                    Pausar.pause();
                    LimparTela.limparTela();
                        break;
                    default://erro
                    System.out.println("Escolha uma opção válida");
                        break;
                }
                    break;
                case 3://sair
                                System.out.println("Grato por nos escolher, até a proxima.");
                                validacao = true;
                            break;
                default://----Erro
                    System.out.println("Opção invalida, por favor escolha uma opção válida.");
                    Pausar.pause();
                    LimparTela.limparTela();
                    break;
            }

        }while(!validacao);
    }
   
}
