package project1;

import java.util.Calendar;
import java.util.Scanner;

public class Hospital {
	public static void main(String args[])
    {
        String months[] = {
            "Jan",
            "Feb",
            "Mar",
            "Apr",
            "May",
            "Jun",
            "Jul",
            "Aug",
            "Sep",
            "Oct",
            "Nov",
            "Dec"
        };
        Calendar calendar = Calendar.getInstance();
        //System.out.println("--------------------------------------------------------------------------------");
        int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4;
        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("            *** Hospital Management System ***");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));
        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
        doctor[] d = new doctor[25];
        patient[] p = new patient[100];
        lab[] l = new lab[20];
        fecility[] f = new fecility[20];
        medical[] m = new medical[100];
      
        int i;
        for (i = 0; i < 25; i++)
            d[i] = new doctor();
        for (i = 0; i < 100; i++)
            p[i] = new patient();
        for (i = 0; i < 20; i++)
            l[i] = new lab();
        for (i = 0; i < 20; i++)
            f[i] = new fecility();
        for (i = 0; i < 100; i++)
            m[i] = new medical();
        
        d[0].did = "1";
        d[0].dname = "Dr.Raji";
        d[0].specilization = "ENT";
        d[0].worktime = "5-11AM"; 
        d[0].qualification = "MBBS,MD";
        d[0].droom = 17;
        d[1].did = "2";
        d[1].dname = "Dr.Vikram";
        d[1].specilization = "Physician";
        d[1].worktime = "10-3AM";
        d[1].qualification = "MBBS,MD";
        d[1].droom = 45;
        d[2].did = "17";
        d[2].dname = "Dr.Rekha";
        d[2].specilization = "Surgeon";
        d[2].worktime = "8-2AM";
        d[2].qualification = "BDM";
        d[2].droom = 8;
        d[3].did = "33";
        d[3].dname = "Dr.Pramod";
        d[3].specilization = "Artho";
        d[3].worktime = "10-4PM";
        d[3].qualification = "MBBS,MS";
        d[3].droom = 40;

        p[0].pid = "12";
        p[0].pname = "Praneeth";
        p[0].disease = "fever";
        p[0].sex = "Male";
        p[0].admit_status = "y";
        p[0].age = 30;
        p[1].pid = "13";
        p[1].pname = "Sushma";
        p[1].disease = "Cold";
        p[1].sex = "Female";
        p[1].admit_status = "y";
        p[1].age = 23;
        p[2].pid = "14";
        p[2].pname = "Ashok";
        p[2].disease = "Maleriya";
        p[2].sex = "Male";
        p[2].admit_status = "y";
        p[2].age = 45;
        p[3].pid = "15";
        p[3].pname = "Ravi";
        p[3].disease = "Diabetes";
        p[3].sex = "Mal";
        p[3].admit_status = "y";
        p[3].age = 25;

        m[0].med_name = "Corex";
        m[0].med_comp = "Cino pvt";
        m[0].exp_date = "9-5-16";
        m[0].med_cost = 55;
       
        m[1].med_name = "Nytra";
        m[1].med_comp = "Ace pvt";
        m[1].exp_date = "4-4-15";
        m[1].med_cost = 500;
      
        m[2].med_name = "Brufa";
        m[2].med_comp = "Reckitt";
        m[2].exp_date = "12-7-17";
        m[2].med_cost = 50;
        
        m[3].med_name = "Pride";
        m[3].med_comp = "DDF pvt";
        m[3].exp_date = "12-4-12";
        m[3].med_cost = 1100;
     

        l[0].fecility = "X-ray     ";
        l[0].lab_cost = 800;
        l[1].fecility = "CT Scan   ";
        l[1].lab_cost = 1200;
        l[2].fecility = "OR Scan   ";
        l[2].lab_cost = 500;
        l[3].fecility = "Blood Bank";
        l[3].lab_cost = 50;

        f[0].fec_name = "Ambulance";
        f[1].fec_name = "Admit Facility ";
        f[2].fec_name = "Canteen";
        f[3].fec_name = "Emergency";

       
        
        Scanner sc = new Scanner(System.in);
        int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1 ;
        while (status == 1)
        {
            System.out.println("\n                                    MAIN MENU");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("1.Doctor\n2.Patients\n3.Medicines\n4.Laboratories\n5.Facilities ");
            System.out.println("-----------------------------------------------------------------------------------");
            choice = sc.nextInt();//used to read values
            switch (choice)
            {
                case 1:
                    {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                      **DOCTOR SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        s1 = 1;
                        while (s1 == 1)
                        {
                            System.out.println("1.Add New Entry\n2.Existing Doctors List");
                            c1 = sc.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        d[count1].new_doctor();count1++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id\tName\tSpecilist\ttiming\tQualification\tRoom No.");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count1; j++)
                                        {
                                            d[j].doctor_info();
                                        }
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s1 = sc.nextInt();
                        }
                        break;
                    }
                case 2:
                {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                     **PATIENT SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    s2 = 1;
                    while (s2 == 1)
                    {
                        System.out.println("1.Add New Entry\n2.Existing Patients List");
                        c1 = sc.nextInt();
                        switch (c1)
                        {
                            case 1:
                                {
                                    p[count2].new_patient();count2++;
                                    break;
                                }
                            case 2:
                                {
                                    System.out.println("--------------------------------------------------------------------------------");
                                    System.out.println("id\tName\tDisease \tGender\t\tAdmit Status\t\tAge");
                                    System.out.println("--------------------------------------------------------------------------------");
                                    for (j = 0; j < count2; j++) {
                                        p[j].patient_info();
                                    }
                                    break;
                                }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s2 = sc.nextInt();
                    }
                    break;
                }
            case 3:
                {
                    s3 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                     **MEDICINE SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (s3 == 1)
                    {
                        System.out.println("1.Add New Entry\n2.Existing Medicines List");
                        c1 = sc.nextInt();
                        switch (c1)
                        {
                            case 1:
                                {
                                    m[count3].new_medi();count3++;
                                    break;
                                }
                            case 2:
                                {
                                    System.out.println("--------------------------------------------------------------------------------");
                                    System.out.println("Name \t Company \t ExpiryDate \t Cost");
                                    System.out.println("--------------------------------------------------------------------------------");
                                    for (j = 0; j < count3; j++) {
                                        m[j].medical_info();
                                    }
                                    break;
                                }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s3 = sc.nextInt();
                    }
                    break;
                }
            case 4:
                {
                    s4 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                    **LABORATORY SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (s4 == 1)
                    {
                        System.out.println("1.Add New Entry \n2.Existing Laboratories List");
                        c1 = sc.nextInt();
                        switch (c1)
                        {
                            case 1:
                                {
                                    l[count4].new_feci();count4++;
                                    break;
                                }
                            case 2:
                                {
                                    System.out.println("--------------------------------------------------------------------------------");
                                    System.out.println("Fecilities\t\t Cost");
                                    System.out.println("--------------------------------------------------------------------------------");
                                    for (j = 0; j < count4; j++) {
                                        l[j].feci_list();
                                    }
                                    break;
                                }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s4 = sc.nextInt();
                    }
                    break;
                }
            case 5:
                {
                    s5 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("          **HOSPITAL FECILITY SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (s5 == 1)
                    {
                        System.out.println("1.Add New Fecility\n2.Existing Fecilities List");
                        c1 = sc.nextInt();
                        switch (c1)
                        {
                            case 1:
                                {
                                    f[count5].add_feci();count5++;
                                    break;
                                }
                            case 2:
                                {
                                    System.out.println("--------------------------------------------------------------------------------");
                                    System.out.println("Hospital  Fecility are:");
                                    System.out.println("--------------------------------------------------------------------------------");
                                    for (j = 0; j < count5; j++) {
                                        f[j].show_feci();
                                    }
                                    break;
                                }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s5 = sc.nextInt();
                    }
                    break;
                }
           
            default:
                {
                    System.out.println(" You Have Enter Wrong Choice!!!");
                }
        }
        System.out.println("\nReturn to MAIN MENU Press 1");
        status = sc.nextInt();
    }
            }
        }
     

        
       
