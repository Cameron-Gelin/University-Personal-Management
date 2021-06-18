import java.util.Scanner;

public class Project3 {



	public static void main(String[] args) {
		
	       Student student = new Student();
	       Student student2 = new Student();
	       Faculty faculty = new Faculty();
	       Staff staff = new Staff();
		
	       int userinput = 0;
	       
		
	       
	      System.out.println("\t\tWelcome to my Personal Management Program\n\n");
		   System.out.println("Choose one of the options:\n");
	      
	      do{
	    	  
           System.out.println("1- Enter the information of the faculty");
           System.out.println("2- Enter the information of the two students");
           System.out.println("3- Print tuition invoice");
           System.out.println("4- Print faculty information");
           System.out.println("5- Enter the information of the staff member");
           System.out.println("6- Print the information of the staff member");
           System.out.println("7- Exit Program\n");
           System.out.print("\tEnter your selection: ");
           
           Scanner scan = new Scanner(System.in);
           
           if(!scan.hasNextInt()) {
               System.out.println("\nInvalid entry- please try again\n");
               scan.next();
               continue;
               } //if input is not numerical
           
           userinput = scan.nextInt();

           
           if(userinput<=0 || userinput>=8) {
        	  System.out.println("\nInvalid entry- please try again\n");
        	  continue;
           } //if input is not between 1-7
         

           
           if(userinput==1) {
        	   System.out.println("\n  Enter faculty info:");
        	   
        	   System.out.print("\n\t Name of the faculty: ");
        	   scan.nextLine(); //throws away enter key
        	   faculty.setFullName(scan.nextLine()); //saves Name
        	   System.out.print("\n\t ID: ");
        	   faculty.setId(scan.next()); //saves ID
        	   
        	   System.out.print("\n\t Rank: ");
               String rankString = scan.next();
               
               while (rankString.equals("adjunct") == false &&  rankString.equals("Adjunct") == false && rankString.equals("professor") == false && rankString.equals("Professor") == false){
            	   System.out.println("\n\t \""+ rankString +"\" is invalid"); //checks that Rank is adjunct or professor
            	   System.out.print("\n\t Rank: ");
                   rankString = scan.next();}
               
                   faculty.setRank(rankString); //saves Rank

        	   System.out.print("\n\t Department: ");
        	   String department = scan.next();
               String departmentlower = department.toLowerCase();
               while (departmentlower.equals("mathematics") == false &&  departmentlower.equals("engineering") == false && departmentlower.equals("sciences") == false){
                   System.out.println("\t \""+ department +"\" is invalid");
                   System.out.print("\n\t Department: ");
                   department = scan.next();
                   departmentlower = department.toLowerCase();
               };
               
               	faculty.setDepartment(departmentlower); //saves Department
               
        	   System.out.println("\n\t Faculty successfully added!\n\n\n");
} // end of 1
           
           if(userinput==2) {
               
               if((student.getFullName() == null)){
            	   
                   System.out.println("\nEnter student 1 info:");
                   
                   System.out.print("\n\tName of Student: ");
                   scan.nextLine();
                   student.setFullName(scan.nextLine()); //saves name
                   System.out.print("\n\tID: ");
                   student.setId(scan.next()); //saves ID
                   System.out.print("\n\tGpa: ");
                   student.setGpa(scan.nextFloat()); //saves GPA
                   System.out.print("\n\tCredit hours: ");
                   student.setCreditHours(scan.nextInt()); //saves Credit Hours
                   System.out.println("\nThanks!");
              
                   System.out.println("\nEnter student 2 info");
                   
                   System.out.print("\n\tName of Student: ");
                   scan.nextLine();
                   student2.setFullName(scan.nextLine()); //saves second name
                   System.out.print("\n\tID: ");
                   student2.setId(scan.next()); //saves ID
                   System.out.print("\n\tGpa: ");
                   student2.setGpa(scan.nextFloat()); //saves GPA
                   System.out.print("\n\tCredit hours: ");
                   student2.setCreditHours(scan.nextInt()); //saves Credit Hours
                   System.out.println("\nThanks!\n");

               }
               else {
            	   System.out.println("You already have two students filled in. Do you want to update their information?");
                   System.out.println("Yes or No: ");
                   String answer = scan.next();
                   if("Yes".equals(answer)) { 
                       System.out.println("\nEnter student 1 info: ");
                       
                       System.out.print("\n\tName of Student: ");
                       scan.nextLine();
                       student.setFullName(scan.nextLine());
                       System.out.print("\nID: ");
                       student.setId(scan.next());
                       System.out.print("\n\tGpa: ");
                       student.setGpa(scan.nextFloat());
                       System.out.print("\n\tCredit hours: ");
                       student.setCreditHours(scan.nextInt());
                       System.out.println("\nThanks!");
                  
                       System.out.println("\nEnter student 2 info");
                       
                       System.out.print("\n\tName of Student: ");
                       scan.nextLine();
                       student2.setFullName(scan.nextLine());
                       System.out.print("\nID: ");
                       student2.setId(scan.next());
                       System.out.print("\n\tGpa: ");
                       student2.setGpa(scan.nextFloat());
                       System.out.print("\n\tCredit hours: ");
                       student2.setCreditHours(scan.nextInt());
                       System.out.print("\nThanks!\n");

               }
              
               }
              
              
} // end of 2
           
           if((student.getFullName() == null)) {
    		   
    		   System.out.println("\nSorry! No Students entered yet\n");
    		   continue;
    	   }
           
           
           if(userinput==3) {  	   
        	   System.out.print("" + "\n\nWhich student? 1 " +student.getFullName()+ " or 2 " +student2.getFullName()+ " ? ");
        	   int answer=scan.nextInt();
        	   if(answer == 1) {
        		   student.studentInvoice(student); //function for invoice
        	   }
        	   else if(answer == 2){
        		   student2.studentInvoice(student2); //function for invoice

        	   }
        	   
        	   
        	   
} // end of 3
           
           if(userinput==4) {
        	   
        	   		if((faculty.getFullName() == null)) {
        		   
        		   System.out.println("\nSorry! No Faculty member entered yet\n");
        		   continue;
        	   }
        	   
        	   System.out.println("\n---------------------------------------------------------------------------");
        	   System.out.println(""+faculty.getFullName()+" \t "+faculty.id+" \n"+faculty.getDepartment()+" department, "+faculty.rank+"");
               System.out.println("\n---------------------------------------------------------------------------");
} // end of 4
           
           if(userinput==5) {
        	
        	   System.out.print("\n\t Name of the staff member: ");
        	   scan.nextLine(); //throws away enter key
        	   staff.setFullName(scan.nextLine());
        	   System.out.print("\n\t ID: ");
        	   staff.setId(scan.next()); //saves ID
        	   

               
        	   System.out.print("\n\t Department: ");
        	   String department = scan.next();
               String departmentlower = department.toLowerCase();
               while (departmentlower.equals("mathematics") == false &&  departmentlower.equals("engineering") == false && departmentlower.equals("sciences") == false){
                   System.out.println("\t\t \""+ department +"\" is invalid");
                   System.out.print("\n\t Department: ");
                   department = scan.next();
                   departmentlower = department.toLowerCase();
                   
               }; //loop to check if department entered is valid
               
               staff.setDepartment(departmentlower); //saves Department
                   
            	   System.out.print("\n\t Status, Enter P for Part Time or Enter F for Full Time: ");
                   String statusString = scan.next();
               
               while (statusString.equals("p") == false &&  statusString.equals("P") == false && statusString.equals("f") == false && statusString.equals("F") == false){
            	   System.out.println("\t\t \""+ statusString +"\" is invalid"); //checks that Status is P or F
            	   System.out.print("\n\t Status, Enter P for Part Time or Enter F for Full Time: ");
                   statusString = scan.next();}
               
                   staff.setStatus(statusString); //saves Rank
                   
                   System.out.println("\n\t Staff member added!\n\n\n");

}; // end of 5
           
           if(userinput==6) {
        	   
        	   if((staff.getFullName() == null)) {
        		   
        		   System.out.println("\nSorry! No Staff member entered yet\n");
        		   continue;
        	   }
        	   
        	   System.out.println("---------------------------------------------------------------------------");
        	   System.out.print(""+staff.getFullName()+" \t "+staff.id+" \n"+staff.getDepartment()+" department, ");
        	   
        	   String statusString=staff.getStatus();;
			if(statusString.equals("p") || statusString.equals("P")){
				System.out.println("Part Time");
        	   };
        	   
        	if(statusString.equals("f") || statusString.equals("F")){
   				System.out.println("Full Time");
           	   };
            
           	   System.out.println("---------------------------------------------------------------------------");
           	   
        	
} // end of 6
           
} // end of do loop
	      while(userinput!= 7);
	      
	      System.out.println("\n\n\n\nGoodbye!");
	      
} // end of main

} // The end of Project1


class Faculty {

	   String fullName;
	   String id;
	   String department;
	   String rank;
	   
	   public String getFullName() {
		   return fullName;
	   }
	   
	   public void setFullName(String fullName) {
		   this.fullName = fullName;
	   }
	   
	   public String getId() {
	       return id;
	   }
	   
	   public void setId(String id) {
	       this.id = id;
	   }
	   
	   public String getDepartment() {
	       return department;
	   }
	   public void setDepartment(String department) {
	       this.department = department;
	   }
	   
	   public String getRank() {
	       return rank;
	   }
	   public void setRank(String rank) {
	       this.rank = rank;
	   }
	   
	}


class Student {
	    String fullName;
	    String id;
	   float gpa;
	   int creditHours;
	   
	   public String getFullName() {
	       return fullName;
	   }
	   public void setFullName(String fullName) {
	       this.fullName = fullName;
	   }
	   public String getId() {
	       return id;
	   }
	   public  void setId(String id) {
	       this.id = id;
	   }
	   public float getGpa() {
	       return gpa;
	   }
	   public void setGpa(float gpa) {
	       this.gpa = gpa;
	   }
	   public int getCreditHours() {
	       return creditHours;
	   }
	   public void setCreditHours(int creditHours) {
	       this.creditHours = creditHours;
	   }
	   
	   public void studentInvoice(Student student) {
	       
	       System.out.println("---------------------------------------------------------------------------");

	         
	       System.out.print(""+student.fullName);
	       System.out.println("\t\t"+ student.id);
	       System.out.println("Credit hours: "+student.creditHours+ " ($236.45/credit hour)");
	       System.out.println("Fees: $52");
	           
	       if(student.getGpa() >= 3.85) {
	          
	           System.out.println("Total payment (after discount): $"+((float) (((236.45*student.getCreditHours()+52)*.85))));
	       } else {
	           System.out.println("Total payment (after discount): $"+((float) 236.45*student.getCreditHours()+52));
	       }
	       
	       System.out.println("---------------------------------------------------------------------------");
	              
	      
	   }

}


class Staff {
	String fullName;
	String id;
	String department;
	String status;
	
	   public String getFullName() {
		   return fullName;
	   }
	   
	   public void setFullName(String fullName) {
		   this.fullName = fullName;
	   }
	   
	   public String getId() {
	       return id;
	   }
	   
	   public void setId(String id) {
	       this.id = id;
	   }
	   
	   public String getDepartment() {
	       return ("" + department);
	   }
	   public void setDepartment(String department) {
	       this.department = department;
	   }
	   
	   public String getStatus() {
	       return status;
	   }
	   public void setStatus(String status) {
	       this.status = status;
	   }
};
