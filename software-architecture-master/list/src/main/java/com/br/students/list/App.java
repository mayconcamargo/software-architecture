package com.br.students.list;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ArrayList<String> arlist = new ArrayList<String>();
        // Set<String> arlist = new HashSet<String>(Arrays.asList(a));
        Set<String> arlist = new HashSet<String>();
        // List<String> names = Arrays.asList("MAYCON");
        boolean run = true;

        while (run) {
            System.out.println("Menu");
            System.out.println("Digite 1 para inserir o estudante ");
            System.out.println("Digite 2 para imprimir a lista ");

            String option = scanner.nextLine();

            if (option.equals("1")) {
                System.out.println("Digite o nome do aluno: ");

                String name = scanner.nextLine();
                if (!arlist.contains(name)) {
                    arlist.add(name);
                } else {
                    System.out.println("O aluno já esta cadastrado!");
                }

            } else if (option.equals("2")) {
                System.out.println("Listando ...");
                // listar com ForEach
                for (String student : arlist) {
                    // student.forEach(System.out::println);
                    System.out.println(student);
                    // names.forEach(System.out::println);
                }
                run = false;
            } else {
                System.out.println("Digite uma opção válida");
            }
        }
        scanner.close();
    }
}
