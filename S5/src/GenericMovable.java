
public class GenericMovable implements MovableObject {

	private double speed=35.0;
		
	@Override
	public boolean canAccelerate() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		speed=speed+5;
	}

	@Override
	public double getTimeToMove(double D) {
		// TODO Auto-generated method stub
		return (D/speed)*60;
	}

	public void brake() {
		speed=speed-5;
	}
}
