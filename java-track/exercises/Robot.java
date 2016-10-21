
public class Robot {

	private String name;
	private int xpos;
	private int ypos;
	private int speed;
	private int orientation;

	public Robot(String name, int xpos, int ypos, int speed, String orientation) {
		this.name = name;
		this.xpos = xpos;
		this.ypos = ypos;
		this.speed = speed;
		if( orientation == "north" || orientation == "North") {
			this.orientation = 1;
		}
		else if ( orientation == "east" || orientation == "East"){
			this.orientation = 2;
		}
		else if ( orientation == "south" || orientation == "South"){
			this.orientation = 3;
		}
		else if ( orientation == "west" || orientation == "West"){
			this.orientation = 4;
		}
	}
	public void moveRobot(Robot robo, int xpos, int ypos){
		this.xpos = robo.xpos + xpos;
		this.ypos += ypos;
	}

	public void rotate(){
		if(this.orientation + 1 == 5){
			this.orientation = 1;
		}
		else {
			this.orientation = this.orientation + 1;
		}
	}
	public double distanceFromRobo( Robot robo1, Robot robo2) {

		double xComponent = robo1.xpos - robo2.ypos;
		double yComponent = robo1.ypos - robo2.ypos;
		double xSquare = (xComponent * xComponent);
		double ySquare = (yComponent * yComponent);
		double squareSum = xSquare + ySquare;

		double distanceBetween = Math.sqrt(squareSum);
		return distanceBetween;
	}

	public String toString(Robot robo) {
		String orientation1 = "";
		if(this.orientation == 1 ){
			orientation1 = "North";
		}
		else if(this.orientation == 2 ){
			orientation1 = "East";
		}
		else if(this.orientation == 3 ){
			orientation1 = "South";
		}
		else if(this.orientation == 4 ){
			orientation1 = "West";
		}

		return "Name: " + this.name +  this.xpos + this.ypos + orientation1 + this.speed;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
