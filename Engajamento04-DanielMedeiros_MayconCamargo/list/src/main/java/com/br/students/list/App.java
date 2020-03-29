package com.br.students.list;

import java.util.*;
import java.util.Scanner;

public class App {
    private static List<String> alunos;
    private static boolean run;
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        alunos = new ArrayList<String>();
        run = true;
        carregarMenu();
    }
        
    private static void exibeMenu() {
        System.out.println("Menu");
        System.out.println("Digite 1 para inserir o estudante ");
        System.out.println("Digite 2 para imprimir a lista ");
    }
    
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

            if (!alunos.contains(name)) {
                alunos.add(name);
            } else {
                System.out.println("O aluno já esta cadastrado!");
            }
            Optional<String> found = alunos.stream().filter(e -> e.trim().toLowerCase().equals(name.toLowerCase().trim() )).findAny();
	    if (!found.isPresent()) {
		alunos.add(name);
	    } else {
		System.out.println("Este aluno já está cadastrado!");
		criarAluno();
	}
    }
    private static void exibirAlunos() {
        System.out.println("LISTA DE USUÁRIOS");
        alunos.forEach(e -> System.out.println("NOME: " + e));
        System.out.println("");	
    }
}
