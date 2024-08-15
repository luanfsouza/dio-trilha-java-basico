package br.com.dio.dominio;

public class Curso extends Conteudo {
    private int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super.titulo = titulo;
        super.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    public Curso() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso [titulo=" + super.getTitulo() + ", descricao=" + super.getDescricao() + ", cargaHoraria=" + this.cargaHoraria + "]";
    }

}
