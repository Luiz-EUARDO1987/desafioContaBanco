package servicos;

public class LimparTela {
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
}
