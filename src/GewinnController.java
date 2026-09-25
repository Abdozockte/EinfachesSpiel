import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GewinnController {
    private GewinnModel model;
    private GewinnView view;

    public GewinnController(GewinnModel model, GewinnView view) {
        this.model = model;
        this.view = view;

        view.spielerFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int eingabe;

                try {
                    eingabe = Integer.parseInt(view.spielerFeld.getText());
                } catch (NumberFormatException ex) {
                    return;
                }

                if (eingabe < 1 || eingabe > 9) {
                    return;
                }

                model.berechneComputerZahl();
                model.berechneRunde(eingabe);

                view.computerFeld.setText(
                        String.valueOf(model.getComputerZahl())
                );

                int ergebnis = model.getRundenErgebnis();

                if (ergebnis > 0) {
                    view.rundenergebnisAnzeige.setText("+" + ergebnis);
                    view.rundenergebnisAnzeige.setBackground(Color.green);
                    view.gesamtPunkteAnzahl.setBackground(Color.green);
                } else {
                    view.rundenergebnisAnzeige.setText("" + ergebnis);
                    view.rundenergebnisAnzeige.setBackground(Color.red);
                    view.gesamtPunkteAnzahl.setBackground(Color.red);
                }

                view.gesamtPunkteAnzahl.setText("Gesamtpunkte: " + model.getGesamtpunkte());
                if(model.getGesamtpunkte() <= 0){
                    view.spielerFeld.setEnabled(false);
                    view.rundenergebnisAnzeige.setText("Verloren!");
                }
                if(model.getGesamtpunkte() >= 100){
                    view.spielerFeld.setEnabled(false);
                    view.rundenergebnisAnzeige.setText("Gewonnen!");
                }
            }
        });

        view.button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nocheinmalGeklickt();
            }
        });
    }

    public void nocheinmalGeklickt() {
        view.spielerFeld.setEnabled(true);
        view.spielerFeld.setText("");
        view.computerFeld.setText("");
        view.rundenergebnisAnzeige.setText("Tippe eine Zahl von 1 bis 9");
        model.setGesamtpunkte(30);
        view.gesamtPunkteAnzahl.setText("Gesamtpunkte: "+ model.getGesamtpunkte());
        view.gesamtPunkteAnzahl.setBackground(Color.WHITE);
        view.rundenergebnisAnzeige.setBackground(Color.WHITE);
    }
}