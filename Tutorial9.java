

public class Tutorial9 {

    public static void main(String[] args) {
        Student student = new Student("Aung Aung", 50, 60, 70);

        System.out.println("Name : " + student.getName());
        System.out.println("Mark1 : " + student.getMark1());
        System.out.println("Mark2 : " + student.getMark2());
        System.out.println("Mark3 : " + student.getMark3());
        System.out.println("Average : " + student.getAverage());
    }
}