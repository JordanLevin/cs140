package assignment08;

public class Rectangle {
	private int width;
	private int height;
	public Rectangle(int w, int h){
		width = w;
		height = h;
	}
	public int getArea(){
		if(width==0 || height==0){
			return 0;
		}
		if(width==1){
			return height;
		}
		return height + new Rectangle(height, width-1).getArea();
	}
	
}
