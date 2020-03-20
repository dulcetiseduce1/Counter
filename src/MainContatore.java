
public class MainContatore extends Thread {
    public static void main(String[] args)
    {

        contatore c = new contatore(100);
        boolean e;
        int lim;

        lim=c.getValueMax();

        for(int i=0;i<lim+2;i++){
            e=c.isError();
            c.inc();
            System.out.println("Il valore attuale è: "+c.getValve);
            System.out.println("Lo stato interno è: "+e);
        }

        c.reset();
    }
}

//main