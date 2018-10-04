package  view.hud;

import java.util.HashMap;

import org.lwjgl.opengl.GL11;

import  view.sprites.Sprite;

/**
 * This PseudoFont class is a set of sprits meant to match a character, and
 * print text
 * 
 *
 */
public class PseudoFont {

	/** Set of characters with sprite */
	protected HashMap<String, Sprite> chars;

	/**
	 * Basic constructor
	 */
	public PseudoFont() {
		chars = new HashMap<String, Sprite>();
	}

	/**
	 * Adds a printable character to the font
	 * 
	 * @param character
	 *            Unicode character
	 * @param charSprite
	 *            Sprite of the character
	 */
	public void addChar(String character, Sprite charSprite) {
		chars.put(character, charSprite);
	}

	/**
	 * Draws the given text (it will ignore the unrecognized characters)
	 * 
	 * @param text
	 *            Text to draw
	 */
	public void draw(String text) {
		Sprite current;

		GL11.glPushMatrix();

		for (int i = 0; i < text.length(); i++) {
			current = chars.get("" + text.charAt(i));
			if (current != null) {
				current.draw();
				GL11.glTranslated(current.getW() * current.getScaling(), 0, 0);
			}
		}

		GL11.glPopMatrix();
	}
}
