package in.ashokit.exception;

public class AuthServiceException extends RuntimeException {
	// user defined exception class
	private String errCode;
	
	public AuthServiceException()
	{
		
	}
	
	public AuthServiceException(String msg,String errcode)
	{
		super(msg);
		this.errCode=errcode;
	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}
	 
}
