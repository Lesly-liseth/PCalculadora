import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {
    private JTextArea entrada;
    private JButton MSButton1;
    private JButton nButton;
    private JButton Tangente;
    private JButton cButton1;
    private JButton Siete;
    private JButton Cero;
    private JButton Uno;
    private JButton tan1Button;
    private JButton Cuatro;
    private JButton expButton1;
    private JButton Nueve;
    private JButton Seis;
    private JButton Tres;
    private JButton CParentesis;
    private JButton Pi;
    private JButton xButton;
    private JButton tan1Button1;
    private JButton logButton1;
    private JButton Porcentaje;
    private JButton xYButton;
    private JButton AParentesis;
    private JButton CEButton1;
    private JButton Ocho;
    private JButton Dos;
    private JButton Punto;
    private JButton Seno;
    private JButton sin1Button;
    private JButton mButton2;
    private JButton MCButton1;
    private JButton xButton4;
    private JButton Coseno;
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

    private JButton Cinco;

    private JButton Cubo;
    private JButton Cuadrado;
    private JButton RaizCuadrada;
    private JButton RaizCubica;
    private JButton Division;
    private JButton Multiplicacion;
    private JButton Resta;
    private JButton Suma;
    private JButton Igual;
    private JButton a1XButton;
    private JButton a10XButton;
    private JButton eButton;
    private JPanel mainPanel;
    private JTextField salida;


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

        Cero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comenzar == true) {
                    entrada.setText(" ");
                    entrada.setText("0");
                    comenzar = false;
                } else {
                    entrada.setText(entrada.getText() + "0");
                }
            }
        });

        Uno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comenzar == true) {
                    entrada.setText(" ");
                    entrada.setText("1");
                    comenzar = false;
                } else {
                    entrada.setText(entrada.getText() + "1");
                }
            }

        });
        Dos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comenzar == true) {
                    entrada.setText(" ");
                    entrada.setText("2");
                    comenzar = false;
                } else {
                    entrada.setText(entrada.getText() + "2");
                }
            }

        });
        Tres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comenzar == true) {
                    entrada.setText(" ");
                    entrada.setText("3");
                    comenzar = false;
                } else {
                    entrada.setText(entrada.getText() + "3");
                }
            }


        });
        Cuatro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comenzar == true) {
                    entrada.setText(" ");
                    entrada.setText("4");
                    comenzar = false;
                } else {
                    entrada.setText(entrada.getText() + "4");
                }
            }

        });
        Cinco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comenzar == true) {
                    entrada.setText(" ");
                    entrada.setText("5");
                    comenzar = false;
                } else {
                    entrada.setText(entrada.getText() + "5");
                }
            }

        });
        Seis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comenzar == true) {
                    entrada.setText(" ");
                    entrada.setText("6");
                    comenzar = false;
                } else {
                    entrada.setText(entrada.getText() + "6");
                }

            }
        });
        Siete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comenzar == true) {
                    entrada.setText(" ");
                    entrada.setText("7");
                    comenzar = false;
                } else {
                    entrada.setText(entrada.getText() + "7");
                }
            }

        });
        Ocho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comenzar == true) {
                    entrada.setText(" ");
                    entrada.setText("8");
                    comenzar = false;
                } else {
                    entrada.setText(entrada.getText() + "8");
                }
            }

        });
        Nueve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comenzar == true) {
                    entrada.setText(" ");
                    entrada.setText("9");
                    comenzar = false;
                } else {
                    entrada.setText(entrada.getText() + "9");
                }

            }
        });


        Punto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(entrada.getText().contains(".")){

                }
                else{
                    entrada.setText(entrada.getText() + ".");
                }
            }
        });
        Suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                igual = true;
                comenzar = true;
                if(op1 == true){
                    v1 = Double.parseDouble(entrada.getText());
                    salida.setText("");
                    salida.setText(entrada.getText()+ "+");
                    op1 = false;
                }
                else{
                    if (op2 == true){
                        v2 = Double.parseDouble(entrada.getText());
                        salida.setText("");
                        salida.setText(entrada.getText()+ "+");
                        op2 = false;
                    }
                    else{
                        salida.setText(entrada.getText()+ "+");
                        //operaciones(resultado,v2); Metodo a implementar
                    }
                }
                tpoperacion = "+";
            }
        });
    }




    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
    }

}