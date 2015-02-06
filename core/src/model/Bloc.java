package model;

import com.badlogic.gdx.graphics.Texture;

public abstract class Bloc {
	
	protected int largeur, hauteur;
	// Pour la position : vector2
	protected int posX, posY;
	protected Texture texture;
	public boolean mobile;
	
	public Bloc(int posX, int posY, int hauteur, int largeur, boolean m){
		this.posX = posX;
		this.posY = posY;
		this.hauteur = hauteur;
		this.largeur = largeur;
		this.mobile =m;
	}	
	
	public Texture getTexture(){
		return texture;
	}
	
	public int getPosX(){
		return posX;
	}
	
	public int getPosY(){
		return posY;
	}
	
	public boolean getMobile(){
		return mobile;
	}

}
