/**
 * Represents a generic health professional.
 * This class serves as the base for all specific types of health professionals.
 */
public class HealthProfessional {
    private int id;
    private String name;
    private String clinicLocation; // A more specific universal attribute than 'any variable'

    /**
     * Default constructor.
     */
    public HealthProfessional() {
    }

    /**
     * Parameterized constructor to initialize a HealthProfessional object.
     *
     * @param id The unique ID of the professional.
     * @param name The name of the professional.
     * @param clinicLocation The location where the professional works.
     */
    public HealthProfessional(int id, String name, String clinicLocation) {
        this.id = id;
        this.name = name;
        this.clinicLocation = clinicLocation;
    }

    // --- Getters and Setters ---
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClinicLocation() {
        return clinicLocation;
    }

    public void setClinicLocation(String clinicLocation) {
        this.clinicLocation = clinicLocation;
    }

    /**
     * @return A string representation of the HealthProfessional object.
     */
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Location: " + clinicLocation;
    }
}