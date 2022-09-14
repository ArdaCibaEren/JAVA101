public class Employee {
    String name;
    double salary;
    double newSalary;
    int workHours;
    int hireYear;
    double vergi;
    double bonus;
    double salaryRaise;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.newSalary = newSalary;
    }

    public void tax() {
        if (this.salary > 1000) {
            this.vergi = (this.salary * 0.03);
        } else {
            this.vergi = 0;
        }
    }

    public void bonus() {
        int extraHours;
        if (this.workHours > 40) {
            extraHours = this.workHours - 40;
            this.bonus = extraHours * 30;
        } else {
            this.bonus = 0;
        }
    }

    public void raiseSalary() {
        if (this.hireYear < 10) {
            this.salaryRaise = this.salary * 0.05;
            this.newSalary += (this.salary * 0.05);
        } else if (this.hireYear < 20) {
            this.salaryRaise = this.salary * 0.10;
            this.newSalary += (this.salary * 0.10);
        } else {
            this.salaryRaise = this.salary * 0.15;
            this.newSalary += (this.salary * 0.15);
        }
    }

    public String toString() {

        System.out.println("Adı : \t" + this.name);
        System.out.println("Maaşı : \t" + this.salary);
        System.out.println("Çalışma Saati : \t" + this.workHours);
        System.out.println("Başlangıç Yılı : \t" + this.hireYear);
        System.out.println("Vergi : \t" + this.vergi);
        System.out.println("Bonus : \t" + this.bonus);
        System.out.println("Maaş Artışı : \t" + this.salaryRaise);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : \t" + ((this.salary) + (this.bonus - this.vergi)));
        System.out.println("Toplam maaş : \t" + ((this.salary + this.salaryRaise)));
        return null;
    }
}