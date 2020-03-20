
public class MainContatore {
    public static void main(String[] args)
    {

        Contatore c = new Contatore(100);
        boolean e;
        int lim;

        lim=c.getValueMax();

        for(int i=0;i<lim+2;i++){
            e=c.isError();
            c.inc();
            System.out.println("Il valore attuale è: "+c.getValue());
            System.out.println("Lo stato interno è: "+e);
        }

        c.reset();
    }
}

//main