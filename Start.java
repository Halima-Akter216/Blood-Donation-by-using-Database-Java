import java.io.BufferedReader;

import com.blood.doner.DonarD;
import com.blood.doner.Doner;

import java.io.*;

public class Start {
	public static void main(String[] args) throws IOException{
		System.out.println("Welcome to Blood Donar Management App");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Press 1 to Add doner:-");
			System.out.println("Press 2 to Delete doner:-");
			System.out.println("Press 3 to Display doner:-");
			System.out.println("Press 0 to EXIT:-");
			System.out.println("Enter choice=");
			int choice= Integer.parseInt(br.readLine());
			if(choice==1) {
				//add doner
				System.out.println("Enter donar name=");
				String name=br.readLine();
				System.out.println("Enter donar age=");
				int age=Integer.parseInt(br.readLine());
				System.out.println("Enter donar blood group=");
				String group=br.readLine();
				System.out.println("Enter donar gender=");
				String gender=br.readLine();
				//craet donar object
				Doner dr= new Doner(age, name, group, gender);
				boolean ans=DonarD.insertDonertoDB(dr);
				if(ans) {
					System.out.println("donar successfully added....");
					System.out.println("Doner kindly Remember your ID...");
				}
				else {
					System.out.println("Something went wrong....");
				}
				System.out.println(dr);
				
			}
			else if(choice==2) {
				//delete doner
				System.out.println("Enter Doner id to DELETE=");
				int did=Integer.parseInt(br.readLine());
				boolean bool =DonarD.deleteD(did);
				if(bool) {
					System.out.println("Deleted Doner with id="+did);
				}
				else {
					System.out.println("Something went wrong.....try again ('~')");
				}
				
			}
			else if(choice==3) {
				//display doner
				System.out.println("Here is a full donar list//..\\");
				DonarD.showDonar();
			}
			else if(choice==0) {
				System.out.println("Thank you for using our service.....");
				System.out.println("see you soon....");
				break;
			}
			else {
				
			}
			
		}
	}
}
