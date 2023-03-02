public class cargasT {

    private String runCarga;
    private String nombres;
    private String apellidos;
    private String parentesco;
    private int edad;
    private String run;

    public cargasT(String runCarga, String nombres, String apellidos, String parentesco, int edad, String run) {
        this.runCarga = runCarga;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.parentesco = parentesco;
        this.edad = edad;
        this.run = run;
    }

    public java.lang.String getRun() {
        return run;
    }

    public void setRun(java.lang.String run) {
        this.run = run;
    }

    public String getRunFamiliar() {
        return runCarga;
    }

    public void setRunFamiliar(String runFamiliar) {
        this.runCarga = runFamiliar;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String mostrarParentesco() {
        String mensaje = "";
        if (parentesco.equals("1")) {
            mensaje = " es Conyuge";

        } else if (parentesco.equals("2")) {
            mensaje = " es hij@";
        } else {
            mensaje = " es otro";
        }
        return mensaje;
    }

    @Override
    public String toString() {
        return "cargasT [runFamiliar=" + runCarga + ", nombres=" + nombres + ", apellidos=" + apellidos
                + ", parentesco =" + mostrarParentesco() + ", edad=" + edad + "]";
    }

}
