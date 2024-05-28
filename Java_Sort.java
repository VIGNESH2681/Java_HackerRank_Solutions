import java.util.*;
class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code
public class Java_Sort
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        // Sort the studentList using a custom comparator
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.getCgpa() != s2.getCgpa()) {
                    // Sort by CGPA in descending order
                    return Double.compare(s2.getCgpa(), s1.getCgpa());
                } else if (!s1.getFname().equals(s2.getFname())) {
                    // If CGPA is the same, sort by name in alphabetical order
                    return s1.getFname().compareTo(s2.getFname());
                } else {
                    // If CGPA and name are the same, sort by ID in ascending order
                    return Integer.compare(s1.getId(), s2.getId());
                }
            }
        });

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}
