package com.br.students.list;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class App {
    private static boolean run;
    private static Scanner scanner;

    public static void main(final String[] args) {
        // ArrayList<String> arlist = new ArrayList<String>();
        // Set<String> arlist = new HashSet<String>(Arrays.asList(a));
        // List<String> names = Arrays.asList();
        Scanner scanner = new Scanner(System.in);
        Set<String> arlist = new HashSet<String>();
        boolean run = true;
        
        /* while (run) {
            System.out.println("Menu");
            System.out.println("Digite 1 para inserir o estudante ");
            System.out.println("Digite 2 para imprimir a lista ");

            String option = scanner.nextLine();
        - O MENU PODE SER SUSBTITUIDO POR UMA FUNÇÃO ESPECÍFICA E COM ISSO 
          UTILIZANDO MELHOR O ENCAPSULAMENTO.*/
    }
        
    private static void exibeMenu() {
        System.out.println("Menu");
        System.out.println("Digite 1 para inserir o estudante ");
        System.out.println("Digite 2 para imprimir a lista ");
    }

    /*if (option.equals("1")) {
        System.out.println("Digite o nome do aluno: ");

        String name = scanner.nextLine();
        if (!arlist.contains(name)) {
            arlist.add(name);
        } else {
            System.out.println("O aluno já esta cadastrado!");
        }

        } else if (option.equals("2")) {
            System.out.println("Listando ...");
            for (String student : arlist) {
                System.out.println(student);
        }
        run = false;
        } else {
            System.out.println("Digite uma opção válida");
    }
    -UTILIZANDO AS FUNÇÕES CARREGARMENU, CRIAR E EXIBIR ALUNOS
     E COM ISSO PODENDO UTILIZAR O ARROW FUNCTIONS*/

    private static void carregarMenu() {
        while (run) {
            exibeMenu();
            String opcao = scanner.nextLine();
            if (opcao.equals("1")) {
                criarAluno();
                System.out.println("Aluno Criado");
            } else if (opcao.equals("2")) {
                exibirAlunos();
            } else if (opcao.equals("0")) {
                run = false;
            } else {
                System.out.println("Opção inválida!");
                exibeMenu();
                opcao = scanner.nextLine();
            }
        }
    }

    private static void criarAluno() {
        System.out.println("Digite o nome do aluno: ");
            String name = scanner.nextLine();
            Optional<String> found = usuarios.stream().filter(e -> e.trim().toLowerCase().equals(nome.toLowerCase().trim() )).findAny();
			if (!found.isPresent()) {
				usuarios.add(nome);
			} else {
				System.out.println("Este aluno já está cadastrado!");
				criarAluno();
			}
    }
    private static void exibirAlunos() {
        System.out.println("LISTA DE USUÁRIOS");
		usuarios.forEach(e -> System.out.println("NOME: " + e));
		System.out.println("");
		
		} else {
			System.out.println("Digite uma opção válida");
		}
    }
    scanner.close();
}