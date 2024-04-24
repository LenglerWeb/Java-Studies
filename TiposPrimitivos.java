import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o nome do(a) aluno(a): ");
        String nome = teclado.nextLine();

        System.out.print("Agora informe a nota do aluno(a): ");
        float nota = teclado.nextFloat();

        System.out.format("A nota do aluno(a) %s é %.1f .\n", nome, nota);
    }
}
