/**

        * File: Unit 3 problem set
        * Author: Raymond Shen
        * Date Created: March 31, 2026
        * Date Last Modified: April 7, 2026

*/

import java.util.Scanner;

public class ProblemSet {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input a email: ");
		String inp = input.nextLine();

        emailvailiton(inp);
        }

        public static void emailvailiton (String inp) {
            //declearing 
            boolean vaild = true;
            int numIndex = 0;
            String locatEnd = "";
            String domainEnd = "";
            String domainUser = "";
            String dotDomainEnd = "";
            int numIndexEnd = 0;
            Boolean NormalVaild = false;

            //restrictions 
            if (!inp.contains("@")) {
                System.out.println("Invalid: Missing @");
                return;
            }

            if (inp.indexOf('@') != inp.lastIndexOf('@')) {
                System.out.println("Invalid: Multiple @");
                return;
            }
      
            numIndex = inp.indexOf("@");           
            
            if ((inp.startsWith(".")) || (inp.endsWith("."))) {
                vaild = false;
                System.out.println("Invaild: starts or ends with dot");
                return;
            }
                                        
            if (inp.contains(" ")){				 
                vaild = false;
                System.out.println( "Invaild: contains spaces");
                return;
            }   
                        
            domainUser = (inp.substring(0,numIndex));
            if (domainUser.length() > 64) {
                vaild = false;
                System.out.println( "Invaild: domain too long");
                return ;
            }
            else if ((domainUser.length() < 1)){
                vaild = false;
                System.out.println( "Invaild: doamin too short");
                return ;
                }      
                
            domainEnd = inp.substring(numIndex);
            if (!domainEnd.contains(".")) { 
                System.out.println( "Invaild: domain doesn't contain dot");
                return;
            }
            locatEnd = domainEnd.replaceAll(".", domainEnd);  
            if (locatEnd.length() == 1) {
                vaild = true;
                  
            }   
            numIndexEnd = domainEnd.lastIndexOf(".");
            dotDomainEnd = domainEnd.substring(numIndexEnd+1);
                                        
            if (dotDomainEnd.length() >= 2 && (dotDomainEnd.length()>=6)){
                vaild = true;
            }
            else if ((dotDomainEnd.length() < 2)){
                System.out.println( "Invaild: extentsion is too short");
                return;

                }
            else if ((dotDomainEnd.length() > 6)){
                System.out.println( "Invaild: extenstion is too long");
                return;

                }
               
            //expections 
            //+ - 
            if (domainUser.contains("+") && domainUser.contains("_")) {
                System.out.println( "Invaild chacarcters");
                return;
            } 

            if (domainEnd.contains("gmail.com") && domainEnd.contains(".")) {
                vaild = true;
                NormalVaild = true;
            }

             //output 
            if (vaild == true && NormalVaild==true){
                System.out.println("Vaild + (Gmail normalized)");
            }
            if (vaild == true){
                System.out.println("Vaild");
            }
          
            }
            
               
        }




