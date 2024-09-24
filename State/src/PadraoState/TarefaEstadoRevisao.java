package PadraoState;

public class TarefaEstadoRevisao extends TarefaEstado {

    private TarefaEstadoRevisao() {};

    private static TarefaEstadoRevisao instance = new TarefaEstadoRevisao();

    public static TarefaEstadoRevisao getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Revisão";
    }

    public boolean progredir(Tarefa tarefa){
        return true;
    }

    public boolean concluir(Tarefa tarefa){
        return true;
    }
}
