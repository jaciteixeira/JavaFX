package com.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

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
        // String nome = txtNome.getText();
        // txtAlunos.setText(nome);
        // txtAlunos.setText(txtAlunos.getText() + "\n" + nome);
        // txtAlunos.appendText(txtNome.getText() + "\n");
        
        //ANONYMOUS CLASS
        nomes.sort(
            new Comparator<String>() {
                @Override 
                public int compare(String o1, String o2) { 
                    return o1.compareToIgnoreCase(o2); 
                } 
            } 
        );
        
        txtAlunos.clear();
        for (String aluno : nomes) { //Para cada aluno dentro de nomes append do aluno
            txtAlunos.appendText(aluno + "\n");
        }
        System.out.println("adicionando aluno...");
        System.out.println(nomes);
    }

}