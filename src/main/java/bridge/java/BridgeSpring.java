package bridge.java;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

public class BridgeSpring {

    public static void main(String[] args) {
        PlatformTransactionManager tx = new DataSourceTransactionManager();
    }
}
