package orm.tests;

import orm.actions.BuscaPorId;
import orm.actions.DeleteAluno;
import orm.models.Aluno;

public class TesteDelete {
    public static void main(String[] args) {
        Aluno aluno = new BuscaPorId().getById(2L);

        new DeleteAluno().delete(aluno, aluno.getId());
    }
}
