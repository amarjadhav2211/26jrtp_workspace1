package in.ashokit.exception;
//@Builder
public class ExResponse {
	// when ever exception occurs we need to send response 
	// to client in proper format using this class
	private String errMsg;
	private String errCode;
	public ExResponse(String errMsg, String errCode) {
		super();
		this.errMsg = errMsg;
		this.errCode = errCode;
	}
	
	public ExResponse() {
		// TODO Auto-generated constructor stub
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}
	
	
}
