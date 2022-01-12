package test.smartphone;

public class RunSmartPhone {

	public static void main(String[] args) {
		S21 s = new S21();
		s.sendCall("010-1112-0208");
		s.receiveSMS("010-1112-0208");
		s.installApp("Google Map");
		s.runApp("Google Map");
		String music = s.searchMusic("WAITING ARMS");
		s.playMusic(music);
		s.stopMusic();
	}

}
