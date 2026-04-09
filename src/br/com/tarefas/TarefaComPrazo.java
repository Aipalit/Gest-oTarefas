package src.br.com.tarefas;

import java.time.LocalDate;

// Herança: TarefaComPrazo estende Tarefa
public class TarefaComPrazo extends Tarefa {
    private LocalDate dataLimite;

    public TarefaComPrazo(String titulo, String descricao, LocalDate dataLimite) {
        super(titulo, descricao); // Chama o construtor da classe pai
        this.dataLimite = dataLimite;
    }

    // Sobrescrita de Método: Alterando o comportamento do toString
    @Override
    public String toString() {
        return super.toString() + " (Prazo: " + dataLimite + ")";
    }
}