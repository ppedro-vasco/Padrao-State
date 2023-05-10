import java.time.*;
import java.util.HashMap;

public class Tarefa {
    int idTarefa;
    int idUsuario;
    String nome;
    String descricao;
    LocalDateTime dataCriacao;
    LocalDateTime dataConclusao;
    TarefaEstado estado;
    static HashMap<Integer, Tarefa>listaTarefas = new HashMap<Integer, Tarefa>();

    public Tarefa(){
        this.estado = TarefaEstadoAdicionada.getInstance();
    }
    public void setTarefa(int idTarefa,
                          int idUsuario,
                          String nome,
                          String descricao,
                          LocalDateTime dataCriacao,
                          LocalDateTime dataConclusao
                          ) {
        this.idTarefa = idTarefa;
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.dataConclusao = dataConclusao;
        listaTarefas.put(idTarefa, this);
    }
    public void setEstado(TarefaEstado estado){
        this.estado = estado;
    }

    public boolean adicionar(){
        return estado.adicionar(this);
    }
    public boolean exibir(){
        return estado.exibir(this);
    }
    public boolean transferir(){
        return estado.transferir(this);
    }
    public boolean retornar(){
        return estado.retornar(this);
    }
    public boolean concluir(){
        return estado.concluir(this);
    }
    public boolean deletar(){
        return estado.deletar(this);
    }
    public static HashMap<Integer, Tarefa> getListaTarefas(){
        return listaTarefas;
    }
    public String getNomeEstado(){
        return estado.getEstado();
    }
    public void setNomeEstado(String nomeEstado){
        this.nome = nomeEstado;
    }
    public TarefaEstado getEstado(){
        return estado;
    }
}
