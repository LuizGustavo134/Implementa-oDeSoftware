package projaluno.entities;

public class Aluno {
    public String name = "Luiz";
    public double nota1 = 4.5;
    public double nota2 = 10;
    public double media;

    public Aluno() {
    }

    public Aluno(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

 public double CalcMedia(){
 return media = (nota1 + nota2)/ 2;
 }
 public void exibir(){
     System.out.println("Nota1: "+ nota1);
     System.out.println("Nota2: "+ nota2);
     System.out.println("A media é: "+ media);
 }
 
    
    
}
