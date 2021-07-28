package john.com;

import org.junit.BeforeClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class Test {
    private static Logger log = LoggerFactory.getLogger(Test.class);
    @BeforeClass
    public static void init(){
        log.info("GCP_P12_KEYFILE: {}" , System.getenv("GCP_P12_KEYFILE"));
    }
    @org.junit.Test
    public void a () {
        assertTrue(true);
        log.info("GCP_P12_KEYFILE: {}" , System.getenv("GCP_P12_KEYFILE"));
        System.out.println(System.getenv("GCP_P12_KEYFILE"));
    }

}
