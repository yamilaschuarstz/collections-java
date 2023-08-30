import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidados(String nome, int codigoConvite){
        convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigo(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidados){
            if (c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }

        convidados.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidados.size();
    }

    public void exibirConvidados(){
        System.out.println(convidados);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidados("Nome 1", 1234);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados");

        conjuntoConvidados.adicionarConvidados("Nome 2", 1235);
        conjuntoConvidados.adicionarConvidados("Nome 3", 1235);
        conjuntoConvidados.adicionarConvidados("Nome 2", 1233);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados");

        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigo(1234);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados");

        conjuntoConvidados.exibirConvidados();
    }
}
