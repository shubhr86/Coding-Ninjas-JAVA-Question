package OopsPractice;

public class cyliner {
	private int radious;
	private int height;
	private int volume;
	
	
	
	public void setRadious(int radious) {
		this.radious = radious;
	}
	
	public int getRadious() {
		return radious;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	public int getHeight() {
		return height;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getVolume() {
		return volume;
	}
	
	public int volume() {
		
		return  (int) (Math.PI * height*radious*radious);
	}

}
