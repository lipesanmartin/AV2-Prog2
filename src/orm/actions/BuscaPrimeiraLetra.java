package orm.actions;

import orm.models.Aluno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;
import java.util.Scanner;

public class BuscaPrimeiraLetra {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a primeira letra que quer buscar: ");
        String letra = sc.nextLine();

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
        EntityManager manager = factory.createEntityManager();

        Query query = manager.createQuery("SELECT a FROM Aluno a WHERE SUBSTRING(a.name, 1, 1) = :letra");
        query.setParameter("letra", letra);

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
