package ComparingGrades;

public class Comparing {
    public static void main(String[] args){

        Student andy = new Student ("Andy");

        andy.addMarks("English", 63);
        andy.addMarks("History", 98);
        andy.addMarks("Math", 87);
        andy.addMarks("Geography", 34);

        Student bob = new Student("Bob");

        bob.addMarks("English", 24);
        bob.addMarks("History", 54);
        bob.addMarks("Math", 66);
        bob.addMarks("Geography", 87);

        if(andy.compareTo(bob) > 0){
            System.out.println(andy.getName() + " gets a higher total mark!");
        }
        else if(andy.compareTo(bob) < 0){
            System.out.println(bob.getName() + " gets a higher total mark!");
        }
        else{
            System.out.println(andy.getName() + " and " + bob.getName() + " have the same total mark!");
        }
    }
}
