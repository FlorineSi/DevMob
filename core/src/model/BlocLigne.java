package model;

import com.badlogic.gdx.graphics.Texture;

public class BlocLigne extends Bloc{
	
	public BlocLigne(int posX, int posY, int hauteur, int largeur){
		super(posX,posY,hauteur,largeur,false);
		this.texture = new Texture("blanc.jpg");
	}

}
