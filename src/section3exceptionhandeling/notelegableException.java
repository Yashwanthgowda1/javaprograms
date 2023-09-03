package section3exceptionhandeling;

public class notelegableException extends RuntimeException {

	

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "wait for paricular period of time ";
	}

}
