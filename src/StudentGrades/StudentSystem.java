package StudentGrades;

public class StudentSystem {

    public static void main(String[] args) {
        Student andy = new Student("Andy");

        andy.add("Mathematics ", 'C');
        andy.add("English", 'A');
        andy.add("Geography", 'D');
        andy.add("History", 'B');


        System.out.println(andy.getName() + " has a GPF of: " + andy.getGPA());

        System.out.println("Is it obtained from the following subjects: ");
        for(String str : andy.getSubjects()){
            System.out.println(str);
        }
    }
}
