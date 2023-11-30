package orm.tests;

import orm.actions.AlteraAluno;
import orm.actions.BuscaAlunos;
import orm.actions.BuscaPorId;
import orm.models.Aluno;

import java.util.Scanner;

public class TestaAltera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new BuscaPorId().getById(2L);
        System.out.print("Nome: ");
        aluno.setName(sc.nextLine());
        System.out.print("E-mail: ");
        aluno.setEmail(sc.nextLine());
        System.out.print("CPF: ");
        aluno.setCpf(sc.nextLine());
        System.out.print("Data de nascimento (dd/mm/yyyy): ");
        aluno.setDataDeNascimento(sc.nextLine());
        System.out.print("Naturalidade: ");
        aluno.setNaturalidade(sc.nextLine());
        System.out.println("Endereço: ");
        aluno.setEndereco(sc.nextLine());

        Aluno altera = new AlteraAluno().alteraAluno(aluno);



        sc.close();

    }
}
