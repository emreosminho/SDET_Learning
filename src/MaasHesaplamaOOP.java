public class MaasHesaplamaOOP {
    String name;
    int salary;
    int workHours;
    int hireYear;

    MaasHesaplamaOOP(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void tax(){
        if (salary<1000){
            System.out.println("Vergi tabii değil Maas: " + salary);
        } else {
            salary = salary - (salary*3/100);
            System.out.println("Vergiye tabii Maas: " + salary);
        }
    }
    void bonus(){
        if (workHours > 40){
            salary = ((workHours-40)*30) + salary;
            System.out.println("Maas: " + salary);
        } else {
            System.out.println("Fazla Calısma Yok - Maas: " + salary);
        }
    }
    void raiseSalary(){
        if (hireYear>2015){
            salary = salary + (salary*5/100);
            System.out.println("Kıdem yok - Maas: " + salary);
        } else {
            salary = salary + (salary*15/100);
            System.out.println("Kıdem var - Maas: " + salary);
        }
    }
    public static void main(String[] args){
        MaasHesaplamaOOP isci1 = new MaasHesaplamaOOP("Emre", 999, 39,2014);
        isci1.tax();
        isci1.bonus();
        isci1.raiseSalary();
    }
}
