package test.overriding1;

public class Laser extends Weapon {
	@Override
	public void fire() {
		super.fire();
		System.out.println("ÂîÀÌÀ×~");
	}
}
