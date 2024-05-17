import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class myCalculator extends JFrame {
    private JPanel panel;
    private JTextField secondNumber;
    private JTextField firstNumber;
    private JTextField result1;
    private JTextField operation;
    private JButton button;

    public myCalculator() {

        add(panel);
        setSize(400, 200);
        setTitle("calculator");

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String op = operation.getText();
                    Double number1 = Double.parseDouble(firstNumber.getText());
                    Double number2 = Double.parseDouble(secondNumber.getText());

                    if (op.equals("+")) {
                        Double result = number1 + number2;
                        String s = Double.toString(result);
                        result1.setText(s);
                    } else if (op.equals("-")) {
                        Double result = number1 - number2;
                        String s = Double.toString(result);
                        result1.setText(s);
                    } else if (op.equals("*")) {
                        Double result = number1 * number2;
                        String s = Double.toString(result);
                        result1.setText(s);
                    } else if (op.equals("/")) {
                        if (number2 != 0) {
                            Double result = number1 / number2;
                            String s = Double.toString(result);
                        } else {
                            throw new ArithmeticException("Division by zero.");
                        }
                    } else {
                       result1.setText("This is an invalid operation.");
                    }
                } catch (ArithmeticException exp) {
                    result1.setText("Division by zero error.");

                }
            }
        });
    }
}



