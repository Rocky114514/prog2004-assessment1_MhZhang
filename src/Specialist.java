/**
 * Represents a Specialist, another specific type of HealthProfessional.
 */
public class Specialist extends HealthProfessional {
    private String specialty; // 独特的属性：专业领域

    public Specialist() {
        super();
    }

    /**
     * Parameterized constructor for Specialist.
     *
     * @param id The Specialist's ID.
     * @param name The Specialist's name.
     * @param location The Specialist's clinic location.
     * @param specialty The medical specialty of this doctor.
     */
    public Specialist(int id, String name, String location, String specialty) {
        super(id, name, location);
        this.specialty = specialty;
    }

    // Getter and Setter
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    /**
     * Overridden toString() to include Specialist-specific information.
     * @return A string representation of the Specialist.
     */
    @Override
    public String toString() {
        return "[Specialist] " + super.toString() + ", Specialty: " + specialty;
    }
}