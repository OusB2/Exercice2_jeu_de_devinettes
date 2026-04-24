import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Déclaration des outils nécessaires
        Scanner lecture = new Scanner(System.in);
        int nombreSecret = (int) (Math.random() * 100) + 1;
        boolean victoire = false;

        System.out.println("J'ai choisi un nombre entre 1 et 100.");
        System.out.println("Vous avez 10 essais pour le trouver !");

        // La boucle pour les 10 essais
        for (int essai = 1; essai <= 10; essai++) {
            System.out.println("Essai n°" + essai + ". Entrez un nombre :");
            int choix = lecture.nextInt();

            if (choix < nombreSecret) {
                System.out.println("Le nombre à deviner est plus GRAND.");
            } else if (choix > nombreSecret) {
                System.out.println("Le nombre à deviner est plus PETIT.");
            } else {
                // Si on trouve le bon nombre
                victoire = true;
                break;
            }
        }

        if (victoire) {
            System.out.println("Félicitations ! Vous avez gagné.");
        } else {
            System.out.println("Dommage, vous avez perdu. Le nombre était : " + nombreSecret);
        }
    }
}