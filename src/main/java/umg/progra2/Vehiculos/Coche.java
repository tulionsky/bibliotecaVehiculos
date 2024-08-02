package umg.progra2.Vehiculos;

public class Coche extends Vehiculo {
    private Integer numeroPuertas;

    public Coche(String Marca, String Modelo, String Ano,Integer numeroPuertas) {
        super(Marca, Modelo, Ano);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Numero puertas: " + numeroPuertas);
    }
}
