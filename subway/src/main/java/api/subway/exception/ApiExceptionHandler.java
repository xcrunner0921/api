package api.subway.exception;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.apache.log4j.Logger;

/**
 * api.subway.exceptionApiExceptionHandler.java
 * TODO : rest 예외처리
 * date : 2015. 1. 19.
 * user : Administrator
 */
@Provider
@Produces(MediaType.APPLICATION_XML)
public class ApiExceptionHandler implements ExceptionMapper<ApplicationException> {

//	protected Logger log = LoggerFactory.getLogger(this.getClass());
	protected Logger log = Logger.getLogger(this.getClass());

	public Response toResponse(ApplicationException exception) {
		// TODO Auto-generated method stub
		try {
			ErrorMessage err = new ErrorMessage();
			int code = exception.getCode();
			//String //errMsg = "";
			switch (code) {
			case 100:
				//errMsg = MessageFactory.getMessage("error.sti.issue.ouptut.set.genuid");
				break;
			case 101:
				//errMsg = MessageFactory.getMessage("error.sti.issue.ouptut.set.issueinfo");
				break;
			case 102:
				//errMsg = MessageFactory.getMessage("error.sti.issue.ouptut.set.insert");
				break;
			case 103:
				//errMsg = MessageFactory.getMessage("error.sti.issue.ouptut.set.history");
				break;
			case 104:
				//errMsg = MessageFactory.getMessage("error.sti.issue.ouptut.set.endissue");
				break;
			case 105:
				//errMsg = MessageFactory.getMessage("error.sti.issue.ouptut.get.select");
				break;
			}
//			vo.setErrMsg( String.format(MessageFactory.getMessage("error.sti.comm.rollback"), code, errMsg) );
			log.error( exception.getInternalErrorMessage() );
			//System.out.println( ">>>>>>>>> "+exception.getInternalErrorMessage() );

			return Response.ok(err).build();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			ErrorMessage err = new ErrorMessage();
//			vo.setSuccessYN( "N" );
			log.error("{}", e);
			return Response.ok(err).build();
		}
	}

}
