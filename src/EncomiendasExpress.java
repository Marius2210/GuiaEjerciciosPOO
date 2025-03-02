import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EncomiendasExpress extends JFrame {
    private JTextField txtPeso, txtDistancia;
    private JCheckBox chkExpress, chkVIP;
    private JLabel lblResultado;

    public EncomiendasExpress() {
        setTitle("Encomiendas Express");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        add(new JLabel("Peso del paquete (kg):"));
        txtPeso = new JTextField();
        add(txtPeso);

        add(new JLabel("Distancia de envío (km):"));
        txtDistancia = new JTextField();
        add(txtDistancia);

        chkExpress = new JCheckBox("Envío Express (+13%)");
        add(chkExpress);
        chkVIP = new JCheckBox("Tarjeta VIP (-10%)");
        add(chkVIP);

        JButton btnCalcular = new JButton("Calcular");
        add(btnCalcular);
        lblResultado = new JLabel("Precio total: ");
        add(lblResultado);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularCosto();
            }
        });
    }

    private void calcularCosto() {
        try {
            double peso = Double.parseDouble(txtPeso.getText());
            double distancia = Double.parseDouble(txtDistancia.getText());
            double costoPeso = calcularCostoPeso(peso);
            double costoDistancia = calcularCostoDistancia(distancia);
            double subtotal = costoPeso + costoDistancia;

            if (chkExpress.isSelected()) {
                subtotal *= 1.13;
            }
            if (chkVIP.isSelected()) {
                subtotal *= 0.90;
            }

            lblResultado.setText("Precio total: $" + String.format("%.2f", subtotal));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese valores válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private double calcularCostoPeso(double peso) {
        if (peso >= 1 && peso <= 4) return peso * 1.20;
        else if (peso >= 5 && peso <= 10) return peso * 1.35;
        else if (peso >= 11 && peso <= 20) return peso * 1.60;
        else return peso * 1.75;
    }

    private double calcularCostoDistancia(double distancia) {
        if (distancia >= 1 && distancia <= 20) return distancia * 0.20;
        else if (distancia >= 21 && distancia <= 40) return distancia * 0.08;
        else if (distancia >= 41 && distancia <= 60) return distancia * 0.06;
        else return distancia * 0.04;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new EncomiendasExpress().setVisible(true);
        });
    }
}
