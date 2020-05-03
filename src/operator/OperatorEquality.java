package operator;

public class OperatorEquality {
    public static void main(String[] args) {
        int i = 7;
        int j = 8;
        System.out.println(i==7); //true
        System.out.println(j==8); //false
        System.out.println(i==j); //false
        System.out.println(i>j); //false
        System.out.println(i<j); //true
        System.out.println(7>8); //false
        System.out.println(7<8); //true
        System.out.println(i!=7); //false
        System.out.println(j!=7); //true
    }
}
