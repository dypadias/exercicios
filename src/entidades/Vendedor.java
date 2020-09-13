//Curso: ANALISE E DESNVOLVIMENTO DE SISTEMAS UNICESUMAR
//Prof.: ANDRÉ NOEL
//Aluno: DIEGO MATOS
package entidades;

public class Vendedor extends Funcionario {

    public Double comissao;

    public Vendedor() {

    }

    public Vendedor(Double comissao, Double salario, Integer ramal, String nome, String cpf) {
        super(salario, ramal, nome, cpf);
        this.comissao = comissao;
    }

   

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double salarioMes() {
        return salario + comissao;
    }

    void getNome(String diego) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "VENDEDOR"
                + "\n-Nome:" + getNome()
                + "\n-CPF:" + getCpf()
                + "\n-Ramal:" + getRamal()
               ;

    }

}
