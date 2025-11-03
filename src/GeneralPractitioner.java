/**
 * Represents a General Practitioner (GP), a specific type of HealthProfessional.
 */
public class GeneralPractitioner extends HealthProfessional {
    private boolean bulkBillingAvailable; // 独特的属性

    /**
     * Default constructor.
     */
    public GeneralPractitioner() {
        super(); // 调用父类的默认构造函数
    }

    /**
     * Parameterized constructor for GeneralPractitioner.
     *
     * @param id The GP's ID.
     * @param name The GP's name.
     * @param location The GP's clinic location.
     * @param bulkBillingAvailable True if bulk billing is available.
     */
    public GeneralPractitioner(int id, String name, String location, boolean bulkBillingAvailable) {
        super(id, name, location); // 必须首先调用父类的构造函数
        this.bulkBillingAvailable = bulkBillingAvailable;
    }

    // Getter and Setter for the unique property
    public boolean isBulkBillingAvailable() {
        return bulkBillingAvailable;
    }

    public void setBulkBillingAvailable(boolean bulkBillingAvailable) {
        this.bulkBillingAvailable = bulkBillingAvailable;
    }

    /**
     * Overridden toString() to include GP-specific information.
     * It calls the parent's toString() method to reuse code.
     * @return A string representation of the GeneralPractitioner.
     */
    @Override
    public String toString() {
        return "[GP] " + super.toString() + ", Bulk Billing: " + (bulkBillingAvailable ? "Yes" : "No");
    }
}