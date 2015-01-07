package api.subway.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import api.subway.model.SubwayVO;

/**
 * rest 예외처리
 *
 */
@Provider
public class ApiExceptionHandler implements ExceptionMapper<ApplicationException> {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	/* (non-Javadoc)
	 * @see javax.ws.rs.ext.ExceptionMapper#toResponse(java.lang.Throwable)
	 */
//	@Override
//	public Response toResponse(Exception exception) {
//		// TODO Auto-generated method stub
//		exception.printStackTrace();
//		return null;
//	}

//	@Override
//	public Response toResponse(Exception arg0) {
////		System.out.println("---------------------22222");
////		return Response.status(500).build();
//		StampIssueVo issueVo = new StampIssueVo();
//		issueVo.setSuccessYN( "N" );
//		return Response.ok( issueVo, MediaType.APPLICATION_JSON ).build();
//	}


	//@Override
	public Response toResponse(ApplicationException exception) {
		// TODO Auto-generated method stub
		try {
			SubwayVO vo = new SubwayVO();
//			vo.setSuccessYN( "N" );
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
			logger.error( exception.getInternalErrorMessage() );
			//System.out.println( ">>>>>>>>> "+exception.getInternalErrorMessage() );

			return Response.ok( vo, MediaType.APPLICATION_JSON ).build();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			SubwayVO vo = new SubwayVO();
//			vo.setSuccessYN( "N" );
			logger.error("{}", e);
			return Response.ok( vo, MediaType.APPLICATION_JSON ).build();
		}
	}

}
