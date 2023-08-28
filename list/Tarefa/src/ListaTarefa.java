import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> listaTarefas;

    public ListaTarefa() {
        this.listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefaParaRemover = new ArrayList<>();
        for (Tarefa tarefa : listaTarefas){
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaRemover.add(tarefa);
            }
        }

        listaTarefas.removeAll(tarefaParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return listaTarefas.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(listaTarefas);
    }


    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("Número total de tarefas na lista: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Acordar");

        System.out.println("Número total de tarefas na lista: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Acordar");
        listaTarefa.adicionarTarefa("Tomar café");

        System.out.println("Número total de tarefas na lista: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("acordar");

        System.out.println("Número total de tarefas na lista: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();

    }
}
