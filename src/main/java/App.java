import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.LogManager;
import org.slf4j.LoggerFactory;
import org.slf4j.bridge.SLF4JBridgeHandler;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Baofeng Xue at 2016/6/3 22:36.
 */
public class App {

    static Logger julLogger = Logger.getLogger(App.class.getName());
    static org.slf4j.Logger slf4jLogger = LoggerFactory.getLogger(App.class);

    static org.apache.log4j.Logger log4jLogger = LogManager.getLogger(App.class);
    static Log commonLog = LogFactory.getLog(App.class);

    public static void main(String[] args) {
        SLF4JBridgeHandler.install();
        julLogger.log(Level.FINE, "jul debug");
        slf4jLogger.debug("slf4j debug");
        log4jLogger.debug("log4j debug");
        commonLog.debug("commonlog debug");
    }
}
