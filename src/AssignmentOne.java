/**
 * File:       AssignmentOne.java
 * Author:     Minghe Zhang
 * Student ID: 24833060
 * Unit:       PROG2004 Object Oriented Programming
 * Assessment: Assessment 1
 * Date:       07 November 2025
 */
import java.util.ArrayList;
import java.util.Iterator;

public class AssignmentOne {

    public static void main(String[] args) {
        // --- Part 3 - Using classes and objects ---
        System.out.println("// Part 3 - Using classes and objects");

        // Create Doctor Object
        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr. Alice", "Downtown Clinic", true);
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Dr. Bob", "Uptown Medical", false);
        GeneralPractitioner gp3 = new GeneralPractitioner(103, "Dr. Carol", "Suburb Health", true);
        Specialist specialist1 = new Specialist(201, "Dr. David", "City Heart Center", "Cardiology");
        Specialist specialist2 = new Specialist(202, "Dr. Eve", "General Hospital", "Neurology");

        // Print doctor details
        System.out.println("--- Health Professional Details ---");
        System.out.println(gp1);
        System.out.println(gp2);
        System.out.println(gp3);
        System.out.println(specialist1);
        System.out.println(specialist2);

        System.out.println("------------------------------------");


        // --- Part 5 - Collection of appointments ---
        System.out.println("// Part 5 - Collection of appointments");

        // Declare an ArrayList to store appointments
        ArrayList<Appointment> appointments = new ArrayList<>();

        // Demo appointment creation
        System.out.println("\n--- Making Appointments ---");
        createAppointment(appointments, "John Smith", "0411222333", "09:00", gp1);
        createAppointment(appointments, "Jane Doe", "0422333444", "09:30", gp2);
        createAppointment(appointments, "Peter Pan", "0433444555", "10:00", specialist1);
        createAppointment(appointments, "Mary Jane", "0444555666", "11:00", specialist2);
        System.out.println("=> 4 new appointments have been created.");

        // Print existing appointments
        System.out.println("\n--- Printing Existing Appointments (Before Cancel) ---");
        printExistingAppointments(appointments);

        // Demo Cancel Appointment
        System.out.println("\n--- Cancelling an Appointment ---");
        cancelBooking(appointments, "0422333444"); // Cancel Jane Doe's appointment

        // Print the appointment again and display the updated list
        System.out.println("\n--- Printing Existing Appointments (After Cancel) ---");
        printExistingAppointments(appointments);

        // Demo to cancel a non-existent appointment
        System.out.println("\n--- Attempting to Cancel a Non-existent Appointment ---");
        cancelBooking(appointments, "0499999999");

        System.out.println("-------------------------------------------------");
    }

    /**
     * Part 5 Method: Creates a new appointment and adds it to the list.
     * @param appointmentList The list of appointments.
     * @param patientName The patient's name.
     * @param patientMobile The patient's mobile.
     * @param time The appointment time.
     * @param doctor The selected doctor (can be any HealthProfessional).
     */
    public static void createAppointment(ArrayList<Appointment> appointmentList, String patientName, String patientMobile, String time, HealthProfessional doctor) {
        if (patientName == null || patientMobile == null || time == null || doctor == null || patientName.isEmpty() || patientMobile.isEmpty() || time.isEmpty()) {
            System.out.println("Error: All information must be supplied to create an appointment.");
            return;
        }
        Appointment newAppointment = new Appointment(patientName, patientMobile, time, doctor);
        appointmentList.add(newAppointment);
    }

    /**
     * Part 5 Method: Prints all existing appointments in the list.
     * @param appointmentList The list of appointments.
     */
    public static void printExistingAppointments(ArrayList<Appointment> appointmentList) {
        if (appointmentList.isEmpty()) {
            System.out.println("There are no existing appointments.");
            return;
        }
        for (int i = 0; i < appointmentList.size(); i++) {
            System.out.println("\n--- Appointment " + (i + 1) + " ---");
            System.out.println(appointmentList.get(i));
        }
    }

    /**
     * Part 5 Method: Cancels a booking using the patient's mobile number.
     * @param appointmentList The list of appointments.
     * @param patientMobile The mobile number to search for and cancel.
     */
    public static void cancelBooking(ArrayList<Appointment> appointmentList, String patientMobile) {
        boolean found = false;
        Iterator<Appointment> iterator = appointmentList.iterator();
        while (iterator.hasNext()) {
            Appointment currentAppointment = iterator.next();
            if (currentAppointment.getPatientMobile().equals(patientMobile)) {
                iterator.remove(); // safely remove
                found = true;
                System.out.println("Success: Appointment for mobile " + patientMobile + " has been cancelled.");
                break; // Assuming a phone number only has one appointment, you can exit once you find it
            }
        }

        if (!found) {
            System.out.println("Error: No appointment found for mobile " + patientMobile + ".");
        }
    }
}