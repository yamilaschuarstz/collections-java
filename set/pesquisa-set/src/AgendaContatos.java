import java.util.HashSet;
import java.util.Set;
public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato c : contatoSet){
            if (c.getNome().startsWith(nome)){
                contatoPorNome.add(c);
            }
        }

        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int numero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(numero);
                contatoAtualizado = c;
                break;
            }
        }

        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Billie", 12345689);
        agenda.adicionarContato("Billie Joca", 5325345);
        agenda.adicionarContato("Monalisa", 234324234);
        agenda.adicionarContato("Billie", 1111111);

        agenda.exibirContatos();

        System.out.println(agenda.pesquisarPorNome("Billie"));

        System.out.println("Contato atualizado: " + agenda.atualizarNumeroContato("Billie", 1111111));
        agenda.exibirContatos();
    }
}
