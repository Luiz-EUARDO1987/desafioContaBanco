package classes;
//----------------criando o objeto conta
public class Conta 
{
    //------------declarando os atributos
    public enum tipoConta {corrente,poupança};
    private String nomeCliente = "";
    private String agencia = "";
    private int numeroConta = 0;
    private double saldoCota = 0;
    private tipoConta tipo;
    //--------------------criando o construtor
    public Conta(String nome, String agencia, int numeroConta, double saldoCota, tipoConta tipo) {
        this.nomeCliente = nome;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldoCota = saldoCota;
        this.tipo = tipo;
    }
    //---------------------criando a função deposito
    public void depositar(double valor) 
    {
        if (valor > 0) {
            this.saldoCota += valor;
            System.out.println("Depósito realizado com sucesso. Novo saldo: " + this.saldoCota);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }
    //-----------------------criando a função sacar
    public void sacar(double valor) throws Exception
    {
        if (valor < this.saldoCota) {
            this.saldoCota -= valor;
            System.out.printf("saque realizado com sucesso\n. Novo saldo: %.2f\n", this.saldoCota);
            Thread.sleep(3000);
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        } else {
            System.out.println("Valor inválido para sacar.");
            Thread.sleep(3000);
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        }
    }
    //-------------------------criando a função saldo
    public void saldoCota()
    {
        System.out.printf("Nome: %s\n",this.nomeCliente);
        System.out.printf("Tipo de conta: %s\n",tipo);
        System.out.printf("Agencia: %s \n",this.agencia);
        System.out.printf("Conta: %d\n", this.numeroConta);
        System.out.printf("Saldo da conta: %.2f\n", this.saldoCota);
    }
    //-------------------------criando a função retornar nome
    public String retornarNome()
    {
        return this.nomeCliente;
    }
}
