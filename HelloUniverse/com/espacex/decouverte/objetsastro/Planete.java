package HelloUniverse.com.espacex.decouverte.objetsastro;

public class Planete implements Comparable {
  public String nom;
  public int diametre;
  public Atmosphere atmosphere;
  public float distanceEtoile;

  static String forme = "Sphérique";
  static int nbPlanetesDecouvertes;

  Planete(String nom) {
    this.nom = nom;
    nbPlanetesDecouvertes++;
  }

  public final int revolution(int degres) {
    System.out.println("Je suis la planète " + nom + " et je tourne autour de mon étoile de " + degres + " degrés.");
    return degres / 360;
  }

  public final int rotation(int degres) {
    System.out.println("Je suis la planète " + nom + " et je tourne sur moi-même de " + degres + " degrés.");
    return degres / 360;
  }

  static String expansion(double distance) {
    if (distance < 14) {
      return "Oh la la mais c'est super rapide !";
    } else {
      return "Je rêve ou c'est plus rapide que la lumière ?";
    }
  }

  public int compareTo(Object o) {
    Planete autrePlanete = (Planete) o;
    return ((Float) this.distanceEtoile).compareTo(autrePlanete.distanceEtoile);
  }
}
