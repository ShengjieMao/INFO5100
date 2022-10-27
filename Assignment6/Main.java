import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("weightedCalc");
        frame.setContentPane(new weightedCalc().weightedScore);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
