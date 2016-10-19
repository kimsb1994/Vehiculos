/**
 * Created by DAM on 19/10/16.
 */

public class Coche {
    private String Matricula;
    private String Marca;
    private String Modelo;
    private int Precio;


    public Coche(String matricula, String marca, String modelo, int precio) {
        Matricula = matricula;
        Marca = marca;
        Modelo = modelo;
        Precio = precio;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "Matricula='" + Matricula + '\'' +
                ", Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", Precio=" + Precio +
                '}';
    }
}
