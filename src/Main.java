/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonas.jauslin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String text = "23_RoboCup";
        char[] array1 = text.toCharArray();
        System.out.println(array1[0]);
        
        switch (array1[0])
        {
            case '3' : System.out.println("das ist robostuff"); break;
            case '2': System.out.println("das ist anderes zeug"); break;
            default: System.out.println("def");
        }
    }    
}
