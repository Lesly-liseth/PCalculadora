import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {
    private JTextArea entrada;
    private JButton MSButton1;
    private JButton nButton;
    private JButton tanButton;
    private JButton cButton1;
    private JButton a7Button;
    private JButton a0Button1;
    private JButton a1Button;
    private JButton tan1Button;
    private JButton a4Button;
    private JButton expButton1;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton a0Button;
    private JButton πButton1;
    private JButton xButton;
    private JButton tan1Button1;
    private JButton logButton1;
    private JButton button22;
    private JButton xYButton;
    private JButton button25;
    private JButton CEButton1;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton button30;
    private JButton sinButton1;
    private JButton sin1Button;
    private JButton mButton2;
    private JButton MCButton1;
    private JButton xButton2;
    private JButton cosButton1;
    private JButton cos1Button;
    private JButton mButton3;
    private JButton MRButton1;
    private JButton xButton3;
    private JButton xButton1;
    private JButton button3;
    private JButton button5;
    private JButton button6;
    private JButton xButton5;
    private JButton button8;
    private JButton button9;

    private JButton button1;
    private JButton a1XButton;
    private JButton a10XButton;
    private JButton eButton;
    private JPanel mainPanel;


    // VARIABLES
    private boolean igual, comenzar = true, op1, op2;
    private double x, y, z, mem = 0, resultado, v1, v2;
    private String cad, fun, tpoperacion;

    public Calculadora() {

        setTitle("CALCULADORA");
        setSize(700, 300);
        setLocationRelativeTo(null);
        setContentPane(mainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        //NUMEROS (BOTONES)
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comenzar == true) {
                    entrada.setText(" ");
                    entrada.setText("1");
                    comenzar = false;
                }
                else{
                    entrada.setText(entrada.getText()+"1");
                    }
                }

        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comenzar == true) {
                    entrada.setText(" ");
                    entrada.setText("2");
                    comenzar = false;
                }
                else{
                    entrada.setText(entrada.getText()+"2");
                }
            }

        }
        });
    }


public static void main(String[] args) {
    Calculadora calculadora = new Calculadora();
}
}
