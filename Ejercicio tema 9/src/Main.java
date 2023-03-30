public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador=new Trabajador();
        cliente.credito=100;
        cliente.edad=20;
        cliente.teléfono=123456;
        cliente.nombre="Jonathan";

        trabajador.edad=19;
        trabajador.nombre="Mafer";
        trabajador.salario=10000;
        trabajador.teléfono=654321;

        System.out.println("Nombre cliente:"+cliente.nombre);
        System.out.println("Credito cliente:"+cliente.credito);
        System.out.println("Edad cliente:"+cliente.edad);
        System.out.println("Teléfono cliente:"+cliente.teléfono);
        System.out.println("");
        System.out.println("Nombre trabajador:"+trabajador.nombre);
        System.out.println("Telefono trabajador:"+trabajador.teléfono);
        System.out.println("Edad trabajador:"+trabajador.edad);
        System.out.println("Salario trabajador:"+trabajador.salario);
    }
}
class Persona{
    int edad;
    String nombre;
    int teléfono;
}
class Cliente extends Persona{
int credito;
}
class Trabajador extends Persona{
    int salario;
}