import java.beans.Transient;

public class B {


    public static void main(String[] args) throws Exception {
        B  myClass = new B();
        Class c = myClass.getClass();
        System.out.println(c.getMethod("getNum",null).toString());
        System.out.println(c.getDeclaredMethod("setNum",null).toString());



    }
    public Integer getNum(){
        return 2;
    }
    public void setNum(Integer n){

    }






}
