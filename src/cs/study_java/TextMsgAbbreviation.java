package cs.study_java;

// Author:  Jefferson Nah

import java.util.Scanner;

public class TextMsgAbbreviation {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        String msg;
        String lol = "laughing out loud";
        String idk = "I don't know";

        String bff = "best friends forever";
        String imho = "in my humble opinion";

        System.out.println("Input an abbreviation:");
        msg = scnr.nextLine();
        // match the input "msg" abbreviation with the list of supported abbreviations
        // if any matches, output the unabbreviated form
        msg = msg.toLowerCase();
        if (msg.compareTo("lol") == 0) {
            System.out.println(lol);
        } else if (msg.compareTo("idk") == 0) {
            System.out.println(idk);
        } else if (msg.compareTo("bff") == 0) {
            System.out.println(bff);
        } else if (msg.compareTo("imho") == 0) {
            System.out.println(imho);
        } else {
            System.out.println("Unknown");
        }

        return;

    }
}
