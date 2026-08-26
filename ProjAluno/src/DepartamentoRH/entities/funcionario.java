package DepartamentoRH.entities;
public class funcionario {
    public String name = "andre";
    public int reg = 98469;
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
       return salarioLIquido = ( Salbruto - Desconto);
    }
   public String toString(){
        return
                "funcionario: \n"+
                name +"\n"
                +"Salario Bruto: \n"
                +Salbruto+"\n"
                +"Salario Liquido: \n"
                +String.format("%.2f",CalcSalario())+"\n"
                + "Desconto: "
                +Desconto;

    }
}
