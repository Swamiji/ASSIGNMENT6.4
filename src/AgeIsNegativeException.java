
public class AgeIsNegativeException extends Exception {
String errormessage;
	public AgeIsNegativeException(String errormessage) {
		// TODO Auto-generated constructor stub
	this.errormessage=errormessage;
	}
	public String toString(){
		return errormessage;
		
	}
	

}
