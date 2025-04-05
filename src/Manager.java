class Manager extends Employee {
    private double managementBonus;

    public Manager(String name, double baseSalary, double managementBonus) {
        super(name, baseSalary);
        this.managementBonus = managementBonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + managementBonus + (getBaseSalary() * 0.1);
    }
}