package model;

public class Usuario {

    public String login;
    public int senha;
    public int tentativas = 0;

    public boolean Validar() {
        if ("Edu".equals(this.login) && this.senha == 1234) {
            return true;
        } else {
            tentativas++;
            return false;
        }
    }
}