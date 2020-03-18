
public class ConstantSpeedMovable implements MovableObject {
	private final double speed = 35.0;
	
	@Override
	public boolean canAccelerate() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub

	}

	@Override
	public double getTimeToMove(double D) {
		// TODO Auto-generated method stub
		return (D/speed)*60;
	}
	
	public void brake() {
		
	}
}
