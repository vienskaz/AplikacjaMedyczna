import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;


public class APLIKACJAMEDYCZNA
{
    public static void main(String[] args) {
        

        ArrayList<Patient> patientsList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        menu(patientsList, scanner);


        

    }
    public static void addPatients(ArrayList<Patient> patientsList, Scanner scanner) {
        Patient newPatient = new Patient();

        System.out.println("Name: ");
        String name = scanner.nextLine();
        newPatient.setName(name);
    
        System.out.println("Surname: ");
        String surname = scanner.nextLine();
        newPatient.setSurname(surname);

        System.out.println("Sex: ");
        String sex = scanner.nextLine();
        newPatient.setSex(sex);
    
        System.out.println("Age: ");
        int age = Integer.parseInt(scanner.nextLine());
        newPatient.setAge(age);
    
        System.out.println("Weight in kg: ");
        double weight = scanner.nextDouble();
        newPatient.setWeight(weight);

    
        System.out.println("Height in cm: ");
        double height = scanner.nextDouble();
        newPatient.setHeight(height);

    
        System.out.println("Temperature in \u00B0C: ");
        double temperature = scanner.nextDouble();
        newPatient.setTemperature(temperature);

    
        System.out.println("Pulse: ");
        int pulse = scanner.nextInt();
        newPatient.setPulse(pulse);

    
        System.out.println("Systolic Pressure: ");
        int systolicPressure = scanner.nextInt();
        newPatient.setSystolicPressure(systolicPressure);

    
        
        patientsList.add(newPatient);
    
        System.out.println("Patient added successfully!\n");
        menu(patientsList, scanner);
    }
    


        public static void menu(ArrayList<Patient> patientsList, Scanner scanner)
        {
            System.out.println("What do you want to do?");
            System.out.println("To add patient enter 1");
            System.out.println("To delete patient enter 2");
            System.out.println("To check patient enter 3");
            System.out.println("To save all patients into file 4");
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
                System.out.println("Enter 1 to add, enter 2 to go back to menu");
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

            case 3:
             System.out.println("Select patient to check from the list");
                for (int i = 0; i < patientsList.size(); i++) {
                    Patient patient = patientsList.get(i);
                    System.out.println(i + ": " + patient.getName() + " " + patient.getSurname());
                }
                int selectTocheck=Integer.parseInt(scanner.nextLine());
                Patient patientTocheck = patientsList.get(selectTocheck);
                System.out.println("Name:" +patientTocheck.getName());
                System.out.println("Surname: "+patientTocheck.getSurname());
                System.out.println("Sex: "+patientTocheck.getSex());
                System.out.println("Age: "+patientTocheck.getAge());
                System.out.println("Weight: "+patientTocheck.getWeight());
                System.out.println("Height: "+patientTocheck.getHeight());
                System.out.println("Temperature: "+patientTocheck.getTemperature());
                System.out.println("Pulse: "+patientTocheck.getPulse());
                System.out.println("Systolic Pressure: "+patientTocheck.getSystolicPressure());
                patientTocheck.checkBMI();

                case 4:
                String csvFilePath = "data.csv";
                try {
                    FileWriter csvWriter = new FileWriter(csvFilePath);
                    
                    // Write CSV header
                    csvWriter.append("Name,Surname,Sex,Age,Weight,Height,Temperature,Pulse,Systolic Pressure");
                    csvWriter.append("\n");
                
                    // Write patient data
                    for (Patient patient : patientsList) {
                        csvWriter.append(patient.getName()).append(",");
                        csvWriter.append(patient.getSurname()).append(",");
                        csvWriter.append(patient.getSex()).append(",");
                        csvWriter.append(String.valueOf(patient.getAge())).append(",");
                        csvWriter.append(String.valueOf(patient.getWeight())).append(",");
                        csvWriter.append(String.valueOf(patient.getHeight())).append(",");
                        csvWriter.append(String.valueOf(patient.getTemperature())).append(",");
                        csvWriter.append(String.valueOf(patient.getPulse())).append(",");
                        csvWriter.append(String.valueOf(patient.getSystolicPressure()));
                        csvWriter.append("\n");
                    }
                
                    csvWriter.flush();
                    csvWriter.close();
                
                    System.out.println("Patient data has been saved to the CSV file.");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;


            


            default:
            System.out.println("Select option");
            menu(patientsList, scanner);
            break;
        }
        }



}