package api.subway.property;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

//import api.subway.core.FrameworkContext;

public class MessageFactory {

//    private static ApplicationContext appCtx = FrameworkContext.getInstance().getApplicationContext();
//    private static ReloadableResourceBundleMessageSource msa = (ReloadableResourceBundleMessageSource) appCtx.getBean("messageSource");
//
//
//    /**
//     * 코드에 해당하는 메시지를 리턴
//     *
//     * @param code
//     * @return
//     */
//    public static String getMessage(String code) {
//        return msa.getMessage(code, null, Locale.KOREA);
//    }
//
//    /**
//     * 파라미터가 포함된 코드에 해당하는 메시지를 리턴
//     * <p/>
//     * 파라미터는 *.properties 파일에 {0} , {1} 형식으로 추가하며 다음 처럼 호출함. 예) {0} 님 환영합니다.
//     * <p/>
//     * String param0 = "";
//     * String param1 = "";
//     * MessageFactory.getMessage("code", new String[]{param0, param1})
//     *
//     * @param code
//     * @param params
//     * @return
//     */
//    public static String getMessage(String code, String[] params) {
//        return msa.getMessage(code, params, Locale.KOREA);
//    }
//
//    public static void main(String[] args) {
//
//        System.out.println(">>" + MessageFactory.getMessage("error.framework.util.KoreanNotEncode"));
//    }
}
