public class Main {
    public static void main(String[] args) {
        Dragon dragon = new Dragon("Draco", 100, 20);
        Mago mago = new Mago("Merlín", 80, 15);
        Guerrero guerrero = new Guerrero("Arthas", 120, 18);

        Arma espada = new Arma("Espada Legendaria", 10);
        Arma báculo = new Arma("Báculo Mágico", 12);

        guerrero.equiparArma(espada);
        mago.equiparArma(báculo);

        mago.aprenderHechizo("Bola de Fuego");

        dragon.volar();
        mago.lanzarHechizo(dragon);
        dragon.aterrizar();

        SimuladorBatalla.simular(dragon, mago);
        SimuladorBatalla.simular(guerrero, dragon);
    }
}
