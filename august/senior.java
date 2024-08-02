package august;

public class senior {
    public static void main(String[] args) {
        String[] details = { "1313579440F2036", "2921522980M5644" };
        countSeniors(details);

    }

    public static int countSeniors(String[] details) {
        int count = 0;
        for (int i = 0; i < details.length; i++) {
            String vimal = details[i];
            System.out.println(vimal);
            char ten = vimal.charAt(11);
            System.out.println(ten);
            char eleven = vimal.charAt(12);
            int a = ten - '0';
            int b = eleven - '0';
            // int age = (ten * 10) + eleven ;
            int age = (a * 10) + b;
            System.out.println(eleven);
            System.out.println(age);

            if (age > 60) {
                count = count + 1;
            }

        }
        return count;

    }
}
