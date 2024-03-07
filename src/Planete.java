package src;

public class Planete {
  String nom;
  String matiere;
  long diametre;
  int totalVisiteurs;

  int revolution(int angle) {
    return angle/360;
  }

  int rotation(int angle) {
    return angle/360;
  }

  // Methode
  void accueillirVaisseau(int visiteurs){
    totalVisiteurs += visiteurs;
  }

  // Methode Surchargé
  void accueillirVaisseau(String visiteurs){
    if(visiteurs.equals("CHASSEUR")) {
      totalVisiteurs += 3;
    } else if(visiteurs.equals("FREGATE")) {
      totalVisiteurs += 12;
    } else if (visiteurs.equals("CROISEUR")) {
      totalVisiteurs += 50;
    }
  }
}
