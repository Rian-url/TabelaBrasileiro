package com.example.TabelaBrasileirao;

public class ClubeFutebol {
    private String nome;
    private String apelido;
    private String mascote;
    private String tecnico;
    private int vitorias = 0;
    private int empates = 0;
    private int derrotas = 0;

    public ClubeFutebol(String nome, String apelido, String mascote, String tecnico) {
        this.nome = nome;
        this.apelido = apelido;
        this.mascote = mascote;
        this.tecnico = tecnico;
    }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    public String getMascote() {
        return mascote;
    }

    public String getTecnico() {
        return tecnico;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int vitoria(){
        return this.vitorias ++;
    }

    public int derrota(){
        return this.derrotas ++;
    }

    public int empate(){
        return this.empates ++;
    }


}
