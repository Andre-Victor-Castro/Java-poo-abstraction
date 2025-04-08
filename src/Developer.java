// Strategic use to decouple code
class Developer extends Employee {
    private double technicalBonus;

    public Developer(String name, double baseSalary, double technicalBonus) {
        super(name, baseSalary);
        this.technicalBonus = technicalBonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + technicalBonus;
    }
}
