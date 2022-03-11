package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainView extends JFrame {

    private JTextField EtapaField;
    private JButton InscriereButton;
    private JButton VeziPacienti;

    public MainView()
    {

        this.setBounds(100, 100, 681, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);

        InscriereButton= new JButton("INSCRIERE");
        InscriereButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
        InscriereButton.setBounds(285, 90, 113, 23);
        this.getContentPane().add(InscriereButton);

        JLabel label2 = new JLabel("ETAPA");
        label2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        label2.setBounds(62, 227, 60, 28);
        this.getContentPane().add(label2);

        EtapaField= new JTextField();
        EtapaField.setBounds(132, 227, 86, 26);
        this.getContentPane().add(EtapaField);
        EtapaField.setColumns(10);

        VeziPacienti = new JButton("VEZI PACIENTI");
        VeziPacienti.setFont(new Font("Tahoma", Font.PLAIN, 16));
        VeziPacienti.setBounds(267, 229, 153, 23);
        this.getContentPane().add(VeziPacienti);

        JLabel label1 = new JLabel("VACCINARE COVID");
        label1.setFont(new Font("Tahoma", Font.BOLD, 16));
        label1.setBounds(267, 38, 167, 28);
        this.getContentPane().add(label1);

        this.setVisible(true);
    }

    public int getEtapaField() {
        return Integer.parseInt(EtapaField.getText());
    }

    public void setEtapaField(JTextField etapaField) {
        this.EtapaField.setText(String.valueOf(EtapaField));
    }

    public JButton getInscriereButton() {
        return InscriereButton;
    }

    public void setInscriereButton(JButton inscriereButton) {
        InscriereButton = inscriereButton;
    }

    public JButton getVeziPacienti() {
        return VeziPacienti;
    }

    public void setVeziPacienti(JButton veziPacienti) {
        VeziPacienti = veziPacienti;
    }

    public void addInscriereListener(ActionListener action)
    {
        InscriereButton.addActionListener(action);
    }

    public void addVeziPacientiListener(ActionListener action)
    {
        VeziPacienti.addActionListener(action);
    }

    public void showMessage(String message)
    {
        JOptionPane.showMessageDialog(this,message);
    }

    public void showPacienti(String pacienti)
    {
        JOptionPane.showMessageDialog(this,pacienti);
    }

}
