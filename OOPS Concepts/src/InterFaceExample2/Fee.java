package InterFaceExample2;

public abstract class Fee{ 
//it contains both implemented and Unimplemented Methods
	
	public abstract double Cfee(double fee);
	// this is abstract Method it doesnt have body,so we need to implement 
	// by inheriting this class to anoother class
	
	public boolean Marks(double Marks) {
		if(Marks>600) {
		return true;
	}
		else{
			return false;
			}
		}
	
}