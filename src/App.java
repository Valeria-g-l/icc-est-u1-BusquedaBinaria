import controllers.BusquedaBinaria;
import controllers.PersonaController;
import models.Persona;
import views.ShowConsole;

public class App {
    public static void main(String[] args) throws Exception {
        PersonaController pC = new PersonaController();
        ShowConsole sC = new ShowConsole();
        BusquedaBinaria bB = new BusquedaBinaria();
        int [] numeros = new int[]{10, 2, 4, 6,7,8,13,20};
        Integer resultado = bB.busquedaBinaria(numeros, 13);
        sC.showResult(resultado, 10);

        Persona[] people = new Persona[]{
            new Persona("Juan", 25),
            new Persona("Ana", 30),
            new Persona("Pedro", 20),
            new Persona("Maria", 28),
            new Persona("Luis", 22),
            new Persona("Carmen", 27),
            new Persona("Sofia", 24)
        };

        Persona encontPersona = pC.findByName(people, "Pedro");
        sC.showResult(encontPersona, "Pedro");


    }
}
