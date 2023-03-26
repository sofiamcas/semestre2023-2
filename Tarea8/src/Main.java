public class Main {
    public static void main(String[] args) {
        MaquinaDeCafe maquina = new MaquinaDeCafe();
        System.out.println("Máquina de café lista para servir\n");
        maquina.estadoActual();

        int cafesServidos = 0;
        while (maquina.servirAmericano()) {
            cafesServidos++;
        }
        while (maquina.servirCapuchino()) {
            cafesServidos++;
        }
        while (maquina.servirExpreso()) {
            cafesServidos++;
        }

        System.out.println("\nSe han servido " + cafesServidos + " cafés\n");
        maquina.estadoActual();
    }
}