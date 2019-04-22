import java.util.ArrayList;
import java.util.Scanner;

//test sana


public class Equipe
{
	private ArrayList<Unite> liste_unite_equipe = new ArrayList<Unite>();

	void ajoutEquipe(ArrayList<Unite> liste)
	{
		int i;
		int choix;
		int j=0;
		int nbr_max=2;
		Scanner sc = new Scanner(System.in);

		//affiche tout les personnages disponibles
		this.afficheCarac(liste);

		System.out.println("Vous devez choisir " + nbr_max + " unités\n");
		//on demande a l'utilisateur de former son equipe
		do
		{
			j+=1;
			System.out.println("Veuillez choisir une unite (num) ");
			do
			{
				System.out.print("Choix : ");
				choix = sc.nextInt();
			}while(choix<0||choix>=liste.size());

			liste_unite_equipe.add(liste.get(choix));

		}while(j!=nbr_max);

		System.out.println("\nVoici donc votre equipe : ");
		this.afficheCarac(liste_unite_equipe);
	}

	void afficheCarac(ArrayList<Unite> liste_unite)
	{
		for (int i=0;i<liste_unite.size();i++)
		{
			System.out.print(i +")" + "Nom : " + liste_unite.get(i).getNom() );
			System.out.print(" / PV : " + liste_unite.get(i).getPV() );
			System.out.print(" / P_Att : " + liste_unite.get(i).getPAtt() );
			System.out.print(" / P_Def : " + liste_unite.get(i).getPDef() );
			System.out.print(" / P_Depl : " + liste_unite.get(i).getDepl() );
			System.out.println(" / Vision : " + liste_unite.get(i).getVis() );
		}
		System.out.println();
	}
}