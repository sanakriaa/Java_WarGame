

import java.util.ArrayList;


public class Terrain
{
	private String nom;
	private int depl;
	private double bonus_def;

	Terrain(String nom, int depl, double bonus_def)
	{
		this.nom = nom;
		this.depl=depl;
		this.bonus_def=bonus_def;
	}

	public String getNom() { return this.nom; }

	public int getDeplTerrain() { return this.depl; }

	public double getBonusDef() { return this.bonus_def; }


}