package Ejercicios2026;

import java.util.Scanner;

public class Cuento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del personaje principal");
        String nombrePersonaje = sc.nextLine();

        String cuento = "Había una vez un pequeño robot llamado " + nombrePersonaje +  ", cuya única tarea en una inmensa biblioteca galáctica era limpiar el polvo de los estantes. Mientras otros robots clasificaban datos complejos sobre agujeros negros o biología estelar, " + nombrePersonaje +  " pasaba sus días deslizando un plumero de fibra óptica sobre lomos de libros antiguos.\n" +
                "\n" +
                "Un martes, mientras limpiaba la sección de \"Historia de Planetas Extintos\", un libro pequeño y desgastado se deslizó del estante. Al caer, se abrió en una página que no contenía números ni coordenadas, sino un dibujo hecho a mano de una **flor roja**.\n" +
                "\n" +
                "" + nombrePersonaje +  " nunca había visto algo que no fuera gris, azul metálico o blanco neón. Sus sensores procesaron la imagen y, por primera vez en su existencia, sintió algo que no estaba en su programación: **curiosidad**.\n" +
                "\n" +
                "Decidió que no podía dejar que esa imagen se llenara de polvo. En lugar de cerrar el libro, buscó un pequeño rincón iluminado por un rayo de sol que entraba por la cúpula de la biblioteca. Colocó el libro allí y, cada día, " + nombrePersonaje +  " regresaba no para limpiar, sino para observar la flor.\n" +
                "\n" +
                "Con el tiempo, otros robots empezaron a detenerse también. Primero fue un dron de carga, luego un traductor de idiomas. La \"esquina de la flor\" se convirtió en el único lugar de la galaxia donde las máquinas no trabajaban; simplemente se quedaban quietas, aprendiendo que, a veces, **contemplar la belleza es la tarea más importante de todas**.\n";
        System.out.println(cuento);

    }
}
