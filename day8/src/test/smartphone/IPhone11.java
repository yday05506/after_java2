package test.smartphone;

import test.phone.interface1.MP3;
import test.phone.interface1.MobilePhone;

public class IPhone11 implements MobilePhone, MP3 {

	@Override
	public String searchMusic(String searchWords) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void playMusic(String musicName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void stopMusic() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sendCall(String phoneNumber) {
		// TODO Auto-generated method stub

	}

	@Override
	public void receiveCall(String phoneNumber) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sendSMS(String phoneNumber) {
		// TODO Auto-generated method stub

	}

	@Override
	public void receiveSMS(String phoneNumber) {
		// TODO Auto-generated method stub

	}

}
