/**
 * File:       Appointment.java
 * Author:     Minghe Zhang
 * Student ID: 24833060
 * Unit:       PROG2004 Object Oriented Programming
 * Assessment: Assessment 1
 * Date:       07 November 2025
 */
public class Appointment {
    private String patientName;
    private String patientMobile;
    private String timeSlot;
    private HealthProfessional selectedDoctor; // Use parent class reference

    public Appointment() {
    }

    /**
     * Parameterized constructor for an Appointment.
     *
     * @param patientName The name of the patient.
     * @param patientMobile The mobile number of the patient.
     * @param timeSlot The preferred time for the appointment (e.g., "10:30").
     * @param selectedDoctor The doctor for the appointment (can be a GP or Specialist).
     */
    public Appointment(String patientName, String patientMobile, String timeSlot, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.timeSlot = timeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    // --- Getters --- (Setters can be added if needed)
    public String getPatientName() {
        return patientName;
    }

    public String getPatientMobile() {
        return patientMobile;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public HealthProfessional getSelectedDoctor() {
        return selectedDoctor;
    }

    @Override
    public String toString() {
        // Calling the toString() method of the doctor object will result in polymorphism
        return "Patient: " + patientName + " (Mobile: " + patientMobile + ")\n" +
                "  Time: " + timeSlot + "\n" +
                "  With: " + selectedDoctor.toString();
    }
}