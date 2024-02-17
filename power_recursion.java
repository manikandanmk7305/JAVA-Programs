import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class power_recursion {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,i;
        System.out.println("enter base value:");
        n=in.nextInt();
        System.out.println("enter power value value:");
        i=in.nextInt();
        System.out.println(pow(n,i));
    }
    static int pow(int n,int i){
        if(i<1){
            return 1;
        }
        return n*pow(n,i-1);

            }
}