/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devgeovani.exRoadmap1;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import javax.swing.UIManager;
import org.json.simple.JSONObject;

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
                case 1 -> newFile();
                
                case 2 -> carregarArquivo();
                
                case 3 -> displayHelp();
                
                default -> System.out.println("Opcao inválida!");
                    
            }
        
            opcao = 'n';
        }
        
    }
    
    public static void displayHelp(){
        System.out.println("Exibindo ajuda");
    }
    
    public static void newFile(){
        
        int id = 1;
        String nameTask = "Primeira tarefa";
        
        JSONObject jsonObject = new JSONObject();
        
        FileWriter writeFile = null;
        
        jsonObject.put("id", id);
        jsonObject.put("name", nameTask);
        jsonObject.put("description", "Concluir a criação do json");
        jsonObject.put("status","Fazendo");
        jsonObject.put("createdAt", "29072025");
        jsonObject.put("updatedAt", "29072025");
        
        try {
            writeFile = new FileWriter(id + nameTask);
            
            writeFile.write(jsonObject.toJSONString());
            writeFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println(jsonObject);
    }
    
    public static void carregarArquivo(){
        
    }
    
    public abstract class AbstractReader {
        public static String readJson(String path) throws IOException {
            String json = String.join(" ", 
                    Files.readAllLines(
                            Paths.get(path),
                            StandardCharsets.UTF_8)
            );
            return json;
        }
    }
    
}
