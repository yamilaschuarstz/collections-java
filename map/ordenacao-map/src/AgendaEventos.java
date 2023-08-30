import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventos;

    public AgendaEventos() {
        this.eventos = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventos.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosOrganizados = new TreeMap<>(eventos);
        System.out.println(eventosOrganizados);
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2011, 9, 21), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2010, Month.OCTOBER, 13), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2017, 11, 17), "Evento 3", "Atração 3");

        agendaEventos.exibirAgenda();
    }
}
