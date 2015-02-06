package fr.univ_lorraine.hungry_frog;

import java.util.ArrayList;

import model.*;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.FPSLogger;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class HungryFrogGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Level level;
	FPSLogger log;
	OrthographicCamera camera;
	// taille de l'écran
	float hauteur, largeur;
	float ppu, ppuX, ppuY;
	
	@Override
	public void create(){
		batch = new SpriteBatch();
		img = new Texture("fondArbres.png");
		level = new Level();
		level.creerBlocs();
		log = new FPSLogger();
		largeur = Gdx.graphics.getWidth();
        hauteur = Gdx.graphics.getHeight();		
		camera=new OrthographicCamera(largeur, hauteur);
		//camera.position.set(100, 10, 0);
	}
	
	@Override
	public void render () {
		//log.log();
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		batch.draw(img, 0, 0, 800, 480);
		for(Bloc b : level){
			if(b.getMobile())
				batch.draw(b.getTexture(),44*b.getPosY(),44*b.getPosX());
		}
		batch.end();
	}

	public void resize(int width, int height){
		// Permet de projeter uniquement une portion du monde
		camera.setToOrtho(false,width,height);
		// Positionne la caméra à un endroit donné
		//camera.position.set(width/ 3,height/ 3, 0);
		camera.update(); 
	}
}