package assegenment;

class EmployeeSalarySystem {
    public static void main(String[] args) {

        // Basic employee details
        double basicSalary = 25000;
        double hra = 5000;
        double da = 3000;
        double tax = 4000;

        int experience = 4;           // years of experience
        boolean isPermanent = true;   // employee type
        int bonus = 2000;

        // 1. Arithmetic Operators
        double grossSalary = basicSalary + hra + da;
        double netSalary = grossSalary - tax;

        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);

        // 2. Relational Operators
        boolean moreThan3Years = experience > 3;
        boolean salaryGreaterThan30000 = netSalary > 30000;

        System.out.println("Experience > 3 years: " + moreThan3Years);
        System.out.println("Net salary > 30000: " + salaryGreaterThan30000);

        // 3. Logical Operators
        boolean permanentAndExperienced = isPermanent && experience > 3;
        boolean permanentOrExperienced = isPermanent || experience > 5;

        System.out.println("Permanent AND >3 years experience: " + permanentAndExperienced);
        System.out.println("Permanent OR >5 years experience: " + permanentOrExperienced);

        // 4. Assignment Operator (compound)
        bonus += 1000;
        System.out.println("Updated Bonus: " + bonus);

        // 5. Unary Operator
        experience++;
        System.out.println("Updated Experience: " + experience);

        // 6. Ternary Operator
        String eligibilityStatus = (netSalary >= 30000) ? "Eligible" : "Not Eligible";
        System.out.println("Eligibility Status: " + eligibilityStatus);
    }
}
