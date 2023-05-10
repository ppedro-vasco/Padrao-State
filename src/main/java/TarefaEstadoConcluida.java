public class TarefaEstadoConcluida extends TarefaEstado{
    private TarefaEstadoConcluida(){};
    private static TarefaEstadoConcluida instance = new TarefaEstadoConcluida();
    public static TarefaEstadoConcluida getInstance(){
        return instance;
    }
    public String getEstado(){
        return "Concluido";
    }
}
