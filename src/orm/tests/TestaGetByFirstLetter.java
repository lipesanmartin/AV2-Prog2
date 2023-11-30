package orm.tests;

import orm.actions.BuscaPrimeiraLetra;
import orm.models.Aluno;

import java.util.List;
import java.util.Scanner;

public class TestaGetByFirstLetter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a letra: ");
        String letra = sc.nextLine();

        List<Aluno> lista = new BuscaPrimeiraLetra().getByFirstLetter(letra);

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
    }
}
