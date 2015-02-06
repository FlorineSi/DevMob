package model;

import com.badlogic.gdx.graphics.Texture;

public class BlocFly extends Bloc{
	
	public BlocFly(int posX, int posY, int hauteur, int largeur){
		super(posX,posY,hauteur,largeur,true);
		this.texture = new Texture("fly.png");
	}

}
