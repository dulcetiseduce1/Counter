
public class MainContatore {
    public static void main(String[] args)
    {

        Contatore c = new Contatore(101);
        boolean e;
        int lim;

        lim=c.getValueMax();

        for(int i=0;i<=lim;i++){
            System.out.println("Il valore attuale è: "+c.getValue());
            c.inc();
            e=c.isError();
            System.out.println("Lo stato interno è: "+e);
        }

        c.reset();
    }
}