import java.util.HashMap;
import java.util.Map;

public class AgendaContato {
    private Map<String, Integer> agendaContato;

    public AgendaContato() {
        this.agendaContato = agendaContato = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContato.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContato.isEmpty()){
            agendaContato.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContato);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numero = null;
        if (!agendaContato.isEmpty()){
            numero = agendaContato.get(nome);
        }

        return numero;
    }

    public static void main(String[] args) {
        AgendaContato agenda = new AgendaContato();

        agenda.exibirContatos();

        agenda.adicionarContato("Billie", 234324);
        agenda.adicionarContato("Monalisa", 45354);
        agenda.adicionarContato("Billie", 45345);
        agenda.adicionarContato("Nico", 3534534);

        agenda.exibirContatos();

        System.out.println(agenda.pesquisarPorNome("Nico"));

        agenda.removerContato("Monalisa");
        agenda.exibirContatos();
    }
}
