package src.br.com.tarefas;

import java.time.LocalDate;

// Herança: TarefaComPrazo estende Tarefa
public class TarefaComPrazo extends Tarefa {
    private LocalDate dataLimite;

    public TarefaComPrazo(String titulo, String descricao, LocalDate dataLimite) {
        super(titulo, descricao); 
        this.dataLimite = dataLimite;
    }

    @Override
    public String toString() {
        return super.toString() + " (Prazo: " + dataLimite + ")";
    }
}