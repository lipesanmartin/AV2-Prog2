package orm.tests;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestaCriaTabela {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
        factory.close();
    }
}
