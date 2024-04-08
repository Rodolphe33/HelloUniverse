package HelloUniverse.com.espacex.decouverte;

import static HelloUniverse.com.espacex.decouverte.enginsspatiaux.TypeVaisseau.CARGO;
import static com.espacex.decouverte.enginsspatiaux.TypeVaisseau.CHASSEUR;
import static com.espacex.decouverte.enginsspatiaux.TypeVaisseau.CROISEUR;
import static com.espacex.decouverte.enginsspatiaux.TypeVaisseau.FREGATE;
import static com.espacex.decouverte.enginsspatiaux.TypeVaisseau.VAISSEAU_MONDE;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import HelloUniverse.com.espacex.decouverte.enginsspaciaux.DepassementTonnageException;
import HelloUniverse.com.espacex.decouverte.enginsspaciaux.TypeVaisseau;
import HelloUniverse.com.espacex.decouverte.enginsspaciaux.Vaisseau;
import HelloUniverse.com.espacex.decouverte.enginsspaciaux.VaisseauCivil;
import HelloUniverse.com.espacex.decouverte.enginsspaciaux.VaisseauDeGuerre;
import HelloUniverse.com.espacex.decouverte.objetsastro.Atmosphere;
import HelloUniverse.com.espacex.decouverte.objetsastro.Galaxie;
import HelloUniverse.com.espacex.decouverte.objetsastro.Planete;
import HelloUniverse.com.espacex.decouverte.objetsastro.PlaneteGazeuse;
import HelloUniverse.com.espacex.decouverte.objetsastro.PlaneteTellurique;

public class HelloUniverse {
  public static void main(String... args) {
    Galaxie systemeSolaire = new Galaxie();

    PlaneteTellurique mercure = new PlaneteTellurique("Mercure", 1);
    mercure.diametre = 4880;
    mercure.distanceEtoile = 57.9f;

    PlaneteTellurique venus = new PlaneteTellurique("Venus", 2);
    venus.diametre = 12100;
    venus.distanceEtoile = 108.2f;

    PlaneteTellurique terre = new PlaneteTellurique("Terre", 10);
    terre.diametre = 12756;
    terre.distanceEtoile = 149.6f;

    PlaneteTellurique mars = new PlaneteTellurique("Mars", 3);
    mars.diametre = 6792;
    mars.distanceEtoile = 227.9f;
    Atmosphere atmosphereMars = new Atmosphere();
    atmosphereMars.constituants.put("CO2", 95f);
    atmosphereMars.constituants.put("N2", 3f);
    atmosphereMars.constituants.put("AR", 1.5f);
    atmosphereMars.constituants.put("NO", 0.013f);
    mars.atmosphere = atmosphereMars;

    PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
    jupiter.diametre = 142984;
    jupiter.distanceEtoile = 778.3f;

    PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
    saturne.diametre = 120536;
    saturne.distanceEtoile = 1427f;

    PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
    uranus.diametre = 51118;
    uranus.distanceEtoile = 2877.38f;
    Atmosphere atmosphereUranus = new Atmosphere();
    atmosphereUranus.constituants.put("H", 83f);
    atmosphereUranus.constituants.put("He", 15f);
    atmosphereUranus.constituants.put("CH4", 2.5f);
    uranus.atmosphere = atmosphereUranus;

    PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");
    neptune.diametre = 49532;
    neptune.distanceEtoile = 4497.07f;

    systemeSolaire.planetes.add(neptune);
    systemeSolaire.planetes.add(jupiter);
    systemeSolaire.planetes.add(venus);
    systemeSolaire.planetes.add(mars);
    systemeSolaire.planetes.add(saturne);
    systemeSolaire.planetes.add(mercure);
    systemeSolaire.planetes.add(uranus);
    systemeSolaire.planetes.add(terre);

    for (Planete nextPlanete : systemeSolaire.planetes) {
      System.out.println("La planète suivante est " + nextPlanete.nom);
    }

    Vaisseau chasseur2 = new VaisseauDeGuerre(CHASSEUR);
    chasseur2.nbPassagers = 4;
    chasseur2.blindage = 156;
    chasseur2.resistanceDuBouclier = 2;
    Vaisseau chasseur3 = new VaisseauDeGuerre(CHASSEUR);
    chasseur3.nbPassagers = 5;
    chasseur3.blindage = 156;
    chasseur3.resistanceDuBouclier = 2;
    Vaisseau cargo2 = new VaisseauCivil(CARGO);
    cargo2.nbPassagers = 10001;
    cargo2.blindage = 1520;
    cargo2.resistanceDuBouclier = 20;

    terre.accueillirVaisseaux(chasseur2, chasseur3, cargo2);

    // Vaisseau newVaisseau = new VaisseauDeGuerre("FREGATE");
    // newVaisseau.nbPassagers = 9;

    // Vaisseau autreVaisseau = new VaisseauDeGuerre("CROISEUR");
    // autreVaisseau.nbPassagers = 42;

    // System.out.println("Le nombre d'humains ayant déjà séjourné sur Mars est
    // actuellement de " + mars.totalVisiteurs);

    // System.out.println(PlaneteGazeuse.expansion(10.5));
    // System.out.println(PlaneteGazeuse.expansion(14.2));

    // System.out.println("Le nombre de planète est de " +
    // PlaneteGazeuse.nbPlanetesDecouvertes);

    // Vaisseau chasseur = new VaisseauDeGuerre("CHASSEUR");
    // chasseur.blindage = 156;
    // chasseur.resistanceDuBouclier = 2;

    // Vaisseau vaisseauMonde = new VaisseauCivil("VAISSEAU-MONDE");
    // vaisseauMonde.blindage = 4784;
    // vaisseauMonde.resistanceDuBouclier = 30;

    // vaisseauMonde.activerBouclier();
    // chasseur.activerBouclier();
    // ((VaisseauDeGuerre) chasseur).attaque(vaisseauMonde, "lasers photoniques",
    // 3);
    // vaisseauMonde.desactiverBouclier();
    // System.out.println("la durée de protection résiduelle du bouclier du
    // Vaisseau-Monde est de "
    // + vaisseauMonde.resistanceDuBouclier + " minutes");
    // System.out.println("la valeur du blindage du Vaisseau-Monde est de " +
    // vaisseauMonde.blindage);

    // mars.accueillirVaisseau(vaisseauMonde);
    // mars.accueillirVaisseau(chasseur);

    // Vaisseau chasseurSurTerre = new VaisseauDeGuerre("CHASSEUR");
    // terre.accueillirVaisseau(chasseurSurTerre);
    // System.out.println("Le chasseur a rejeté " +
    // chasseurSurTerre.emporterCargaison(20) + " tonnes.");

    // Vaisseau fregateSurTerre = new VaisseauDeGuerre("FREGATE");
    // fregateSurTerre.nbPassagers = 100;
    // terre.accueillirVaisseau(fregateSurTerre);
    // System.out.println("La frégate a rejeté " +
    // fregateSurTerre.emporterCargaison(45) + " tonnes.");
    // System.out.println("La frégate a rejeté " +
    // fregateSurTerre.emporterCargaison(12) + " tonnes.");

    // Vaisseau fregateSurTerre2 = new VaisseauDeGuerre("FREGATE");
    // fregateSurTerre2.nbPassagers = 14;
    // terre.accueillirVaisseau(fregateSurTerre2);
    // System.out.println("La frégate 2 a rejeté " +
    // fregateSurTerre2.emporterCargaison(30) + " tonnes.");

    // Vaisseau vaisseauMondeSurTerre = new VaisseauCivil("VAISSEAU-MONDE");
    // terre.accueillirVaisseau(vaisseauMondeSurTerre);
    // System.out.println("La vaisseau Monde a rejeté " +
    // vaisseauMondeSurTerre.emporterCargaison(1560) + " tonnes.");
    // System.out.println("La vaisseau Monde a rejeté " +
    // vaisseauMondeSurTerre.emporterCargaison(600) + " tonnes.");

    Vaisseau chasseur = new VaisseauDeGuerre(CHASSEUR);
    chasseur.nbPassagers = 6;
    chasseur.blindage = 156;
    chasseur.resistanceDuBouclier = 2;
    Vaisseau fregate = new VaisseauDeGuerre(FREGATE);
    fregate.nbPassagers = 25;
    Vaisseau croiseur = new VaisseauDeGuerre(CROISEUR);
    croiseur.nbPassagers = 50;
    Vaisseau cargo = new VaisseauCivil(CARGO);
    cargo.nbPassagers = 12;
    Vaisseau vaisseauMonde = new VaisseauCivil(VAISSEAU_MONDE);
    vaisseauMonde.nbPassagers = 200;
    vaisseauMonde.blindage = 4784;
    vaisseauMonde.resistanceDuBouclier = 30;

    Scanner sc = new Scanner(System.in);
    boolean recommencer = true;
    while (recommencer) {
      System.out
          .println("Quel vaisseau souhaitez vous manipuler : CHASSEUR, FREGATE, CROISEUR, CARGO ou VAISSEAUMONDE ?");
      String typeVaisseauString = sc.nextLine();
      TypeVaisseau typeVaisseau = TypeVaisseau.valueOf(typeVaisseauString);
      Vaisseau vaisseauSelectionne = null;
      switch (typeVaisseau) {
        case CHASSEUR:
          vaisseauSelectionne = chasseur;
          break;
        case FREGATE:
          vaisseauSelectionne = fregate;
          break;
        case CROISEUR:
          vaisseauSelectionne = croiseur;
          break;
        case CARGO:
          vaisseauSelectionne = cargo;
          break;
        case VAISSEAU_MONDE:
          vaisseauSelectionne = vaisseauMonde;
          break;
      }

      System.out.println(
          "Sur quelle planète tellurique du systeme solaire voulez-vous vous poser : Mercure, Venus, Terre ou Mars ?");
      String nomPlanete = sc.nextLine();

      // Planete p = systemeSolaire.planetes.get(nomPlanete -1);

      Planete planeteSelectionne = null;
      for (Planete p : systemeSolaire.planetes) {
        if (p.nom.equals(nomPlanete)) {
          planeteSelectionne = p;
          break;
        }
      }

      if (planeteSelectionne instanceof PlaneteGazeuse) {
        System.out.println("La planète sélectionnée n'est pas une planète Tellurique, recommencez.");
        continue;
      }
      PlaneteTellurique planete = (PlaneteTellurique) planeteSelectionne;

      System.out.println("Quel tonnage souhaitez-vous emporter ?");
      int tonnageSouhaite;
      while (true) {
        try {
          tonnageSouhaite = sc.nextInt();
          sc.nextLine();
          break;
        } catch (InputMismatchException ime) {
          System.out.println("Le tonnage n'est aps un numérique");
        } finally {
          sc.nextInt();
        }
      }

      if (planete.restePlaceDisponible(vaisseauSelectionne)) {
        planete.accueillirVaisseaux(vaisseauSelectionne);
        try {
          vaisseauSelectionne.emporterCargaison(tonnageSouhaite);
        } catch (DepassementTonnageException dte) {
          System.out.println("Le vaisseau a rejeté : " + dte.tonnageEnExces + " tonnes.");
          System.out.println("Voulez-vous emporter un tonnage partiel à hauteur de "
              + (tonnageSouhaite - dte.tonnageEnExces) + "(oui/non) ?");
          String accepte = sc.nextLine();
          if (accepte.equals("oui")) {
            try {
              vaisseauSelectionne.emporterCargaison(tonnageSouhaite - dte.tonnageEnExces);
            } catch (DepassementTonnageException dt) {
              System.out.println("Erreur inattendue.");
            }
          } else {
            System.out.println("Opération annulée.");
          }
        }
      } else {
        System.out.println("Le vaisseau ne peut pas se poser sur la planète par manque de place dans la baie.");
      }

      sc.nextLine();
      System.out.println("Voulez-vous recommencer oui/non ?");

      recommencer = sc.nextLine().equals("oui");
    }

    System.out.println("L'atmosphère de Mars est constituée de :");
    for (Map.Entry<String, Float> atmo : mars.atmosphere.constituants.entrySet()) {
      System.out.println(atmo.getValue() + "% de " + atmo.getKey());
    }

  }
}
