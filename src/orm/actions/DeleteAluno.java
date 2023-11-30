package orm.actions;

import orm.models.Aluno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DeleteAluno {
	public void delete(Aluno aluno, Long id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		EntityManager manager = factory.createEntityManager();

		aluno = manager.find(Aluno.class, id);
		manager.getTransaction().begin();
		manager.remove(aluno);
		manager.getTransaction().commit();

		manager.close();
		factory.close();
    }
}
