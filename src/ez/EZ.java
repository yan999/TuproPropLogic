/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ez;

import java.io.BufferedReader;
import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author TELC
 */
public class EZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String input;

        //BufferedReader br = new BufferedReader(in);
        Scanner s = new Scanner(System.in);

        System.out.print("Input: ");
        input = s.nextLine();
        String lowCaseIn = input.toLowerCase();

        char token[];
        char temp[];
        token = lowCaseIn.toCharArray();

        System.out.println(lowCaseIn);
        System.out.println("");
        
        for (int i = 0; i < lowCaseIn.length(); i++) {
            //p,q,r,s
            if (token[i] == 'p' || token[i] == 'q' || token[i] == 'r' || token[i] == 's') {
                System.out.println(token[i] + "\t" + 1);
            } //not
            else if (token[i] == 'n' && token[i + 1] == 'o' && token[i + 2] == 't') {
                System.out.println("not\t" + 2);
            } //and
            else if (token[i] == 'a' && token[i + 1] == 'n' && token[i + 2] == 'd') {
                System.out.println("and\t" + 3);
            } //or
            else if (token[i] == 'o' && token[i + 1] == 'r') {
                System.out.println("or\t" + 4);
            } //xor
            else if (token[i] == 'x' && token[i + 1] == 'o' && token[i + 2] == 'r') {
                System.out.println("xor\t" + 5);
            } //if, iff
            else if (token[i] == 'i' && token[i + 1] == 'f') {
                if (token[i + 2] == 'f') {
                    System.out.println("iff\t" + 8);
                } else if (token[i + 2] == ' ') {
                    System.out.println("if\t" + 6);
                } else {
                    System.out.println("Error6");
                }
            } //then
            else if (token[i] == 't' && token[i + 1] == 'h' && token[i + 2] == 'e' && token[i + 3] == 'n') {
                System.out.println("then\t" + 7);
            } // (
            else if (token[i] == '(') {
                System.out.println("(\t" + 9);
            } // )
            else if (token[i] == ')') {
                System.out.println(")\t" + 10);
            }
            else if (token[i] == ' ') {
                //continue
            }
            else {
                System.out.println("Error");
            }
        }
    }
}
