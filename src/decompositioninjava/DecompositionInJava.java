/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decompositioninjava;

/**
 *
 * @author Lenovo
 */
public class DecompositionInJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Wall wall1 = new Wall("east");
        Wall wall2 = new Wall("west");
        Wall wall3 = new Wall("north");
        Wall wall4 = new Wall("south");
        
        Ceiling ceiling = new Ceiling(12,55);
        
        Bed bed = new Bed("Modern",1,4,4,1);
        
        Lamp lamp = new Lamp("Classic",false,75);
        
        Bedroom bedroom = new Bedroom("tims",wall1,wall2,wall3,wall4,bed,lamp,ceiling);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
    
}
