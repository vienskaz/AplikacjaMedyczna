import java.util.ArrayList;

public class Patient
{
    String name;
    String surname;
    boolean isMan;
    int age;
    double weight;
    double height;
    double temperature;
    int pulse;
    int systolicPressure;
    
    
    Patient(String name,String surname,boolean  isMan,int age,double weight,double height,double temperature,int pulse,
    int systolicPressure)
    {
        this.name=name;
        this.surname=surname;
        this.isMan=isMan;
        this.weight=weight;
        this.height=height;
        this.temperature=temperature;
        this.pulse=pulse;
        this.systolicPressure=systolicPressure;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public void setSurname(String surname)
    {
        this.surname=surname;
    }

    public void setisMan(boolean isMan)
    {
        this.isMan=isMan;
    }

    public void setWeight(double weight)
    {
        this.weight=weight;
    }

    public void setHeight(double height)
    {
        this.height=height;
    }

    public void setTemperature(double temperature)
    {
        this.temperature=temperature;
    }

    public void setPulse(int pulse)
    {
        this.pulse=pulse;
    }

    public void setSystolicPressure(int systolicPressure)
    {
        this.systolicPressure=systolicPressure;
    }


    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public boolean getisMan()
    {
        return isMan;
    }

    public double getWeight(double weight)
    {
        return weight;
    }

    public double getHeight()
    {
        return height;
    }

    public double getTemperature( )
    {
        return temperature;
    }

    public int getPulse()
    {
        return pulse;
    }

    public int getSystolicPressure()
    {
        return systolicPressure;
    }


    public void checkBMI()
    {
        height=height/100;
        double BMI=weight/(height*height);

        if(isMan==true)
        {
            if(BMI<18.5)
            {
                System.out.println("This patient's BMI is "+BMI+" which stands for underweight");
            }
            else if(BMI>=18.5 && BMI<=24.9 )
            {
                System.out.println("This patient's BMI is "+BMI+" which stands for healty weight");
            }
            else if(BMI>=25 && BMI<=29.9)
            {
                System.out.println("This patient's BMI is "+BMI+" which stands for overweight");
            }
            else
            {
                System.out.println("This patient's BMI is "+BMI+" which stands for obsiety");
            }
        }
        else{
            if(BMI<18.5)
            {
                System.out.println("This patient's BMI is "+BMI+" which stands for underweight");
            }
            else if(BMI>=18.5 && BMI<=24.9 )
            {
                System.out.println("This patient's BMI is "+BMI+" which stands for healty weight");
            }
            else if(BMI>=25 && BMI<=29.9)
            {
                System.out.println("This patient's BMI is "+BMI+" which stands for overweight");
            }
            else
            {
                System.out.println("This patient's BMI is "+BMI+" which stands for obsiety");
            }

        }

        

    }






































}