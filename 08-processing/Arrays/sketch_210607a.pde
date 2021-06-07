public class Arrays extends PApplet {
 
	public void setup() {
		// define the window size, make graphics softer, and make
		// the background white
		size(600, 600);
		smooth();
		background( 0xeeeeff );
	}
 
	public void draw() {
 
		// change color of circle paint depending on mouse button
		if (mousePressed)  {
			stroke( 255 );
			fill(0);
		}
		else { 
			stroke( 0 );
			fill(255);
		}
 
                // draw a circle where the mouse is located
		ellipse(mouseX, mouseY, 80, 80);
	}
}
