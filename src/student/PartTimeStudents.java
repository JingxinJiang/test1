/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author seanz
 */
public class PartTimeStudents extends Student{
    private int partTime;
    public PartTimeStudents(int partTime, String name){
        super(name);
        this.partTime=partTime;
    }

    public int getPartTime() {
        return partTime;
    }

    public void setPartTime(int partTime) {
        this.partTime = partTime;
    }
}
