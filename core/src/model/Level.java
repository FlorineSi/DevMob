package model;

import java.util.ArrayList;
import java.util.Iterator;

import model.Bloc;
import model.BlocArbre;
import model.BlocFly;
import model.BlocGrenouille;
import model.BlocHerbe;
import model.BlocLigne;
import model.BlocRoute;
import model.BlocVoiture;

public class Level implements Iterable<Bloc>{


	private int[][]tab;
	private ArrayList<Bloc> listeBlocs;

	public Level(){
		listeBlocs = new ArrayList<Bloc>();
		// 0 : herbe
		// 1 : route
		// 2 : ligne
		// 3 : grenouille
		// 4 : mouche
		// 5 : arbre
		// 6 : voiture
		// 7 : camion
		tab = new int[][]
				{{0,0,0,0,5,0,0,5,0,4,0,0,5,0,0,5,0,0,0},
				{0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
				{1,1,7,1,1,1,1,1,1,1,6,1,1,1,7,1,1,1,1},
				{1,1,1,1,6,1,1,1,1,1,1,1,1,1,1,1,1,6,1},
				{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
				{1,1,1,1,1,1,1,1,7,1,1,1,1,1,1,1,1,1,1},
				{1,1,1,6,1,1,1,1,1,1,1,1,1,1,1,1,1,6,1},
				{1,1,1,1,1,1,1,1,1,6,1,1,1,1,1,1,1,1,1},
				{0,0,5,0,5,0,0,0,0,0,0,0,0,0,0,0,5,0,0},
				{0,0,0,0,0,0,0,5,0,3,0,5,0,5,0,0,0,0,0}};
	}

	public void creerBlocs(){
		for(int i = 0; i<tab.length;i++){
			for(int j = 0; j<tab[i].length; j++){
				switch(tab[i][j]){
				case 0 :
					listeBlocs.add(new BlocHerbe(i,j,0,0));
					break;
				case 1 :
					listeBlocs.add(new BlocRoute(i,j,0,0));
					break;
				case 2 : 
					listeBlocs.add(new BlocLigne(i,j,0,0));
					break;
				case 3 :
					listeBlocs.add(new BlocGrenouille(i,j,0,0));
					break;
				case 4 : 
					listeBlocs.add(new BlocFly(i,j,0,0));
					break;
				case 5 : 
					listeBlocs.add(new BlocArbre(i,j,0,0));
					break;
				case 6 : 					
					listeBlocs.add(new BlocVoiture(i,j,0,0));
					break;
				case 7 :
					listeBlocs.add(new BlocCamion(i,j,0,0));
					break;
				}
			}
		}
	}

	public Iterator<Bloc> iterator() {
		return listeBlocs.iterator();
	}

}