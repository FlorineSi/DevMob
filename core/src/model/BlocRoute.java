package model;

import com.badlogic.gdx.graphics.Texture;

public class BlocRoute extends Bloc{
	
	public BlocRoute(int posX, int posY, int hauteur, int largeur){
		super(posX,posY,hauteur,largeur,false);
		this.texture = new Texture("route.jpg");
	}

}
