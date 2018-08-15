import com.spring.ApplicationContentHolder;
import manager.ServerManager;

public class Main {

    public static void main(String[] args) {
        ServerManager serverManager = ApplicationContentHolder.getExtBean(ServerManager.class);
        serverManager.startServer();
    }
}

