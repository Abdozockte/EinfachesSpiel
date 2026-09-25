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
                } else {
                    view.rundenergebnisAnzeige.setText("" + ergebnis);
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
        view.spielerFeld.setText("");
        view.computerFeld.setText("");
        view.rundenergebnisAnzeige.setText("Tippe eine Zahl von 1 bis 9");
    }
}