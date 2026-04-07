import java.util.Scanner;

public class problemsetfunc {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input a email: ");
		String inp = input.nextLine();


		boolean vaild = true;
		String failreason = "";
		int numIndex = 0;
        String locat = "";
        String locatEnd = "";
		String domainEnd = "";
		String domainUser = "";
		String dotDomainEnd = "";
		int domainEndIndex = 0;
		int numIndexEnd = 0;
        Boolean NormalVaild = false;
        }

        public static String emailvail (String inp) {
            boolean vaild = true;
            String failreason = "";
            int numIndex = 0;
            String locat = "";
            String locatEnd = "";
            String domainEnd = "";
            String domainUser = "";
            String dotDomainEnd = "";
            int domainEndIndex = 0;
            int numIndexEnd = 0;
            Boolean NormalVaild = false;

            if (!inp.contains("@")) {
                failreason = "missing @";
                return failreason;
            }

            locat = inp.replaceAll("@", inp);
            if (locat.length() == 1) { //index
                vaild = true;
                numIndex = inp.indexOf("@");
            }
            else if((locat.length() >1)) {
                vaild = false;
                failreason = "missing @";
                return failreason;
            }
            else if (locat.length() <= 1){
                failreason = "muplitue @";
                return failreason;
            }
            
             
            
            if ((inp.startsWith(".")) || (inp.endsWith("."))) {
                vaild = false;
                failreason = "starts or ends with dot";
                return failreason;
            }
                                        
            if (inp.contains(" ")){				 
                vaild = false;
                failreason = "contains spaces";
                return failreason;
            }   
                        
            domainUser = (inp.substring(0,numIndex));
            if (domainUser.length() >=64){
                vaild = false;
                failreason = "domain too long";
                return failreason;
            }
            else if ((domainUser.length() < 1)){
                vaild = false;
                failreason = "doamin too short";
                return failreason;
                }
            
            
                
            domainEnd = inp.substring(numIndex);
            if (!domainEnd.contains(".")) { 
                failreason = "domain doesn't contain dot";
                return failreason;
                
            locatEnd = domainEnd.replaceAll(".", domainEnd);  
            if (locatEnd.length() == 1) {
                vaild = true;
                 
            } 
            }   

            numIndexEnd = domainEnd.lastIndexOf(".");
            dotDomainEnd = domainEnd.substring(numIndexEnd+1);
                                        
            if (dotDomainEnd.length() >= 2 && (dotDomainEnd.length()>=6)){
                vaild = true;
            }
            else if ((dotDomainEnd.length() < 2)){
                failreason = "doamin is too short";
                return failreason;

                }
            else if ((dotDomainEnd.length() < 6)){
                failreason = "domain is too long";
                return failreason;

                }
               

            //expections 
            //+ - 
            String domainUserLower = domainUser.toLowerCase()
            if (!domainUserLower.matches("[a-zA-Z0-9._+_]+")){
                failreason = "invaild chacarcters";
            } 

            if (domainEnd.contains("gmail.com") && domainUser.contains(".")) {
                vaild = true;
                NormalVaild = true;
            }
             //output 
            if (vaild == true && NormalVaild){
                System.out.println("Vaild + (Gmail normalized)");
            }
            if (vaild == true){
                System.out.println("vaild");
            }
            else if (vaild == false){
                System.out.println("Invaild" + failreason);
            }
            
               
        }
  

    


        
		

	    //output
        }

}


