package week2.salarycalculation;

public class Employee {
    // Sabitler
    private static final int STANDARD_WORK_HOURS = 40;
    private static final int BONUS_PER_HOUR = 30;
    private static final int CURRENT_YEAR = 2021;


    // Nitelikler
    private String nameAndSurname;

    private double salary;

    private int workHours;

    private int hireYear ;


    // Değişkenler

    private double tax;

    private double bonus;

    private   double raiseSalary ;

    private double netSalary;

    private double totalSalary;


    // Kurucu Metot

    public Employee(String nameAndSurname, double salary, int workHours, int hireYear) {

        setNameAndSurname(nameAndSurname);

        setSalary(salary);

        setWorkHours(workHours);

        setHireYear(hireYear);


        calculateTax();

        calculateBonus();

        calculateRaiseSalary();

        calculateNetSalary();

        calculateTotalSalary();

    }

    // Metotlar
    void calculateTax(){
        if (salary>=1000)
            this.tax= salary * 0.03;
        else tax = 0;
    }

    void calculateBonus(){
        if (workHours>STANDARD_WORK_HOURS)
            this.bonus = BONUS_PER_HOUR*(workHours-STANDARD_WORK_HOURS);
        else bonus = 0;
    }

    void calculateRaiseSalary(){
        if(CURRENT_YEAR- hireYear < 10)
            this.raiseSalary= salary * 0.05 ;
        else if (10<= (CURRENT_YEAR-hireYear) && (CURRENT_YEAR-hireYear) < 20)
            this.raiseSalary = salary*0.1;
        else
            this.raiseSalary = salary*0.15;
        }

    void calculateNetSalary(){
        this.netSalary = salary + bonus - tax;
    }

    void calculateTotalSalary(){
        this.totalSalary = netSalary + raiseSalary;
    }

    @Override
    public String toString(){

        return  "Adı Soyadı: "+nameAndSurname +
                "\n"+"Maaşı: "+ salary+
                "\n"+"Haftalık Çalışma Saati: "+workHours+
                "\n"+"İşe Giriş Yılı: "+hireYear +
                "\n"+"Vergi: "+ tax+
                "\n"+"Bonus: "+ bonus+
                "\n"+"Maaş Artışı: "+ raiseSalary +
                "\n"+"Vergi ve Bonuslar ile birlikte maaş :"+ netSalary +
                "\n"+"Toplam Maaş: "+ totalSalary+
                "\n";
    }

    // Setterlar Throw new IllegalArgumentException(); satırı Hata mesajı oluşturur.
    public void setNameAndSurname(String nameAndSurname) {

        if (nameAndSurname != null && !nameAndSurname.isEmpty())
            this.nameAndSurname = nameAndSurname;
        else
            throw new IllegalArgumentException("İsim boş olamaz.");
    }

    public void setSalary(double salary) {

        if (salary >= 0) {
            this.salary = salary;
            calculateTax();
            calculateRaiseSalary();
            calculateNetSalary();
            calculateTotalSalary();
        }else {
            throw new IllegalArgumentException("Maaş negatif olamaz.");
        }
    }

    public void setWorkHours(int workHours) {

        if(workHours>=0){
            this.workHours = workHours;
            calculateBonus();
            calculateNetSalary();
            calculateTotalSalary();
        }else {
            throw new IllegalArgumentException("Çalışma saati negatif olamaz.");
        }
    }

    public void setHireYear(int hireYear) {

        if (hireYear>0){
            this.hireYear = hireYear;
            calculateRaiseSalary();
            calculateTotalSalary();

        }
        else {
            throw new IllegalArgumentException("Yıl negatif olamaz.");
        }
    }


    // Getterlar
    public double getTax() {
        return tax;
    }

    public double getBonus() {
        return bonus;
    }

    public double getRaiseSalary() {
        return raiseSalary;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public double getTotalSalary() {
        return totalSalary;
    }
}