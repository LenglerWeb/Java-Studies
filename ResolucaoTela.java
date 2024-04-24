import java.awt.Dimension;
import java.awt.Toolkit;

    public class ResolucaoTela {

        public static void main(String[] args) {
            // Obtém a resolução da tela
            Dimension resolucao = Toolkit.getDefaultToolkit().getScreenSize();
            int largura = (int) resolucao.getWidth();
            int altura = (int) resolucao.getHeight();

            System.out.println("Resolução da Tela:");
            System.out.println("Largura: " + largura + " pixels");
            System.out.println("Altura: " + altura + " pixels");
        }
    }
