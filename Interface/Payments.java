package Interface;

interface pp {
    boolean payProcess(double amount);

    boolean refProcess(double amount);
}

class card implements pp {
    public boolean payProcess(double amount) {
        if (amount <= 0) {
            System.out.println("The amount " + amount + "  is not sufficient for the payment");

            return false;
        } else {
            System.out.println("The amount " + amount + "scuccesfully credited");
            return true;
        }
    }

    public boolean refProcess(double amount) {
        if (amount <= 0) {
            System.out.println("The amount " + amount + "  can't refund");

            return false;
        } else {
            System.out.println("The amount " + amount + "scuccesfully refunded");
            return true;
        }
    }
}

public class Payments {
    public static void main(String[] args) {

        card obj = new card();

        System.out.println(obj.payProcess(100.0));
    }

}
