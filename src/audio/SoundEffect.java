package  audio;

/**
 * This Music class stores a playable sound which can overlap music and other
 * sound effects but itself
 * 
 *
 */
public class SoundEffect extends Audible {

	/**
	 * Basic constructor
	 * 
	 * @param filename
	 *            Name of the audio file (must be .ogg or .wav)
	 */
	public SoundEffect(String filename) {
		super(filename);
	}

	@Override
	public void play() {
		if (audio == null)
			return;

		if (audio.isPlaying())
			audio.stop();

		audio.playAsSoundEffect(pitch, gain, false);
	}

}
