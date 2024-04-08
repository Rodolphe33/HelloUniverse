package HelloUniverse.com.espacex.decouverte.enginsspaciaux;

import static com.espacex.decouverte.enginsspatiaux.TypeVaisseau.FREGATE;
import static com.espacex.decouverte.enginsspatiaux.TypeVaisseau.CROISEUR;
import static com.espacex.decouverte.enginsspatiaux.TypeVaisseau.CHASSEUR;

public class VaisseauDeGuerre {
  private boolean armesDesactivees;

  public VaisseauDeGuerre(TypeVaisseau type) {
    super(type);
    if (type == CHASSEUR) {
      tonnageMax = 0;
    } else if (type == FREGATE) {
      tonnageMax = 50;
    } else if (type == CROISEUR) {
      tonnageMax = 100;
    }
  }

  void attaque(Vaisseau cible, String arme, int dureeAttaque) {
    if (armesDesactivees) {
      System.out.println("Attaque impossible, l'armement est désactivé");
    } else {
      cible.resistanceDuBouclier = dureeAttaque - cible.resistanceDuBouclier;
      cible.resistanceDuBouclier = 0;
      cible.blindage = cible.blindage / 2;

      System.out.println("Un vaisseau de type " + type + " attaque un vaisseau de type " + cible.type
          + " en utilisant l'arme " + arme + " pendant " + dureeAttaque + " minutes.");
      System.out.println("Déstruire complètement le bouclier");
      System.out.println("Diminuer le blindage de moitié");
    }
  }

  public void desactiverArmes() {
    armesDesactivees = true;
    System.out.println("Désactivation des armes d'un vaisseau de type " + type);
  }

  @Override
  public void activerBouclier() {
    this.desactiverArmes();
    super.activerBouclier();
  }

  @Override
  public void emporterCargaison(int cargaison) throws DepassementTonnageException {
    if (type.equals(CHASSEUR)) {
      throw new DepassementTonnageException(cargaison);
    } else {
      if (nbPassagers < 12) {
        throw new DepassementTonnageException(cargaison);
      } else {
        int tonnaPassagers = 2 * nbPassagers;
        int tonnageRestant = tonnageMax - tonnageActuel;
        int tonnageAconsiderer = tonnaPassagers < tonnageRestant ? tonnaPassagers : tonnageRestant;
        if (cargaison > tonnageAconsiderer) {
          int tonnageEnExces = cargaison - tonnageAconsiderer;
          throw new DepassementTonnageException(tonnageEnExces);
        } else {
          tonnageActuel += cargaison;
        }
      }
    }
  }

  public void activerArmes() {
    armesDesactivees = false;
    System.out.println("Activation des armes d'un vaisseau de type " + type);
  }
}
