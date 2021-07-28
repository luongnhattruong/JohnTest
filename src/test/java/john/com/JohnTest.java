package john.com;

import org.junit.BeforeClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;

public class JohnTest {
    private static Logger log = LoggerFactory.getLogger(JohnTest.class);
    @BeforeClass
    public static void init(){
        log.info("GCP_P12_KEYFILE: {}" , System.getenv("GCP_P12_KEYFILE"));
    }

    @Test
    public void TestEnv () {
        if(System.getenv("GCP_P12_KEYFILE") == null) {
            fail("GCP_P12_KEYFILE not set");
        }
        fail(System.getenv("GCP_P12_KEYFILE"));
        log.info("GCP_P12_KEYFILE: {}" , System.getenv("GCP_P12_KEYFILE"));
        System.out.println(System.getenv("GCP_P12_KEYFILE"));
    }

}
