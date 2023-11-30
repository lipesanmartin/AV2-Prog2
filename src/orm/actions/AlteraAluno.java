package orm.actions;

import orm.models.Aluno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlteraAluno {

    public Aluno alteraAluno(Aluno aluno) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();
        manager.merge(aluno);
        manager.getTransaction().commit();

        manager.close();
        factory.close();
        return aluno;
    }


}
