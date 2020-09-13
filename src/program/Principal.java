//Curso: ANALISE E DESNVOLVIMENTO DE SISTEMAS UNICESUMAR
//Prof.: ANDRÉ NOEL
//Aluno: DIEGO MATOS
package program;

import entidades.Cliente;
import entidades.Funcionario;
import entidades.Pessoa;
import entidades.Presidente;
import entidades.Secretaria;
import entidades.Vendedor;

public class Principal {

    public static void main(String[] args) {

        Pessoa fun = new Funcionario(Double.NaN, Integer.SIZE, "as", "df") {
        };
        Pessoa ven = new Vendedor(10.0, 10.6, 12, "saf", "fg");
        Funcionario sec = new Secretaria(12.5, 136, "Fatima", "3124697");

        Presidente pre = new Presidente();

        Vendedor ven1 = new Vendedor();
        Vendedor ven2 = new Vendedor();
        Cliente cli = new Cliente();
        Cliente cli1 = new Cliente();
        Cliente cli2 = new Cliente();
        Cliente cli3 = new Cliente();

//CADASTRO DE CLIENTES        
        ven1.setNome("Vanessa");
        ven1.setCpf("879645213645");
        ven1.setRamal(312);
        ven1.setSalario(1200.00);
        ven1.setComissao(45.00);
        ven1.salarioMes();
        ven1.calculaSalAnual();

        ven2.setNome("Carlos");
        ven2.setCpf("879645218796");
        ven2.setRamal(358);
        ven2.setSalario(1500.00);
        ven2.setComissao(69.00);
        ven2.salarioMes();
        ven2.calculaSalAnual();

        sec.calculaSalAnual();
        sec.exibe();

        pre.setNome("Asdrubal Leoncio Correia");
        pre.setCpf("69745883214");
        pre.setRamal(457);
        pre.setSalario(15.00);
        pre.calculaSalAnual();

        cli.setNome("Lucas");
        cli.setCpf("89756478932");
        cli.setSenha("123456");

        cli1.setNome("Marcos");
        cli1.setCpf("879865541232");
        cli1.setSenha("954645");

        cli2.setNome("Joana");
        cli2.setCpf("879865541232");
        cli2.setSenha("44799");

        cli3.setNome("Elias");
        cli3.setCpf("879865541232");
        cli3.setSenha("12345");

        //CALCULO SALARIO
        System.out.println("\nSalario anual: ");

        pre.exibe();
        System.out.println("Salario anual: " + pre.calculaSalAnual());

        sec.exibe();
        System.out.println("Salario anual: " + sec.calculaSalAnual());

        double salarioAnual = pre.calculaSalAnual();
        System.out.format("Resultado\n", salarioAnual);

        //VERIFICAÇÃO SENHA LUCAS       
        System.out.println("\nVerificação de senha:\n");

        cli.exibe();

        System.out.println("Esqueceu a senha.\n");

        System.out.println("\nDigite a senha para verificação");
        String vSenha = "Segredo";
        System.out.printf("Senha digitada: " + vSenha, "\n");

        if (cli.verificaSenha(vSenha)) {
            System.out.println("\nCorreta");
        } else {
            System.out.println("\nIncorreta\n Tente Novamente\n");
        }
        System.out.println("Digite a senha para verificação");
        vSenha = "Teste";
        System.out.printf("Senha digitada: " + vSenha, "\n");
        if (cli.verificaSenha(vSenha)) {
            System.out.println("\nCorreta");
        } else {
            System.out.println("\nIncorreta\n Tente Novamente\n");
        }
        System.out.println("Digite a senha para verificação");
        vSenha = "123456";
        System.out.printf("Senha digitada: " + vSenha, "\n");
        if (cli.verificaSenha(vSenha)) {
            System.out.println("\nCorreta");
        } else {
            System.out.println("\nIncorreta\n Tente Novamente\n");
        }
//DADOS DE TODOS CADASTRADOS
       sec.exibe();

    }

}
