package Ex4;

import java.awt.Color;
import java.awt.event.KeyEvent;




public class UnionFindSimpleTester {
static Color[] colors;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ang = 30;
		int step = 30;
		int n = 5000;
		colors=Ex4Utils.generateColorrray(n);
		UnionFind uf = new UnionFind(n, ang);
		while (Ex4Utils.getUniqueGroups(uf) != 1) {
			System.out.println(
					"Current Angle: " + uf.angle + "\nNumber of groups: " + Ex4Utils.getUniqueGroups(uf) + " groups");
			Ex4Utils.showPoints(uf);
			while (!(StdDraw.isKeyPressed(KeyEvent.VK_SPACE))) {
				StdDraw.pause(100);
			}
			uf.increaseAngle(step);
		}
		Ex4Utils.showPoints(uf);
		System.out.println("All points has been connected");
	}

}
