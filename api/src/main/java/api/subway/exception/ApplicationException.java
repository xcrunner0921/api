package api.subway.exception;

import java.io.PrintWriter;
import java.io.StringWriter;


public class ApplicationException extends RuntimeException
{
	private static final long serialVersionUID = 1L;
	
	private int code;

	public ApplicationException()
	{
		super();
	}
	
	public ApplicationException(String message, Throwable cause)
	{
		super(message, cause);
	}
	
	public ApplicationException(int message, Throwable cause)
	{
		super(cause);
		this.setCode(message);
	}
	
	public ApplicationException(Throwable cause)
	{
		super(cause);
	}
	
	public ApplicationException(String msg)
	{
		super(msg);
	}
	
	public int getCode() {
		return this.code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public String getInternalErrorMessage()
	{
		Throwable cause = this.getCause();
		if(cause != null)
		{
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			cause.printStackTrace(pw);
			return sw.toString();
		}
		return null;
	}

}