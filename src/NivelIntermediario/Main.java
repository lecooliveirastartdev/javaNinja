import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Ninja cadastro = new Ninja("naruto ", "naruto@email.com ", 99999999);
        System.out.println(cadastro);

        NinjaRecord cadastroNinjaRecord = new NinjaRecord("Leco ", "Leco@.com ", 1111111);
        System.out.println(cadastroNinjaRecord);

        Stack<String> ninjStack = new Stack<>();
        ninjStack.add("Naruto Uzumaki");
        ninjStack.push("Sasuke Uchiha");
        ninjStack.push("Sakura haruno");
        System.out.println(ninjStack);
        ninjStack.pop();
        System.out.println(ninjStack);
        System.out.println(ninjStack.size());
        ninjStack.add("LecoOliveira");
        System.out.println(ninjStack.size());

    }

}
