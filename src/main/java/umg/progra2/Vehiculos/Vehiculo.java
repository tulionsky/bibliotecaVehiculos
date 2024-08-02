package umg.progra2.Vehiculos;

public class Vehiculo {

    private String Marca;
    private String Modelo;
    private String Ano;

    public Vehiculo(String Marca,String Modelo,String Ano){
        this.Marca=Marca;
        this.Modelo=Modelo;
        this.Ano=Ano;
    }

    public void mostrarDetalles(){
        System.out.println("Marca: "+Marca);
        System.out.println("Modelo: "+Modelo);
        System.out.println("Año: "+Ano);
    }

}
