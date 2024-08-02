package august;

public class senior {
    public int countSeniors(String[] details) {
        int count = 0;
        for (int i = 0; i < details.length; i++) {
            String vimal = details[i];
            int ten = vimal.charAt(11);
            int eleven = vimal.charAt(12);
            int age = (ten * 10) + eleven;

            if (age > 60) {
                count = count + 1;
            }

        }
        return count;

    }
}
