
import java.util.ArrayList;

public class Plateau
{
	public static void main(String[] args)
	{
		//deux equipes
		Equipe equipe1 = new Equipe();
		Equipe equipe2 = new Equipe();

		GroupeUnite perso = new GroupeUnite();
		GroupeTerrain terrain = new GroupeTerrain();

		//ajout des personnages
		perso.ajoutUnite("Archer", 33, 6, 2, 5, 7);
		perso.ajoutUnite("Infanterie", 28, 5, 3, 6, 4);
		perso.ajoutUnite("Cavalerie", 38, 8, 3, 8, 6);

		//ajout des terrains
		terrain.ajoutTerrain("Village", 1, 0.40);
		terrain.ajoutTerrain("Forteresse", 1, 0.60);
		terrain.ajoutTerrain("Foret", 2, 0.40);

		System.out.println("Construction equipe 1 : ");
		equipe1.ajoutEquipe(perso.getListeUnite());
		System.out.println("Construction equipe 2 : ");
		equipe2.ajoutEquipe(perso.getListeUnite());

		terrain.afficheCaracTerrain();
	}
}
