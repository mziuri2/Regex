/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author user
 */
public class Regex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("შემოიტანეთ regex...");
            Pattern pattern = Pattern.compile(scanner.nextLine());
            System.out.println("შემოიტანეთ შესამოწმებელი სტრიქონი...");
            Matcher matcher = pattern.matcher(scanner.nextLine());
            boolean found = false;
            while (matcher.find()) {
                System.out.println("ნაპოვნია ტექსტი " + matcher.group() + " იწყება " +
                        matcher.start() + " და მთავრდება " + matcher.end());
                found = true;
            }
            if(!found){
                System.out.println("დამთხვევა არ მოიძებნა");
            }
        }
    }
}
