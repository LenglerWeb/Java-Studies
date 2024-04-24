import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraSwing {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Calculadora");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 400);

            JPanel panel = new JPanel(new GridLayout(4, 4));

            String[] buttons = {"7", "8", "9", "/",
                    "4", "5", "6", "*",
                    "1", "2", "3", "-",
                    "0", ".", "=", "+"};

            JTextField textField = new JTextField();
            textField.setHorizontalAlignment(JTextField.RIGHT);

            for (String button : buttons) {
                JButton btn = new JButton(button);
                btn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textField.setText(textField.getText() + btn.getText());
                        /*int n = Integer.parseInt(textNum.getText());
                        int d = Integer.parseInt(textDen.getText());
                        float div = n / d;
                        float res = n % d;
                        lblDiv.setText(Float.toString(div));
                        lblResto.setText(Float.toString(res));
*/
                    }
                });
                panel.add(btn);
            }

            frame.add(textField, BorderLayout.NORTH);
            frame.add(panel, BorderLayout.CENTER);
            frame.setVisible(true);
        });
    }
}
