import java.util.*;

public class page4_about_Operators_and_BIT_Manipulation_Explained {
    // Power Sets using BIT Manipulation
    static ArrayList<String> subsets(String s) {
        int n = s.length();
        ArrayList<String> ans = new ArrayList<String>();
        for (int num = 0; num < (1 << n); num++) {
            String subsString = "";
            for (int i = 0; i < n; i++) {
                if ((num & (1 << i)) != 0) {
                    subsString += s.charAt(i);
                }
            }
            if (subsString.length() > 0) {
                ans.add(subsString);
            }
        }
        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * // Lets Write our code here
         * //operators (notes bhi bana lena bhai)
         * int a = 4;
         * a += 3; // += ka matlab ki usme add bhi karo aur assign bhi karo
         * System.out.println(a);
         * System.out.println(7==8); // comparison operators h ==,<=,<,>,>=
         * System.out.println(8==8 && 91<9); // condition/comparison operators h &&
         * (dono ko true hona hoga)
         * System.out.println(8==0 || 91>9); // logical operators h || (koi ek true hona
         * chahiye)
         * 
         * // arithmetic operators cannot work with booleans
         * // % operator can work with floats and doubles data types ***
         * 
         * // example of last statement marked ***
         * System.out.println(4.2 % 2.2); // *** decimal remainder bhi dega
         * 
         * // precedence & associativity -> jo bada hoga wo pehle evaluate hoga
         * float b = 20*4-18/9;
         * System.out.println(b);
         * float c = 20/4-18*9;
         * System.out.println(c);
         * 
         * 
         */
        // all codes are commented out now
        /*
         * // Increment or Decrement Operators
         * int i = 5;
         * 
         * System.out.println(i++); // pehle i print kar diya fir same variable me
         * increment karke store kiya
         * System.out.println(i); // incremented i (new i) ko print kar diya
         * System.out.println(++i); // pehle increment kiya h fir print hua h
         * System.out.println(i); // yahan last i ka operation ke baad jo value bana
         * sirf usko print kar diya h
         * System.out.println(i++); // yahan i me 7 tha usko as it is print to kar diya
         * par ab i me store kar liya
         * // increment of 1 which is 8
         * System.out.println(i); // yahan new i ko print kiya after last operation of
         * i++ jo ki 8 hi h
         * System.out.println(++i); // pehle new i me increment hua aur usi time latest
         * i ko print kiya
         * System.out.println(i); // jo last operation ke baad ka i h usko print kar
         * diya joki 9 h
         * // agar samajh ni aaya to line 60 to 63 ko comment out karo aur fir note
         * points
         * // padho
         * 
         * // Relational Operators
         * /*
         * Operators used to evaluate the conditions in any conditional statements
         * like:-
         * == - equals to
         * > - greater than
         * >= - greater than or eqauls to
         * < - less than
         * <= - less than or equals to
         * != - not equals to
         */
        // Logical Operators (just like logic gates)
        /*
         * Operators used to check whether the logics in any conditional statements
         * like:-
         * && - AND (dono conditions ko true hona hoga)
         * A && A -True A-True(1)
         * A && B -False B-False(0)
         * B && A -False
         * B && B -False
         * || - OR (koi ek condition true hona chahiye)
         * A || A -True A-True(1)
         * A || B -True B-False(0)
         * B || A -True
         * B || B -False
         * != - NOT (negates the whole conditon - True becomes False and False becomes
         * True)
         * !A -False A-True(1)
         * !B -True B-False(0)
         * 
         */

        /*
         * // BIT MASKING IN JAVA
         * System.out.println("Give me your number to check for each bits : ");
         * int n = sc.nextInt();
         * System.out.println("For which position you want to search bit");
         * int pos = sc.nextInt();
         * int bitMask = 1 << pos;
         * int oper = bitMask & n;
         * 
         * // GET BIT
         * if (oper == 0) {
         * System.out.println("bit is 0");
         * } else {
         * System.out.println("bit is 1");
         * }
         * // SET BIT
         * //(n&(1<<i)!=0)
         * int setBit = bitMask | n;
         * System.out.println(setBit);
         * 
         * // CLEAR BIT
         * int NOTclearBit = ~bitMask;
         * int clearBit = NOTclearBit & n;
         * System.out.println(clearBit);
         * 
         * // UPDATE BIT -
         * // for 1 (set bit)
         * int updateBit = bitMask | n;
         * System.out.println(updateBit);
         * // for 0 (clear bit)
         * int NOTupdateBit= ~bitMask;
         * int UpdateBIT = NOTupdateBit & n;
         * System.out.println(UpdateBIT);
         */

        // Power Sets using BIT Manipulation
        System.out.println("Give me String to find its Power_Sets or Sub_Sets : ");
        String s = sc.nextLine();
        ArrayList<String> ans = subsets(s);
        int count =0;
        System.out.println("All powersets are :- ");
        for (String it : ans) {
            System.out.print(it + " ");
            if (it.equalsIgnoreCase("balloon")) {
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
        // Method to find the number of power sets in any string
        System.out.println(subsets(s).toArray().length);
        sc.close();
        
    }
}
