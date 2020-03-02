
public class CircleArea {
	private float PI = (float) 3.14159265359;
	private float reduis = 0;
	
	public CircleArea () {}
	
	public CircleArea (float reduis) {
		this.reduis = reduis;
	}
	
	public float get_reduis() {
		return this.reduis;
	}
	
	public void set_reduis(float reduis) {
		this.reduis = reduis;
	}

	public float area() {
		return (float) PI * reduis *reduis;
	}
}

