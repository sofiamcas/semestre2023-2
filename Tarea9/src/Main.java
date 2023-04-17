import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo(4,4,Color.black);
        System.out.println(vehiculo1);
        vehiculo1.encender();
        vehiculo1.apagar();



        Automovil auto = new Automovil(4,4,Color.black,"NISSAN", "xtreme", 2020);
        System.out.println(auto);
        auto.acelerar();
        auto.frenar();


        Taxi taxi = new Taxi(4,4,Color.black,"NISSAN", "xTreme", 2020, "José","Sí tiene licencia", 4);
        System.out.println(taxi);
        taxi.recogerPasajero();
        taxi.dejarPasajero();

    }

}