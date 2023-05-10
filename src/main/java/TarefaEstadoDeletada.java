public class TarefaEstadoDeletada extends TarefaEstado{
    private TarefaEstadoDeletada(){};
    private static TarefaEstadoDeletada instance = new TarefaEstadoDeletada();
    public static TarefaEstadoDeletada getInstance(){
        return instance;
    }
    public String getEstado(){
        return "Deletado";
    }
}