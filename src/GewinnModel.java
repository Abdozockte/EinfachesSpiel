public class GewinnModel {
    private int gesamtpunkte;
    private int spielerZahl;
    private int computerZahl;
    private int rundenErgebnis;

    public GewinnModel() {
        gesamtpunkte = 30;
        spielerZahl = 0;
        computerZahl = 0;
        rundenErgebnis = 0;
    }

    public int getGesamtpunkte() {
        return gesamtpunkte;
    }
    public void setGesamtpunkte(int punkte){
        this.gesamtpunkte = punkte;
    }

    public int getComputerZahl() {
        return computerZahl;
    }

    public int getRundenErgebnis() {
        return rundenErgebnis;
    }

    public void berechneRunde(int spielerZahl) {
        this.spielerZahl = spielerZahl;
        int diff = Math.abs(spielerZahl - computerZahl);

        if (diff == 0) {
            rundenErgebnis = 20;
        } else if (diff == 1) {
            rundenErgebnis = 5;
        } else {
            rundenErgebnis = -10;
        }

        gesamtpunkte += rundenErgebnis;
    }

    public void berechneComputerZahl() {
        computerZahl = (int) (Math.random() * 9) + 1;
    }

    public boolean hatGewonnen() {
        return gesamtpunkte >= 50;
    }

    public boolean hatVerloren() {
        return gesamtpunkte <= 0;
    }
}