/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devgeovani.exemplomap;

import java.util.Scanner;
import javax.swing.UIManager;

/**
 *
 * @author geovani
 */
public class ExRoadmap1 {
    public static void main(String[] args) {
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        Scanner scan = new Scanner(System.in);
       
        System.out.println("Acessando a Lista de Tarefas!\n\n");
        System.out.println("Opções: ");
        System.out.println("1 - Criar novo arquivo.");
        System.out.println("2 - Carregar arquivo com tarefas.");
        System.out.println("3 - Ajuda.");
        System.out.print("task-cli: ");
        int comando = scan.nextInt();
        
        scan.close();
        
        char opcao = 's';
        
        while(opcao == 's'){
            
            switch (comando) {
                case 1:
                    //novo
                    break;
                case 2:
                    //
                    break;
                case 3:
                    //exibir ajuda
                    break;
                default:
                    System.out.println("Opcao inválida!");
                    
            }
        
            opcao = 'n';
        }
        
    }
    
    public static void exibirAjuda(){
        System.out.println("Exibindo ajuda");
    }
}
