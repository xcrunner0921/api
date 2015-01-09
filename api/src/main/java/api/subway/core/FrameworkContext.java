package api.subway.core;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import api.subway.core.ConfigLoaderListener;

/**
 * Date: 2009. 6. 1, 오전 11:10:52
 *
 * @author jeongtak
 */

public class FrameworkContext {

    private static FrameworkContext instance = new FrameworkContext();

    private static ApplicationContext applicationContext = null;

    public static FrameworkContext getInstance() {

        if (instance == null) {
            instance = new FrameworkContext();
        }

        return instance;
    }

    private FrameworkContext() {

        ConfigInitializer.getInstance();

        if (applicationContext == null) {

            // web에서 먼저 로딩했는지 체크
            applicationContext = ConfigLoaderListener
                    .getWebApplicationContext();

            if (applicationContext != null) {
                applicationContext = ConfigLoaderListener
                        .updateApplicationContext();
            }
            else {

                try {

                    System.out
                            .println(">> Framework Started.. with Standalone Initialization Mode");

                    applicationContext = new ClassPathXmlApplicationContext(
                            "context/applicationContext.xml");
                } catch (BeanCreationException e) {
                    e.printStackTrace();
                    // if (e.getCause() instanceof NoClassDefFoundError) {
                    // if (!((NoClassDefFoundError) e.getCause()).getMessage()
                    // .startsWith("javax/transaction/")) {
                    // throw e;
                    // }
                    // }
                }
            }
        }
    }

    public ApplicationContext getApplicationContext() {
        if (applicationContext == null) {
            applicationContext = ConfigLoaderListener
                    .getWebApplicationContext();

            if (applicationContext == null) {
                applicationContext = ConfigLoaderListener
                        .updateApplicationContext();
            }
        }
        return applicationContext;
    }

}
