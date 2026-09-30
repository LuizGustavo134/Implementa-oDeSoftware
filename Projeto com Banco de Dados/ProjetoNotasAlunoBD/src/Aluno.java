package modelo;

public class Aluno {

    // Atributos
    private int rgm;
    private String nome;
    private double nota1;
    private double nota2;

    // Construtor vazio
    public Aluno() {
    }

    // Construtor com todos os atributos
    public Aluno(int rgm, String nome, double nota1, double nota2) {
        this.rgm = rgm;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // Getter e Setter do RGM
    public int getRgm() {
        return rgm;
    }

    public void setRgm(int rgm) {
        this.rgm = rgm;
    }

    // Getter e Setter do Nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter da Nota 1
    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    // Getter e Setter da Nota 2
    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    // Cálculo da média
    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }
}