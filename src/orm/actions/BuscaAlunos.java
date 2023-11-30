package orm.actions;

import orm.models.Aluno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class BuscaAlunos {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
        EntityManager manager = factory.createEntityManager();

        Query query = manager.createQuery("select a from Aluno as a");


        List<Aluno> lista = query.getResultList();

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

        manager.close();
        factory.close();

    }
}
