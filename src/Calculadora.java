import javax.swing.*;
import java.awt.*;

public class Calculadora extends JFrame {
    public Calculadora(){
        JTextField text = new JTextField(10);
        JPanel panel = new JPanel(new GridLayout(4,4));
        JButton suma = new JButton("+");
        JButton resta = new JButton("-");
        JButton multiplica = new JButton("*");
        JButton divisi = new JButton("/");
        JButton resultado = new JButton("=");

        panel.add(text);
        panel.add(suma);
        panel.add(resta);
        panel.add(multiplica);
        panel.add(divisi);

        for (int i = 0; i < 10; i++) {
            JButton btn = new JButton(String.valueOf(i));
            panel.add(btn);
            btn.addActionListener(e -> {
                text.setText(text.getText() + btn.getText());
            });
        }

        suma.addActionListener(e -> {
            text.setText(text.getText() + suma.getText());
        });
        resta.addActionListener(e -> {
            text.setText(text.getText() + resta.getText());
        });
        multiplica.addActionListener(e -> {
            text.setText(text.getText() + multiplica.getText());
        });
        divisi.addActionListener(e -> {
            text.setText(text.getText() + divisi.getText());
        });
        resultado.addActionListener(e -> {
            text.setText("");
        });

        text.setEditable(false);

        panel.add(resultado);

        add(panel);
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200,300);
        setResizable(false);
        setVisible(true);
    }
}
