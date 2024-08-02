package umg.progra2;

import umg.ejercicios.conductores.ConductorDeCoche;
import umg.ejercicios.conductores.ConductorDeMoto;
import umg.progra2.Vehiculos.Coche;
import umg.progra2.Vehiculos.Moto;
import umg.progra2.Vehiculos.Vehiculo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehiculo HondaOdissey = new Coche("Honda","Odissey","2005",4);
        HondaOdissey.mostrarDetalles();

        Vehiculo Miraidon = new Moto("Pokemon","Miraidon","2023",false);
        Miraidon.mostrarDetalles();

        // Crear objetos de las clases del proyecto Conductores
        ConductorDeCoche conductorCoche = new ConductorDeCoche("Juan Perez", "C12345", 5);
        ConductorDeMoto conductorMoto = new ConductorDeMoto("Maria Lopez", "M67890", true);

        // Mostrar información de los conductores
        System.out.println("Información del conductor de coche:");
        conductorCoche.mostrarInformacion();
        System.out.println();
}

}