package com.gurusaluja;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*
---------------------------------------------------| Section 1 |---------------------------------------------------------
        #############################################
        #########  Sum of 10 Number by user #########
        #############################################


        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

//        while(true) {
        while(counter < 10) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
               int number = scanner.nextInt();
               counter++;
               sum += number;
//               if(counter == 10) {
//                   break;
//               }
            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine(); // handle end of line (enter key)
        }

        System.out.println("sum = " + sum);
        scanner.close();
---------------------------------------------------| Section 1 End |------------------------------------------------------
*/


/*
---------------------------------------------------| Section 2 |---------------------------------------------------------
        #############################################################
        #########  User Input and Calculate sum adn avg     #########
        #############################################################

        InputCalculator obj = new InputCalculator();

        InputCalculator.inputThenPrintSumAndAverage();

---------------------------------------------------| Section 2 End |-----------------------------------------------------
*/

/*
---------------------------------------------------| Section 3 |---------------------------------------------------------
        ####################################
        #########   Overloading    #########
        ####################################

        B obj = new B();

        A obj = new B();      // same as above in case of static -> init -> constructor
---------------------------------------------------| Section 3 End |-----------------------------------------------------
*/
/*
---------------------------------------------------| Section 4 |---------------------------------------------------------
        ####################################
        #########  Overloading     #########
        ####################################

        Overloading o =new Overloading();
        o.add();
        o.add(5,7);
        System.out.println(o.add(5.6f,5.7f));
        System.out.println(o.add(5.6f,6.6f));
        System.out.println(o.add(5,6,6,7,8,9));
        System.out.println(o.add(5,78f,6f,9f));
---------------------------------------------------| Section 4 End |-----------------------------------------------------
 */

/*
---------------------------------------------------| Section 5 |---------------------------------------------------------
        ####################################
        #########  Overriding     #########
        ####################################

        System.out.println("---------------------------------------------------");
        BB o =new BB();
        o.fun();            //overriding method
        o.parfun();         // Parent method which is AA
        o.childfun();       // child method which is BB
        System.out.println(o.a);
        System.out.println("---------------------------------------------------\n\n");

        System.out.println("---------------------------------------------------");
        AA ob = new AA();
        ob.fun1();                          //overriding method
        ob.parfun();                        //Parent method
        System.out.println(ob.a);           //parent method
        System.out.println(ob.a == ob.b);   //checking short and int has same but range is different
        System.out.println("---------------------------------------------------\n\n");

        System.out.println("---------------------------------------------------");
        AA obj = new BB();
        obj.fun1();                         //overriding method
        obj.parfun();                       //Parent method through child instance
        //obj.childfun();                   //child method is not possible through parent class
        System.out.println(obj.a);          //calling only parent data member
        System.out.println(obj.a == obj.b); //
        System.out.println("---------------------------------------------------\n\n");
---------------------------------------------------| Section 5 End |-----------------------------------------------------
*/

/*
---------------------------------------------------| Section 6 |---------------------------------------------------------
        ############################################################
        #########   Exception and User Define Exception    #########
        ############################################################
 */
        try
        {
            Scanner scan = new Scanner(System.in);
            UserException obj =new UserException();
            int x=scan.nextInt();
            int y=scan.nextInt();
            System.out.println(obj.addNumber(x,y));
        }catch(NumberFormatException e)
        {
            System.out.println("Number Format Exception");
        }
        catch(NullPointerException e)
        {
            System.out.println("Null pointer Exception");
        }
        catch(Exception e)
        {
            System.out.println("Exception");
        }

        //##################################   User Define Exception  #####################################
        try
        {
            throw new UserDefineException();
        }catch(UserDefineException e)
        {
            System.out.println("User Define Exception");
        }

//---------------------------------------------------| Section 6 End |-----------------------------------------------------



    }
}
