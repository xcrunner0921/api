package api.subway.core;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import api.subway.core.ConfigInitializer;

/**
 * Date: 2009. 6. 1, 오후 11:45:47
 *
 * @author jeongtak
 */
public class ConfigLoaderListener implements ServletContextListener {

    private static ServletContext servletContext = null;

    // root applicationContext
    private static WebApplicationContext applicationContext = null;

    /**
     * 프레임워크를 초기화 한다.
     *
     * @param event
     */
    public void contextInitialized(ServletContextEvent event) {
        servletContext = event.getServletContext();

        ConfigInitializer.getInstance();

        applicationContext = WebApplicationContextUtils
                .getWebApplicationContext(servletContext);

        if (applicationContext != null) {
            System.out
                    .println("Spring WebApplicationContext initialization done.");
        }
        else {
            System.out.println("Spring WebApplicationContext initializing...");
        }
    }

    public void contextDestroyed(ServletContextEvent event) {
        try {
            ConfigInitializer.getInstance().releaseResource();

        } finally {
            System.gc();
        }
    }

    /**
     * xxx-servelt.xml 로 부터 로딩된 WebApplicationContext를 리턴한다.
     *
     * @return
     */
    public static WebApplicationContext getWebApplicationContext() {

        if (applicationContext == null) {

            if (servletContext != null) {

                try {
                    applicationContext = WebApplicationContextUtils
                            .getRequiredWebApplicationContext(servletContext);
                } catch (IllegalStateException e) {
                    System.out.println("Spring Webapplication 초기화가 되지 않았습니다. "
                            + e.getMessage());
                }

                if (applicationContext == null) {
                    applicationContext = ContextLoaderListener
                            .getCurrentWebApplicationContext();

                    if (applicationContext == null) {
                        System.out
                                .println("현재 초기화된 Spring Webapplication이 없습니다.");
                    }
                }
            }
        }

        return applicationContext;

    }

    public static WebApplicationContext updateApplicationContext(){
        applicationContext = ContextLoaderListener
                .getCurrentWebApplicationContext();
        return applicationContext;
    }
}
