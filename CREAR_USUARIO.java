import java.util.Scanner;

public class CREAR_USUARIO {

    private final Scanner scanner = new Scanner(System.in);
    private PERSONA Persona;
    private EMPLEADO Empleado;

    public CREAR_USUARIO(){
        OBTENERMENU();
        OBTENEREMPLEADO();
        OBTENERPERSONA();
    }

    public void OBTENERPERSONA(){
        System.out.println("PERSONA");
        /*MENU OBTENERMENU = OBTENERPERSONA();*/
    }

    public EMPLEADO OBTENEREMPLEADO(){
        System.out.println("EMPLEADO");
        MENU  = OBTENERMENU();
        System.out.println("INGRESE SALARIO");
        Integer SALARIO = scanner.nextInt();
        EMPLEADO = new EMPLEADO( Integer SALARIO);
    }


    public PERSONA OBTENERMENU(){
        System.out.println("INGRESE SU IDENTIFICACION");
        Long ID = scanner.nextLong();
        System.out.println("INGRESE NOMBRE");
        String NOMBRE = scanner.nextLine();
        System.out.println("INGRESE APELLIDOS");
        String  APELLIDO = scanner.nextLine();

        return new PERSONA(ID, NOMBRE, APELLIDO);
    }


}
