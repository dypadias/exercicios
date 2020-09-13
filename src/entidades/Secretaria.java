//Curso: ANALISE E DESNVOLVIMENTO DE SISTEMAS UNICESUMAR
//Prof.: ANDRÉ NOEL
//Aluno: DIEGO MATOS
package entidades;

public class Secretaria extends Funcionario {

    public Secretaria(Double salario, Integer ramal, String nome, String cpf) {
        super(salario, ramal, nome, cpf);
    }

    @Override
    public double calculaSalAnual() {
        return super.calculaSalAnual(); 
    
    

    
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCpf(String cpf) {
        super.setCpf(cpf); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCpf() {
        return super.getCpf(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNome() {
        return super.getNome(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRamal(Integer ramal) {
        super.setRamal(ramal); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer getRamal() {
        return super.getRamal(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSalario(Double salario) {
        super.setSalario(salario); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Double getSalario() {
        return super.getSalario(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String exibe() {
        return super.exibe(); 
    }

 

}
