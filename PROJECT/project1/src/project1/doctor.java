package project1;

import java.util.Scanner;

public class doctor {
	

    String did, dname, specilization, worktime, qualification;
    int droom;
    void new_doctor()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        did = input.nextLine();
        System.out.print("name:-");
        dname = input.nextLine();
        System.out.print("specilization:-");
        specilization = input.nextLine();
        System.out.print("work time:-");
        worktime = input.nextLine();
        System.out.print("qualification:-");
        qualification = input.nextLine();
        System.out.print("room no.:-");
        droom = input.nextInt();
    }
    void doctor_info()
    {
        System.out.println(did +"\t"+ dname +"\t"+ specilization +"\t" + worktime +"\t" + qualification +"\t" + droom);
    }
}


