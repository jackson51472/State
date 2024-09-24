package PadraoState;

public class Tarefa {

    private TarefaEstado estado;

    public Tarefa(){
        this.estado = TarefaEstadoCriada.getInstance();
    }

    public void setEstado(TarefaEstado estado) {
        this.estado = estado;
    }

    public boolean progredir(){
        return estado.progredir(this);
    }
    public boolean revisao(){
        return estado.revisao(this);
    }
    public boolean criar(){
        return estado.criar(this);
    }
    public boolean concluir(){
        return estado.concluir(this);
    }
}
