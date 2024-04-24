import javax.xml.transform.Source;
import java.io.PrintStream;
import java.sql.SQLOutput;
import java.math.*;

public class Main {
    public static void main(String[] args) {

        int a, b;

        a = 10;
        b = 4;
        float res;
        float resultado = (float) Math.sqrt(a);
        float v = 8.9f;
        float v2 = 8.4f;
        int ar = (int) Math.ceil(v); // Arredonda para cima, independente do número após a vírgula
        int ar1 = (int) Math.floor(v); // Arredonda para baixo, independente do número após a vírgula
        int ar2 = (int) Math.round(v2); // Arredonda para cima ou para baixo conforme o valor depois da vírgula
        int ar3 = (int) Math.round(v);
        double ran = Math.random();
        int num = (int)(5 + ran * (10-5));


        System.out.format("1) %d + %d = %.0f\n", a, b, res = a+=b );
        System.out.format("2) %d - %d = %.0f\n", a, b, res = a-=b);
        System.out.format("3) %d * %d = %.0f\n", a, b, res = a*=b);
        System.out.format("4) %d / %d = %.0f\n", a, b, res = a/=b);
        System.out.format("5) %d resto %d = %.0f\n", a, b, res = a%=b);
        System.out.format("A Raíz Quadrada de %d = %.2f\n", a, resultado);
        System.out.format("Arredondando o valor %.1f para cima = %d\n", v, ar);
        System.out.format("Arredondando o valor %.1f para baixo = %d\n", v, ar1);
        System.out.format("Arredondando o valor %.1f para = %d\n", v, ar3);
        System.out.format("Arredondando o valor %.1f para = %d\n", v2, ar2);
        System.out.format("Número gerado pelo método RANDOM: %.1f\n", ran);
        System.out.format("Número gerado entre 5 e 10 com o método RANDOM: %d\n", num);

        int n1 = 2, n2 = 5;
        double result = n1/n2;
        System.out.println(result);

    }
}