import java.util.ArrayList;

class WithObject{
    public static void main(String[] args) {
        int sum = 0;
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(46);
        a.add(23);

        for (Object e : a) {
            sum += (int)e;
        }
        System.out.println("Sum = "+sum);
    }
}