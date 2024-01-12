 // check alph in vowels

import java.util.Scanner;
class Check_Vowel{
public static void main(String[]args){

Scanner sc=new Scanner(System.in);

System.out.println("Enter alphabet");

char alp=sc.next().charAt(0);

String alphabet=(alp=='a'||alp=='e'||alp=='i'||alp=='o'||alp=='u')?("it's a vowel"):("it's not a vowel");

System.out.println(alphabet);




}


}