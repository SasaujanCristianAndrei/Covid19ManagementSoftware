package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

public class SecondView extends JFrame {

    private JTextField numeField;
    private JTextField varstaField;
    private JComboBox comboBox;

    private JButton verificaEtapaButton;
    private JButton inscriereButton;
    private JButton backToMainMenu;

    private JTextArea textAreaVfEtapa;

    public SecondView()
    {
        this.setBounds(100, 100, 597, 344);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);///pentru a inchide doar tabul ala
        this.getContentPane().setLayout(null);

        JLabel titlu = new JLabel("Inscriere Proces De Vaccinare COVID");
        titlu.setFont(new Font("Tahoma", Font.PLAIN, 16));
        titlu.setBounds(149, 11, 270, 14);
        this.getContentPane().add(titlu);

        JLabel lblNewLabel = new JLabel("Nume");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel.setBounds(29, 86, 46, 14);
        this.getContentPane().add(lblNewLabel);

        JLabel lblVarsta = new JLabel("Varsta");
        lblVarsta.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblVarsta.setBounds(29, 116, 46, 14);
        this.getContentPane().add(lblVarsta);

        JLabel lblOcupatie = new JLabel("Ocupatie");
        lblOcupatie.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblOcupatie.setBounds(29, 145, 62, 20);
        this.getContentPane().add(lblOcupatie);

        numeField = new JTextField();
        numeField.setBounds(93, 85, 86, 20);
        this.getContentPane().add(numeField);
        numeField.setColumns(10);

        varstaField = new JTextField();
        varstaField.setColumns(10);
        varstaField.setBounds(93, 115, 86, 20);
        this.getContentPane().add(varstaField);

        comboBox = new JComboBox();
        comboBox.setBounds(101, 146, 78, 22);
        this.getContentPane().add(comboBox);
        comboBox.addItem("Doctor");
        comboBox.addItem("Profesor");
        comboBox.addItem("Elev");

        verificaEtapaButton = new JButton("Verifica Etapa");
        verificaEtapaButton.setBounds(402, 77, 99, 23);
        this.getContentPane().add(verificaEtapaButton);

        JLabel lblNewLabel_1 = new JLabel("Etapa");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1.setBounds(388, 118, 46, 20);
        this.getContentPane().add(lblNewLabel_1);

        textAreaVfEtapa = new JTextArea();
        textAreaVfEtapa.setBounds(444, 118, 24, 22);
        this.getContentPane().add(textAreaVfEtapa);

        inscriereButton = new JButton("INSCRIERE");
        inscriereButton.setBounds(226, 241, 89, 23);
        this.getContentPane().add(inscriereButton);

        backToMainMenu = new JButton("Inapoi");
        backToMainMenu.setFont(new Font("Tahoma", Font.PLAIN, 16));
        backToMainMenu.setBounds(10, 271, 119, 23);
        this.getContentPane().add(backToMainMenu);

        this.setVisible(false);

    }

    public String getNumeField() {
        return numeField.getText();
    }

    public void setNumeField(String numeField) {
        this.numeField.setText(numeField);
    }

    public int getVarstaField() {
        return Integer.parseInt(varstaField.getText());
    }

    public void setVarstaField(double varstaField) {
        this.varstaField.setText(String.valueOf(varstaField));
    }

    public int getTextAreaVfEtapa() {
        return Integer.parseInt(textAreaVfEtapa.getText());
    }

    public void setTextAreaVfEtapa(int textAreaVfEtapa) {
        this.textAreaVfEtapa.setText(String.valueOf(textAreaVfEtapa));
    }

    public void addExistListener(WindowListener action)
    {
        this.addWindowListener(action);
    }
    public String getComboBox() {
        return comboBox.getSelectedItem().toString();
    }

    public void addInscriere(ActionListener action)
    {
        inscriereButton.addActionListener(action);
    }

    public void addVeziEtapa(ActionListener action)
    {
        verificaEtapaButton.addActionListener(action);
    }

    public void addBackButton(ActionListener action)
    {
        backToMainMenu.addActionListener(action);
    }

    public void showMessage(String message)
    {
        JOptionPane.showMessageDialog(this,message);
        refresh();
    }

    public void refresh()
    {
        numeField.setText(null);
        varstaField.setText(null);
        textAreaVfEtapa.setText(null);
    }
}
