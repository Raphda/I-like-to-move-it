
public interface MovableObject {

	public boolean canAccelerate();
	
	public void accelerate();
	
	public double getTimeToMove(double D);
	
	public void brake();
	
}
