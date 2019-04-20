
import java.util.ArrayList;

public class GroupeTerrain
{
	private ArrayList<Terrain> liste_terrain = new ArrayList<Terrain>();

	public ArrayList<Terrain> getListeTerrain() { return liste_terrain; }

	void ajoutTerrain(String nom, int depl, double bonus_def)
	{
		Terrain terrain = new Terrain(nom, depl, bonus_def);
		liste_terrain.add(terrain);
	}

	void afficheCaracTerrain()
	{
		for (int i=0;i<liste_terrain.size();i++)
		{
			System.out.print(i +")" + "Nom : " + liste_terrain.get(i).getNom() );
			System.out.print(" / Deplacement : " + liste_terrain.get(i).getDeplTerrain() );
			System.out.println(" / Bonus Def : " + liste_terrain.get(i).getBonusDef() );
		}
		System.out.println();
	}
}