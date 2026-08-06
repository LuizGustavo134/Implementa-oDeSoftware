package DepartamentoRH.entities;
public class funcionario {
    public String name;
    public int reg = 0;
    public double Salbruto = 3200;
    public double Desconto = 800;
    public double salarioLIquido;

    public funcionario() {}
    public funcionario(String name, int reg, double salbruto, double desconto, double salarioLiquido) {
    this.name = name;
    this.reg = reg;
    this.Salbruto = salbruto;
    this.Desconto = desconto; 
    this.salarioLIquido = salarioLiquido;
    }
    public double CalcSalario(){
       return salarioLIquido = (Desconto - Salbruto);
    }
   public String toString(){
        return
                "funcionario: "+
                name +" , "
                +"Salario Bruto: "
                +Salbruto
                +", Salario Liquido"
                +String.format("%.2f",salarioLIquido);
         
    }
}
