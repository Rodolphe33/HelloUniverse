package HelloUniverse.com.espacex.decouverte.enginsspaciaux;

public enum TypeVaisseau {
  CHASSEUR("Chasseur"),
  FREGATE("Frégate"),
  CROISEUR("Croiseur"),
  CARGO("Cargo"),
  VAISSEAU_MONDE("Vaisseau-Monde");

  String nom;

  TypeVaisseau(String nom) {
    this.nom = nom;
  }
}
