//by: asayel qaid - ID: 44 - groub7
/*Elysian party program provides many services such as: wedding planning, birthday planning , or graduation planning,...etc.
  The system allows the customer to choose one of the services provided and enter PartDetails */
//Last update: 8:24PM - 23oct
package elysianparty;

import java.util.Scanner;
public class ElysianParty {

    public static void main(String[] args) {
        //variables
        double TotalPrice=0, Discount=0;
        String CustomerName;
        String MobileNumber;
        String Service= "";
        String BookingDay = "";
        String customerEvulation = "";
        
        //Cake variables
        String CakeColor = "", Size = "", Flavor = "", Filling = "", Writing_on_the_cake="",CakePrice="";

        //Decoration variables
        String Location="", DecorationColor="", Coordination="",DecorationPrice=""; 

        //Drink variables
        String DrinkType="", DrinkDetails="",DrinkPrice="";

        //Photographys variables
        int PhotoNumber=0;
        String PhotographysPrice="";

        //Events variables
        String EventDetails="",EventPrice = "";

        //InvitationDesign variables
        String InvitationDesignType = "",InvitationDesignPrice="";
        
        //This variables for check User is Select service 
        boolean cake=false,drinks=false,events=false,invitationDesign=false,photographys=false,decoration=false;
        //
        Scanner input = new Scanner(System.in);//Define a scanner-type variable to take values ​​from the user

        System.out.println("Welcome to Elysian Party^_^");//Show a welcome message
        System.out.println("We offer many services and activities which will help you to make beautiful memories");
        System.out.println("We create, you celebrate!");
        System.out.println("Enter your Name:");//The user is asked to enter his name
        CustomerName = input.nextLine();//Take the entered value
        System.out.println("welcome " +CustomerName+" you have a pretty name(:");
        System.out.println("Enter your MobileNumber(first the country code followed by the full phone number)");//Request to enter the number
        MobileNumber = input.next();//Take the entered value
        System.out.println("Enter the code you got by means of an SMS message");
        input.next();
        //select day of BookingDay 
        int dayChoose;//Define a variable of type int for 
        do {
            showMenuDay();//Call the method to display a set of instructions to the user on the consol
            dayChoose = input.nextInt();//Take the selected values
            switch (dayChoose) {//Define the entered value
                case 1://
                   BookingDay = "Saturday";
                    break;
                case 2:
                    BookingDay = "Sunday";
                    break;
                case 3:
                   BookingDay = "Monday";
                    break;
                case 4:
                    BookingDay = "Tuesday";
                    break;
                case 5:
                    BookingDay = "Wednesday";
                    break;
                case 6:
                    BookingDay = "Thursday";
                    break;
                case 7:
                    BookingDay = "Friday";
                    break;
                default://If a value is chosen that is not in the instructions
                    System.out.println("______________________\n");
                    System.out.println("You Enter Wrong Choose");//We show a message to the user: You have entered a wrong choice
                    System.out.println("_______________________");
                    dayChoose = 8;// day=8 to continues of loop 
                    break;
            }
        } while (dayChoose == 8);//The loop continues if the value of the  day equal  8 

        //select Party Type
        int serviceChoose;//Define a variable of type int for  selected choose 
        do {
            showMenuType();//call the method, Show 4 choose in consol 
            serviceChoose = input.nextInt();//
            switch (serviceChoose) {//Select the entered value
                case 1:
                    Service = "Birthdays";//If the number is one, the type of party is a birthday
                    break;//Pause and go to Post-Switch Execution
                case 2:
                    Service = "Kids Parties";
                    break;
                case 3:
                    Service = "Engagement or marriage";
                    break;
                case 4:
                    Service = "Graduation Parties";
                    break;

                default://If the user enters a value that is not in the instructions
                    System.out.println("______________________\n");
                    System.out.println("You Enter Wrong Choose");
                    System.out.println("______________________\n");
                    serviceChoose = 5;
                    break;
            }

        } while (serviceChoose == 5);//The loop continues if the value of the option is five (meaning the list appears again for the user)

        //Service Details Informations
        int serviceDetails;//Here we know a variable that takes the value in order to determine the type of service chosen
        do {

            showMenuServiceDetails();//Display the list of services for the user in the console
            serviceDetails = input.nextInt();//take the value that enterd by user 

            switch (serviceDetails) {//Select the type of service chosen
                //Cake,Decoration,Drinks,Photographys,Events,InvitationDesign
                case 1:
                    cake=true;
                    System.out.println("****************************************");
                    System.out.println("Service Cake Information");
                    System.out.println("****************************************");
                    System.out.println(" Enter Cake Color: ");//color entry request
                    CakeColor = input.next();//Take the value and add it to the variable Color
                    System.out.println(" Enter Cake Size Number(inch): ");//Cake Size entry request
                Size = input.next();//Take the value and add it to the variable Size 
                    System.out.println(" Enter Cake Flavor:");//Flavor entry request 
                  Flavor = input.next();//اTake the value and add it to the variable Flavor
                    System.out.println("Do You Want Cake Filling? Enter Your Choose\n 1-Yes added 20RAS to Price\n 2-No");//Offer to the user, does he want a filling or not?
                int isfill = input.nextInt();//Take the value that enterd by user
                    if (isfill == 1) {// if the user is enter yes 

                        System.out.println("Enter Cake Filling Details: ");//Enter the filling details
                        Filling = input.next();//take the details thet entered by user
                        TotalPrice += 270;//Cake with filling is equal 270(250+20)
                        CakePrice="270";
                    } else {
                        Filling = " ";//No Details for filln
                         TotalPrice += 250;//Price of Cake Service is equal 250
                          CakePrice="250";
                    }
                   
                   
                    System.out.println("Enter the words you want to write on the cake: ");//Request to enter the sentence you write on the cake
                    Writing_on_the_cake = input.next();//اtake the value that entered by user 
               
                case 2:
                    //Decoration
                    decoration=true;
                    int loc;//Variable for Location selected
                    System.out.println("****************************************");
                    System.out.println("Service Decoration Information");//
                    System.out.println("****************************************");
                    System.out.println("Select Location from the  following:");
                    System.out.println("1-Garden");//Choose one 
                    System.out.println("2-Chalet");//Choose tow
                    System.out.println("3-Home");//Choose three
                    System.out.print(" > Enter your choice:  ");//choose entry request for user
                    loc = input.nextInt();//Tacke the value that enterd by user 
                    switch (loc) {//Define the entered value
                        case 1:
                            Location = "Garden";//If it is one, it means that the Location is in the garden
                            break;
                        case 2:
                            Location = "Chalet";//If it is 2, it means that the Location is in the Chalet
                            break;
                        case 3:
                          Location = "Home";//If it is 3, it means that the location is in the home
                            break;

                    }
                    //
                    int CoordinationChoose;//Decoration Coordination
                    System.out.println("Select Coordination from the  following:");//Request to choose one of the following options
                    System.out.println("1-Childish");//childish Coordination
                    System.out.println("2-Official");//formal Coordination
                    System.out.println("3-Delightful");//Delightful Coordination
                    System.out.print(" > Enter your choice:  ");

                    CoordinationChoose = input.nextInt();

                    switch (CoordinationChoose) {
                        case 1:
                            Coordination = "Childish";
                            break;
                        case 2:
                            Coordination = "Official";
                            break;
                        case 3:
                            Coordination = "Delightful";
                            break;
                    }
                    //
                    System.out.println(" Enter Color of decoration:  ");
                    DecorationColor = input.next();
                    TotalPrice+= 700;//price of decoration Service
                    DecorationPrice="700";
                    break;

                case 3:
                    //String Type, Details;
                    drinks=true;
                    System.out.println("****************************************");
                    System.out.println("Service Drinks Information");
                    System.out.println("****************************************");
                    System.out.println(" > Enter Drink Type (Hot or Cool or both): ");
                    DrinkType = input.next();
                    System.out.println(" > Enter Drink Details: ");
                    DrinkDetails = input.next();
                    TotalPrice+= 300;
                    DrinkPrice="300";
                    break;

                case 4:
                    photographys=true;
                    System.out.println("****************************************");
                    System.out.println("Service Photographys Information");
                    System.out.println("****************************************");
                    //PhotoNumber
                    int photoNumberChoose;
                    do {
                        System.out.println("Select one of the following");
                        System.out.println("1- 5  photos :45SAR");
                        System.out.println("2- 10 photos :75SAR");
                        System.out.println("3- 20 photos :125SAR");
                        System.out.println("4- 40 photos :220SAR");
                        System.out.print(" > Enter your choice:  ");
                        photoNumberChoose = input.nextInt();
                        switch (photoNumberChoose) {
                            case 1:
                               PhotoNumber = 5;
                                TotalPrice+= 45;
                                PhotographysPrice="45";
                                break;
                            case 2:
                               PhotoNumber = 10;
                                TotalPrice+=75;
                                PhotographysPrice="75";
                                break;
                            case 3:
                                PhotoNumber = 20;
                                 TotalPrice+=125;
                                 PhotographysPrice="125";
                                break;
                            case 4:
                               PhotoNumber = 40;
                                 TotalPrice+= 220;
                                 PhotographysPrice="220";
                                break;
                            default:
                                System.out.println("___________________________________________________\n");
                                System.out.println(" You Enter Wrong choice please enter correct choice ");
                                System.out.println("___________________________________________________");

                                photoNumberChoose = 5;
                                break;
                        }
                    } while (photoNumberChoose == 5);
                    break;

                case 5:
                    events=true;
                    System.out.println("****************************************");
                    System.out.println("Service Events Information");
                    System.out.println("****************************************");
                   
                    int eventTypeChoose;
                    do {
                        System.out.println("Select one of the following");
                        System.out.println("1- Face Painting :35SAR");
                        System.out.println("2- Cartoon Characters :350SAR");
                        System.out.println("3- Food Turk, team games and creative games :750SAR");
                        System.out.print(" > Enter your choice:  ");
                        eventTypeChoose = input.nextInt();

                        switch (eventTypeChoose) {
                            case 1:
                              EventDetails = "Face Painting";
                                TotalPrice += 35;
                                EventPrice="35";
                                break;
                            case 2:
                                EventDetails = "Cartoon Characters";
                                TotalPrice += 350;
                                EventPrice="350";
                                break;
                            case 3:
                                EventDetails = "Food Turk, team games and creative games";
                                TotalPrice += 750;
                                EventPrice="750";
                                break;

                            default:
                                System.out.println("__________________________________________________\n");
                                System.out.println("You Enter Wrong choice please enter correct choice");
                                System.out.println("___________________________________________________");
                                eventTypeChoose = 4;
                                break;
                        }
                    } while (eventTypeChoose == 4);
                    break;

                case 6:
                    //Invitation Design
                    invitationDesign=true;
                    System.out.println("****************************************");
                    System.out.println("Service Invitation Design Information");
                    System.out.println("****************************************");
                    //Create and initialization object of InvitationDesign Service
                    int designTypeChoose;

                    do {
                        System.out.println("Select one of the following");//Show options of InvitationDesign to select on of them
                        System.out.println("1- Photo :50SAR");
                        System.out.println("2- Video :250SAR");
                        System.out.print(" > Enter your choice:  ");
                        designTypeChoose = input.nextInt();

                        switch (designTypeChoose) {//
                            case 1://if value selected is one that mean is photo  
                                InvitationDesignType = "Photo";
                                TotalPrice += 50;
                                InvitationDesignPrice="50";
                                break;
                            case 2://if value selected is tow that mean is video 
                                InvitationDesignType = "Video";
                                TotalPrice += 250;
                                InvitationDesignPrice="250";
                                break;

                            default://if value selected is not in option .
                                System.out.println("__________________________________________________\n");
                                System.out.println("You Enter Wrong choice please enter correct choice");
                                System.out.println("__________________________________________________");
                                designTypeChoose = 3;
                                break;
                        }
                    } while (designTypeChoose == 3);//if the user enterd number not in options value 
                    break;

            }

        } while (serviceDetails != 7);//Service Details End

        //in this code Take coupon and calcuate Totalprice
        String coupon;//Declare Coupon for use it in discount
        System.out.println("Please Enter Your Coupon: !Pay attention to the letters whether they are capital or small!");//Request to enter Coupon
        coupon = input.next();//Take Value that entered by user
        if (coupon.equals("student")) {//if coupon is student the discount is 15%
            Discount = TotalPrice * 0.15;

        } else if (coupon.equals("curlIT")) {//if coupon is curlIT the discount is 10%
            Discount = TotalPrice * 0.10;
        }

        //Take Customer Evulation for Services
        int evulation; 
  do {  
        System.out.println("Please  evaluating the quality of services, using the scale (1-5) stars as the following: ");
        System.out.println("1 star  → strongly unsatisfied *_*");
        System.out.println("2 stars → unsatisfied -_-");
        System.out.println("3 stars → satisfied ~_~");
        System.out.println("4 stars → strongly satisfied +_+");
        System.out.println("5 stars → outstanding ^_^");
        System.out.print(" > Enter your choice:  ");
        evulation = input.nextInt();
        
              switch (evulation)  {
            
              case 1: //When evaluating the user 1 star
                   customerEvulation = "strongly unsatisfied";
        System.out.println("we regret that, Tell us how we can improve by sharing your thoughts\nyou will get reimbursed with a discount coupon 40% for your next party");
        input.next();
              break;
          
              case 2 : //When evaluating the user 2 stars
                  customerEvulation = "unsatisfied";
        System.out.println("we regret that, Tell us how we can improve by sharing your thoughts\nyou will get reimbursed with a discount coupon 40% for your next party");  
        input.next();
              break; 
        
             case 3: //When evaluating the user 3 stars
                  customerEvulation = "satisfied";
        System.out.println("we regret that, Tell us how we can improve by sharing your thoughts\nyou will get reimbursed with a discount coupon 40% for your next party");
        input.next();
             break;
        
             case 4: //When evaluating the user 4 stars
           customerEvulation = "strongly satisfied";
        System.out.println("we regret that, Tell us how we can improve by sharing your thoughts\\nyou will get reimbursed with a discount coupon 40% for your next party");
        input.next();
             break;
        
            case 5: //When evaluating the user 5 stars
            customerEvulation = "outstanding";
        System.out.println("We enjoy it! Our utmost goal is to ensure customer satisfaction and provide the best quality of services\nTell us about your experience with our suggestions");
        input.next(); 
            break; 
        
        default:
              System.out.println("__________________________________________________\n");
              System.out.println("You Enter Wrong choice please enter correct choice");  
              System.out.println("__________________________________________________");
             evulation = 6;
             break;
        }
            
   } while (evulation ==6 );
        
  
        //Show Customer receipt 
        System.out.println("\n**********************************************************");
        System.out.println("Customer receipt Information");
        System.out.println("**********************************************************");
        System.out.println("Customer Name:" +CustomerName+ "\t Mobile Number:" +MobileNumber+ "\t Party Type:" +Service+ "\t Booking day:" +BookingDay);
        if (cake) {
            System.out.println("\nCake Service Details\n  Cake Color:" +CakeColor+ "\n  Cake Size:" +Size
                    + "\n  Cake Filling: " +Filling+ "\n  Cake Flavor Details: " +Flavor+ "\n  Cake Writing word :" +Writing_on_the_cake+ "\n  Cake Price:" +CakePrice);
        }
        if (drinks ) {

            System.out.println("\nDrinks Service Details\n  " +  "Drinks Details:" +DrinkDetails+ "\n  Drink Type:" +DrinkType+ "\n  Drinks Service price:" + DrinkPrice);
        }
        if (decoration ) {

            System.out.println("\nDecoration Service Details\n  " +  "Location:" +Location+ "\n  Decoration Coordination:" + Coordination + "\n  Decoration Color:" + DecorationColor + "\n  Decoration Service price:" + DecorationPrice);
        }
        if (photographys ) {

            System.out.println("\nPhotographys Service Details \n  " + "Photo Number:" + PhotoNumber + "\n  Photography Service price:" + PhotographysPrice);
        }
        if (events) {

            System.out.println("\nEvents Service Details \n  " + "Events Details:" + EventDetails + "\n  Events Service price:" + EventPrice);
        }

        if (invitationDesign) {

            System.out.println("\nInvitationDesign Service Details \n  " + "InvitationDesign Type:" + InvitationDesignType + "\n  InvitationDesign Service price:" +InvitationDesignPrice);
        }
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Total Price :" +TotalPrice+ " SAR" + "\t  DiscountPrice :" +Discount+ " SAR" + "\t PayPrice :" +CalculatePrice(TotalPrice,Discount) + " SAR");
        System.out.println();

        System.out.println("Customer Evulation : " +customerEvulation);
        System.out.println("********************************************************************");
         System.out.println("Thank you for choosing ElysianParty, Strive to provide the best"); 
    }//End Main Funcation

// Funcations to show the main menus of instractions in consol 
    //this method show options of Partyes type  
    public static void showMenuType() {

        System.out.println("**** Party Menu *****");
        System.out.println("**************************************");
        System.out.println(" | 1.Birthdays               |");//Birthday Party 
        System.out.println(" | 2.Kids Parties            |");
        System.out.println(" | 3.Engagement or marriage  |");
        System.out.println(" | 4.Graduation Parties      |");
        System.out.print(" > Enter your choice:  ");
    }

    ////this method show  options of Days to selected the party day
    public static void showMenuDay() {
        System.out.println("**** Select  PartyDay *****");
        System.out.println("**************************************");
        System.out.println(" | 1.Saturday |");
        System.out.println(" | 2.Sunday   |");
        System.out.println(" | 3.Monday   |");
        System.out.println(" | 4.Tuesday  |");
        System.out.println(" | 5.Wednesday|");
        System.out.println(" | 6.Thursday |");
        System.out.println(" | 7.Friday   |");
        System.out.print(" > Enter your choice:  ");
    }

    //this method show  options of ServiceDetails  to Choose one of the services
    public static void showMenuServiceDetails() {

        System.out.println("**** Select  Service Type *****");
        System.out.println("**************************************");
        System.out.println(" | 1.Cake              |");
        System.out.println(" | 2.Decoration        |");
        System.out.println(" | 3.Drinks            |");
        System.out.println(" | 4.Photographys      |");
        System.out.println(" | 5.Events            |");
        System.out.println(" | 6.Invitation Design |");
        System.out.println(" | 7.Exit              |");
        System.out.print(" > Enter your choice:  ");
    }

    public static double CalculatePrice(double totalprice,double discount) {
        //Sum of all Service if customer not take service the price will be zero
        double total = totalprice;
        if (discount > 0) //if Customer have discount 
        {
        total = totalprice - discount;
        return total;//return totalPrice after substract discount 
        }
        return total;
    }
}
