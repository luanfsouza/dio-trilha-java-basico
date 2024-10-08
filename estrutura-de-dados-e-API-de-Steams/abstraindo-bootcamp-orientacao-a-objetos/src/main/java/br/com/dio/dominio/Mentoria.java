package br.com.dio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate data) {
        super.titulo = titulo;
        super.descricao = descricao;
        this.data = data;
    }
    public Mentoria() {
    }

    @Override
    public double calcularXp(){
        return XP_PADRAO + 20.0;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria [titulo=" + super.getTitulo() + ", descricao=" + super.getDescricao() + ", data=" + this.data + "]";
    }
    
}
