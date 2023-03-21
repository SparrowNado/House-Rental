

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class House {

    private String HouseType ;
    private String RentType;
    private String HouseNumber;
    private  int Deposit;
    private int Rate;

    public  House (String selectHouseType, String selectRentType, String selectHouseNumber,
                  int selectDeposit, int selectRate)

    {
        HouseType = selectHouseType;
        RentType = selectRentType;
        HouseNumber =selectHouseNumber;
        Deposit = selectDeposit;
        Rate = selectRate;

    }

    public String  getHouseType(){
        return HouseType;
    }

    public String getRentType(){
        return  RentType;
    }

    public String getHouseNumber(){
        return HouseNumber;
    }

    public double getDeposit(){
        return  Deposit;
    }

    public int getRate(){
        return Rate;
    }


}



public class HouseRental {

    public static  void main(String [] args){


        List <House> HouseList = new ArrayList<>();
        HouseList.add(new House("Bungalow", "Monthly",
                "345",75000,1));

        HouseList.add(new House("Single-detached 2-story",
                "Monthly","727",150000,2));

        HouseList.add(new House("Single Attached 2-Story","Monthly",
                "865",300000,3));

        HouseList.add(new House("TownHouse",
                "Monthly","745",175000,2));
        HouseList.add(new House("Quadruplex",
                "Monthly","798",145000,3));
        HouseList.add(new House("RowHouse",
                "Monthly","492",45000,1));

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Type of House To Rent: ");

        String HouseType = input.nextLine();

        for ( House s  : HouseList) {

         if (HouseType.equals(s.getHouseType())){
             System.out.println("HouseType :" + HouseType + "Is Available");
             System.out.println("How Many Months Will You Stay ? " );
             int Duration = input.nextInt();

             System.out.println("**********Details**********");

             double cost = (Duration *s.getRate()) + s.getDeposit();

             System.out.println(s.getDeposit()+ "   " + s.getRate());

             System.out.println("Will You Proceed To Rent ? Y/N");

             String decision = input.next();

             if (decision.equals("y")) {

                 System.out.println("Enter Tenant Name : ");

                 String Name = input.next();

                 System.out.println("Enter National ID Number ");
                 int Num = input.nextInt();

                 System.out.println("**********Receipt**********");

//                 System.out.println("Name" +   "  National Id #" + "  HouseType" +  "  HouseNumber" +  "  Duration in Months " +  "  Cost ($)" );
//                 System.out.println(Name + "  " + Num + "  " + HouseType + "   " + s.getHouseNumber() + "   " + Duration + "   " + cost);

                 System.out.println("Name " + Name);
                 System.out.println("National ID #" + Num);
                 System.out.println("House Type :" + HouseType);
                 System.out.println("House Number : " + s.getHouseNumber());
                 System.out.println("Duration In Months " + Duration);
                 System.out.println("Cost " + cost);



                 System.out.println("Ready For Next Transaction ");

             } else if (decision.equals("n")) {

                 System.out.println("Serving Next Customer: ");

             }


         }









         }

        }






    }



