import java.util.ArrayList;
import java.util.Scanner;

public class APLIKACJAMEDYCZNA
{
    public static void main(String[] args) {
        

        ArrayList<Patient> patients = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
       

        addPatients(patients, scanner);

    }
     public static void addPatients(ArrayList<Patient> patientsList, Scanner scanner)
        {
            System.out.println("Name: ");
            String name = scanner.nextLine();

            System.out.println("Surname: ");
            String surname = scanner.nextLine();

            System.out.println("Is the patient a man? (true/false): ");
            boolean isMan = scanner.nextBoolean();
            scanner.nextLine();

            System.out.println("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); 

            System.out.println("Weight: ");
            double weight = scanner.nextDouble();
            scanner.nextLine(); 

            System.out.println("Height: ");
            double height = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Temperature: ");
            double temperature = scanner.nextDouble();
            scanner.nextLine(); 
            System.out.println("Pulse: ");
            int pulse = scanner.nextInt();
            scanner.nextLine(); 

            System.out.println("Systolic Pressure: ");
            int systolicPressure = scanner.nextInt();
            scanner.nextLine();

            Patient newPatient = new Patient(name, surname, isMan, age, weight, height, temperature, pulse, systolicPressure);
            patientsList.add(newPatient);

            System.out.println("Patient added successfully!\n");
        }
}