//Curso: ANALISE E DESNVOLVIMENTO DE SISTEMAS UNICESUMAR
//Prof.: ANDRÉ NOEL
//Aluno: DIEGO MATOS
package entidades;

public abstract class Funcionario extends Pessoa {

    Double salario;
    private Integer ramal;

    public Funcionario() {

    }

    public Funcionario(Double salario, Integer ramal, String nome, String cpf) {
        super(nome, cpf);
        this.salario = salario;
        this.ramal = ramal;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Integer getRamal() {
        return ramal;
    }

    public void setRamal(Integer ramal) {
        this.ramal = ramal;
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

    public double calculaSalAnual() {
        return salario * 13;
    }

    @Override
    public String exibe() {
        return super.exibe(); 
    }

  
}
