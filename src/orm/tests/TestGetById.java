package orm.tests;

import orm.actions.BuscaPorId;
import orm.models.Aluno;

import javax.persistence.NoResultException;

public class TestGetById {
    public static void main(String[] args) {

        try {
            Aluno a = new BuscaPorId().getById(6L);
            System.out.println("Aluno " + a.getId());
            System.out.println("Nome: " + a.getName());
            System.out.println("Email: " + a.getEmail());
            System.out.println("CPF: " + a.getCpf());
            System.out.println("Data de nascimento: " + a.getDataDeNascimento());
            System.out.println("Naturalidade: " + a.getNaturalidade());
            System.out.println("Endereço: " + a.getEndereco());
            System.out.println();


        } catch (NoResultException e) {
            System.out.println("Aluno não encontrado.");;
        }

    }
}
