import javax.swing.*;
import java.awt.*;

public class GewinnView extends JFrame {

    JPanel panel = new JPanel();
    JLabel rundenergebnis = new JLabel("Rundenergebnis", SwingConstants.CENTER);
    JLabel rundenergebnisAnzeige = new JLabel("Tippe eine Zahl von 1 bis 9", SwingConstants.CENTER);
    JLabel gesamtpunkte = new JLabel("Gesamtpunkte", SwingConstants.CENTER);
    JLabel gesamtPunkteAnzahl = new JLabel("Gesamtpunkte:30", SwingConstants.CENTER);
    JLabel zahlLabel = new JLabel("Deine Zahl: ", SwingConstants.CENTER);
    JLabel computerLabel = new JLabel("Computer: ", SwingConstants.CENTER);

    JTextField spielerFeld = new JTextField();
    JTextField computerFeld = new JTextField();

    JPanel labels = new JPanel(new GridLayout(4, 2));
    JPanel eingabePanel = new JPanel(new GridLayout(1, 2));

    JPanel buttonPanel = new JPanel();
    JButton button = new JButton("Noch einmal!");

    public GewinnView() {

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600, 500);
        this.setResizable(false);
        panel.setLayout(new BorderLayout());

        rundenergebnis.setForeground(Color.BLACK);
        rundenergebnis.setBackground(Color.LIGHT_GRAY);
        rundenergebnis.setOpaque(true);

        computerLabel.setForeground(Color.BLACK);
        computerLabel.setBackground(Color.LIGHT_GRAY);
        computerLabel.setOpaque(true);

        zahlLabel.setForeground(Color.BLACK);
        zahlLabel.setBackground(Color.LIGHT_GRAY);
        zahlLabel.setOpaque(true);

        gesamtpunkte.setForeground(Color.BLACK);
        gesamtpunkte.setBackground(Color.LIGHT_GRAY);
        gesamtpunkte.setOpaque(true);

        gesamtPunkteAnzahl.setForeground(Color.BLACK);
        gesamtPunkteAnzahl.setBackground(Color.WHITE);
        gesamtPunkteAnzahl.setOpaque(true);

        rundenergebnisAnzeige.setForeground(Color.BLACK);
        rundenergebnisAnzeige.setBackground(Color.white);
        rundenergebnisAnzeige.setOpaque(true);

        rundenergebnis.setFont(new Font("Arial", Font.PLAIN, 20));
        gesamtpunkte.setFont(new Font("Arial", Font.PLAIN, 20));
        rundenergebnisAnzeige.setFont(new Font("Arial", Font.PLAIN, 18));
        gesamtPunkteAnzahl.setFont(new Font("Arial", Font.PLAIN, 18));

        spielerFeld.setPreferredSize(new Dimension(100, 50));
        button.setBackground(Color.LIGHT_GRAY);
        button.setFocusable(false);
        computerFeld.setEnabled(false);

        labels.add(rundenergebnis);
        labels.add(gesamtpunkte);
        labels.add(rundenergebnisAnzeige);
        labels.add(gesamtPunkteAnzahl);
        labels.add(zahlLabel);
        labels.add(computerLabel);

        eingabePanel.add(spielerFeld);
        eingabePanel.add(computerFeld);
        buttonPanel.add(button);

        panel.add(labels, BorderLayout.NORTH);
        panel.add(eingabePanel, BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.SOUTH);
        this.add(panel);
        this.setVisible(true);
    }
}