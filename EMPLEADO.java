public class EMPLEADO extends PERSONA {

    private Integer SALARIO;

    public EMPLEADO(Integer ID, String NOMBRE, String APELLIDO, Integer SALARIO) {
        super(ID, NOMBRE, APELLIDO);
        this.SALARIO = SALARIO;
    }

    public Integer getSALARIO() {
        return SALARIO;
    }
}
