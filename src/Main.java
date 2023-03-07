import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Automovil auto = new Automovil("Nissan","Xtrail", (byte)15, Color.DARK_GRAY);
        System.out.println(auto);
        auto.encender();

        Persona per = new Persona(18, "Sofía", 1.63, 60, "M");
        System.out.println(per);
        per.comer();

        Monitor mon =  new Monitor(21.5, "HP", "P22VA", "LED", 3064 );
        System.out.println(mon);
        mon.encender();

        Pluma plum = new Pluma(145, 72, "Scribe", Color.BLUE);
        System.out.println(plum);
        plum.pintar();
    }

}