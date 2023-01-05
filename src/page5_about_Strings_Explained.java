import java.util.Scanner;

public class page5_about_Strings_Explained {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Lets Write our code here
        /*
         * // String name="Rohit";
         * String name = new String("Rohit"); // scanner ko use karne ka tarika for
         * strings
         * System.out.println(name);
         * // Strings are strongly IMMUTABLE - bilkul change ni hoga, its always fixed .
         * 
         * // printf and print.format [kaam to ek hi bas likhne ka tarika h diffrent]
         * int a = 5;
         * float b = 6.252f;
         * // System.out.printf("1st value is:%d and 2nd value is:%f",a,b);
         * System.out.format("1st value is:%d and 2nd value is:%f", a, b);
         * // %d and %f is a format specifier
         * // %f ki jagah agar %5.2f likh de to uska matlab kya h ?
         * // Answer :-
         * // 5 ka matlab isme hoga ki decimal point ko use karke 5 spaces dikhaega
         * example
         * // (value is" 5.25")
         * // aur 2 ka matlab h ki decimal ke baad sirf 2 numbers dikhaega
         * 
         * // taking string input from user
         * Scanner sc = new Scanner(System.in);
         * // String st=sc.next(); //ek word lega sirf user se bhake hi sentence likha
         * ho
         * String st = sc.nextLine(); // pura line lega user se jo bhi user likhega
         * System.out.println(st);
         * 
         * // String Methods
         * // Sagar Sinha - String
         * // 012345678910 - Index of each character (always starts from 0)
         * String Name = "Sagar Sinha";
         * System.out.println(Name);
         * int nameLength = Name.length(); // length bata dega string ka, whitespaces ko
         * bhi count kar lega (kitne
         * // characters h kis string me) [Index number always starts from 0]
         * System.out.println(nameLength); // nameLength naam ka ek variable declare
         * kiye jo Name string ka method ko call
         * // kar rha h jo ki Name.length() hai
         * String LowerName = Name.toLowerCase(); // String ka jo bhi characters use ho
         * rha h usko lower case me return kar
         * // dega but ab store ho rha h new string variable me jiska naam LowerName
         * // hai
         * System.out.println(LowerName); // LowerName naam ka ek variable declare kiye
         * jo Name string ka method ko call
         * // kar rha h jo ki Name.toLowerCase() hai
         * String UpperName = Name.toUpperCase(); // String ka jo bhi characters use ho
         * rha h usko upper case me return kar
         * // dega but ab store ho rha h new string variable me jiska naam UpperName
         * // hai
         * System.out.println(UpperName); // UpperName naam ka ek variable declare kiye
         * jo Name string ka method ko call
         * // kar rha h jo ki Name.toUpperCase() hai
         * 
         * String newName = "   Rohit Sinha   ";
         * System.out.println(newName.trim()); // directly hm print me newName string ka
         * ek method call kiye h
         * // newName.trim() jiska kaam sirf aaghe piche ke whitespaces ko hatana h
         * // beech ka nhi
         * 
         * System.out.println(Name.substring(3)); // substring ka kaam h ki jo string h
         * usme given index number ka jo bhi
         * // last tak text hai usko print karke dikha dega jaise 3 likhne pe "ar
         * // Sinha" dikha, whitespaces bhi count karega
         * System.out.println(Name.substring(3, 8)); // ye substring limit ki tarah h
         * jisme 3rd index ka character to lega
         * // par 8th index wala character ko hata dega aur 3-7 jitne bhi
         * // characters h unko print kar dega
         * 
         * System.out.println(Name.replace("S", "R")); // ek character ko replace kar
         * diya dusre se jab directly call kiye
         * // replace method ko string me
         * 
         * System.out.println(Name.startsWith("Sag")); // jo string h kya wo start ho
         * rha h given characters se ya nhi
         * // (boolean answer dega hamesha)
         * System.out.println(Name.endsWith("Sag")); // jo string h kya wo end ho rha h
         * given characters se ya nhi (boolean
         * // answer dega hamesha)
         * 
         * System.out.println(Name.charAt(6)); // kisi string me given index number pe
         * kya character h ye bata dega but
         * // index number starts from 0 (index of me bhi 0 se start hua tha)
         * 
         * System.out.println(Name.indexOf("agar")); // ye bataega ki given characters
         * sabse pehle string me kis index pe
         * // occur hua h
         * System.out.println(Name.indexOf("a", 4)); // ye bataega ki given characters
         * sabse pehle string me kis index pe
         * // occur hua h but ek given index number ke baad 1st time kahan pe
         * // occur hua h jaise 'a' 10th index pe occur hua h after index number
         * // 4
         * System.out.println(Name.lastIndexOf("agar"));// ye bataega ki given
         * characters kahan pe string me kis index pe
         * // occur hua h but end se
         * System.out.println(Name.lastIndexOf("a", 9));// ye bataega ki given
         * characters kahan pe string me kis index pe
         * // occur hua h but end se but ab wo search bhi karega ulta like
         * // index from 0<-1<-2<-3<-4<-5<-6<-7<-8<-9 jahan milega match us
         * // index number ko bata dega
         * 
         * System.out.println(Name.equals("Sagar Sinha")); // direct text ko compare kar
         * dega ki string me wo exact
         * // characters h ya ni aur pura string same hona chahiye tabhi
         * // hoga true (case sensitive method h ye)
         * System.out.println(Name.equalsIgnoreCase("SagaR SiNha")); // direct text ko
         * compare kar dega ki string me wo
         * // exact characters h ya ni aur pura string same hona
         * // chahiye tabhi hoga true (ye case sensitivity 0 kar
         * // dega uppercase ya lowercase kuch bhi ho ye bas text
         * // ka match dhundhega)
         * 
         * /*
         * Escape Sequence
         * characters written after backslash "\" like:-
         * \n - next line
         * \t - next tab
         * \" - double quote any text
         * \' - single quote any text
         * \\ - give back slash to any text/strings
         * 
         */
        /*
         * // practice problems :-
         * // 1 string to lower case
         * String name = "Rohit Sinha";
         * name= name.toLowerCase();
         * System.out.println(name);
         * 
         * // 2 replace white spaces with underscores
         * String text = "Hello my name is Rohit Sinha";
         * text= text.replace(" ", "_");
         * System.out.println(text);
         * 
         * // 3 Thanksgiving template
         * String letter = "Hello my name is <|name|> , thank you for your help !";
         * letter=letter.replace("<|name|>", "Rohit Sinha");
         * System.out.println(letter); //strings are always immutable
         * 
         * // 4 string that detects double and triple spaces in a string
         * String texta = "Hello my  name   is  Rohit   Sinha";
         * System.out.println(texta.indexOf("  "));
         * System.out.println(texta.indexOf("   "));
         * 
         * // 5 type a letter in letter writing format(informal) chota sa letter bana
         * bas
         * String
         * letterA="Hello bro\n\tIts me cody and i wanna thank you for the new phone.\n\tHope you doin' well.\n\tLets meet on next sunday.\nyours and only yours\nedward"
         * ;
         * System.out.println(letterA);
         * 
         * 
         */
        /*
         * StringBuilder sd = new StringBuilder("Tony");
         * sd.setCharAt(3, 'a');
         * System.out.println(sd);
         * 
         * sd.insert(0, 's');
         * sd.delete(0, 3);// 3 is exclusive , ni lega 3rd index ko
         * System.out.println(sd);
         * 
         * StringBuilder sa = new StringBuilder("hello");// while appending space
         * complexity same rahega
         * // sa.append(" world"); // last me string add kar dega
         * System.out.println(sa);
         */

        // Concept of String Builder - Non Immutable type of string
        /*
         * StringBuilder sb = new StringBuilder("hello");
         * for (int i = 0; i < sb.length() / 2; i++) {
         * int front = i;
         * int back = sb.length() - 1 - i; // 5-1-0
         * 
         * char frontChar = sb.charAt(front);
         * char backChar = sb.charAt(back);
         * 
         * sb.setCharAt(front, backChar);
         * sb.setCharAt(back, frontChar);
         * 
         * }
         * System.out.println(sb);
         * 
         * System.out.println("give me sentence :-");
         * String str = sc.nextLine();
         * String rev = "";
         * for (int i = str.length() - 1; i >= 0; i--) {
         * rev = rev + str.charAt(i);
         * }
         * System.out.println(rev);
         * 
         */
        sc.close();

    }

}
