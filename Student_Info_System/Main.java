package OOP_Giris.Student_Info_System;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ali Hoca", "05554443322", "MAT");
        Teacher t2 = new Teacher("Mehmet Hoca", "05556667788", "PHY");
        Teacher t3 = new Teacher("İnci Hoca", "05551112233", "CHE");


        Course mat = new Course("Maths", "101", "MAT");
        Course physics = new Course("Physics", "101", "PHY");
        Course chemistry = new Course("Chemistry", "101", "CHE");

        mat.addTeacher(t1);
        mat.printTeacher();

        physics.addTeacher(t2);
        physics.printTeacher();

        chemistry.addTeacher(t3);
        chemistry.printTeacher();

        Student s1 = new Student("Ahmet", "001", 3, mat, physics, chemistry);
        s1.addBulkExamNote(40, 70, 86);
        s1.addBulkVerbalNote(70, 53, 66);
        s1.isPass();

        Student s2 = new Student("Mustafa", "002", 3, mat, physics, chemistry);
        s2.addBulkExamNote(55, 45, 76);
        s2.addBulkVerbalNote(33, 65, 79);
        s2.isPass();

        Student s3 = new Student("İlke", "003", 3, mat, physics, chemistry);
        s3.addBulkExamNote(87, 44, 60);
        s3.addBulkVerbalNote(66, 70, 30);
        s3.isPass();



    }

}
