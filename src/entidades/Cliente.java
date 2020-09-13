//Curso: ANALISE E DESNVOLVIMENTO DE SISTEMAS UNICESUMAR
//Prof.: ANDRÉ NOEL
//Aluno: DIEGO MATOS
package entidades;

public class Cliente extends Pessoa {

    public String usuario;
    public String senha;

    public Cliente() {

    }

    public Cliente(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public boolean verificaSenha(String senha) {
        if (senha == getSenha()) {
            return true;

        } else {
            return false;
        }
        
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {

        return "CLIENTE"
                + "\n-Nome:" + getNome()
                + "\n-CPF:" + getCpf();

    }
    
}
