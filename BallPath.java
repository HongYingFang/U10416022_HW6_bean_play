import java.util.Random;
import javafx.scene.paint.Paint;
import javafx.scene.shape.*;
import javafx.util.Duration;
import javafx.animation.PathTransition;

public class BallPath extends Circle {
	// constructor
	public BallPath(double centerX, double centerY, double radius, Paint fill) {
		super(centerX, centerY, radius, fill);
	}
	
	//this RollBall method make the ball roll
	public void RollBall() {
		//new path(for ball)
		Path path = new Path();
		double X = this.getCenterX();
		double Y = this.getCenterY();
		//new random
		Random random = new Random();
		//the path get the X and Y value
		path.getElements().add(new MoveTo(this.getCenterX(), this.getCenterY()));
		// use for loop to choose the ball's path at random
		for (int i = 0; i < 7; i++) {
			if (random.nextInt(2) == 1) {
				//right
				X = X + 25.5;
				Y = Y + 33.5;
			} else {
				//left
				X = X - 25.5;
				Y = Y + 33.5;
			}

			path.getElements().add(new LineTo(X, Y));
		}
		
		path.getElements().add(new LineTo(X, Y+73));
		// new PathTransition
		PathTransition ptball = new PathTransition();
		ptball.setDuration(Duration.millis(2000));
		ptball.setPath(path);
		ptball.setNode(this);
		ptball.setOrientation(PathTransition.OrientationType.NONE);
		ptball.setCycleCount(1);
		ptball.play();
	}
}

