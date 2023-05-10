public class TarefaEstadoTransferida extends TarefaEstado{
    private TarefaEstadoTransferida(){};
    private static TarefaEstadoTransferida instance = new TarefaEstadoTransferida();
    public static TarefaEstadoTransferida getInstance(){
        return instance;
    }
    public String getEstado(){
        return "Transferido";
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
    public boolean exibir(Tarefa tarefa){
        tarefa.setEstado(TarefaEstadoExibida.getInstance());
        return true;
    }
    public boolean retornar(Tarefa tarefa){
        tarefa.setEstado(TarefaEstadoRetornada.getInstance());
        return true;
    }
}