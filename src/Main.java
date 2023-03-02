public class Main {

    public static void main(String[] args) {

        Trabajador t1 = new Trabajador();

        System.out.println(t1);
        t1.mostrarCarga();

        ///////////////
        Trabajador t2 = new Trabajador("pepito","8778378-0","487847",33,"1231855","juanito","gonzales",55,"2");

        t2.setCargas("123156-0", "ape", "run222", "1", 11, t2.getRun());

        System.out.println(t2);
        t2.mostrarCarga();
    }
}
