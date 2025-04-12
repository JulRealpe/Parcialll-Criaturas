import java.util.ArrayList;
import java.util.List;

public class Mago extends Criatura implements Magico {
    private List<String> hechizos = new ArrayList<>();

    public Mago(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    public void atacar(Criatura objetivo) {
        lanzarHechizo(objetivo);
    }

    public void defender(int daño) {
        salud -= daño;
        System.out.println(nombre + " recibe " + daño + " de daño. Salud restante: " + salud);
    }

    public void lanzarHechizo(Criatura objetivo) {
        int daño = fuerza;
        if (arma != null) {
            daño += arma.atacarConArma();
            System.out.println(nombre + " lanza un hechizo usando su " + arma.getNombre());
        } else {
            System.out.println(nombre + " lanza un hechizo mágico.");
        }
        objetivo.defender(daño);
    }
    
    public void aprenderHechizo(String hechizo) {
        hechizos.add(hechizo);
        System.out.println(nombre + " aprendió el hechizo: " + hechizo);
    }
}
