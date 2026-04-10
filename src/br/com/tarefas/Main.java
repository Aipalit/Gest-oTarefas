package src.br.com.tarefas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sistema de Gestão de Tarefas (Protótipo Acadêmico) ===\n");

        // 1. Uso de Polimorfismo: Criamos uma lista da classe base (Tarefa)
        List<Tarefa> listaDeTarefas = new ArrayList<>();

        // 2. Instanciando Objetos
        TarefaComPrazo t1 = new TarefaComPrazo(
                "Projeto em Java",
                "Rever conceitos de Herança e Interface ",
                LocalDate.now().plusDays(7));

        TarefaComPrazo t2 = new TarefaComPrazo(
                "Projeto de Faculdade",
                "Entregar o código fonte via AVA",
                LocalDate.of(2026, 04, 30));

        TarefaComPrazo t3 = new TarefaComPrazo("Revisar Tarefa", "Revisar tarefa e Subir no ava",
                LocalDate.of(2026, 04, 9));

        // 3. Exibindo a Lista:
        System.out.println("=== LISTA DE TAREFAS ===\n");
        listaDeTarefas.add(t1);
        listaDeTarefas.add(t2);
        listaDeTarefas.add(t3);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        // 4. Aplicando Encapsulamento e Métodos
        System.out.println("\n -> Alterando status da primeira tarefa...");
        t1.concluir();

        System.out.println("-> Alterando status da Segunda tarefa...");
        t2.concluir();

        System.out.println("-> Alterando status da Terceira tarefa...");
        t3.concluir();

        // 5. Exemplo de Sobrescrita e Polimorfismo na prática
        System.out.println("\n--- Lista de Tarefas Atualizada ---\n");
        for (Tarefa t : listaDeTarefas) {

            System.out.println(t.toString());
        }

        System.out.println("\n--- Verificando Prioridades ---\n");
        exibirPrioridade(t2);
        exibirPrioridade(t3);
    }

    // Método que aceita a Interface (Desacoplamento)
    public static void exibirPrioridade(Tarefa t) {
        if (t instanceof Priorizavel) {
            System.out.println("A tarefa '" + t.getTitulo() + "' segue contrato de prioridade.");
        } else {
            System.out.println("A tarefa '" + t.getTitulo() + "' é comum.");
        }
    }
}
