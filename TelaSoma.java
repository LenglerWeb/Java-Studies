import javax.swing.*;
import java.awt.*;



public class TelaSoma {
    private JPanel panel1;
    private JTextField txtN1;
    private JTextField txtN2;
    private JButton btnSoma;
    private JLabel lblSoma;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    private void btnSomaActionPerformed(java.awt.event.ActionEvent evt) {
        int n1 = Integer.parseInt(txtN1.getText());
        int n2 = Integer.parseInt(txtN2.getText());
        int s = n1 + n2;

        lblSoma.setText(Integer.toString(s));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Calculadora");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 400);

            JPanel panel = new JPanel(new GridLayout(4, 4));
        });


    }

}
