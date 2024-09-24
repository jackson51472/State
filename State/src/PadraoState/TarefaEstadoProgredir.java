package PadraoState;

public class TarefaEstadoProgredir extends TarefaEstado{

    private TarefaEstadoProgredir() {};
    private static TarefaEstadoProgredir instance = new TarefaEstadoProgredir();
    public static TarefaEstadoProgredir getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Progredir";
    }

    public boolean progredir(Tarefa tarefa){
        return true;
    }

    public boolean revisao(Tarefa tarefa){
        return true;
    }
}
