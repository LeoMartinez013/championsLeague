package com.atvLeo.championsLeague.Model;

public class Clube {
    private String nome;
    private int numero;
    
    public Clube() {
    }
    
    public Clube(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
}