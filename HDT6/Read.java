/**
 * @author Fernando Echeverria
 * Folder: HDT6
 * Archivo: Read.java
 * Fecha: 05/03/2023
 */

import java.io.File;
import java.util.Map;
import java.util.Scanner;

public class Read {

    public void getinventory(Map <Integer, Cards> cardTree, String filename) {
        try {
               Scanner input = new Scanner(new File(filename));
               int i = 1;
               while (input.hasNextLine()) {
                   String line = input.nextLine();
                   String[] tokens = line.split("\\|");
                   cardTree.put(i, new Cards(tokens[0], tokens[1], 10));
                   i++;
               }
               input.close();
           } catch (Exception ex) {
               ex.printStackTrace();
           }
   }
}
