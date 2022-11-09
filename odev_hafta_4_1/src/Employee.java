public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    int bouns;
    int year;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.bouns = 0;
        this.year = 2021;
    }

    double tax()
    {
        if (this.salary > 1000) {

            return this.salary * 0.03;
        }
            return this.salary;
    }
    double bonus()
    {
        if (this.workHours > 40)
        {
            this.bouns = (this.workHours % 40) * 30;
            return this.bouns;
        }
        return this.bouns;
    }

    double raiseSalary()
    {
        if ((this.year - hireYear) < 10)
        {
            return this.salary * 0.5;
        }else if (((this.year - hireYear) > 9) && ((this.year - hireYear) < 20))
        {
            return this.salary * 0.10;
        }
        else if (((this.year - this.hireYear) > 19))
        {
            return this.salary * 0.15;
        }
        return this.salary;
    }

    void printEmployee() {
        System.out.println("------------------------------");
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi  : " + tax());
        System.out.println("bonus  : " + bonus());
        System.out.println("Maaş Artışı  : " + raiseSalary());
        System.out.println("Maaş Artışı  : " + (this.salary + (bonus() - tax())));
        System.out.println("Toplam Maaş : " + (salary + raiseSalary()));

    }

}
