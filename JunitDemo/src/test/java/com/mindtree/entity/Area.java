package com.mindtree.entity;

public class Area {
	private AreaInterface area;

	public AreaInterface getArea() {
		return area;
	}
	public void setArea(AreaInterface area) {
		this.area = area;
	}
	public int areaRectangle(int a , int b)
	{
		return area.areaRectangle(a, b);
	}
	public int areaCircle(int r)
	{
		return area.areaCircle(r);
	}
	public int areaSquare(int l)
	{
		return area.areaSquare(l);
	}
	public int areaTriangle(int b , int h)
	{
		return area.areaTriangle(b, h);
	}
}
