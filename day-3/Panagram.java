import java.util.*;

class Panagram {
    static boolean checkPanagram(String s) {
        s = s.toLowerCase(); // Convert to lowercase once
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (s.indexOf(ch) == -1) {
                return false; // If any letter is not found, it's not a pangram
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine(); // Read the full line
        if (checkPanagram(str)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
