
/**
 * Write a description of class WordCount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class WordCount
{
    public static int wordcount(String Message){

        int wordcount = 0;
        for(int i=0;i<Message.length() ;i++){
            String Characterpos =  Character.toString(Message.charAt(i));

            if (Characterpos.equals(" ")){
                wordcount++;

            } else if (!Characterpos.equals(" "))

                wordcount=wordcount;

        }
        return(wordcount + 1);
    }

    public static int vowelscons(String Message){
        int Vowel = 0;
        int Consonants = 0;
        for(int i=0; i<Message.length() ; i++){
            String Characterpos =  Character.toString(Message.charAt(i));
            if(Characterpos.equals("A") || Characterpos.equals("a")){
                Vowel++ ; 
            } else if (Characterpos.equals("E") || Characterpos.equals("e")){
                Vowel++;
            } else if (Characterpos.equals("I") || Characterpos.equals("i")){
                Vowel++;
            } else if (Characterpos.equals("O") || Characterpos.equals("o")){
                Vowel++;
            } else if (Characterpos.equals("U") || Characterpos.equals("u")){
                Vowel++;
            } else {
                Vowel=Vowel;
            }
        }
        return(Vowel);

    }

    public static  int consonants(String Message){
        int Consonants = 0;
        for(int i=0; i<Message.length() ; i++){
            String Characterpos =  Character.toString(Message.charAt(i));
            if(Characterpos.equals("A") || Characterpos.equals("a")){
                Consonants=Consonants;
            } else if (Characterpos.equals("E") || Characterpos.equals("e")){
                Consonants=Consonants;
            } else if (Characterpos.equals("I") || Characterpos.equals("i")){
                Consonants=Consonants;
            } else if (Characterpos.equals("O") || Characterpos.equals("o")){
                Consonants=Consonants;
            } else if (Characterpos.equals("U") || Characterpos.equals("u")){
                Consonants=Consonants;
            } else if (Characterpos.equals(" ")){
                Consonants=Consonants;
            } else 
                Consonants++;
        }
        return(Consonants);

    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a phase");
        String Message = input.nextLine();
        if (Message.length()<1 || Message.equals(" ")) {
            do{
                System.out.println("String is empty");
                Message=input.nextLine();

            }while (Message.length()<1 || (Message.equals(" ")));
        }
        System.out.println("Word Count is:" + " " + wordcount(Message));
        System.out.println("Backwards");
        int count = Message.length();
        do{

            System.out.print(Message.substring(count-1,count));
            count=count -1 ;

        }while(count>0);
        System.out.println("Enter a word");
        String word = input.nextLine();
        System.out.println("The number of vowels in the word are:" + " " + vowelscons(word));
        System.out.println("The number of Consonants in the word are:" + " " + consonants(word));

    }
}