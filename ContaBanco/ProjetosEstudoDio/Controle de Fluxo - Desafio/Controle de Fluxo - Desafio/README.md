DIO - Trilha Java Básico
www.dio.me

Autores
Gleyson Sampaio
Controle de Fluxo - Desafio
Vamos praticar todo o conteúdo apresentado no módulo de Controle de Fluxo codificando o seguinte cenário.

O sistema deverá receber duas interações via terminal que representem dois números inteiros, com estes dois números você deverá obter a quantidade de interações (para) e realizar a impressão no console (System.out.print) dos números incrementados, por exemplo:

Se você passar os números 12 e 30, logo teremos uma interação (for) com 18 ocorrências para imprimir os números, exemplo: "Imprimindo o número 1", "Imprimindo o número 2"e assim por diante.
Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar uma exceção personalizada chamada ParametrosInvalidosExceptioncom a segunda mensagem: "O segundo parâmetro deve ser maior que o primeiro"
Crie o projetoDesafioControleFluxo
Dentro do projeto, crie uma aula Contador.javapara realizar toda a programação do nosso programa.
Dentro do projeto, crie uma classe ParametrosInvalidosExceptionque representará uma exceção de negócio no sistema.
Abaixo temos um trecho de código no qual você poderá seguir alterando as partes que contêm??

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.??;
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.??;
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (? exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
	}
}
