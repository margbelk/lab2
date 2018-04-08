import java.awt.geom.Point2D;

public class Polygon {
	
	String toString = "";
	private int numVertices = 0;
	Point2D.Double[] vertex;
	
	public Polygon() {
		vertex = new Point2D.Double[3];

	}
	
	public void add(Point p) {

        if (numVertices < vertex.length)
        {
            vertex[numVertices] = p.pointDouble;
            toString = toString + "(" + (int) vertex[numVertices].getX() + ", " + (int) vertex[numVertices].getY() + ")";
            numVertices++;
            	
        }
        
	}
	public String getVertex(int i) {
		return "(" + String.valueOf((int) vertex[i].getX()) + ", " + String.valueOf( (int) vertex[i].getY()) + ")";
		
	}
	
	public void delete(int index) {
		
		int counter = 0;
		int lenght = vertex.length;
		Point2D.Double[] temp_vertex = new Point2D.Double[lenght-1];

		for(int i=0; i<vertex.length;i++) {
			if (i == 0) {
				toString = ""; 
			}
			if (index != i) {
				temp_vertex[counter] = vertex[i];
				toString = toString + "(" + (int) temp_vertex[counter].getX() + ", " + (int) temp_vertex[counter].getY() + ")";
				counter++;
			}
		}
		vertex = temp_vertex;
	}

	public String toString() {
		if (toString == "") {
			return "Empty polygon";
		}
		return toString;
	}

	
}
