package Singelton;

/**
 * Created by skynet on 29/04/17.
 */
enum MySingelton {
    SINGLE_INSTANCE; //Specificy only and only one type


    MySingelton() {
        System.out.println("2. Object Created");
    }

    public void doSomething() {
        System.out.println("3. We are doing some Operation");
    }


}

public class EnumBased {

    public static void main(String args[]) {
        System.out.println("1. Main Started");
        MySingelton.SINGLE_INSTANCE.doSomething();

        MySingelton.SINGLE_INSTANCE.doSomething();


    }

}
