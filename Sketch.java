import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(700, 700);
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
    rect((float)(width * 0.475),(float)(height * 0.5),(float)(width * 0.05),(float)(height * 0.75));

    // flower head
    stroke(252, 244, 0);
    fill(252, 244, 0);
    ellipse((float)(width * 0.5),(float)(height * 0.375),(float)(width * 0.375), (float)(height * 0.375));
    
    // flower center

    stroke(3, 3, 3);
    fill(3, 3, 3);
    ellipse((float)(width * 0.5),(float)(height * 0.375), (float)(width * 0.125),(float)(height * 0.125));

    // grasss
    stroke(5, 250, 70);
    fill(5, 250, 70);
    triangle(0, height, (float)(width * 0.0375), (float)(height * 0.875), (float)(width * 0.075), height);
    triangle((float)(width * 0.075), height, (float)(width * 0.113), (float)(height * 0.875), (float)(width * 0.15), height);
    triangle((float)(width * 0.15), height, (float)(width * 0.188), (float)(height * 0.875), (float)(width * 0.225), height);
    triangle((float)(width * 0.225), height, (float)(width * 0.263), (float)(height * 0.875), (float)(width * 0.3), height);
    triangle((float)(width * 0.3), height, (float)(width * 0.338), (float)(height * 0.875), (float)(width * 0.375), height);
    triangle((float)(width * 0.375), height, (float)(width * 0.413), (float)(height * 0.875), (float)(width * 0.45), height);
    triangle((float)(width * 0.45), height, (float)(width * 0.488), (float)(height * 0.875), (float)(width * 0.525), height);
    triangle((float)(width * 0.525), height, (float)(width * 0.563), (float)(height * 0.875), (float)(width * 0.6), height);
    triangle((float)(width * 0.6), height, (float)(width * 0.638), (float)(height * 0.875), (float)(width * 0.675), height);
    triangle((float)(width * 0.675), height, (float)(width * 0.713), (float)(height * 0.875), (float)(width * 0.75), height);
    triangle((float)(width * 0.75), height, (float)(width * 0.788), (float)(height * 0.875), (float)(width * 0.825), height);
    triangle((float)(width * 0.825), height, (float)(width * 0.863), (float)(height * 0.875), (float)(width * 0.9), height);
    triangle((float)(width * 0.9), height, (float)(width * 0.938), (float)(height * 0.875), (float)(width * 0.975), height);
    triangle((float)(width * 0.975), height, (float)(width * 1.0125), (float)(height * 0.875), (float)(width * 1.0375), height);
  }
  
  // define other methods down here.
}