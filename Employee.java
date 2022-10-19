public class Employee {
    double salary;
    int workHours;
    int hireYear;
    String name;
    Employee( String name,double salary, int workHours, int hireYear){

        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
     double tax()
    {
            double vergi = 0;
            if (salary < 1000) {
                vergi=0;
            } else if (salary > 1000) {
                vergi = salary * 0.03;
            }
        return vergi;
    }
     double bonus() {
        double bonusucret = 0;
        if (workHours > 40) {
            bonusucret = (workHours - 40) * 30;
        } else {
            bonusucret=0;
        } return bonusucret;
    }
    double raiseSalary() {
        double zam = 0;
        if (2021 - hireYear < 10) {
            zam = (salary+bonus()+tax()) * 0.05;
        } else if (2021 - hireYear > 9 && 2021 - hireYear < 20){

        zam = (salary+bonus()+tax()) * 0.1;
    } else if(2021-hireYear>19){
        zam = salary * 0.15;
    }
            return zam;
}
    public String toString() {
        System.out.println("    Çalışan Bilgisi     ");
        System.out.println("------------------------------------");
        System.out.println("İsim Soyisim: " + this.name);
        System.out.println("Hangi Yil Başladi: " + this.hireYear);
        System.out.println("Haftada kaç saat calisiyor: " + this.workHours);
        System.out.println("Vergi:  "+tax());
        System.out.println("Bonus:  "+bonus());
        System.out.println("Maaş Artışı(zam):    "+raiseSalary());
        System.out.println("Vergi Ve Bonuslarla Birlikte Maaş:    "+(bonus()+salary-tax()));
        System.out.println("Toplam Maaş:"   +(bonus()+salary+raiseSalary()-tax()));
        System.out.println();
        return super.toString();
    }
    }
    class Main {
        public static void main(String[] args) {
            Employee table1 = new Employee("Ahmet", 5000.0, 50, 1995);
            table1.toString();
            Employee table2 = new Employee("Ayşe", 2000.0, 45, 1985);
            table2.toString();
        }
    }