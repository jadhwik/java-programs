import java.util.*;

interface stringUtils {
    String revString();

    String isPallindrome();
}

class stringImp implements stringUtils {
    String str;

    public stringImp(String str) {
        this.str = str;
    }

    public String revString() {
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);

        }
        return rev;

    }

    public String isPallindrome() {
        String rev = "";
        String st = str.toLowerCase();
        for (int i = st.length() - 1; i >= 0; i--) {
            rev += st.charAt(i);
        }
        if (st.equals(rev)) {
            return "The string " + str + " is pallindrome";
        } else {
            return "string " + str + " is not pallindrome";
        }
    }
}

public class StringInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string for start the actions:");

        String st = sc.nextLine();

        stringImp obj = new stringImp(st);
        System.out.println("the reversed string is  " + obj.revString());
        System.out.println(obj.isPallindrome());

    }

}
