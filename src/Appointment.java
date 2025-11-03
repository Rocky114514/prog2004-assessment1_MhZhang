/**
 * Represents a patient appointment with a health professional.
 * This class demonstrates composition, as it "has a" HealthProfessional.
 */
public class Appointment {
    private String patientName;
    private String patientMobile;
    private String timeSlot;
    private HealthProfessional selectedDoctor; // HD 关键点：使用父类引用

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
        // 调用 doctor 对象的 toString() 方法，这里会发生多态
        return "Patient: " + patientName + " (Mobile: " + patientMobile + ")\n" +
                "  Time: " + timeSlot + "\n" +
                "  With: " + selectedDoctor.toString();
    }
}