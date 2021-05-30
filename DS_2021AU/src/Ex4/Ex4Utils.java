package Ex4;

import java.awt.Color;
import java.awt.Point;
import java.util.HashSet;
import java.util.Random;



public class Ex4Utils {
	static Color[] colors;

	public static Point[] generateRandomArray(int size) {
		Point[] points = new Point[size];
		for (int i = 0; i < size; i++) {
			int x = (int) (Math.random() * 100);
			int y = (int) (Math.random() * 100);
			Point p = new Point(x, y);
			points[i] = p;
		}
		colors=generateColorrray(size);
		return points;
	}

	public static Color[] generateColorrray(int size) {
		Color[] color = new Color[size];
		Random rand = new Random();
		for (int i = 0; i < size; i++) {
			float r = rand.nextFloat();
			float g = rand.nextFloat();
			float b = rand.nextFloat();
			Color randomColor = new Color(r, g, b);
			color[i] = randomColor;
		}
		return color;
	}

	public static double angleFrom(Point from, Point to) {
		double dy, dx;
		dy = to.getY() - from.getY();
		dx = to.getX() - from.getX();
		double angle = Math.atan2(dy, dx);
		angle = Math.toDegrees(angle);
		angle = (angle + 360) % 360;
		return angle;
	}

	public static void showPoints(UnionFind uf) {
		StdDraw.clear();
		int i;
		Color[] colors=UnionFindSimpleTester.colors;
		for (i = 0; i < uf.id.length; i++) {
			StdDraw.setPenColor(colors[uf.Find(i)]);
			StdDraw.filledCircle(uf.elements[i].getX() / 100, uf.elements[i].getY() / 100, 0.007);
		}
	}
	public static int countUniqueGroups(UnionFind uf) {
		int i;
		HashSet<Integer> uniqueGroups = new HashSet<Integer>();
		for (i = 0; i < uf.id.length; i++) {
			int indd = uf.Find(i);
			if (!uniqueGroups.contains(indd)) {
				uniqueGroups.add(indd);
			}
		}
		return uniqueGroups.size();
	}
	
}
