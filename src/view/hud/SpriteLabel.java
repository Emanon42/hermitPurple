package  view.hud;

import org.lwjgl.opengl.GL11;

import  model.physics.Vertex;
import  view.sprites.Sprite;

/**
 * This SpriteLabel class is a sprite used as label in the HUD
 * 
 *
 */
public class SpriteLabel extends Label {

	/** Sprite of the label */
	protected Sprite sprite;

	/**
	 * Basic constructor
	 * 
	 * @param name
	 *            Name of the label
	 * @param pos
	 *            Center position (in VGApx, absolute to the canvas)
	 * @param sprite
	 *            Sprite of the label
	 */
	public SpriteLabel(String name, Vertex pos, Sprite sprite) {
		super(name, pos);
		this.sprite = sprite;
	}

	@Override
	public void draw() {
		GL11.glPushMatrix();
		GL11.glTranslated(position.getX(), position.getY(), 0);
		sprite.draw();
		GL11.glPopMatrix();
	}

}
