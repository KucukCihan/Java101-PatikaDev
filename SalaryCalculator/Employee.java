package Giris.SalaryCalculator;

public class Employee {
    String fullName;
    int salary;
    int workHours;
    int hireYear;

    public Employee (String fullName, int salary, int workHours, int hireYear) {
        this.fullName = fullName;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (salary >= 1000) {
            return (salary * 0.03);
        } else {
            return 0;
        }
    }

    double bonus() {
        if (workHours >= 40) {
            return ((workHours - 40) * 30);
        } else {
            return 0;
        }
    }

    double raiseSalary() {
        if ((2021 - hireYear) >= 20) {        // Accept that we're in 'Year:2021'
            return (salary * 0.15);
        } else if ((2021 - hireYear) >= 10) {
            return (salary * 0.10);
        } else {
            return (salary * 0.05);
        }
    }

    public void printInfo() {
        System.out.println("--------------------------------------------------");
        System.out.println("Adı ve Soyadı: " + fullName);
        System.out.println("Maaşı: " + salary);
        System.out.println("Haftalık çalışma saati: " + workHours);
        System.out.println("İşe başlama yılı: " + hireYear);
        System.out.println("Vergi miktarı: " + tax());
        System.out.println("Bonus:\t" + bonus());
        System.out.println("Maaş artışı: " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile maaş: " + (salary - tax() + bonus()));
        System.out.println("Toplam maaş: " + (salary - tax() + bonus() + raiseSalary()));
    }

}
