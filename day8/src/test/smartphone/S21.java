package test.smartphone;

import test.phone.interface1.SmartPhone;

public class S21 implements SmartPhone {

	@Override
	public void sendCall(String phoneNumber) {
		System.out.println(phoneNumber + "�� ��ȭ�� �Ǵ�.");
	}

	@Override
	public void receiveCall(String phoneNumber) {
		System.out.println(phoneNumber + "���� �ɷ� �� ��ȭ�� �޴´�.");
	}

	@Override
	public void sendSMS(String phoneNumber) {
		System.out.println(phoneNumber + "�� ���� �޽����� ������.");
	}

	@Override
	public void receiveSMS(String phoneNumber) {
		System.out.println(phoneNumber + "���� �� ���� �޽����� �޴´�.");
	}

	@Override
	public String searchMusic(String searchWords) {
		System.out.println("������ ã�� ���Դϴ�.");
		return searchWords + "_music.mp3";
	}

	@Override
	public void playMusic(String musicName) {
		System.out.println(musicName + " ������ ����մϴ�.");
	}

	@Override
	public void stopMusic() {
		System.out.println("���� ���� ������ �����մϴ�.");
	}

	@Override
	public void installApp(String appName) {
		System.out.println(appName + "���� �ν��� �մϴ�.");
	}

	@Override
	public void runApp(String appName) {
		System.out.println(appName + "���� �����մϴ�.");
	}

}
