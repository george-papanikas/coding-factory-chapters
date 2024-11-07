package gr.aueb.cf.ch8;

import java.util.Optional;

public class OptionalApp {

    public static void main(String[] args) {
        //Optional method
        String c = "AUEB";
        String copied = null;

        Optional<String> strr = getStrCopy(c);

        if (strr.isPresent()) { // αν δεν ειναι null
            copied = strr.get(); // η get φέρνει μέσα από το Optional αυτό το String
        }

        System.out.println(copied);

        // ενναλλακτικά του παραπάνω μπορώ να γράψω str.ifPresent(System.out::println); θα το δούμε σε επόμενα κεφάλαια

        // getCopy method
        String s = null;
        String str = getCopy(s);
//        if (str.equals("AUEB")) null pointer exception
        if ((str != null) && (str.equals("AUEB"))) {
            System.out.println(str);
        }
    }

    public static String getCopy(String s) {
        return s;
    }

    public static Optional<String> getStrCopy(String s) {
//        return Optional.of(s);το of μετατρέπει στον τύπο που είναι στα αριστερά (σε Optional στη προκειμένη)
        if (s == null) return Optional.empty();
        return Optional.of(s);
//        εναλλακτικά μπορεί να γίνει με το return Optional.ofNullable(s); // το ofNullable μπορεί να κουβαλάει και nulls
    }
}
