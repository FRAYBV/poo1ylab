package _p120_Vehiculo;

public class Sedan extends Maquina implements Familiar {
    public Sedan(String nombre) {
        super(nombre);
    }
    @Override
    public void sistemaElectrico() {
        System.out.println("Es un automovil con sistema electrico es un sedan ");
    }
    @Override
    public void combustionInterna() {
        System.out.println("Es un autmovil de combustion interna es un sedan ");
    }
    @Override
    public void carroceriaTres() {
        System.out.println("Es de tipo familiar con carroceria en tres partes es un sedan ");    
    }
    @Override
    public void chasisMonocasco(){
        System.out.println("Es de tipo familiar con chasis monocasco es un sedan");
    }
}
