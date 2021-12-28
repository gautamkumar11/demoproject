package in.sts.demoproject.product;

public class ProductDimention {

	private int length;
	private int breadth;
	private int thick;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public int getThick() {
		return thick;
	}
	public void setThick(int thick) {
		this.thick = thick;
	}
	@Override
	public String toString() {
		return "ProductDimention [length=" + length + ", breadth=" + breadth + ", thick=" + thick + "]";
	}
	
}
