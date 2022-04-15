import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private List<Command> commands = new ArrayList<Command>();
    public void setCommands(Command cmd) {
        commands.add(cmd);

    }

    //发起命令功能 喊订单来了
    public void orderUp() {
        System.out.println("机器人服务员说有订单了");
        for(Command command : commands) {
            if(command != null) {
                command.execute();
            }

        }
    }
}
