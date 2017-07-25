package sketcher.domain;

import java.awt.Graphics2D;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;

public class Sketcher{

	private int currentShapeType = Shape.CIRCLE;

	private ArrayList<Shape> shapes = new ArrayList<Shape>();

	public void setCurrentShapeType(int currentShape) {
		this.currentShapeType = currentShape;
	}

	public int getCurrentShapeType() {
		return currentShapeType;
	}

	public Shape createShape(int x, int y) {
		Shape shape = Shape.create(currentShapeType, x, y);
		shapes.add(shape);
		return shape;
	}
	
	public void selectShape(int index){
		if(index < shapes.size()){
			Shape selectedShape = shapes.remove(index);
			shapes.add(selectedShape);
		}else{
			System.out.println("There is no shape with such index!");
		}
	}
	
	public Shape getSelectedShape(){
		if(shapes.size() > 0){
			return shapes.get(shapes.size()-1);
		}else{
			return null;
		}
	}
	
	public void drawAll(){
		if(!shapes.isEmpty()){
			Iterator<Shape> iterator = shapes.iterator();
			int index = 0;
			System.out.println();
			while (iterator.hasNext()) {
				System.out.println("Index: "+index);
				iterator.next().draw();
				System.out.println();
				index++;
			}
		}else{
			System.out.println("Nothing to draw!");
		}
	}
	
	public void drawAll(Graphics2D g2d){
		Iterator<Shape> iterator = shapes.iterator();
		while (iterator.hasNext()) {
			iterator.next().draw(g2d);
		}
	}
	//Open Streaming channel.
	public void saveData(String filePath){
		Path myFile = Paths.get(filePath);
		try {
			ObjectOutputStream objectOut = new ObjectOutputStream(Files.newOutputStream(myFile));
			objectOut.writeObject(shapes);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void loadData(String filePath){
		Path myFile = Paths.get(filePath);
		try {
			ObjectInputStream objectIn = new ObjectInputStream(new BufferedInputStream(Files.newInputStream(myFile)));
			//Read the streaming file
			shapes = (ArrayList<Shape>) objectIn.readObject();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
	}
	//Clear surface
	public void removeShapes(){
		shapes.clear();
	}
}
