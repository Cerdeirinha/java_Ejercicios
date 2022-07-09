//Clase principal
import java.io.IOException;
import java.util.Scanner;


 public class App {
    final static int MAXIMO_FAMILIARES = 100;
    static familiar[] familiares = new familiar[MAXIMO_FAMILIARES]; 
    static int indice = 0;
    static Scanner fm = new Scanner(System.in);
    

    public static void main(String[] args) throws Exception {
        
        
        leerfamiliares();
        System.out.println("Hello, World!");

        //familiar familiar1=new familiar ("Diego", "Garcia", "Cerdeiriña", 43, "31/01/1977","Retorta");
 
        //familiar familiar2=new familiar ("Elisabeth", "Brocal", "Ayelo", 39 ,"20/08/1983", "Petrer");
 
        //Mostramos el valor actual del fecha de nacimiento del familiar1
        //System.out.println("El fecha de nacimiento del familiar1 es "+familiar1.getfechaNacimiento());
 
        //Modificamos la edad del familiar1
        //familiar1.setEdad(45);

        //Modificamos la edad del familiar2
        //familiar2.setEdad(38);
 
        
 
        //Mostramos el fecha de nacimientola edad de nuevo, ahora tendra 2 años  mas
        //System.out.println("La ficha del familiar1 es "+familiar1.getNombre()+ " - " +familiar1.getApellido()+  " - " +familiar1.getSegundoApellido()+ " - " + familiar1.getEdad()+  " - " +familiar1.getfechaNacimiento()+ " - " + familiar1.getlugarNacimiento());
        if (numeroDeFamiliares() > 0) {

        //mostrar empleados
        System.out.println("\n\nFamiliares introducidos: ");
        mostrar();

       
        System.out.println("\n\nNumero Familiares introducidos: "+ numeroDeFamiliares());
         
    	 }      
        
        
       
    }

    //Metodo para leer todos los familiares y guardarlos en un array
    public static void leerfamiliares() throws IOException {
        familiar f;
        String nombre, apellido, segundoapellido, fechaNacimiento, lugarNacimiento;
        int edad;
        int i, N;

        do {
            System.out.print("Número de familiares? ");
            N = fm.nextInt();
        } while (N < 0 || N > MAXIMO_FAMILIARES);
       
        for (i = 1; i <= N; i++) {
            fm.nextLine(); //limpiar el intro
            System.out.println("familiar " + i);
            System.out.print("Nombre: ");
            nombre = fm.nextLine();
            System.out.print("Apellido: ");
            apellido = fm.nextLine();
            System.out.print("Segundo Apellido: ");
            segundoapellido = fm.nextLine();
            System.out.print("edad: ");
            edad = fm.nextInt();
            System.out.print("Fecha nacimiento: ");
            fechaNacimiento = fm.nextLine(); 
            System.out.print("Lugar de nacimiento: ");
            lugarNacimiento = fm.nextLine();
            System.out.print("\nESo es todo");
            
            
            f = new familiar(); //crear una nueva instancia de empleado

            f.setNombre(nombre);
            f.setApellido(apellido);
            f.setsegundoApellido(segundoapellido);
            f.setEdad(edad);
            f.setfechaNacimiento(fechaNacimiento);
            f.setlugarNacimiento(lugarNacimiento);
            

            familiares[indice] = f; //se añade el empleado al array
            indice++;
        }
    }

    //método para mostrar todos los familiares
    public static void mostrar() {
        for (int i = 0; i < indice; i++) {
            System.out.println(familiares[i]);
        }
    }

     //método que devuelve el número total de familiares
     public static int numeroDeFamiliares() {
        return indice;
    }
    

}
