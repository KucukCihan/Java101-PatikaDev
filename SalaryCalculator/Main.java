package Giris.SalaryCalculator;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Çağatay Atay", 2000, 45, 1985);
        Employee e2 = new Employee("Taylan Gürel", 1800, 50, 2012);
        Employee e3 = new Employee("Şafak Gezer", 1600, 35, 2004);

        e1.printInfo();
        e2.printInfo();
        e3.printInfo();
    }

}
