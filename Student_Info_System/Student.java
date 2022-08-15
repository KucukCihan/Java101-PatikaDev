package OOP_Giris.Student_Info_System;

public class Student {
    // Qualifications
    String name;
    String stuNo;
    int classes;
    Course mat;
    Course physics;
    Course chemistry;
    double average;
    boolean isPass;

    Student(String name, String stuNo, int classes, Course mat, Course physics, Course chemistry) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.physics = physics;
        this.chemistry = chemistry;
        calcAverage();
        this.isPass = false;
    }

    public void addBulkVerbalNote(int verbalMat, int verbalPhysics, int verbalChemistry) {
        if (verbalMat >= 0 && verbalMat <= 100) {
            this.mat.verbalNote = verbalMat;
        }
        if (verbalPhysics >= 0 && verbalPhysics <= 100) {
            this.physics.verbalNote = verbalPhysics;
        }
        if (verbalChemistry >= 0 && verbalChemistry <= 100) {
            this.chemistry.verbalNote = verbalChemistry;
        }
    }

    public void addBulkExamNote(int mat, int physics, int chemistry) {
        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if (physics >= 0 && physics <= 100) {
            this.physics.note = physics;
        }
        if (chemistry >= 0 && chemistry <= 100) {
            this.chemistry.note = chemistry;
        }
    }

    public void isPass() {
        if ( (this.mat.note != 0) && (this.physics.note != 0) && (this.chemistry.note != 0) ) {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama :\t" + this.average);
            if (this.isPass) {
                System.out.println("Sınıfı geçti.");
            } else {
                System.out.println("Sınıfta kaldı.");
            }
        } else {
            System.out.println("Notlar eksik girildi.");
        }
    }

    public void calcAverage() {
        double matAv = (this.mat.note * 0.8) + (this.mat.verbalNote * 0.2);
        double physicsAv = (this.physics.note * 0.7) + (this.physics.verbalNote * 0.3);
        double chemistryAv = (this.chemistry.note * 0.6) + (this.chemistry.verbalNote * 0.4);
        double av = ( (matAv + physicsAv + chemistryAv) / 3);
        this.average = new Double(av).intValue();
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void printNote() {
        System.out.println("*************************");
        System.out.println("Öğrenci : " + this.name);
        System.out.print("Matematik sözlü notu : " + this.mat.verbalNote + " Sınav notu : " + this.mat.note);
        System.out.println(" Sözlü notu : % 20 - Sınav notu : % 80" );
        System.out.print("Fizik sözlü notu : " + this.physics.verbalNote + " Sınav notu : " + this.physics.note);
        System.out.println(" Sözlü notu : % 30 - Sınav notu : % 70" );
        System.out.print("Kimya sözlü notu : " + this.chemistry.verbalNote + " Sınav notu : " + this.chemistry.note);
        System.out.println(" Sözlü notu : % 40 - Sınav notu : % 60" );
    }

}
