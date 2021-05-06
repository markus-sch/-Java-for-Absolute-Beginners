public class Arrays {
    public static void main(String[] args) {
        String[] studentNames; // Decalre an array of strings
        studentNames = new String[]{"John", "David", "Henry", "Bob", "Vistor"}; // Array of names
        int[] studentAge = new int[] {29, 25, 42, 31,33}; // Array of Ages
        double[] studentGrade = new double[] {4.0, 3.25, 3.0, 2.9, 3.5};

        String[] studentSubjects new String[5];    // Weitere Art, ein Array zu erzeugen.
        studentSubjects[0] = "Computer Science";
        studentSubjects[1] = "Sociology";
        studentSubjects[2] = "History";
        studentSubjects[3] = "Biology";
        studentSubjects[4] = "English";
        studentSubjects[5] = "Physics";     // Dies hier ist nicht mehr gültig, weil es das sechste Element ist.


        System.out.println(studentNames[0]);
        System.out.println(studentNames[2]);
        System.out.println(studentNames[4]);
        System.out.println(studentAge[1]);
        System.out.println(studentAge[4]);
        System.out.println(studentGrade[3]);

    }
}
