package src;

public class HelloUniverse {

  public static void main(String... args) {
    Planete mercure = new Planete();
    mercure.nom = "Mercure";
    mercure.matiere = "Tellurique";
    mercure.diametre = 48880;

    Planete venus = new Planete();
    venus.nom = "Venus";
    venus.matiere = "Tellurique";
    venus.diametre = 12100;

    Planete terre = new Planete();
    terre.nom = "Terre";
    terre.matiere = "Tellurique";
    terre.diametre =12756;

    Planete mars = new Planete();
    mars.nom = "Mars";
    mars.matiere = "Tellurique";
    mars.diametre = 6792;

    Planete jupiter = new Planete();
    jupiter.nom = "Jupiter";
    jupiter.matiere = "Gazeuse";
    jupiter.diametre = 142984;

    Planete saturne = new Planete();
    saturne.nom = "Saturne";
    saturne.matiere = "Gazeuse";
    saturne.diametre = 120536;

    Planete uranus = new Planete();
    uranus.nom = "Uranus";
    uranus.matiere =  "Gazeuse";
    uranus.diametre = 51118;

    Planete neptune = new Planete();
    neptune.nom = "Neptune";
    neptune.matiere = "Gazeuse";
    neptune.diametre = 49532;

    Planete pluton = new Planete();
    pluton.nom = "Pluton";
    pluton.matiere = "Gazeuse";
    pluton.diametre = 2300;

    Planete sansNom = new Planete();

    System.out.println(sansNom.nom + " est une planète " + sansNom.matiere + " avec un diamètre de " + sansNom.diametre + " kilomètres.");
    System.out.println("Neptune a effectué " + neptune.revolution(-3542) + " tours complets autour de son étoile.");
    System.out.println("Mars a effectué "+mars.rotation(-684)+" tours sur elle-même.");
    System.out.println("Venus a effectué "+venus.rotation(1250)+" tours sur elle-même.");

    mars.accueillirVaisseau(8);
    mars.accueillirVaisseau("FREGATE");


    System.out.println("Le nombre d'humains ayant déjà séjourné sur Mars est actuellement de " + mars.totalVisiteurs);
  }
}
