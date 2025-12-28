/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.javaedu;

/**
 *
 * @author kg00k
 */

public class Oblong
{
	// the attributes
	private double length;
	private double height;
	
	// the methods
	
	// the constructor
	public Oblong(double lengthIn, double heightIn)
	{
		length = lengthIn;
		height = heightIn;
	}
	
	// this method allows us to read the length attribute
	public double getLength()
	{
		return length;
	}
	
	// this method allows us to read the height attribute
	public double getHeight()
	{
		return height;
	}
	
	// this method allows us to write to the length attribute
	public void setLength(double lengthIn)
	{
		length = lengthIn;
	}
	
	// this method allows us to write to the height attribute
	public void setHeight(double heightIn)
	{
		height = heightIn;
	}
	
	// this method returns the area of the rectangle
	public double calculateArea()
	{
		return length * height;
	}
	
	// this method returns the perimeter of the rectangle
	public double calculatePerimeter()
	{
		return 2 * (length + height);
	}
}

