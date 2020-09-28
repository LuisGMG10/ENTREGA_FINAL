public class PERSONA {

    private final long ID;
    private final String NOMBRE;
    private final String APELLIDO;

    public PERSONA(long ID, String NOMBRE, String APELLIDO) {
        this.ID = ID;
        this.NOMBRE = NOMBRE;
        this.APELLIDO = APELLIDO;
    }

    public long getID() {
        return ID;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public String getAPELLIDO() {
        return APELLIDO;
    }
}
