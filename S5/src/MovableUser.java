
public class MovableUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericMovable car1 = new GenericMovable();
		GenericMovable car2 = new GenericMovable();
		ConstantSpeedMovable car3 = new ConstantSpeedMovable();
		car2.accelerate();
		System.out.println(car1.getTimeToMove(1.0));
		System.out.println(car2.getTimeToMove(1.0));
		System.out.println(car3.getTimeToMove(1.0));
		System.out.println(getTotalTime(car1)+" "+ getTotalTime(car2)+" "+getTotalTime(car3));
	}
	public static double getTotalTime(MovableObject movable){
		double time = 0.0;
		time=time+ movable.getTimeToMove(1);
		movable.brake();
		time=time+movable.getTimeToMove(0.1);
		movable.accelerate();
		time=time+movable.getTimeToMove(1);
		return time;
	}
}
