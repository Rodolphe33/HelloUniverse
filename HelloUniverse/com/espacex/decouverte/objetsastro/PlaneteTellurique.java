package HelloUniverse.com.espacex.decouverte.objetsastro;

import HelloUniverse.com.espacex.decouverte.enginsspaciaux.Vaisseau;
import HelloUniverse.com.espacex.decouverte.enginsspaciaux.VaisseauDeGuerre;

public class PlaneteTellurique extends Planete implements Habitable {
  public Vaisseau[][] vaisseauxAccostes;
  public int totalVisiteurs;

  public PlaneteTellurique(String nom, int tailleBaie) {
    super(nom);
    this.vaisseauxAccostes = new Vaisseau[tailleBaie][tailleBaie];
  }

  public boolean restePlaceDisponible(Vaisseau vaisseau) {
    int indexZone = 0;
    switch (vaisseau.type) {
      case CARGO:
      case VAISSEAU_MONDE:
        indexZone = 1;
    }

    for (int index = 0; index < vaisseauxAccostes[indexZone].length; index++) {
      if (vaisseauxAccostes[indexZone][index] == null) {
        return true;
      }
    }
    return false;
  }

  public void accueillirVaisseaux(Vaisseau... vaisseaux) {

    for (int i = 0; i < vaisseaux.length; i++) {
      int indexZone = 0;
      switch (vaisseaux[i].type) {
        case CARGO:
        case VAISSEAU_MONDE:
          indexZone = 1;
        default:
          break;
      }
      if (vaisseaux[i] instanceof VaisseauDeGuerre) {
        ((VaisseauDeGuerre) vaisseaux[i]).desactiverArmes();
      }
      totalVisiteurs += vaisseaux[i].nbPassagers;

      for (int index = 0; index < vaisseauxAccostes[indexZone].length; index++) {
        if (vaisseauxAccostes[indexZone][index] == null) {
          vaisseauxAccostes[indexZone][index] = vaisseaux[i];
          break;
        }
      }
    }
  }
}
