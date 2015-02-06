package model;

import com.badlogic.gdx.graphics.Texture;

public class BlocCamion extends Bloc{
	
	public BlocCamion(int posX, int posY, int hauteur, int largeur){
		super(posX,posY,hauteur,largeur,true);
		this.texture = new Texture("texture-camion.png");
	}

}
