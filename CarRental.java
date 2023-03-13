public class CarRental
{
    // Logan Braun
    //instance variables
    private String make;
    private String model;
    private int year;
    private String licensePlate;

    //constructor
    public CarRental(String make, String model, int year, String licensePlate)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.licensePlate = licensePlate;
    }
    //getter methods
    public String getMake()
    {
        return make;
    }

    public String getModel()
    {
        return model;
    }

    public int getYear()
    {
        return year;
    }

    public String getLicensePlate()
    {
        return licensePlate;
    }
    //mutator methods
    public String rentalCode()
    {
        make = make.toUpperCase();
        model = model.toUpperCase();
        String code = make.substring(0,3) + model.substring(0,3);
        int lastNum = year % 100;
        String lastNumbers = licensePlate.substring(3);
        int lastNumValue = Integer.valueOf(lastNumbers);
        int licenseNum = licensePlate.charAt(0) + licensePlate.charAt(1) + licensePlate.charAt(2) + lastNumValue;
        code += lastNum +"-" + licenseNum;
        return code;
    }

    //NOTE: Do not change this code!!
    public String toString()
    {
        return "The rental code for the " + year + " " + make + " " + model +
                " with a license plate of " + licensePlate + " is " + rentalCode() + ".";
    }
}