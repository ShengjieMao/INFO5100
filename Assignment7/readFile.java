import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;


public class readFile extends JFrame {
    private JFrame frame;
    public JPanel pane1;
    public JPanel pane2;
    private JLabel l_inputFile;
    private JTextField t_inputFile;
    private JButton btn_read;
    private JLabel l_inputShow;
    private JTextArea t_inputShow;
    private JLabel l_outFile;
    private JTextField t_outFile;
    private JButton btn_out;
    private JLabel l_outShow;
    private JTextArea t_outShow;



    public readFile() {
        /* implement method for click to read button from methods class
         * and set text for displaying file content in the textfield area
         */
        btn_read.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                String path = "/Users/shengjiemao/Desktop/readFile/src/annual.csv";
                String readIn = methods.readIn(path);
                t_inputShow.setText(readIn);
            }
        });

        /* implement method for click to write button from methods class
         * and set text for displaying the first three fields content in the textfield area
         */
        btn_out.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String strName = t_outFile.getText();
                String content = t_inputFile.getText();
                String writeOut = methods.writeIn(strName, content);
                t_outShow.setText(writeOut);

            }
        });
    }

    //generate the GUI initializer
    {
        $$$setupUI$$$();
    }

    /*
     * @noinspection ALL
     */
    public void $$$setupUI$$$() {
        frame = new JFrame();
        frame.setLayout(new GridLayout(1,2));
        pane1 = new JPanel();
        pane2 = new JPanel();
        pane1.setLayout(new GridLayout(0,1));
        pane2.setLayout(new GridLayout(0,1));
        GridLayout grid = new GridLayout(10, 15, 30, 20);
        l_inputFile = new JLabel();
        l_inputFile.setText("Reading file name");
        pane1.add(l_inputFile);
        l_outFile = new JLabel();
        l_outFile.setText("File name to write");
        pane2.add(l_outFile);
        t_inputFile = new JTextField();
        t_inputFile.setText("annual.csv");
        pane1.add(t_inputFile);
        t_inputFile.setLayout(grid);
        t_outFile = new JTextField();
        pane2.add(t_outFile);
        btn_read = new JButton();
        btn_read.setText("Click to read from file");
        pane1.add(btn_read);
        btn_out = new JButton();
        btn_out.setText("Click to write to file");
        pane2.add(btn_out);
        l_inputShow = new JLabel();
        l_inputShow.setText("First five lines of file");
        pane1.add(l_inputShow);
        l_outShow = new JLabel();
        l_outShow.setText("First five lines of new file");
        pane2.add(l_outShow);
        t_inputShow = new JTextArea();
        t_inputShow.setLineWrap (true);
        //JScrollPane sp = new JScrollPane(t_inputShow);
        pane1.add(t_inputShow);
        t_outShow = new JTextArea();
        t_outShow.setLineWrap (true);
        pane2.add(t_outShow);
        frame.add(pane1);
        frame.add(pane2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
