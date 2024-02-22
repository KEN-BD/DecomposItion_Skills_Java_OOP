/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decompositioninjava;

/**
 *
 * @author Lenovo
 */
public class Bedroom {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Bed bed;
    private Lamp lamp;
    private Ceiling ceiling;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Bed bed, Lamp lamp, Ceiling ceiling) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.bed = bed;
        this.lamp = lamp;
        this.ceiling = ceiling;
    }
    
    
    public Lamp getLamp(){
        return this.lamp;
    }
    public void makeBed(){
        System.out.println("Bedroom-> making bed");
        bed.make();
    }
    
    
}
