/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ez;

import java.util.Scanner;

/**
 *
 * @author TELC
 */
public class Hes {

    public static void main(String[] args) {
        String input;
        String token = "";

        Scanner s = new Scanner(System.in);

        input = s.nextLine();
        String lowerCaseInput = input.toLowerCase();

        for (int i = 0; i < lowerCaseInput.length(); i++) {
            if (input.charAt(i) == 'p' || input.charAt(i) == 'q' || input.charAt(i) == 'r' || input.charAt(i) == 's') {
                System.out.println(input.charAt(i) + "\t" + 1);
                i++;
            }
        }

    }
    }
