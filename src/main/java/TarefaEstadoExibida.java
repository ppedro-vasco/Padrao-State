public class TarefaEstadoExibida extends TarefaEstado{
    private TarefaEstadoExibida(){};
    private static TarefaEstadoExibida instance = new TarefaEstadoExibida();
    public static TarefaEstadoExibida getInstance(){
        return instance;
    }
    public String getEstado(){
        return "Exibido";
    }

    public boolean adicionar(Tarefa tarefa){
        tarefa.setEstado(TarefaEstadoAdicionada.getInstance());
        return true;
    }

    public boolean concluir(Tarefa tarefa){
        tarefa.setEstado(TarefaEstadoConcluida.getInstance());
        return true;
    }
    public boolean deletar(Tarefa tarefa){
        tarefa.setEstado(TarefaEstadoDeletada.getInstance());
        return true;
    }
    public boolean transferir(Tarefa tarefa){
        tarefa.setEstado(TarefaEstadoTransferida.getInstance());
        return true;
    }
    public boolean retornar(Tarefa tarefa){
        tarefa.setEstado(TarefaEstadoRetornada.getInstance());
        return true;
    }
}
