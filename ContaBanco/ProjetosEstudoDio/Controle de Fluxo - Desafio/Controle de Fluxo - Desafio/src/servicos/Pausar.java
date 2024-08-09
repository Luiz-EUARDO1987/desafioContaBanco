package servicos;

public class Pausar {
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
}
