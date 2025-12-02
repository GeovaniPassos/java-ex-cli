/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devgeovani.exemplomap;

import com.devgeovani.exemplomap.utils.ReadJsonFile;

import java.util.Scanner;
import javax.swing.UIManager;

/**
 *
 * @author geovani
 */
public class Main {
    public static void main(String[] args) {

        ReadJsonFile fileSave = new ReadJsonFile();

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        Scanner scan = new Scanner(System.in);

        String opcao = "";

        do {
            menuPrincipal();
            System.out.print("task-cli: ");
            int comando = scan.nextInt();
            switch (comando) {
                case 1:
                    System.out.println("Digite o nome: ");
                    String name = scan.nextLine();
                    System.out.println(name);
                    fileSave.saveNewContent(name);
                    break;
                case 2:
                    fileSave.readFile();
                    break;
                case 3:
                    exibirAjuda();
                    break;
                default:
                    System.out.println("Opcão inválida!");
            }

            while (!opcao.equalsIgnoreCase("n") ||
                    !opcao.equalsIgnoreCase("s")) {
                System.out.print("task-cli: Continuar? n/s");
                opcao = scan.nextLine();
            };

        } while(opcao.equalsIgnoreCase("s"));

        System.out.println("Encerrando programa...");
        
    }
    
    public static void exibirAjuda(){
        System.out.println("Exibindo ajuda");
    }
    public static void menuPrincipal() {
        System.out.println("Acessando a Lista de Tarefas!\n\n");
        System.out.println("Opções: ");
        System.out.println("1 - Criar novo arquivo.");
        System.out.println("2 - Carregar arquivo com tarefas.");
        System.out.println("3 - Ajuda.");
    }
}


