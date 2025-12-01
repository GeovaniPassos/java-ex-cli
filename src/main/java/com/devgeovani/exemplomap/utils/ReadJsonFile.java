package com.devgeovani.exemplomap.utils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.SQLOutput;

public class ReadJsonFile {

    private static final String archieveName = "data/data.json";

    public void readFile() {

        Path pathFileJson = Paths.get(archieveName);

        try {

            if (!Files.exists(pathFileJson)) {
                System.out.println("Erro: Arquivo JSON não encontrado no caminho:" + pathFileJson);
                return;
            }

            String fileContent = Files.readString(pathFileJson, StandardCharsets.UTF_8);
            System.out.println(fileContent);
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void saveNewContent(String newJson) {
        Path pathArchieve = Paths.get(archieveName);

        try {
            Files.createDirectories(pathArchieve.getParent());

            Files.writeString(
                    pathArchieve,
                    newJson,
                    StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING
            );
            System.out.println("\nArquivo JSON gravado com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao gravar o arquivo!");
        }
    }
}
