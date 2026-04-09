package src.br.com.tarefas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sistema de Gestão de Tarefas (Protótipo Acadêmico) ===\n");

        // 1. Uso de Polimorfismo: Criamos uma lista da classe base (Tarefa)
        // que pode armazenar qualquer subclasse (TarefaComPrazo, etc.)
        List<Tarefa> listaDeTarefas = new ArrayList<>();

        // 2. Instanciando Objetos (Uso de Classes e Objetos)
        TarefaComPrazo t1 = new TarefaComPrazo(
                "Estudar Java",
                "Rever conceitos de Herança e Interface",
                LocalDate.now().plusDays(7));

        TarefaComPrazo t2 = new TarefaComPrazo(
                "Projeto de Faculdade",
                "Entregar o código fonte via AVA",
                LocalDate.of(2023, 12, 15));

        // 3. Adicionando à lista
        listaDeTarefas.add(t1);
        listaDeTarefas.add(t2);

        // 4. Aplicando Encapsulamento e Métodos
        System.out.println("-> Alterando status da primeira tarefa...");
        t1.concluir();

        // 5. Exemplo de Sobrescrita e Polimorfismo na prática
        System.out.println("--- Lista de Tarefas Atualizada ---");
        for (Tarefa t : listaDeTarefas) {
            // Aqui o Java decide em tempo de execução qual toString() chamar
            // Se for TarefaComPrazo, ele mostrará a data (Sobrescrita)
            System.out.println(t.toString());
        }

        // 6. Demonstração de Interface (se implementou a Priorizavel)
        System.out.println("\n--- Verificando Prioridades ---");
        exibirPrioridade(t2); // Método auxiliar para mostrar interface
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
