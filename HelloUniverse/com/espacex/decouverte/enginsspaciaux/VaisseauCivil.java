package HelloUniverse.com.espacex.decouverte.enginsspaciaux;

import static com.espacex.decouverte.enginsspatiaux.TypeVaisseau.CARGO;
import static com.espacex.decouverte.enginsspatiaux.TypeVaisseau.VAISSEAU_MONDE;

public class VaisseauCivil {

  public VaisseauCivil(TypeVaisseau type) {
    super(type);
    if (type == CARGO) {
      tonnageMax = 500;
    } else if (type == VAISSEAU_MONDE) {
      tonnageMax = 2000;
    }
  }

  public void emporterCargaison(int cargaison) throws DepassementTonnageException {
    int tonnageRestant = tonnageMax - tonnageActuel;
    if (cargaison > tonnageRestant) {
      int tonnageEnExces = cargaison - tonnageRestant;
      throw new DepassementTonnageException(tonnageEnExces);
    } else {
      tonnageActuel += cargaison;
    }
  }
}
