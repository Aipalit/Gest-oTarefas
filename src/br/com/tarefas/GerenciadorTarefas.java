package src.br.com.tarefas;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {
    private List<Tarefa> tarefas = new ArrayList<>();

    // Método original
    public void adicionarTarefa(Tarefa t) {
        tarefas.add(t);
    }

    // Sobrecarga
    public void adicionarTarefa(String titulo, String desc) {

    }

    public void listarTodas() {
        for (Tarefa t : tarefas) {
            System.out.println(t.toString());
        }
    }
}
