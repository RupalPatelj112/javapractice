public class String_demo {
    public void string_method() {
        String fullname = "Rupal jitendra patel";

        String[] newstr = fullname.split(" ");

        System.out.println(newstr[0]);
        System.out.println(newstr[1]);
        System.out.println(newstr[2]);

        for (int i = fullname.length() - 1; i >= 0; i--) {
            System.out.println(fullname.charAt(i));
        }
    }
}
