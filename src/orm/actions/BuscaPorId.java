package orm.actions;

import orm.models.Aluno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class BuscaPorId {

    public Aluno getById(Long id) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
        EntityManager manager = factory.createEntityManager();

        Query query = manager.createQuery("SELECT a FROM Aluno a WHERE a.id = :id");
        query.setParameter("id", id);

        Aluno aluno = (Aluno) query.getSingleResult();

        manager.close();
        factory.close();
        return aluno;
    }

}
