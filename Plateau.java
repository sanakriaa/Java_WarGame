
import java.util.ArrayList;

public class Plateau
{
	public static void main(String[] args)
	{

		Equipe equipe1 = new Equipe();
		Equipe equipe2 = new Equipe();

		GroupeUnite perso = new GroupeUnite();

		perso.ajoutUnite("Archer", 33, 6, 2, 5, 7);
		perso.ajoutUnite("Infanterie", 28, 5, 3, 6, 4);
		perso.ajoutUnite("Cavalerie", 38, 8, 3, 8, 6);

		System.out.println("Construction equipe 1 : ");
		equipe1.ajoutEquipe(perso.getListeUnite());
		System.out.println("Construction equipe 2 : ");
		equipe2.ajoutEquipe(perso.getListeUnite());
	}
}
