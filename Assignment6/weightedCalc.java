import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class weightedCalc {
    private JPanel weightedScore;
    private JTextField TotalPoints;
    private JTextField Percentage;
    private JTextField Earned;
    private JButton Calculate;
    private JTextField Weighted;
    private JLabel total;
    private JLabel perc;
    private JLabel raw;
    private JLabel result;


    public weightedCalc() {
        Calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double total_score = Double.parseDouble(TotalPoints.getText());
                double earned_score = Double.parseDouble(Earned.getText());
                double perc_take = Double.parseDouble(Percentage.getText());

                double weighted_score = (earned_score / total_score) * perc_take;
                Weighted.setText("" + weighted_score);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("weightedCalc");
        frame.setContentPane(new weightedCalc().weightedScore);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
