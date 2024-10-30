public class App {
    public static void main(String[] args) throws Exception {
        Recursividad rec = new Recursividad();
        int result = rec.factorial(5);
        System.out.println(result);
        System.out.println(rec.sumaConsecutuvas(5));
        System.out.println(rec.potencia(2, 3));
        System.out.println(rec.digital(456));
        System.out.println(rec.fibonacci(5));
        RenombrarDirectorios rd = new RenombrarDirectorios();
        rd.renombrarDirectorios("src/directorios/carpeta1");
    }
}