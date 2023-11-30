package orm.actions;

import orm.models.Aluno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class InsereAluno {
    public void insere(Aluno aluno) {


        EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();
        manager.persist(aluno);
        manager.getTransaction().commit();

        manager.close();
        factory.close();

    }
}
