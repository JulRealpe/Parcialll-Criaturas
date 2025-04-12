public interface Volador {
    void volar();
    void aterrizar();
}

public interface Magico {
    void lanzarHechizo(Criatura objetivo);
    void aprenderHechizo(String hechizo);
}
