package model;

import com.badlogic.gdx.graphics.Texture;

public class BlocArbre extends Bloc{
	
	public BlocArbre(int posX, int posY, int hauteur, int largeur){
		super(posX,posY,hauteur,largeur,false);
		this.texture = new Texture("texture-arbre-2.png");
	}

}
