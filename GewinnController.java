import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class GewinnController {
    private GewinnModel model;
    private  GewinnView view;

    public GewinnController(GewinnModel model, GewinnView view) {
        int eingabe;
        this.model = model;
        this.view = view;
        view.spielerFeld.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try {
                    eingabe = Integer.parseInt(view.spielerFeld.getText());
                }catch(NumberFormatException e){
                    return;
                }
                if(view.spielerFeld.getText() < 1 || view.spielerFeld.getText > 9){
                    return;
                }

                model.berechneComputerZahl();
                model.berechneRunde(eingabe);

                view.computerFeld.setText(String.valueOf(model.getComputerZahl()));
                int ergebnis = model.getRundenErgebnis();
                if(ergebnis > 0)    {
                    view.rundenergebnisAnzeige.setText("+" + ergebnis);
                } else {
                    view.rundenergebnisAnzeige.setText("" + ergebnis);
            }
        }
        private void nocheinmalGeklickt()   {
                view.spielerFeld.setText("");
                view.computerFeld.setText("");
                view.rundenergebnisAnzeige.setText("Tippe eine Zahl von 1 bis 9");
            }
    }
}

