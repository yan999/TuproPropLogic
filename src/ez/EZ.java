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
        token = lowCaseIn.toCharArray();
        
        /*
        Pseudocode dari baris 23-37
        
        input : string
        output("input: ")
        lowCaseIn := input
        token : array of char
        token := lowCaseIn
        
        if p then q
        p or q ( q or s )
        */
        
        System.out.println("Output:");
        for (int i = 0; i < lowCaseIn.length(); i++) {
            //p,q,r,s
            if (token[i] == 'p' || token[i] == 'q' || token[i] == 'r' || token[i] == 's') {
                if (i==lowCaseIn.length()-1 || token[i + 1] == ' ') {
                    System.out.println(token[i] + "\t" + 1);
                } else {
                    System.out.println("Error");
                    break;
                }
            } //not
            else if (token[i] == 'n' && token[i + 1] == 'o' && token[i + 2] == 't') {
                if (i+2==lowCaseIn.length()-1 || token[i + 3] == ' ') {
                    System.out.println("not\t" + 2);
                    i = i + 2;
                } else {
                    System.out.println("Error");
                    break;
                }
            } //and
            else if (token[i] == 'a' && token[i + 1] == 'n' && token[i + 2] == 'd') {
                if (i+2==lowCaseIn.length()-1 || token[i + 3] == ' ') {
                    System.out.println("and\t" + 3);
                    i = i + 2;
                } else {
                    System.out.println("Error");
                    break;
                }
            } //or
            else if (token[i] == 'o' && token[i + 1] == 'r') {
                if (i+1==lowCaseIn.length()-1 || token[i + 2] == ' ') {
                    System.out.println("or\t" + 4);
                    i = i + 1;
                } else {
                    System.out.println("Error");
                    break;
                }
            } //xor
            else if (token[i] == 'x' && token[i + 1] == 'o' && token[i + 2] == 'r') {
                if (i+2==lowCaseIn.length()-1 || token[i + 3] == ' ') {
                    System.out.println("xor\t" + 5);
                    i = i + 2;
                } else {
                    System.out.println("Error");
                    break;
                }
            } //if, iff
            else if (token[i] == 'i' && token[i + 1] == 'f') {
                if (token[i + 2] == 'f') {
                    if (i+2==lowCaseIn.length()-1 || token[i + 3] == ' ') {
                        System.out.println("iff\t" + 8);
                        i = i + 2;
                    } else {
                        System.out.println("Error");
                        break;
                    }
                } else if (i+1==lowCaseIn.length()-1 || token[i + 2] == ' ') {
                    System.out.println("if\t" + 6);
                    i = i + 1;
                } else {
                    System.out.println("Error");
                    break;
                }
            } //then
            else if (token[i] == 't' && token[i + 1] == 'h' && token[i + 2] == 'e' && token[i + 3] == 'n') {
                if (i+3==lowCaseIn.length()-1 || token[i + 4] == ' ') {
                    
                    System.out.println("then\t" + 7);
                    i = i + 3;
                } else {
                    System.out.println("Error");
                    break;
                }
            } // (
            else if (token[i] == '(') {
                if (i==lowCaseIn.length()-1 || token[i + 1] == ' ') {
                    System.out.println("(\t" + 9);
                } else {
                    System.out.println("Error");
                    break;
                }
            } // )
            else if (token[i] == ')') {
                if (i==lowCaseIn.length()-1 || token[i + 1] == ' ') {
                    System.out.println(")\t" + 10);
                } else {
                    System.out.println("Error");
                    break;
                }
            } else if (i==lowCaseIn.length()-1 || token[i] == ' ') {
                //continue
            }
        }
    }
}
