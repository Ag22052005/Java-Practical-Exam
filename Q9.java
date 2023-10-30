// import java.util.*;
// class Q9 
// {
//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         String full_name = new String();
//         StringBuilder short_name = new StringBuilder();
//         System.out.println("Enter Your Full Name: ");
//         full_name = sc.nextLine();
//         sc.close();
//         int i=1;
//         short_name.append(full_name.charAt(0) + ".");
//         while(full_name.charAt(i)!=' ')
//         {
//             i++;
//         }
//         i++;
//         short_name.append(full_name.charAt(i) + ".");
//         while(full_name.charAt(i)!=' ')
//         {
//             i++;
//         }
//         i++;
//         short_name.append(full_name.substring(i));
//         System.out.println("\nShort Name:");
//         System.out.println(short_name);
//     }
// }

import java.util.*;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String full_name = new String();
        StringBuilder short_name = new StringBuilder();

        System.out.println("Enter Your Full Name: ");
        full_name = sc.nextLine();
        sc.close();
        int i = 1, j = 0;
        full_name = full_name.trim();
        while (i < full_name.length()-1) {
            if (full_name.charAt(i) == ' ' && full_name.charAt(i+1) != ' ') 
            {
                short_name.append(full_name.charAt(j) + ".");
                j = i + 1;
            }
            i++;
        }
        short_name.append(full_name.substring(j));
        System.out.println("Short Name : ");
        System.out.println(short_name);
    }
}