public class TesteTiposPrimitivos {

    public static void main(String[] args) {

        int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println("Variável idade em int, transformado para String: "+ idade);

        String valor2 = "30";
        int idade2 = Integer.parseInt(valor2);
        System.out.println("Variável valor2 em String, transformado para Inteiro: " + idade2);

        String valor3 = "30.5";
        float idade3 = Float.parseFloat(valor3);
        System.out.printf("Variável valor3 em String, transformado para Float: %.2f", idade3);

    }

}
