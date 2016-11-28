/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tba;

import java.io.BufferedReader;
import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author TELC
 * 
IF-38-05
Kelompok 1
1301140255 Achmad Safa Ramadhan
1301140295 Fitrah Bima Nusantara
1301144005 Arian Nurrifqhi
1301144425 Fikri Razzaq Arasyid
 */
public class PropLogic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String input;
        String tokens;

        //BufferedReader br = new BufferedReader(in);
        Scanner s = new Scanner(System.in);

        System.out.print("Input: ");
        input = s.nextLine();
        String lowCaseIn = input.toLowerCase();

        char token[];
        token = lowCaseIn.toCharArray();
        
        System.out.println("Output:");
        for (int i = 0; i < lowCaseIn.length(); i++) {
            //p,q,r,s
            if (token[i] == 'p' || token[i] == 'q' || token[i] == 'r' || token[i] == 's') {
                if (i==lowCaseIn.length()-1 || token[i + 1] == ' ') {
                    tokens="1";
                    System.out.println(token[i] + "\t" + tokens);
                } else {
                    System.out.println("Error");
                    break;
                }
            } //not
            else if (token[i] == 'n' && token[i + 1] == 'o' && token[i + 2] == 't') {
                if (i+2==lowCaseIn.length()-1 || token[i + 3] == ' ') {
                    tokens="2";
                    System.out.println("not\t" + tokens);
                    i = i + 2;
                } else {
                    System.out.println("Error");
                    break;
                }
            } //and
            else if (token[i] == 'a' && token[i + 1] == 'n' && token[i + 2] == 'd') {
                if (i+2==lowCaseIn.length()-1 || token[i + 3] == ' ') {
                    tokens="3";
                    System.out.println("and\t" + tokens);
                    i = i + 2;
                } else {
                    System.out.println("Error");
                    break;
                }
            } //or
            else if (token[i] == 'o' && token[i + 1] == 'r') {
                if (i+1==lowCaseIn.length()-1 || token[i + 2] == ' ') {
                    tokens="4";
                    System.out.println("or\t" + tokens);
                    i = i + 1;
                } else {
                    System.out.println("Error");
                    break;
                }
            } //xor
            else if (token[i] == 'x' && token[i + 1] == 'o' && token[i + 2] == 'r') {
                if (i+2==lowCaseIn.length()-1 || token[i + 3] == ' ') {
                    tokens="5";
                    System.out.println("xor\t" + tokens);
                    i = i + 2;
                } else {
                    System.out.println("Error");
                    break;
                }
            } //if, iff
            else if (token[i] == 'i' && token[i + 1] == 'f') {
                if (token[i + 2] == 'f') {
                    if (i+2==lowCaseIn.length()-1 || token[i + 3] == ' ') {
                        tokens="8";
                        System.out.println("iff\t" + tokens);
                        i = i + 2;
                    } else {
                        System.out.println("Error");
                        break;
                    }
                } else if (i+1==lowCaseIn.length()-1 || token[i + 2] == ' ') {
                    tokens="6";
                    System.out.println("if\t" + tokens);
                    i = i + 1;
                } else {
                    System.out.println("Error");
                    break;
                }
            } //then
            else if (token[i] == 't' && token[i + 1] == 'h' && token[i + 2] == 'e' && token[i + 3] == 'n') {
                if (i+3==lowCaseIn.length()-1 || token[i + 4] == ' ') {
                    tokens="7";
                    System.out.println("then\t" + tokens);
                    i = i + 3;
                } else {
                    System.out.println("Error");
                    break;
                }
            } // (
            else if (token[i] == '(') {
                if (i==lowCaseIn.length()-1 || token[i + 1] == ' ') {
                    tokens="9";
                    System.out.println("(\t" + tokens);
                } else {
                    System.out.println("Error");
                    break;
                }
            } // )
            else if (token[i] == ')') {
                if (i==lowCaseIn.length()-1 || token[i + 1] == ' ') {
                    tokens="10";
                    System.out.println(")\t" + tokens);
                } else {
                    System.out.println("Error");
                    break;
                }
            } else if (i==lowCaseIn.length()-1 || token[i] == ' ') {
                //continue
            } else {
                System.out.println("Error");
                break;
                
            }
        }
    }
}