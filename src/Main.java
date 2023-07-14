public class Main implements Interface_demo{
    public static void main(String[] args) {
//        Piramid_pattern pi = new Piramid_pattern();
//        pi.pattern();
        Interface_demo m = new Main();
        m.add(20,40);
        m.div(30,5);
        m.sub(40,20);
        m.multiply(30,10);
    }

    @Override
    public void add(int num1, int num2) {
        num1=num2+num1;
        System.out.println(num1);
    }

    @Override
    public void multiply(int num1, int num2) {
        num1=num2*num1;
        System.out.println(num1);

    }

    @Override
    public void sub(int num1, int num2) {
        num1=num2-num1;
        System.out.println(num1);

    }

    @Override
    public void div(int num1, int num2) {
        num1=num2/num1;
        System.out.println(num1);
    }
}