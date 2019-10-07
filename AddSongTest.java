package jukeBoxTester;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddSongTest {

	@Test
	public void test() {
		JukeBox test = new JukeBox();
		String song1 = "The ABCs";
		String song2 = "The ABCs";
		assertEquals(song1, song2);
	}

}
