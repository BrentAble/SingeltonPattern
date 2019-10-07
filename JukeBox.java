package jukeBoxTester;
/*
 * Author @ Brent Able
 */

import java.util.LinkedList;
import java.util.Queue;

public class JukeBox {
	Queue<String> songQueue = new LinkedList<>();
	private static JukeBox jukeBox;
	
	JukeBox() {}
	/*
	* used for junit testing
	*/
	
	public static JukeBox getInstance() {
		if(jukeBox == null) {
			System.out.println("Getting the music");
			jukeBox = new JukeBox();
		}
		return jukeBox;
	}
	/*
	* Returns instance of the type jukebox in java
	*/
	
	public void requestSong(String song) {
		songQueue.add(song);
		System.out.println(song + " is now #" + songQueue.size() + " on the list!");
	}
	/*
	 * request song takes in an argument string and adds to the queue
	 */
	
	public boolean hasMoreSongs() {
		if(!songQueue.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	/*
	 * has more songs checks the current song title, if its empty returns false, if not then true
	 */
	
	public void playNextSong() {
		for(int i = 0; i < songQueue.size(); i++) {
			String song = songQueue.peek();
			if(song != null) {
				System.out.println("Lets dance to " + song);
				i++;
				songQueue.remove(song);
			}
		}
	}
	/*
	 * play next song checks the length of the songQueue, and the top song then removes the songs as
	 * it goes through the queue playing each next song
	 */
}
