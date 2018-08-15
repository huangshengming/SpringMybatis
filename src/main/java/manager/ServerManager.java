package manager;

import common.LogManager;
import component.AccountComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;




@Component
public class ServerManager {

    @Autowired
    private AccountComponent accountComponent;

    public void startServer(){
        String configFile= System.getProperty("user.dir");
        LogManager.initConfig(configFile + "/config/logback.xml");

        accountComponent.testAccount();
        System.out.print("server start success...............hsm");
    }
}
