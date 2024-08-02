package umg.progra2.Vehiculos;

public class Moto extends Vehiculo {
    private Boolean tieneSidecar;
    public Moto(String Marca, String Modelo, String Ano,Boolean tieneSidecar) {
        super(Marca, Modelo, Ano);
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("¿Tiene Sidecar? " + this.tieneSidecar);
    }
}
