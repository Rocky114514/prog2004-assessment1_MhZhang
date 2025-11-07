/**
 * File:       Specialist.java
 * Author:     Minghe Zhang
 * Student ID: 24833060
 * Unit:       PROG2004 Object Oriented Programming
 * Assessment: Assessment 1
 * Date:       07 November 2025
 */
public class Specialist extends HealthProfessional {
    private String specialty; // Unique attribute: professional field

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