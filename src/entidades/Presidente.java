//Curso: ANALISE E DESNVOLVIMENTO DE SISTEMAS UNICESUMAR
//Prof.: ANDRÉ NOEL
//Aluno: DIEGO MATOS
package entidades;

public class Presidente extends Funcionario {

    @Override
    public String toString() {
        return "PRESIDENTE"
                + "\n-Nome:" + getNome()
                + "\n-CPF:" + getCpf()
                + "\n-Ramal:" + getRamal()
                ;
    }
}
