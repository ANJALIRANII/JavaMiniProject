package custom_exception;

@SuppressWarnings("serial")
public class PatientExceptionHandling extends Exception {
	public PatientExceptionHandling(String msg) {
		super(msg);
	}

}
