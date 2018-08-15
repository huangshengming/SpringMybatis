package com.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContentHolder {

    private static Logger logger = LoggerFactory.getLogger(ApplicationContentHolder.class);
    private static ClassPathXmlApplicationContext applicationContext = null;
    private static ClassPathXmlApplicationContext applicationContextApp = null;

    public static synchronized ClassPathXmlApplicationContext getInstance() {
        try{
            if(applicationContext == null) {
                applicationContext = new ClassPathXmlApplicationContext("classpath:spring/ApplicationContext.xml");
            }
        } catch(Exception e) {
            logger.error("exception happen getApplicationContextInstance {} ", e);
        }
        return applicationContext;
    }

    public static synchronized ClassPathXmlApplicationContext getExtInstance() {
        try{
            if(applicationContextApp == null) {
                applicationContextApp = new ClassPathXmlApplicationContext(
                        new String[]{"classpath:spring/ApplicationContextApp.xml"}, getInstance());
            }
        } catch(Exception e) {
            logger.error("exception happen getApplicationContextInstance {} ", e);
        }


        return applicationContextApp;
    }

    public static ClassPathXmlApplicationContext getInstance(String contextLocation) {
        try {
            if(applicationContext == null) {
                applicationContext = new ClassPathXmlApplicationContext(contextLocation);
            }
        } catch(Exception e) {
            logger.error("exception happen getApplicationContextInstance {} ", e);
        }

        return applicationContext;
    }

    public static <T> T getExtBean(Class<T> clazz) {
        return getExtInstance().getBean(clazz);
    }

}
