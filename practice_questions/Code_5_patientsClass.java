/* 5 : Design a Java program for a Patient class with the data members patientName,
patientId, and disease. Use a parameterized constructor to initialize the details of
a patient (P1). Then, use a copy constructor to create another Patient object (P2)
with the same details as the original patient. Display the details of both patient
objects. */

// Ans)

class Patient {
    String patientName, disease;
    int patientId;

    Patient(String name, int id, String d) {
        patientName = name;
        patientId = id;
        disease = d;
    }

    Patient(Patient p) {
        this.patientName = p.patientName;
        this.patientId = p.patientId;
        this.disease = p.disease;
    }

    void displayDetails() {
        System.out.println("\nPatient Details : ");
        System.out.println("Patient Name : " + patientName);
        System.out.println("Patient Id : " + patientId);
        System.out.println("Patient Disease : " + disease);
    }
}


public class Code_5_patientsClass {
    public static void main(String[] args) {
        Patient p1 = new Patient("Balaji",127,"Corona");
        p1.displayDetails();
        Patient p2 = new Patient(p1);
        p2.displayDetails();
    }
}
