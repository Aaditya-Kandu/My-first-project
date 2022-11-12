import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class firstProject implements ActionListener {

    JFrame frame;
    JTextArea myarea;

    JButton button;


    firstProject()
    {
        frame = new JFrame("First Project");
        frame.setBounds(250,250,300,300);
        frame.setBackground(Color.black);
        frame.getContentPane().setBackground(Color.white);

        button = new JButton("Click");
        button.setBounds(120 ,20,50,20 );

        button.addActionListener(this);

        myarea = new JTextArea("Welcome to the Text Area");
        myarea.setBounds(50,50,200,200);
        myarea.setBackground(Color.red);

        frame.add(button);

        frame.add(myarea);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {

        firstProject object = new firstProject();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        myarea.setText("You Clicked the Button");
    }
}
