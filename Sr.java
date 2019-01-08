/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sr;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Sr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of element : ");
        number = sc.nextInt();
        String dates[] = new String[number];
        System.out.println("Enter Dates in DD-MM-YYYY");
        for(int i = 0 ; i < number ; i++)
        {
            Scanner sc1 = new Scanner(System.in);
            dates[i] = sc1.nextLine();
        }
        Arrays.sort(dates, new Comparator<String>() {
            private SimpleDateFormat sdf = new java.text.SimpleDateFormat("DD-MM-YYYY");
            @Override
            public int compare(String o1, String o2) {
                int result = -1;
                try {
                    result = sdf.parse(o1).compareTo(sdf.parse(o2));
                } catch (ParseException ex) {
                    System.out.println(ex);
                }
                return result;
            }
        });
        System.out.println("Afte Sorting : ");
        for (String date : dates) {
            System.out.println(date);
        }
    }
    
}
