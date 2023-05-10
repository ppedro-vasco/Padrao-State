import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class TarefaTest {

    Tarefa tarefa;

    @BeforeEach
    public void setUp() {
        tarefa = new Tarefa();
    }

    // Tarefa Adicionada
    @Test
    public void testAdicionarTarefaAdicionada() {
        tarefa.setEstado(TarefaEstadoAdicionada.getInstance());
        assertTrue(tarefa.adicionar());
    }

    @Test
    public void testConcluirTarefaAdicionada() {
        tarefa.setEstado(TarefaEstadoAdicionada.getInstance());
        assertTrue(tarefa.concluir());
    }

    @Test
    public void testDeletarTarefaAdicionada() {
        tarefa.setEstado(TarefaEstadoAdicionada.getInstance());
        assertTrue(tarefa.deletar());
    }

    @Test
    public void testTransferirTarefaAdicionada() {
        tarefa.setEstado(TarefaEstadoAdicionada.getInstance());
        assertTrue(tarefa.transferir());
    }

    @Test
    public void testExibirTarefaAdicionada() {
        tarefa.setEstado(TarefaEstadoAdicionada.getInstance());
        assertTrue(tarefa.exibir());
    }

    @Test
    public void testRetornarTarefaAdicionada() {
        tarefa.setEstado(TarefaEstadoAdicionada.getInstance());
        assertTrue(tarefa.retornar());
    }

    // Tarefa Concluida
    @Test
    public void testAdicionarTarefaConcluida() {
        tarefa.setEstado(TarefaEstadoConcluida.getInstance());
        assertFalse(tarefa.adicionar());
    }

    @Test
    public void testConcluirTarefaConcluida() {
        tarefa.setEstado(TarefaEstadoConcluida.getInstance());
        assertFalse(tarefa.concluir());
    }

    @Test
    public void testDeletarTarefaConcluida() {
        tarefa.setEstado(TarefaEstadoConcluida.getInstance());
        assertFalse(tarefa.deletar());
    }

    @Test
    public void testTransferirTarefaConcluida() {
        tarefa.setEstado(TarefaEstadoConcluida.getInstance());
        assertFalse(tarefa.transferir());
    }

    @Test
    public void testExibirTarefaConcluida() {
        tarefa.setEstado(TarefaEstadoConcluida.getInstance());
        assertFalse(tarefa.exibir());
    }

    @Test
    public void testRetornarTarefaConcluida() {
        tarefa.setEstado(TarefaEstadoConcluida.getInstance());
        assertFalse(tarefa.retornar());
    }

    // Tarefa Deletada
    @Test
    public void testAdicionarTarefaDeletada() {
        tarefa.setEstado(TarefaEstadoDeletada.getInstance());
        assertFalse(tarefa.adicionar());
    }

    @Test
    public void testConcluirTarefaDeletada() {
        tarefa.setEstado(TarefaEstadoDeletada.getInstance());
        assertFalse(tarefa.concluir());
    }

    @Test
    public void testDeletarTarefaDeletada() {
        tarefa.setEstado(TarefaEstadoDeletada.getInstance());
        assertFalse(tarefa.deletar());
    }

    @Test
    public void testTransferirTarefaDeletada() {
        tarefa.setEstado(TarefaEstadoDeletada.getInstance());
        assertFalse(tarefa.transferir());
    }

    @Test
    public void testExibirTarefaDeletada() {
        tarefa.setEstado(TarefaEstadoDeletada.getInstance());
        assertFalse(tarefa.exibir());
    }

    @Test
    public void testRetornarTarefaDeletada() {
        tarefa.setEstado(TarefaEstadoDeletada.getInstance());
        assertFalse(tarefa.retornar());
    }

    // Tarefa Exibida
    @Test
    public void testAdicionarTarefaExibida() {
        tarefa.setEstado(TarefaEstadoExibida.getInstance());
        assertTrue(tarefa.adicionar());
    }

    @Test
    public void testConcluirTarefaExibida() {
        tarefa.setEstado(TarefaEstadoExibida.getInstance());
        assertTrue(tarefa.concluir());
    }

    @Test
    public void testDeletarTarefaExibida() {
        tarefa.setEstado(TarefaEstadoExibida.getInstance());
        assertTrue(tarefa.deletar());
    }

    @Test
    public void testTransferirTarefaExibida() {
        tarefa.setEstado(TarefaEstadoExibida.getInstance());
        assertTrue(tarefa.transferir());
    }

    @Test
    public void testExibirTarefaExibida() {
        tarefa.setEstado(TarefaEstadoExibida.getInstance());
        assertFalse(tarefa.exibir());
    }

    @Test
    public void testRetornarTarefaExibida() {
        tarefa.setEstado(TarefaEstadoExibida.getInstance());
        assertTrue(tarefa.retornar());
    }

    // Tarefa Retornada
    @Test
    public void testAdicionarTarefaRetornada(){
        tarefa.setEstado(TarefaEstadoRetornada.getInstance());
        assertTrue(tarefa.adicionar());
    }

    @Test
    public void testConcluirTarefaRetornada() {
        tarefa.setEstado(TarefaEstadoRetornada.getInstance());
        assertTrue(tarefa.concluir());
    }

    @Test
    public void testDeletarTarefaRetornada() {
        tarefa.setEstado(TarefaEstadoRetornada.getInstance());
        assertTrue(tarefa.deletar());
    }

    @Test
    public void testTransferirTarefaRetornada() {
        tarefa.setEstado(TarefaEstadoRetornada.getInstance());
        assertTrue(tarefa.transferir());
    }

    @Test
    public void testExibirTarefaRetornada() {
        tarefa.setEstado(TarefaEstadoRetornada.getInstance());
        assertTrue(tarefa.exibir());
    }

    @Test
    public void testRetornarTarefaRetornada() {
        tarefa.setEstado(TarefaEstadoRetornada.getInstance());
        assertFalse(tarefa.retornar());
    }

    // Tarefa Trasnferida
    @Test
    public void testAdicionarTarefaTransferida(){
        tarefa.setEstado(TarefaEstadoTransferida.getInstance());
        assertTrue(tarefa.adicionar());
    }

    @Test
    public void testConcluirTarefaTransferida() {
        tarefa.setEstado(TarefaEstadoTransferida.getInstance());
        assertTrue(tarefa.concluir());
    }

    @Test
    public void testDeletarTarefaTransferida() {
        tarefa.setEstado(TarefaEstadoTransferida.getInstance());
        assertTrue(tarefa.deletar());
    }

    @Test
    public void testTransferirTarefaTransferida() {
        tarefa.setEstado(TarefaEstadoTransferida.getInstance());
        assertTrue(tarefa.transferir());
    }

    @Test
    public void testExibirTarefaTransferida() {
        tarefa.setEstado(TarefaEstadoTransferida.getInstance());
        assertTrue(tarefa.exibir());
    }

    @Test
    public void testRetornarTarefaTransferida() {
        tarefa.setEstado(TarefaEstadoTransferida.getInstance());
        assertTrue(tarefa.retornar());
    }
}
