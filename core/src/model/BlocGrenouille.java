package model;

import com.badlogic.gdx.graphics.Texture;

public class BlocGrenouille extends Bloc{
		
	enum Direction { 
		HAUT("haut"), BAS("bas"), GAUCHE("gauche"), DROITE("droite");
		
		private final String nom;
			
		Direction(String dir){
			this.nom = dir;
		}
		
		public String getNom(){
			return nom;
		}
	}
	
	private Direction direction;
	private int SPEED;
	
	public BlocGrenouille(int posX, int posY, int hauteur, int largeur){
		super(posX,posY,hauteur,largeur,true);
		this.texture = new Texture("frog.png");
		direction = Direction.GAUCHE;
		SPEED = 1;
	}
	
	public String getDirection(){
		return direction.getNom();
	}
	
	public void setDirection(int d){
		switch(d){
		case 1 :
			direction = Direction.HAUT;
			break;
		case 2 :
			direction = Direction.BAS;
			break;
		case 3 : 
			direction = Direction.GAUCHE;
			break;
		case 4 : 
			direction = Direction.DROITE;
			break;
		default:
			break;
				
		}
	}
	
	public int getSpeed(){
		return SPEED;
	}
	
	public void setSpeed(int s){
		this.SPEED = s;
	}
	
	
	public void update(){
		switch(direction){
		case HAUT:
			this.posX-=1;
			break;
		case BAS:
			this.posX+=1;
			break;
		case GAUCHE:
			this.posY-=1;
			break;
		case DROITE:
			this.posY+=1;
			break;
		}
	}

}
