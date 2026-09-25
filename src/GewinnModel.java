public class GewinnModel{
    private int gesamtpunkte;
    private int spielerZahl;
    private int computerZahl;
    private int rundenErgebnis;

    public GewinnModel(){
        gesamtpunkte = 30;
        spielerZahl = 0;
        computerZahl = 0;
        rundenErgebnis = 0;
    }
    public int getGesamtpunkte(){
        return gesamtpunkte;
    }
    public int getComputerZahl(){
        return computerZahl;
    }
    public int getRundenErgebnist(){
        return rundenErgebnis;
    }
    public void berechneRunde(int spielerZahl){
        int computerZahl = (int) (Math.random()*9);
        if(computerZahl == spielerZahl){
            rundenErgebnis += 20;
        }
        if(spielerZahl ==(++computerZahl) || spielerZahl ==(--computerZahl)){
            rundenErgebnis += 5;
        }
        else{
            rundenErgebnis -= 10;
        }
    }
    public void berechneComputerZahl(){
        computerZahl = (int)(Math.random() *9) +1;
    }
    public boolean hatGewonnen(){
        return rundenErgebnis >= 5;
    }
    public boolean hatVerloren(){
        return rundenErgebnis < 5;
    }
}