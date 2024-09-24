package PadraoState;

public abstract class TarefaEstado {
    public abstract String getEstado();

    public boolean progredir(Tarefa tarefa){
        return false;
    }
    public boolean revisao(Tarefa tarefa){
        return false;
    }
    public boolean criar(Tarefa tarefa){
        return false;
    }
    public boolean concluir(Tarefa tarefa){
        return false;
    }
}
