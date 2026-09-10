package controle;

import view.FormSistema;
import model.Usuario;
import javax.swing.JOptionPane;

public class ControleLogin {

    Usuario usuario = new Usuario();

    public boolean Logar(String log, int senha) {
        if (usuario.tentativas >= 3) {
            JOptionPane.showMessageDialog(null, "Acesso bloqueado! Número máximo de tentativas atingido.");
            return false;
        }

        usuario.login = log;
        usuario.senha = senha;

        if (usuario.Validar()) {
            new FormSistema().setVisible(true);
            return true; // Login bem-sucedido
        } else {
            int restantes = 3 - usuario.tentativas;
            // verifica o numero de tentativas enquanto valida
            if (restantes == 0) {
                JOptionPane.showMessageDialog(null, "3 tentativas incorretas! O sistema será encerrado.");
                System.exit(0); // Encerra a aplicação ao atingir o limite
            } else {
                JOptionPane.showMessageDialog(null, "Usuário/Senha Incorretos! Tentativas restantes: " + restantes);
            }
            return false; // Falha no login
        }
    }
}