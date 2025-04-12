public class SimuladorBatalla {

    public static void simular(Criatura c1, Criatura c2) {
        System.out.println("\n--- ¡Comienza la batalla entre " + c1.getNombre() + " y " + c2.getNombre() + "! ---");

        while (c1.estaViva() && c2.estaViva()) {
            c1.atacar(c2);
            if (!c2.estaViva())
                break;
            c2.atacar(c1);
        }

        System.out.println("\n--- Batalla finalizada ---");
        if (c1.estaViva()) {
            System.out.println(c1.getNombre() + " ha ganado.");
        } else if (c2.estaViva()) {
            System.out.println(c2.getNombre() + " ha ganado.");
        } else {
            System.out.println("Ambas criaturas han caído en combate.");
        }
    }
}
