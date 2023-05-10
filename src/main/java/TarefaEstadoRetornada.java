public class TarefaEstadoRetornada extends TarefaEstado{
    private TarefaEstadoRetornada(){};
    private static TarefaEstadoRetornada instance = new TarefaEstadoRetornada();
    public static TarefaEstadoRetornada getInstance(){
        return instance;
    }
    public String getEstado(){
        return "Retornado";
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

}
