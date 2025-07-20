package org.example.calculateArea;
import java.util.Scanner;
public interface Shape
{
    void acceptInput();
    void compute();
    void disp();
    Scanner scan = new Scanner(System.in);
}
