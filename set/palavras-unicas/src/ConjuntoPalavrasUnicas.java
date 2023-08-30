import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<Palavra> conjuntoPalavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        conjuntoPalavrasUnicas.add(new Palavra(palavra));
    }

    public void removerPalavra(String palavra){
        Palavra palavraRemover = null;
        for (Palavra p : conjuntoPalavrasUnicas){
            if (p.getPalavra().equalsIgnoreCase(palavra)){
                palavraRemover = p;
            }
        }

        conjuntoPalavrasUnicas.remove(palavraRemover);
    }

    public void verificarPalavra(String palavra){
        boolean esta = false;
        for (Palavra p : conjuntoPalavrasUnicas){
            if (p.getPalavra().equalsIgnoreCase(palavra)){
                esta = true;
            }
        }

        if (esta){
            System.out.println("A palavra " + palavra + " está no conjunto.");
        } else {
            System.out.println("A palavra " + palavra + " não está no conjunto.");
        }
    }

    public void exibirPalavrasUnicas(){
        System.out.println(conjuntoPalavrasUnicas);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavras = new ConjuntoPalavrasUnicas();

        conjuntoPalavras.adicionarPalavra("Lagartixa");
        conjuntoPalavras.adicionarPalavra("Jacaré");
        conjuntoPalavras.adicionarPalavra("Hipopótamo");
        conjuntoPalavras.adicionarPalavra("Rinoceronte");

        conjuntoPalavras.exibirPalavrasUnicas();

        conjuntoPalavras.adicionarPalavra("Lagartixa");
        conjuntoPalavras.exibirPalavrasUnicas();

        conjuntoPalavras.verificarPalavra("Jacaré");
        conjuntoPalavras.verificarPalavra("Arara");

        conjuntoPalavras.removerPalavra("Rinoceronte");
        conjuntoPalavras.exibirPalavrasUnicas();
    }
}
