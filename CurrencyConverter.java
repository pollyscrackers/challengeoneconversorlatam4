import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverter extends JFrame {

    private JPanel mainPanel;
    private JLabel deLabel;
    private JComboBox deComboBox;
    private JTextField deTextField;
    private JLabel aLabel;
    private JComboBox aComboBox;
    private JTextField aTextField;
    private JButton convertButton;

    public CurrencyConverter(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double value = Double.parseDouble(deTextField.getText());
                int currency = deComboBox.getSelectedIndex();
                int currencyT = aComboBox.getSelectedIndex();
                if (currency == 0 && currencyT == 1) {
                    aTextField.setText(String.valueOf(value / 495));
                } else if (currency == 0 && currencyT == 2) {
                    aTextField.setText(String.valueOf(value / 254));
                } else if (currency == 1 && currencyT == 0) {
                    aTextField.setText(String.valueOf(value * 495));
                } else if (currency == 1 && currencyT == 2) {
                    aTextField.setText(String.valueOf(value * 0.93));
                } else if (currency == 2 && currencyT == 0) {
                    aTextField.setText(String.valueOf(value * 254));
                } else if (currency == 2 && currencyT == 1) {
                    aTextField.setText(String.valueOf(value / 0.93));
                }
                //aTextField.setText(String.valueOf(value));
                //aTextField.setText(String.valueOf(currency));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new CurrencyConverter("Currency Converter 1.0");
        frame.setVisible(true);
    }
}
