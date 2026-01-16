package core_programming.stringhandling;
import java.util.Scanner;

public class longstword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        String[] words = st.split(" ");
        String longw =" ";
        for(int i=0;i<words.length;i++){
            if(words[i].length()>longw.length()){
                longw=words[i];
            }
        }
        System.out.println(longw);
        sc.close();
        

    }
}
