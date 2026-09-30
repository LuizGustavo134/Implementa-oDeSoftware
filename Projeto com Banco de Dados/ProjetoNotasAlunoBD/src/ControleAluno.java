
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;


public class ControleAluno {
    
    Connection conexao;
    PreparedStatement instrucaosql;
    Statement comando;
    ResultSet lista;
    FormAluno Faluno = new FormAluno();
    
    public void Conectar(){
        try{
            // definição de variáveis com as informações para conexão
            String usuario="root";
            String senha="";
            String nomebanco="notasalunobd";
            String servidor="localhost:3306";
            String driver="com.mysql.cj.jdbc.Driver";
            // carregando o driver
            Class.forName(driver);
            String url="jdbc:mysql://"+servidor+"/"+nomebanco+"?useTimezone=true&serverTimezone=UTC";
            conexao = DriverManager.getConnection(url,usuario,senha);
            comando=conexao.createStatement();
            JOptionPane.showMessageDialog(null,"conectado ao bd: " + nomebanco);
        }
        catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"Problemas no Driver JDBC");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Problemas no acesso ao BD");
        }
    }
    public void cadastrar(String nome, double nota1, double nota2, double nota3){
        Faluno.get
    };
}
