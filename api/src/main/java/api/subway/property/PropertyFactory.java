package api.subway.property;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

//import api.subway.core.FrameworkContext;

public class PropertyFactory {

//    private static ApplicationContext appCtx = FrameworkContext.getInstance().getApplicationContext();
//    private static ReloadableResourceBundleMessageSource msa = (ReloadableResourceBundleMessageSource) appCtx.getBean("propertySource");
//
//    /**
//     * 코드에 해당하는 프로퍼티를 리턴
//     *
//     * @param code
//     * @return
//     */
//    public static String getProperty(String code) {
//        return msa.getMessage(code, null, Locale.KOREA);
//    }
//    
//    /**
//     * <pre>
//     * 파라미터가 포함된 코드에 해당하는 프로퍼티를 리턴
//     * 파라미터는 *.properties 파일에 {0} , {1} 형식으로 추가하며 다음 처럼 호출함. 예) {0} 님 환영합니다.
//     * String param0 = "";
//     * String param1 = "";
//     * PropertyFactory.getProperty("code", new String[]{param0, param1})
//     * </pre>
//     * 
//     * @param code
//     * @param params
//     * @return
//     */
//    public static String getProperty(String code, String[] params) {
//        return msa.getMessage(code, params, Locale.KOREA);
//    }

}
