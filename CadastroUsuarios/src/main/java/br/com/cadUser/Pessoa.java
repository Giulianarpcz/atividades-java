package br.com.cadUser;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

@Named("pessoa")
@SessionScoped
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome;
    private List<String> pessoas = new ArrayList<>();

    public void adicionar() {
        if (nome != null && !nome.trim().isEmpty()) {
            pessoas.add(nome);
            nome = "";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getPessoas() {
        return pessoas;
    }
}

