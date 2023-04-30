import java.util.Scanner;
public class Main {
    static int b1_ac = 20, b1_nac = 20, b2_ac = 20, b2_nac = 20, b3_ac = 20, b3_nac = 20, b4_ac = 20, b4_nac = 20, b5_ac = 20, b5_nac = 20, as = 0;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String n = "\n", d = null, b = null, bt = null;
        int nt = 0,nd = 0;
        double f = 0, tf = 0, tdf = 0, ad = 0, p = 0,c = 0;

        System.out.println(n.repeat(100));
        System.out.println("WELCOME TO LUNA TICKETING SYSTEM!\n");
        while(true){
            //DESTINATION
            while(true){
                System.out.println("Please select destination: ");
                System.out.println("[1] Davao:\t\t4 hours 15 mins\t(260km)");
                System.out.println("[2] Pagadian:\t5 hours 7 mins\t(225km)");
                System.out.println("[3] Bayugan:\t7 hours 16 mins\t(216km)");
                System.out.println("[4] Cotabato:\t4 hours 0 mins\t(237km)");
                System.out.println("[5] Kidapawan:\t8 hours 36 mins\t(238km)");
                int d_choice = s.nextInt();
                System.out.println(n.repeat(100));
                if(d_choice == 1){
                    d = "Davao";
                    break;
                }else if(d_choice == 2){
                    d = "Pagadian";
                    break;
                }else if(d_choice == 3){
                    d = "Bayugan";
                    break;
                }else if(d_choice == 4){
                    d = "Cotabato";
                    break;
                }else if(d_choice == 5){
                    d = "Kidapawan";
                    break;
                }else{
                    System.out.print("ERROR: Invalid input, please try again.\n");
                }
            }
            //BUS & BUS TYPE
            while(true){
                System.out.println("TICKET DETAILS");
                System.out.println("Destination: " + d + "\n");
                System.out.println("Please select bus: ");
                System.out.println("[1] Pabama:\t\t\t" + "Seats: AirCon = " + b1_ac + " Non-AirCon = " + b1_nac);
                System.out.println("[2] Rural Transit:\t" + "Seats: AirCon = " + b2_ac + " Non-AirCon = " + b2_nac);

                System.out.println("[3] Bachelor:\t\t" + "Seats: AirCon = " + b3_ac + " Non-AirCon = " + b3_nac);
                System.out.println("[4] Bagong lipunan:\t" + "Seats: AirCon = " + b4_ac + " Non-AirCon = " + b4_nac);
                System.out.println("[5] Super V:\t\t" + "Seats: AirCon = " + b5_ac + " Non-AirCon = " + b5_nac);
                int b_choice = s.nextInt();
                System.out.println(n.repeat(100));
                System.out.println("TICKET DETAILS");
                System.out.println("Destination: " + d + "\n");
                System.out.println("Please select bus type: ");
                System.out.println("[1] AirCon");
                System.out.println("[2] Non-AirCon");
                int bt_choice = s.nextInt();
                System.out.println(n.repeat(100));
                if(b_choice == 1){
                    if(bt_choice == 1){
                        b = "Pabama";
                        bt = "AirCon";
                        as = b1_ac;
                        f = 200.0;
                        if(as == 0){
                            System.out.println("Sorry, this bus has no remaining seats, please select another bus.\n");
                        }else{
                            while(true){
                                System.out.println("TICKET DETAILS");
                                System.out.println("Destination: " + d);
                                System.out.println("Bus: " + b + " - " + bt);
                                System.out.println("Fare: " + f + "\n");
                                System.out.println("How many tickets would you like to purchase? ( 1 - " + as + ")");
                                nt = s.nextInt();
                                System.out.println(n.repeat(100));

                                if(nt > as){
                                    System.out.println("ERROR: This bus only has " + as + " seat/s available, please try again.\n");
                                }else if(nt < 0){
                                    System.out.println("ERROR: A minimum of 1 ticket per purchase, please try again.\n");
                                }else{
                                    as -= nt;
                                    b1_ac = as;
                                    break;
                                }
                            }
                            break;
                        }
                    }else if(bt_choice == 2) {
                        b = "Pabama";
                        bt = "Non-AirCon";
                        as = b1_nac;
                        f = 150.0;
                        if(as == 0){
                            System.out.println("Sorry, this bus has no remaining seats, please select another bus.\n");
                        }else{
                            while(true){
                                System.out.println("TICKET DETAILS");
                                System.out.println("Destination: " + d);
                                System.out.println("Bus: " + b + " - " + bt);
                                System.out.println("Fare: " + f + "\n");
                                System.out.println("How many tickets would you like to purchase? ( 1 - " + as + ")");
                                nt = s.nextInt();
                                System.out.println(n.repeat(100));
                                if(nt > as){
                                    System.out.println("ERROR: This bus only has " + as + " seat/s available, please try again.\n");
                                }else if(nt < 0){
                                    System.out.println("ERROR: A minimum of 1 ticket per purchase, please try again.\n");
                                }else{
                                    as -= nt;
                                    b1_nac = as;
                                    break;
                                }
                            }
                            break;
                        }
                    }else{
                        System.out.println("ERROR (BUS TYPE): Invalid input, please try again.\n");
                    }
                }else if(b_choice == 2){
                    if(bt_choice == 1){
                        b = "Rural Transit";
                        bt = "AirCon";
                        as = b2_ac;
                        f = 250.0;
                        if(as == 0){
                            System.out.println("Sorry, this bus has no remaining seats, please select another bus.\n");
                        }else{
                            while(true){
                                System.out.println("TICKET DETAILS");
                                System.out.println("Destination: " + d);
                                System.out.println("Bus: " + b + " - " + bt);
                                System.out.println("Fare: " + f + "\n");
                                System.out.println("How many tickets would you like to purchase? ( 1 - " + as + ")");
                                nt = s.nextInt();
                                System.out.println(n.repeat(100));

                                if(nt > as){
                                    System.out.println("ERROR: This bus only has " + as + " seat/s available, please try again.\n");
                                }else if(nt < 0){
                                    System.out.println("ERROR: A minimum of 1 ticket per purchase, please try again.\n");
                                }else{
                                    as -= nt;
                                    b2_ac = as;
                                    break;
                                }
                            }
                            break;
                        }
                    }else if(bt_choice == 2) {
                        b = "Rural Transit";
                        bt = "Non-AirCon";
                        as = b2_nac;
                        f = 200.0;
                        if(as == 0){
                            System.out.println("Sorry, this bus has no remaining seats, please select another bus.\n");
                        }else{
                            while(true){
                                System.out.println("TICKET DETAILS");
                                System.out.println("Destination: " + d);
                                System.out.println("Bus: " + b + " - " + bt);
                                System.out.println("Fare: " + f + "\n");
                                System.out.println("How many tickets would you like to purchase? ( 1 - " + as + ")");
                                nt = s.nextInt();
                                System.out.println(n.repeat(100));

                                if(nt > as){
                                    System.out.println("ERROR: This bus only has " + as + " seat/s available, please try again.\n");
                                }else if(nt < 0){
                                    System.out.println("ERROR: A minimum of 1 ticket per purchase, please try again.\n");
                                }else{
                                    as -= nt;
                                    b2_nac = as;
                                    break;
                                }
                            }
                            break;
                        }
                    }else{
                        System.out.println("ERROR (BUS TYPE): Invalid input, please try again.\n");
                    }
                }else if(b_choice == 3){
                    if(bt_choice == 1){
                        b = "Bachelor";
                        bt = "AirCon";
                        as = b3_ac;
                        f = 300.0;
                        if(as == 0){
                            System.out.println("Sorry, this bus has no remaining seats, please select another bus.\n");
                        }else{
                            while(true){
                                System.out.println("TICKET DETAILS");
                                System.out.println("Destination: " + d);
                                System.out.println("Bus: " + b + " - " + bt);
                                System.out.println("Fare: " + f + "\n");
                                System.out.println("How many tickets would you like to purchase? ( 1 - " + as + ")");
                                nt = s.nextInt();
                                System.out.println(n.repeat(100));

                                if(nt > as){
                                    System.out.println("ERROR: This bus only has " + as + " seat/s available, please try again.\n");
                                }else if(nt < 0){
                                    System.out.println("ERROR: A minimum of 1 ticket per purchase, please try again.\n");
                                }else{
                                    as -= nt;
                                    b3_ac = as;
                                    break;
                                }
                            }
                            break;
                        }
                    }else if(bt_choice == 2) {
                        b = "Bachelor";
                        bt = "Non-AirCon";
                        as = b3_nac;
                        f = 250.0;
                        if(as == 0){
                            System.out.println("Sorry, this bus has no remaining seats, please select another bus.\n");
                        }else{
                            while(true){
                                System.out.println("TICKET DETAILS");
                                System.out.println("Destination: " + d);
                                System.out.println("Bus: " + b + " - " + bt);
                                System.out.println("Fare: " + f + "\n");
                                System.out.println("How many tickets would you like to purchase? ( 1 - " + as + ")");
                                nt = s.nextInt();
                                System.out.println(n.repeat(100));

                                if(nt > as){
                                    System.out.println("ERROR: This bus only has " + as + " seat/s available, please try again.\n");
                                }else if(nt < 0){
                                    System.out.println("ERROR: A minimum of 1 ticket per purchase, please try again.\n");
                                }else{
                                    as -= nt;
                                    b3_nac = as;
                                    break;
                                }
                            }
                            break;
                        }
                    }else{
                        System.out.println("ERROR (BUS TYPE): Invalid input, please try again.\n");
                    }
                }else if(b_choice == 4){
                    if(bt_choice == 1){
                        b = "Bagong Lipunan";
                        bt = "AirCon";
                        as = b4_ac;
                        f = 350.0;
                        if(as == 0){
                            System.out.println("Sorry, this bus has no remaining seats, please select another bus.\n");
                        }else{
                            while(true){
                                System.out.println("TICKET DETAILS");
                                System.out.println("Destination: " + d);
                                System.out.println("Bus: " + b + " - " + bt);
                                System.out.println("Fare: " + f + "\n");
                                System.out.println("How many tickets would you like to purchase? ( 1 - " + as + ")");
                                nt = s.nextInt();
                                System.out.println(n.repeat(100));

                                if(nt > as){
                                    System.out.println("ERROR: This bus only has " + as + " seat/s available, please try again.\n");
                                }else if(nt < 0){
                                    System.out.println("ERROR: A minimum of 1 ticket per purchase, please try again.\n");
                                }else{
                                    as -= nt;
                                    b4_ac = as;
                                    break;
                                }
                            }
                            break;
                        }
                    }else if(bt_choice == 2) {
                        b = "Bagong Lipunan";
                        bt = "Non-AirCon";
                        as = b4_nac;
                        f = 300.0;
                        if(as == 0){
                            System.out.println("Sorry, this bus has no remaining seats, please select another bus.\n");
                        }else{
                            while(true){
                                System.out.println("TICKET DETAILS");
                                System.out.println("Destination: " + d);
                                System.out.println("Bus: " + b + " - " + bt);
                                System.out.println("Fare: " + f + "\n");
                                System.out.println("How many tickets would you like to purchase? ( 1 - " + as + ")");
                                nt = s.nextInt();
                                System.out.println(n.repeat(100));

                                if(nt > as){
                                    System.out.println("ERROR: This bus only has " + as + " seat/s available, please try again.\n");
                                }else if(nt < 0){
                                    System.out.println("ERROR: A minimum of 1 ticket per purchase, please try again.\n");
                                }else{
                                    as -= nt;
                                    b4_nac = as;
                                    break;
                                }
                            }
                            break;
                        }
                    }else{
                        System.out.println("ERROR (BUS TYPE): Invalid input, please try again.\n");
                    }
                }else if(b_choice == 5){
                    if(bt_choice == 1){
                        b = "Super Five";
                        bt = "AirCon";
                        as = b5_ac;
                        f = 400.0;
                        if(as == 0){
                            System.out.println("Sorry, this bus has no remaining seats, please select another bus.\n");
                        }else{
                            while(true){
                                System.out.println("TICKET DETAILS");
                                System.out.println("Destination: " + d);
                                System.out.println("Bus: " + b + " - " + bt);
                                System.out.println("Fare: " + f + "\n");
                                System.out.println("How many tickets would you like to purchase? ( 1 - " + as + ")");
                                nt = s.nextInt();
                                System.out.println(n.repeat(100));

                                if(nt > as){
                                    System.out.println("ERROR: This bus only has " + as + " seat/s available, please try again.\n");
                                }else if(nt < 0){
                                    System.out.println("ERROR: A minimum of 1 ticket per purchase, please try again.\n");
                                }else{
                                    as -= nt;
                                    b5_ac = as;
                                    break;
                                }
                            }
                            break;
                        }
                    }else if(bt_choice == 2) {
                        b = "Super Five";
                        bt = "Non-AirCon";
                        as = b5_nac;
                        f = 350.0;
                        if(as == 0){
                            System.out.println("Sorry, this bus has no remaining seats, please select another bus.\n");
                        }else{
                            while(true){
                                System.out.println("TICKET DETAILS");
                                System.out.println("Destination: " + d);
                                System.out.println("Bus: " + b + " - " + bt);
                                System.out.println("Fare: " + f + "\n");
                                System.out.println("How many tickets would you like to purchase? ( 1 - " + as + ")");
                                nt = s.nextInt();
                                System.out.println(n.repeat(100));

                                if(nt > as){
                                    System.out.println("ERROR: This bus only has " + as + " seat/s available, please try again.\n");
                                }else if(nt < 0){
                                    System.out.println("ERROR: A minimum of 1 ticket per purchase, please try again.\n");
                                }else{
                                    as -= nt;
                                    b5_nac = as;
                                    break;
                                }
                            }
                            break;
                        }
                    }else{
                        System.out.println("ERROR (BUS TYPE): Invalid input, please try again.\n");
                    }
                }else if(b_choice > 5 || b_choice <= 0){
                    if(bt_choice > 5 || bt_choice <= 0){
                        System.out.println("ERROR (BUS/BUS TYPE): Invalid input, please try again.\n");
                    }else{
                        System.out.println("ERROR (BUS): Invalid input, please try again.\n");
                    }
                }else{
                    break;
                }
            }
            //DISCOUNT
            while(true){
                System.out.println("TICKET DETAILS");
                System.out.println("Destination: " + d);
                System.out.println("Bus: " + b + " - " + bt);
                System.out.println("Fare: " + f);
                System.out.println("Number of tickets: " + nt + "\n");
                System.out.println("STUDENT/PWD/SENIOR CITIZEN HAVE 20% DISCOUNT.");
                System.out.println("How many persons are eligible for discount?");
                nd = s.nextInt();
                System.out.println(n.repeat(100));
                if(nd > nt){
                    System.out.println("ERROR: There are only " + nt + " ticket/s purchased, please try again.\n");
                }else if(nd < 0){
                    System.out.println("ERROR: Invalid input, please try again.\n");
                }else{
                    break;
                }
            }
            //PAYMENT LOOP
            while(true){
                tf = f * nt;
                ad = nd * f * 0.2;
                tdf = tf - ad;
                if(nd == 0){
                    while(true){
                        System.out.println("TICKET DETAILS");
                        System.out.println("Destination: " + d);
                        System.out.println("Bus: " + b + " - " + bt);
                        System.out.println("Fare: " + f);
                        System.out.println("Number of tickets: " + nt);
                        System.out.println("Total fare: Php " + tf + "\n");
                        System.out.println("Enter payment: ");
                        p = s.nextDouble();
                        System.out.println(n.repeat(100));
                        if(p < 1){
                            System.out.println("ERROR: Payment can't be less than 1, please try again.\n");
                        }else if(p < tf){
                            System.out.println("ERROR: Not enough amount, please try again.\n");
                        }else if(p == tf){
                            System.out.println("TICKET DETAILS");
                            System.out.println("Destination: " + d);
                            System.out.println("Bus: " + b + " - " + bt);
                            System.out.println("Fare: " + f);
                            System.out.println("Number of tickets: " + nt);
                            System.out.println("Total fare: Php " + tf);
                            System.out.println("Payment: Php " + p);
                            System.out.println("\nThank you for paying the exact amount!");
                            break;
                        }else if(p > tf){
                            c = p - tf;
                            System.out.println("TICKET DETAILS");
                            System.out.println("Destination: " + d);
                            System.out.println("Bus: " + b + " - " + bt);
                            System.out.println("Fare: " + f);
                            System.out.println("Number of tickets: " + nt);
                            System.out.println("Total fare: Php " + tf);
                            System.out.println("Payment: Php " + p);
                            System.out.println("Change: Php " + c);
                        }else{
                            break;
                        }
                    }
                }else if(nd >= 1){
                    while(true){
                        System.out.println("TICKET DETAILS");
                        System.out.println("Destination: " + d);
                        System.out.println("Bus: " + b + " - " + bt);
                        System.out.println("Fare: " + f);
                        System.out.println("Number of tickets: " + nt);
                        System.out.println("Number of discounted tickets: " + nd);
                        System.out.println("Total fare: Php " + tf);
                        System.out.println("Discount amount: Php " + ad);
                        System.out.println("Total discounted fare: Php " + tdf + "\n");
                        System.out.println("Enter payment: ");
                        p = s.nextDouble();
                        System.out.println(n.repeat(100));
                        if(p < 1){
                            System.out.println("ERROR: Payment can't be less than 1, please try again.\n");
                        }else if(p < tdf){
                            System.out.println("ERROR: Not enough amount, please try again.\n");
                        }else if(p == tdf){
                            System.out.println("TICKET DETAILS");
                            System.out.println("Destination: " + d);
                            System.out.println("Bus: " + b + " - " + bt);
                            System.out.println("Fare: " + f);
                            System.out.println("Number of tickets: " + nt);
                            System.out.println("Number of discounted tickets: " + nd);
                            System.out.println("Total discounted fare: Php " + tdf);
                            System.out.println("Payment: Php " + p);
                            System.out.println("\nThank you for paying the exact amount!");
                            break;
                        }else if(p > tdf){
                            c = p - tdf;
                            System.out.println("TICKET DETAILS");
                            System.out.println("Destination: " + d);
                            System.out.println("Bus: " + b + " - " + bt);
                            System.out.println("Fare: " + f);
                            System.out.println("Number of tickets: " + nt);
                            System.out.println("Number of discounted tickets: " + nd);
                            System.out.println("Total discounted fare: Php " + tdf);
                            System.out.println("Payment: Php " + p);
                            System.out.println("Change: Php " + c);
                            break;
                        }
                    }
                }else{
                    break;
                }
                break;
            }
            while(true){
                System.out.println("\nEnter 1 to continue: ");
                int loop = s.nextInt();
                System.out.println(n.repeat(100));
                if(loop == 1){
                    break;
                }else{
                    System.out.println("ERROR: Invalid input, please try again.\n");
                }
            }
            while(true){
                if(nd == 0){
                    System.out.println("\nTICKET DETAILS");
                    System.out.println("Destination: " + d);
                    System.out.println("Bus: " + b);
                    System.out.println("Bus Type: " + bt);
                    System.out.println("Fare: " + f);
                    System.out.println("Number of tickets: " + nt);
                    System.out.println("Total Fare: " + tf + "\n");
                    break;
                }else if(nd >= 1){
                    System.out.println("\nRECIEPT");
                    System.out.println("Destination: " + d);
                    System.out.println("Bus: " + b);
                    System.out.println("Bus Type: " + bt);
                    System.out.println("Fare: " + f);
                    System.out.println("Number of tickets: " + nt);
                    System.out.println("Number of discounted tickets: " + nd);
                    System.out.println("Total Fare: " + tf);
                    System.out.println("Discount amount: " + ad);
                    System.out.println("Total discounted Fare: " + tdf + "\n");
                    break;
                }
            }
            while(true){
                System.out.println("Would you like to make another transaction?");
                System.out.println("[1] Yes");
                System.out.println("[2] No");
                int loop = s.nextInt();
                System.out.println(n.repeat(100));
                if(loop == 1){
                    break;
                }else if(loop == 2){
                    System.out.println("Thank you, have a safe trip.");
                    System.exit(0);
                }else{
                    System.out.println("ERROR: Invalid input, please try again.");
                }
            }
        }
    }
}