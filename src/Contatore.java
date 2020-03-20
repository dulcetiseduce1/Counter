
public class Contatore {
    private int valoreAttuale;
    private int valoreMassimo;
    private boolean errore;

    public Contatore(int valmax) {
        valoreAttuale = 0;
        valoreMassimo = valmax;
        errore = false;
    }

    public void inc() {
        if (valoreAttuale < valoreMassimo)
            valoreAttuale = valoreAttuale + 1;
        else
            errore = true;
    }

    public void reset() {
        valoreAttuale = 0;
        errore = false;
    }

    public int getValue() {
        return valoreAttuale;
    }

    public int getValueMax() {
        return valoreMassimo;
    }

    public boolean isError() {
        return errore;
    }
}
