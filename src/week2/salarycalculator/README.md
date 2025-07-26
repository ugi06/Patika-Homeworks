# Employee Salary Calculation

This project includes a Java class that calculates an employee's salary details. The calculations are based on the following rules:

## Features
- **Tax**: If the salary is 1000 TL or more, a 3% tax is applied.
- **Bonus**: If the employee works more than 40 hours per week, a bonus is added (30 TL per extra hour).
- **Raise Salary**: Based on years of service:
    - Less than 10 years: 5% raise
    - Between 10 and 19 years: 10% raise
    - 20 years or more: 15% raise
- **Net Salary**: Salary + Bonus - Tax
- **Total Salary**: Net Salary + Raise

## Technical Details
- The `Employee` class uses a constructor to initialize the object and run all calculations.
- Setter methods include validation. If an invalid value is given, an `IllegalArgumentException` is thrown.
- Each time a value is updated, the related calculations are also updated.
- The `toString()` method is overridden to print all employee details.
- Uses an interface (`SalaryCalculation`) to define salary calculation logic
- Calculates salary based on years of experience

## Structure

- `SalaryCalculation`: Interface with all calculation methods and constants
- `Employee`: Class that holds employee data and implements the interface
- `Main`: to run the code.

```java
Employee ugur = new Employee("Uğur Taşdelen",5000,45,1998);
System.out.println(ugur);

Adı Soyadı: Uğur Taşdelen
Maaşı: 5000.0
Haftalık Çalışma Saati: 45
İşe Giriş Yılı: 1998
Vergi: 150.0
Bonus: 150.0
Maaş Artışı: 750.0
Vergi ve Bonuslar ile birlikte maaş :5000.0
Toplam Maaş: 5750.0
```
###### You can use the class `Main.java` to try it out. I left an example.