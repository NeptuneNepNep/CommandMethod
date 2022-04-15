public class Client {
    public static void main(String[] args) {
        Order order1 = new Order();
        order1.setDiningTable(1);
        order1.setFood("啤酒",1);
        order1.setFood("面",1);

        Order order2 = new Order();
        order2.setDiningTable(2);
        order2.setFood("白酒",1);
        order2.setFood("米饭",1);

        Senior receiver = new Senior();
        //创建命令对象
        OrderCommand cmd1 = new OrderCommand(receiver,order1);
        OrderCommand cmd2 = new OrderCommand(receiver,order2);
        Waiter invoke = new Waiter();
        invoke.setCommands(cmd1);
        invoke.setCommands(cmd2);

        //调用命令
        invoke.orderUp();
    }
}
