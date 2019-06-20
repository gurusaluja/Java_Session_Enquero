package members;

import java.util.Scanner;

public class Member {
    public int memid;
    //Further implementation is also possibile First name, Middle name, Last name
    public String name = null;
    //Address may save as further Area, Landmark, City
    public String address = null;
    // 0-> Silver (15 Days allowed), 1-> Gold (30 Days allowed), 2-> Premium (45 Days Allowed)
    public byte typeofMember = 0; //by default user added as silver user
    public int noOftransaction=0;

    Member(int id,String name, String address, byte typeofMember){
        this.memid=id;
        this.name =name;
        this.address = address;
        this.typeofMember=typeofMember;
    }
    Member(int id,String name) throws Exception{
        if(address == null)
        {
            throw new Exception("Please enter address");
        }
    }

    public void putDetail() throws Exception
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Member ID ");
        this.memid= scan.nextInt();
        System.out.println("Enter Member Name ");
        this.name= scan.nextLine();
        System.out.println("Enter Member Address ");
        this.address =scan.nextLine();
        System.out.println("Do you assign member as special (y/n) ");
        if(scan.nextLine() == "y")
        {
            upgradeMember();
        }
        scan.close();
    }

    public void getDetail()
    {
        System.out.println("Member Name: " + this.name);
        System.out.println("Member Address: " + this.address);
        String type = (this.typeofMember == 0) ? "Silver" : (this.typeofMember==1) ? "Gold" : (this.typeofMember ==2)? "Premium": "" ;
        System.out.println("Member Type: " + type );
    }

    public void upgradeMember() throws Exception
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Member Type \n1: Silver \n2: Gold \n3:Premium");
        int up=scan.nextInt();
        if(up<=3 && up>=0)
        if(up > eligibilty()){
            System.out.println("Member is not eligible as per transaction\n\n Do you really want to upgrade (y/n): ");
            String con = scan.nextLine();
            if(con == "y"){
                this.typeofMember=(byte) up;
            }
        }
        else
            System.out.println("Invalid Input");

    }

    private int eligibilty()
    {
        if(this.noOftransaction > 30){
            return 1;
        }else if (this.noOftransaction >100){
            return 2;
        }
        return 0;
    }

}
