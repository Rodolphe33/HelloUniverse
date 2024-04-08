package HelloUniverse.com.espacex.decouverte.enginsspaciaux;

public class Vaisseau {
  public int nbPassagers;
  public final TypeVaisseau type;
  public int blindage;
  public int resistanceDuBouclier;
  public int tonnageMax;
  protected int tonnageActuel;

  public Vaisseau(TypeVaisseau type) {
    this.type = type;
  }

  void activerBouclier() {
    System.out.println("Activation du bouclier d'un vaisseau de type " + this.type);
  }

  void desactiverBouclier() {
    System.out.println("Désactivation du bouclier d'un vaisseau de type " + this.type);
  }

  public void emporterCargaison(int cargaison) throws DepassementTonnageException {
  }
}
