import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class weightedCalc extends JFrame{
    // initialize the variables
    public JPanel weightedScore;
    private JTextField TotalPoints;
    private JTextField Percentage;
    private JTextField Earned;
    private JButton Calculate;
    private JTextField Weighted;
    private JLabel total;
    private JLabel perc;
    private JLabel raw;
    private JLabel result;


    // process the button handler and result action
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

    {
    // GUI initializer
        $$$setupUI$$$();
    }


    // uses the GUI and set up the initial values and labels
    public void $$$setupUI$$$() {
        GridLayout gb = new GridLayout(0, 1);
        weightedScore = new JPanel();
        weightedScore.setLayout(gb);
        total = new JLabel();
        total.setText("Total Assignment Points");
        weightedScore.add(total);
        TotalPoints = new JTextField(20);
        TotalPoints.setSize(120,30);
        weightedScore.add(TotalPoints);
        perc = new JLabel();
        perc.setText("Percentage of Class");
        weightedScore.add(perc);
        Percentage = new JTextField(20);
        Percentage.setSize(120,30);
        weightedScore.add(Percentage);
        raw = new JLabel();
        raw.setText("Earned Points");
        weightedScore.add(raw);
        Earned = new JTextField(20);
        Earned.setSize(120,30);
        weightedScore.add(Earned);
        Calculate = new JButton();
        Calculate.setText("Click to calculate score");
        weightedScore.add(Calculate);
        result = new JLabel();
        result.setText("Weighted score");
        weightedScore.add(result);
        Weighted = new JTextField(20);
        Weighted.setSize(120,30);
        Weighted.setText("");
        weightedScore.add(Weighted);
    }


    // running codes
    public JComponent $$$getRootComponent$$$() {
        return weightedScore;
    }


}

