package model;

import com.badlogic.gdx.graphics.Texture;

public class BlocHerbe extends Bloc{

	public BlocHerbe(int posX, int posY, int hauteur, int largeur){
		super(posX,posY,hauteur,largeur,false);
		this.texture = new Texture("texture-herbe-48.png");
	}
}
