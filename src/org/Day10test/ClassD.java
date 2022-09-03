package org.Day10test;

public class ClassD extends ClassA implements InterB,InterC
{
    public void show()
    {
        System.out.println("show() method implementation");
    }
    public void dispD()
    {
        System.out.println("disp() method of ClassD");
    }
    public static void main(String args[])
    {
        ClassD d = new ClassD();
        d.dispD();
        d.show();
    }
}
