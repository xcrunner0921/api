package api.subway.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;

/**
 * Date: 2009. 6. 4, 오후 5:03:46
 *
 * @author jeongtak
 */
public abstract class GeneralObject {

    /**
     * 로거 선언
     */
//    protected Log logger = LogFactory.getLog(this.getClass());
	protected Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 디버깅이 가능한지 체크
     */
    protected boolean isDebugEnabled = logger.isDebugEnabled();

}
