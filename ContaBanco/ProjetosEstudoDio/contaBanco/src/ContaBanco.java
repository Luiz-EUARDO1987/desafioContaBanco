/**
 * instanciar class conta
 * receber dados via terminal
 * @author Luiz Eduardo de Jesus
 * @version 0.1
 */
//---------------------
import java.util.Scanner;
import classes.Conta;
import classes.Conta.tipoConta;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
//----------------------
public class ContaBanco 
{
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static ArrayList<Conta> Contas = new ArrayList<>();//tentando instancia
    public static void main(String[] args) throws Exception 
    {
        int opcao = 0;
        String nome = "";
        int i = 0;
        double valor = 0;
        do 
        {
            System.out.printf("Digite uma das opções \n");
            System.out.printf("1 - Criar Conta \n");
            System.out.printf("2 - saldo \n");
            System.out.printf("3 - depositar \n");
            System.out.printf("4 - sacar \n");
            System.out.printf("0 - Sair \n");
            opcao = scanner.nextInt();
            scanner.nextLine();
            i = 0;
            new ProcessBuilder("clear").inheritIO().start().waitFor();
            switch (opcao) {
                case 1:
                    criarConta();
                    break;
                        case 2:
                        System.out.printf("Digite o nome do proprietário da conta\n");
                        nome = scanner.next();
                        scanner.nextLine();
                         i = consultar(nome);
                        Thread.sleep(5000);
                        new ProcessBuilder("clear").inheritIO().start().waitFor();
                        //-----
                        Contas.get(i).saldoCota();
                        Thread.sleep(5000);
                        new ProcessBuilder("clear").inheritIO().start().waitFor();
                        break;
                            case 3:
                            System.out.printf("Digite o nome do proprietário da conta\n");
                            
                            nome = scanner.nextLine();
                             i = consultar(nome);
                            
                            new ProcessBuilder("clear").inheritIO().start().waitFor();
                            //-------------
                            System.out.println("digite o valor desejado");
                            
                            valor = scanner.nextDouble();
                            Contas.get(i).depositar(valor);
                            
                            new ProcessBuilder("clear").inheritIO().start().waitFor();
                            break;
                                case 4:
                                
                                System.out.printf("Digite o nome do proprietário da conta\n");
                                nome = scanner.nextLine();
                                
                                 i = consultar(nome);
                               
                                new ProcessBuilder("clear").inheritIO().start().waitFor();
                                System.out.println("digite o valor que deseja sacar.");
                                valor = scanner.nextDouble();
                                new ProcessBuilder("clear").inheritIO().start().waitFor();
                                Contas.get(i).sacar(valor);
                                break;
                    case 0:
                        System.out.println("Saindo...");
                    break;
                default:
                System.out.println("Opção invalida");
                    break;
            }
        } while (opcao != 0);

    }
    //-----------------função criar conta
    public static void criarConta() throws Exception
    {
        int escolha = 0;
        tipoConta tipo;
        
        //-----nome
        System.out.println("digite seu nome:");
        String nome = scanner.nextLine();
       

        new ProcessBuilder("clear").inheritIO().start().waitFor();
        //------tipo conta
        System.out.printf("Digite 1 para conta corrente.\nDigite 2 para conta poupança.\n");
          
          escolha = scanner.nextInt();
        
        if(escolha == 2)
        {
            tipo = tipoConta.corrente;
        }
        else
        {
            tipo = tipoConta.poupança;
        }

        new ProcessBuilder("clear").inheritIO().start().waitFor();
        //------agencia
        String agencia = "0502";
        //------numero conta
        int numero = random.nextInt(1000000);
        //------saldo inicial
        double saldo = 0;
        //-----instâncias
         Contas.add(new Conta(nome, agencia, numero, saldo,tipo));
       
        
        new ProcessBuilder("clear").inheritIO().start().waitFor();
    }
    //-----------------função consultar conta
    public static int consultar(String nome)
    {
        int posicao = 0;//pegar a posição da conta no arraylist
        String nomeConta = "";//pegar o nome dda posição atual
        for(int i = 0;i < Contas.size(); i++)// loop para passar pela arraylist
        {
            nomeConta =  Contas.get(i).retornarNome() ;//pegando o nome dos proprietário das contas
            if (nome == nomeConta) //comparação dos nomes
            {
                posicao = i;
            }
        }
        return posicao;
    }

}
