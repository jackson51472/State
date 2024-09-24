package PadraoState;

public class TarefaEstadoConcluir extends TarefaEstado {

    private TarefaEstadoConcluir() {};
    private static TarefaEstadoConcluir instance = new TarefaEstadoConcluir();
    public static TarefaEstadoConcluir getInstance() {
        return instance;
    }
    @Override
    public String getEstado() {
        return "Concluida";
    }
}
