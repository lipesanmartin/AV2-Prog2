package orm.actions;

import orm.models.Aluno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class BuscaAlunos {
    public List<Aluno> getAll() {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
        EntityManager manager = factory.createEntityManager();
        Query query = manager.createQuery("select a from Aluno as a");
        List<Aluno> lista = query.getResultList();

        manager.close();
        factory.close();
        return lista;
    }
}
