package api.subway.core;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Log4jConfigurer;

/**
 * ConfigInitializer는 다음 항목을 초기화 한다.
 * 1. 시스템 환경 변수
 * 2. log4j
 *
 * @author 
 */
public class ConfigInitializer {

    private static ConfigInitializer instance = new ConfigInitializer();

    private static boolean isInitialized = false;

    public static ConfigInitializer getInstance() {
        return instance;
    }

    private ConfigInitializer() {
        initSystemEnv(false);
        initLog4j(false);
        isInitialized = true;
    }

    /**
     * spring 환경변수를 서버의 모드마다 다르게 설정하기 위한 시스템 환경변수를 설정한다.
     * config/property/system.properties 파일의 값을 시스템 환경변수에 등록한다.
     *
     * @param servletContext
     */
    private void initSystemEnv(boolean isUsable) {
       
        if (isUsable) {

            System.out
                    .println("############# 프레임워크 시스템 환경변수 목록 ##############");
            InputStream in = Thread.currentThread().getContextClassLoader()
                    .getResourceAsStream("property/system.properties");
            Properties pro = new Properties();

            try {
                if (in != null) {

                    pro.load(in);

                    for (Iterator<Entry<Object, Object>> it = pro.entrySet()
                            .iterator(); it.hasNext();) {
                        Entry<Object, Object> entry = it.next();
                        String key = (String) entry.getKey();
                        String value = (String) entry.getValue();

                        System.setProperty(key, value);
                        System.out.println(key + "=" + value);
                    }

                    isInitialized = true;
                    System.out
                            .println("#########################################################");
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (in != null)
                        in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }

    public void initLog4j(boolean isReloadable) {
	    
	    try {
	        
	        if(!isReloadable)
	            Log4jConfigurer.initLogging("classpath:property/log4j.properties");
	        else{
	            Log4jConfigurer.initLogging("classpath:property/log4j.properties", Integer.parseInt(System.getProperty("log4j.reload.second")));
	        }
            
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
	    
	}

    /**
     * 시스템 환경변수가 초기화 되었는지를 리턴
     *
     * @return
     */
    public static boolean isInitialized() {
        return isInitialized;
    }

    /**
     * 자원을 해제한다.
     */
    public void releaseResource() {

        Log4jConfigurer.shutdownLogging();

        FrameworkContext fctx = FrameworkContext.getInstance();

        ApplicationContext actx = fctx.getApplicationContext();
        if (actx != null && actx instanceof ClassPathXmlApplicationContext) {
            ((ClassPathXmlApplicationContext) actx).close();
        }

    }

}
