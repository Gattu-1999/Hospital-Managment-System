package project1;

import java.util.Scanner;

public class medical {
	String med_name, med_comp, exp_date;
    int med_cost;
    void new_medi()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("name:-\t");
        med_name = input.nextLine();
        System.out.print("comp:-\t");
        med_comp = input.nextLine();
        System.out.print("exp_date:-\t");
        exp_date = input.nextLine();
        System.out.print("cost:-\t");
        med_cost = input.nextInt();

    }
    void medical_info()
    {
        System.out.println(med_name + "\t" + med_comp + "\t" + exp_date + "\t" + med_cost);
    }
	
		
		
	}

