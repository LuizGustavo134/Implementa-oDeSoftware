
import javax.swing.JOptionPane;

public class conta {
    public String nome_cliente;
    public int num_conta;
    public String banco;
    public double saldo;
    
    public void Depositar(Double vl){
        this.saldo += vl; 
        JOptionPane.showMessageDialog(null, "deposito realizado com sucesso!!!");
    }
    public  void sacar(Double vl){
        if (this.saldo >= vl){
            this.saldo -=vl;
            JOptionPane.showMessageDialog(null, "saque realizado com sucesso!!!");
        }else {
            JOptionPane.showMessageDialog(null, "saldo insuficiente!!!");
        }}
}
