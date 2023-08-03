package com.example;

import java.io.IOException;

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

    public void adicionarAluno(){
        System.out.println("adicionando aluno...");
        String nome = txtNome.getText();
        // txtAlunos.setText(nome);
        // txtAlunos.setText(txtAlunos.getText() + "\n" + nome);
        txtAlunos.appendText(txtNome.getText() + "\n");
        txtNome.clear();
    }
}
