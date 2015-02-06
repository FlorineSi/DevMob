package model;

import com.badlogic.gdx.graphics.Texture;

public class BlocVoiture extends Bloc{
	
	public BlocVoiture(int posX, int posY, int hauteur, int largeur){
		super(posX,posY,hauteur,largeur,true);
		this.texture = new Texture("texture-voiture.png");
	}

}
