import java.util.ArrayList;

public class Trabajador {
    private String nombres;
    private String apellidos;
    private String run;
    private int edad;
    //declara e inicializa //composicion
    private ArrayList<cargasT> cargas = new ArrayList<cargasT>();

    public Trabajador() {
    }


    public Trabajador(String nombres, String apellidos, String run, int edad, String runCarga, String nombreCarga,
                      String apellidoCarga, int edadCarga,String parentesco) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.run = run;
        this.edad = edad;
        setCargas(runCarga, nombreCarga, apellidoCarga, parentesco, edadCarga,run);

    }
    public void setCargas(String runCarga, String nombres, String apellidos, String parentesco, int edad,String runT) {

        cargasT carga = new cargasT(runCarga, nombres, apellidos,parentesco, edad,runT);
        cargas.add(carga);
    }

    public void mostrarCarga() {
        for (cargasT ele : cargas) {
            System.out.println(ele.toString());
        }
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

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<cargasT> getCargas() {
        return cargas;
    }




    /*
     * @return int unicamente digitos del run
     */

    @Override
    public String toString() {
        return "Trabajador [nombres=" + nombres + ", apellidos=" + apellidos + ", run=" + run + ", edad=" + edad;
    }

}
