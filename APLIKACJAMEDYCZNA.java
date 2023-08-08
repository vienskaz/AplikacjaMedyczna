import java.util.ArrayList;
import java.util.Scanner;

public class APLIKACJAMEDYCZNA
{
    public static void main(String[] args) {
        

        ArrayList<Patient> patientsList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        menu(patientsList, scanner);


        

    }
    public static void addPatients(ArrayList<Patient> patientsList, Scanner scanner) {
        System.out.println("Name: ");
        String name = scanner.nextLine();
    
        System.out.println("Surname: ");
        String surname = scanner.nextLine();

        System.out.println("Sex: ");
        String sex = scanner.nextLine();
    
        System.out.println("Age: ");
        int age = Integer.parseInt(scanner.nextLine());
    
        System.out.println("Weight in kg: ");
        double weight = scanner.nextDouble();
    
        System.out.println("Height in cm: ");
        double height = scanner.nextDouble();
    
        System.out.println("Temperature in \u00B0C: ");
        double temperature = scanner.nextDouble();
    
        System.out.println("Pulse: ");
        int pulse = scanner.nextInt();
    
        System.out.println("Systolic Pressure: ");
        int systolicPressure = scanner.nextInt();
    
        Patient newPatient = new Patient(name, surname,sex ,age, weight, height, temperature, pulse, systolicPressure);
        patientsList.add(newPatient);
    
        System.out.println("Patient added successfully!\n");
        System.out.println(newPatient.getName());
        System.out.println(newPatient.getSurname());
        menu(patientsList, scanner);
    }
    


        public static void menu(ArrayList<Patient> patientsList, Scanner scanner)
        {
            System.out.println("What do you want to do?");
            System.out.println("To add patient enter 1");
            System.out.println("To delete patient enter 2");
            System.out.println("To check patient enter 3");
            int select= scanner.nextInt();
            scanner.nextLine();
        
        switch(select)
        {
            case 1:
            addPatients(patientsList, scanner);
            break;
            
            case 2:
            boolean patients_check=patientsList.isEmpty();
            if(patients_check==true)
            {
                System.out.println("You have not patients to delete.");
                System.out.println("Do you want to add one?");
                System.out.println("Enter 1 to add, enter 2 to quit");
                int select_nested= scanner.nextInt();
                switch(select_nested){
                    case 1:
                    addPatients(patientsList, scanner);
                    break;
                    case 2:
                    menu(patientsList, scanner);
                    break;
                }
            break;

            }
            else {
                System.out.println("Select patient to delete from the list");
                for (int i = 0; i < patientsList.size(); i++) {
                    Patient patient = patientsList.get(i);
                    System.out.println(i + ": " + patient.getName() + " " + patient.getSurname());
                }
                int selectToDelete = scanner.nextInt();
                patientsList.remove(selectToDelete);
                System.out.println("Patient added successfully!\n");
            }
            


            default:
            System.out.println("Select option");
            menu(patientsList, scanner);
            break;
        }
        }



}