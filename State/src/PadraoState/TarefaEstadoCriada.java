package PadraoState;

public class TarefaEstadoCriada extends TarefaEstado{


    public TarefaEstadoCriada() {};

    private static TarefaEstadoCriada instance = new TarefaEstadoCriada();

    public static TarefaEstadoCriada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Criada";
    }

    public boolean progredir(Tarefa tarefa){
        return true;
    }
}
