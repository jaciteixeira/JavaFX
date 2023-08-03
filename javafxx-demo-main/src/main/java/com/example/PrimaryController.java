package com.example;

import java.io.IOException;
import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    // @FXML
    // private void dizerOla(){
    //     System.out.println("Olá mundo!");
    // }

    @FXML TextArea txtAlunos; //onde é mandado o texto
    @FXML TextField txtNome; //de onde vem o texto

    //Coleections - ArrayList
    private ArrayList<String> nomes = new ArrayList<>();


    public void adicionarAluno(){
        nomes.add(txtNome.getText());
        txtNome.clear();
        mostrarAlunos();
    }

    public void mostrarAlunos(){

        nomes.sort((o1,o2) ->  o1.compareToIgnoreCase(o2));
        
        txtAlunos.clear();
        for (String aluno : nomes) { //Para cada aluno dentro de nomes append do aluno
            txtAlunos.appendText(aluno + "\n");
        }
        System.out.println("adicionando aluno...");
        System.out.println(nomes);
    }

}