package HelloUniverse.com.espacex.decouverte.enginsspaciaux;

public class DepassementTonnageException extends Exception {
  public int tonnageEnExces;

  public DepassementTonnageException(int tonnageEnExces) {
    super("La cargaison ne peut être chargée car elle présente un excès de " + tonnageEnExces);
    this.tonnageEnExces = tonnageEnExces;
  }
}
