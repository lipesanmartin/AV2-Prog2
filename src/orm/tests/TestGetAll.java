package orm.tests;

import orm.actions.BuscaAlunos;
import orm.models.Aluno;

import java.util.List;

public class TestGetAll {
    public static void main(String[] args) {
        List<Aluno> lista = new BuscaAlunos().getAll();
        for (Aluno a : lista) {
            System.out.println("Aluno " + a.getId());
            System.out.println("Nome: " + a.getName());
            System.out.println("Email: " + a.getEmail());
            System.out.println("CPF: " + a.getCpf());
            System.out.println("Data de nascimento: " + a.getDataDeNascimento());
            System.out.println("Naturalidade: " + a.getNaturalidade());
            System.out.println("Endereço: " + a.getEndereco());
            System.out.println();
        }
    }
}
