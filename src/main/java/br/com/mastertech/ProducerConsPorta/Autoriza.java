package br.com.mastertech.ProducerConsPorta;

public class Autoriza {
    private String nome;
    private String porta;

    public Autoriza() {
    }

    public Autoriza(String nome, String porta) {
        this.nome = nome;
        this.porta = porta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }
}
