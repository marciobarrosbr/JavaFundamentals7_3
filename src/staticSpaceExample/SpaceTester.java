package staticSpaceExample;

import java.awt.Point;

import staticSpaceExample.Space.Cube;
import staticSpaceExample.Space.Line;
import staticSpaceExample.Space.Points;

public class SpaceTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//exemplo de uso das classe aninhadas estáticas
		Points point = Points.creatPoint(1, 2, 3);
		Line line = Line.createLine(Points.creatPoint(0,0,1), Points.creatPoint(2,2,2));
		Cube cube= Cube.creatCube(Points.creatPoint(1,1,1), 3);
	}

}
