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




     /* Scanner inp = new Scanner(System.in);
        double salary, workHours, hireYear;
        String name;
            System.out.println("Çalışanın Adı-Soyadı:");
            name = inp.nextLine();
            System.out.println("Çalışanın Maaşı:");
            salary = inp.nextDouble();
            System.out.println("Haftalık Çalışma Saati:");
            workHours = inp.nextDouble();
            System.out.println("İşe Giriş Tarihi");
            hireYear = inp.nextDouble();
            System.out.println("   ---Çalışanın Bilgileri---  ");
            System.out.println();
            System.out.println("Çalışanın Adı-Soyadı:   " + name);
            System.out.println("Çalışanın Maaşı:    " + salary);
            System.out.println("Haftalık Çalışma Saati:     " + workHours);
            System.out.println("İşe Giriş Tarihi:    " + hireYear);
            toString(salary, workHours, hireYear);
        }*/

           /* tax(salary);
            bonus(workHours);
            raiseSalary(hireYear, salary);
            */






        /*double salary,workHours,hireYear,vergi=0,bonusucret=0,raiseSalary,zam=1,vergilitoplammaas,Toplammaas;
        String name;
        System.out.println("Çalışanın adı-soyadı:");
        name= inp.nextLine();
        System.out.println("Çalışanın maaşı:");
        salary= inp.nextDouble();
        System.out.println("Haftalık çalışma saati:");
        workHours= inp.nextDouble();
        System.out.println("İşe giriş tarhi");
        hireYear= inp.nextDouble();


        //tax() maaşa uygulanan vergi=0;

        if (salary<1000){
            System.out.println("vergi yok"+vergi);
        }else if (salary>1000) {
            vergi=salary*0.03;
        }

        System.out.println(vergi);
        //bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.

        if (workHours>40){
            bonusucret=(workHours-40)*30;
        }
        System.out.println(bonusucret);
        //raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
        //Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
        //Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
        //Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.

        if (Math.abs(hireYear-2021)<10){
            zam*=salary*0.05;
            raiseSalary=zam+salary;
        } else if (Math.abs(hireYear-2021)>9 && Math.abs(hireYear-2021)<20 ) {
            zam*=salary*0.1;
            raiseSalary=zam+salary;
        } else if (Math.abs(hireYear-2021)>19) {
            zam*=salary*0.15;
            raiseSalary=zam+salary;
        }
        System.out.println(zam);

        //Toplam maaş: çalışanın kendi maaşı+ bonus
        //Vergi ve bonuslarla birlikte maaş için: vergi, bonus ve çalışanın kendi maaşı ile bulunacak.

        Toplammaas=salary+bonusucret;
        System.out.println(Toplammaas);
        vergilitoplammaas=salary+bonusucret+vergi;
        System.out.println(vergilitoplammaas);

         */


