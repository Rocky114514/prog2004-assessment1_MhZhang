/**
 * Represents a General Practitioner (GP), a specific type of HealthProfessional.
 */
public class GeneralPractitioner extends HealthProfessional {
    private boolean bulkBillingAvailable; // Unique attributes

    /**
     * Default constructor.
     */
    public GeneralPractitioner() {
        super(); // Call the default constructor of the parent class
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
        super(id, name, location); // The constructor of the parent class must be called first
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