import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       /* 1)Develop a program that takes the weight (in kilograms) and height (in meters)
        as input and calculates the BMI, then prints it. */

        System.out.println("enter your weight :");
        double weight = input.nextDouble();
        System.out.println("enter your height:");
        double height = input.nextDouble();
        System.out.println( "your IBM is :"+(weight/(height*height)));

        /* 2)Write a program that takes the obtained marks and total marks as input and
        calculates the percentage, then prints it.*/

        System.out.println("enter your obtained marks :");
        double obtainedMarks = input.nextDouble();
        System.out.println("enter your total marks :");
        double totalMarks   = input.nextDouble();
        System.out.println( "your percentage, is :"+((obtainedMarks /totalMarks)*100));

        /* 3)Create a program that takes an amount in one currency and an exchange rate
            as input, then converts and prints the amount in another currency.      */

        System.out.println("enter amount in the first currency :");
        double amount = input.nextDouble();
        System.out.println("enter the exchange rate :");
        double exchangeRate = input.nextDouble();
        System.out.println( "ythe amount in another currency :" +(amount * exchangeRate));

        /* 4)Create a program that takes a string as input, calculates its length, and then
            reverses the string using the StringBuilder class, finally printing both the length and
            reversed string.  */

       System.out.println("enter message:");
        String msg = input.nextLine();
        StringBuilder sb = new StringBuilder(msg);
        System.out.println("Expected Output: Length of the string: "+ msg.length()+" nd Reversed string: "
        +sb.reverse());

        /* 5) Develop a program that takes a sentence as input and extracts a substring from
                it, then prints the extracted substring.
        */
        System.out.println("enter sentence:");
        String sentence1 = input.nextLine();
        System.out.println("enter Start Index of substring:");
        int startIndex = input.nextInt();
        System.out.println("enter Start End of substring:");
        int endIndex = input.nextInt();
        System.out.println("Substring Sentence: "+ sentence1.substring(startIndex,endIndex));

        /* 6) Write a program that takes a sentence and a keyword as input, then check if
            the keyword is present in the sentence and prints the result.
         */

        System.out.println("enter sentence:");
        String sentence2 = input.nextLine();
        System.out.println("enter keyword: ");
        String keyword = input.nextLine();
        if(sentence2.contains(keyword))
             System.out.println("Keyword "+ keyword  +" is present in the sentence.");
        else
            System.out.println("Keyword "+ keyword  +" is not present in the sentence.");

        /* 7) Develop a program that takes a sentence and a word to replace as input, then
          replace all occurrences of the word with another word and prints the modified
            sentence.
         */

        System.out.println("enter sentence:");
        String sentence3 = input.nextLine();
        System.out.println("enter word to replace: ");
        String wordToReplace = input.nextLine();
        System.out.println("enter replacement word: ");
        String replacementWord = input.nextLine();
        System.out.println("sentence after replacement: "+sentence3.replace(wordToReplace,replacementWord));

        /* 8) Write a program that takes two strings as input and check if they are equal,
                ignoring the case, then prints whether they are equal or not.  */

        System.out.println("enter first string: ");
        String str1 = input.nextLine();
        System.out.println("enter second string: ");
        String str2 = input.nextLine();
        System.out.println("are strings equal? " + str1.equalsIgnoreCase(str2));


    }
}