/**
The Face class gets and sets the many necessary variables, and has several constructors
in order to initialize and further modify the many facial components. 
*/
public class Face extends Circle {
	private int smileType;
	private int diameter;
	/**
	The getSmileType function gets the smileType variable.
	*/
	public int getSmileType() {
		return smileType;
	}
	/**
	The setSmileType function stores the smileType variable.
	*/	
	public void setSmileType(int st) {
		if (st < 0) {
			smileType = 0;
		} else if (st > 2) {
			smileType = 2;
		} else {
			smileType = st;
		}
	}
	/**
	This is the default face constructor. The superclass default constructor 
	sets x, y, and the radius to 0, and this constructor sets a default smile and diameter. 
	*/
	public Face() {
			smileType = 0;
			diameter = 0;
	}
	/**
	This is the non-default face constructor. It calls the superclass constructor for
	the first 3 variables, and uses the aforementioned setSmileType function to pass
	the smile type value. 
	*/
	public Face(int x, int y, int r, int st) {
		super(x,y,r);
		setSmileType(st);
		diameter = 2 * r;
	}
	/**
	This overrides the getShapeType function from the Shapes class. 
	*/
	@Override
	public String getShapeType() {
			return "face";
	}
	/**
	This function gets names for each smile type that can be printed out later.
	*/
	public String getSmileTypeAsString() {
		if (smileType == 0) {
			return "meh";
		} else if (smileType == 1) {
			return "smile";
		} else {
			return "frown";
		}
	}
	/**
	This overrides the toString function from the Shapes class. 
	*/
	@Override
	/**
	This toString function prints all of the parameters from the Shapes superclass,
	while also printing the smile type. 
	*/
	public String toString() {
		return String.format("%s %s", super.toString(), getSmileTypeAsString());
	}
	/**
	The many face-related functions below are used to correctly position each component
	and change the mouth angle depending on the desired facial expression. 
	*/
	public int getLeftEyeX() {
		return (int)(getX() + 0.1*diameter);
	}
	public int getRightEyeX() {
		return (int)(getX() + 0.7*diameter);
	}
	public int getEyeDiameter() {
		return (int)(0.2*diameter);
	}
	public int getEyeY() {
		return (int)(getY() + 0.2*diameter);
	}
	public int getMouthX() {
		return (int)(getX() + 0.1*diameter);
	}
	public int getMouthY() {
		return (int)(getY() + 0.7*diameter);
	}
	public int getMouthHeight() {
		return (int)(0.1*diameter);
	}
	public int getMouthWidth() {
		return (int)(0.8*diameter);
	}
	public int getMouthAngle() {
		if (smileType == 0) {
			return 0;
		} else if (smileType == 1) {
			return 180;
		} else {
			return -180;
		}
	}
}