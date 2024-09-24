package Test;


import PadraoState.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class TarefaTest {

    Tarefa tarefa;


    @BeforeEach
    public void setUp() {
        tarefa = new Tarefa();
    }

    @Test
    void naoDeveCriarTarefaCriada(){
        tarefa.setEstado(TarefaEstadoCriada.getInstance());
        assertFalse(tarefa.criar());
    }

    @Test
    void deveProgredirTarefaCriada(){
        tarefa.setEstado(TarefaEstadoCriada.getInstance());
        assertTrue(tarefa.progredir());
    }

    @Test
    void naoDeveRevisarTarefaCriada(){
        tarefa.setEstado(TarefaEstadoCriada.getInstance());
        assertFalse(tarefa.revisao());
    }

    @Test
    void naoDeveConcluirTarefaCriada(){
        tarefa.setEstado(TarefaEstadoCriada.getInstance());
        assertFalse(tarefa.concluir());
    }

    @Test
    void naoDeveCriarTarefaProgredir(){
        tarefa.setEstado(TarefaEstadoProgredir.getInstance());
        assertFalse(tarefa.criar());
    }

    @Test
    void deveProgredirTarefaProgredir(){
        tarefa.setEstado(TarefaEstadoProgredir.getInstance());
        assertTrue(tarefa.progredir());
    }

    @Test
    void deveRevisarTarefaProgredir(){
        tarefa.setEstado(TarefaEstadoProgredir.getInstance());
        assertTrue(tarefa.revisao());
    }

    @Test
    void naoDeveConcluirTarefaProgredir(){
        tarefa.setEstado(TarefaEstadoProgredir.getInstance());
        assertFalse(tarefa.concluir());
    }

    @Test
    void naoDeveCriarTarefaRevisao(){
        tarefa.setEstado(TarefaEstadoRevisao.getInstance());
        assertFalse(tarefa.criar());
    }

    @Test
    void deveProgredirTarefaRevisao(){
        tarefa.setEstado(TarefaEstadoRevisao.getInstance());
        assertTrue(tarefa.progredir());
    }

    @Test
    void naoDeveRevisarTarefaRevisao(){
        tarefa.setEstado(TarefaEstadoRevisao.getInstance());
        assertFalse(tarefa.revisao());
    }

    @Test
    void deveConcluirTarefaRevisao(){
        tarefa.setEstado(TarefaEstadoRevisao.getInstance());
        assertTrue(tarefa.concluir());
    }

    @Test
    void naoDeveCriarTarefaConcluida(){
        tarefa.setEstado(TarefaEstadoConcluir.getInstance());
        assertFalse(tarefa.criar());
    }

    @Test
    void naoDeveProgredirTarefaConcluida(){
        tarefa.setEstado(TarefaEstadoConcluir.getInstance());
        assertFalse(tarefa.progredir());
    }

    @Test
    void naoDeveRevisarTarefaConcluida(){
        tarefa.setEstado(TarefaEstadoConcluir.getInstance());
        assertFalse(tarefa.revisao());
    }

    @Test
    void naoDeveConcluirTarefaConcluida(){
        tarefa.setEstado(TarefaEstadoConcluir.getInstance());
        assertFalse(tarefa.concluir());
    }

}