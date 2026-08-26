
import javax.swing.JOptionPane;

public class funcionario {
    
    public String nome;
    public String cargo;
    public String setor;
    public String novoSalario;
    public String salario;
    
    public void AumentarSalario(){
        this.salario = novoSalario;
        JOptionPane.showMessageDialog(null,"operação feita com sucesso !!!");
    }
   
}
