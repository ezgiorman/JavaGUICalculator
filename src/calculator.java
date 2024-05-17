import javax.swing.*;

public class calculator {
    public static void main(String[] args) {


        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                myCalculator f = new myCalculator();
                f.setVisible(true);
            }
        });


    }
}


