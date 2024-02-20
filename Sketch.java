import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(112, 195, 250);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    // stalk 
    stroke(5, 250, 74);
    fill(5, 250, 74);
    rect(190,200,20,300);

    // flower head
    stroke(252, 244, 0);
    fill(252, 244, 0);
    ellipse(200,150, 150, 150);
    
    // flower center

    stroke(3, 3, 3);
    fill(3, 3, 3);
    ellipse(200,150, 50,50);

    // grasss
    stroke(5, 250, 70);
    fill(5, 250, 70);
    triangle(0, 400, 15, 350, 30, 400);
    triangle(30, 400, 45, 350, 60, 400);
    triangle(60, 400, 75, 350, 90, 400);
    triangle(90, 400, 105, 350, 120, 400);
    triangle(120, 400, 135, 350, 150, 400);
    triangle(150, 400, 165, 350, 180, 400);
    triangle(180, 400, 195, 350, 210, 400);
    triangle(210, 400, 225, 350, 240, 400);
    triangle(240, 400, 255, 350, 270, 400);
    triangle(270, 400, 285, 350, 300, 400);
    triangle(300, 400, 315, 350, 330, 400);
    triangle(330, 400, 345, 350, 360, 400);
    triangle(360, 400, 375, 350, 390, 400);
    triangle(390, 400, 405, 350, 405, 400);
  }
  
  // define other methods down here.
}