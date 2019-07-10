package template;

public class sengMSG extends SendCustom
{
    //add 20190709

    @Override
    public void to() {
        System.out.println("Mark");
    }

    @Override
    public void from() {
        System.out.println("Vincnet");
    }

    @Override
    public void context() {
        System.out.println("hello world");
    }

    @Override
    public void send() {

    }

    public static void main(String[] args) {
        SendCustom sendCustom= new sengMSG();
        sendCustom.sendMessage();
    }
}
