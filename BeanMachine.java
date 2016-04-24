//U10416022
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import java.util.Random;
import javafx.animation.PathTransition;
import javafx.scene.paint.Paint;
import javafx.util.Duration;

public class BeanMachine extends Application {
	@Override
	public void start(Stage primaryStage) {

		// new pane
		Pane beanpane = new Pane();

		// create line
		Line line1 = new Line(280, 65, 280, 40);
		line1.setStroke(Color.BLACK);
		Line line2 = new Line(230, 65, 230, 40);
		line2.setStroke(Color.BLACK);
		Line line3 = new Line(280, 65, 455, 280);
		line3.setStroke(Color.BLACK);
		Line line4 = new Line(455, 365, 55, 365);
		line4.setStroke(Color.BLACK);
		Line line5 = new Line(230, 65, 55, 280);
		line5.setStroke(Color.BLACK);
		Line line6 = new Line(455, 280, 455, 365);
		line6.setStroke(Color.BLACK);
		Line line7 = new Line(55, 280, 55, 365);
		line7.setStroke(Color.BLACK);
		Line line8 = new Line(105, 280, 105, 365);
		line8.setStroke(Color.BLACK);
		Line line9 = new Line(155, 280, 155, 365);
		line9.setStroke(Color.BLACK);
		Line line10 = new Line(205, 280, 205, 365);
		line10.setStroke(Color.BLACK);
		Line line11 = new Line(255, 280, 255, 365);
		line11.setStroke(Color.BLACK);
		Line line12 = new Line(305, 280, 305, 365);
		line12.setStroke(Color.BLACK);
		Line line13 = new Line(405, 280, 405, 365);
		line13.setStroke(Color.BLACK);
		Line line14 = new Line(355, 280, 355, 365);
		line14.setStroke(Color.BLACK);
		// get all lines on the pane
		beanpane.getChildren().addAll(line1, line2, line3, line4, line5, line6, line7, line8, line9, line10, line11,
				line12, line13, line14);

		// new 28 circles
		// row 1
		Circle circle1 = new Circle(255,100,9,Color.BLACK);
		beanpane.getChildren().add(circle1);
		// row 2
		Circle circle2 = new Circle(230,130,9,Color.BLACK);
		beanpane.getChildren().add(circle2);
		Circle circle3 = new Circle(280,130,9,Color.BLACK);
		beanpane.getChildren().add(circle3);
		// row 3
		Circle circle4 = new Circle(205,160,9,Color.BLACK);
		beanpane.getChildren().add(circle4);
		Circle circle5 = new Circle(255,160,9,Color.BLACK);
		beanpane.getChildren().add(circle5);
		Circle circle6 = new Circle(305,160,9,Color.BLACK);
		beanpane.getChildren().add(circle6);
		// row 4
		Circle circle7 = new Circle(180,190,9,Color.BLACK);
		beanpane.getChildren().add(circle7);
		Circle circle8 = new Circle(230,190,9,Color.BLACK);
		beanpane.getChildren().add(circle8);
		Circle circle9 = new Circle(280,190,9,Color.BLACK);
		beanpane.getChildren().add(circle9);
		Circle circle10 = new Circle(330,190,9,Color.BLACK);
		beanpane.getChildren().add(circle10);
		// row 5
		Circle circle11 = new Circle(155,220,9,Color.BLACK);
		beanpane.getChildren().add(circle11);
		Circle circle12 = new Circle(205,220,9,Color.BLACK);
		beanpane.getChildren().add(circle12);
		Circle circle13 = new Circle(255,220,9,Color.BLACK);
		beanpane.getChildren().add(circle13);
		Circle circle14 = new Circle(305,220,9,Color.BLACK);
		beanpane.getChildren().add(circle14);
		Circle circle15 = new Circle(355,220,9,Color.BLACK);
		beanpane.getChildren().add(circle15);
		// row 6
		Circle circle16 = new Circle(130,250,9,Color.BLACK);
		beanpane.getChildren().add(circle16);
		Circle circle17 = new Circle(180,250,9,Color.BLACK);
		beanpane.getChildren().add(circle17);
		Circle circle18 = new Circle(230,250,9,Color.BLACK);
		beanpane.getChildren().add(circle18);
		Circle circle19 = new Circle(280,250,9,Color.BLACK);
		beanpane.getChildren().add(circle19);
		Circle circle20 = new Circle(330,250,9,Color.BLACK);
		beanpane.getChildren().add(circle20);
		Circle circle21 = new Circle(380,250,9,Color.BLACK);
		beanpane.getChildren().add(circle21);
		// row 7
		Circle circle22 = new Circle(105,280,9,Color.BLACK);
		beanpane.getChildren().add(circle22);
		Circle circle23 = new Circle(155,280,9,Color.BLACK);
		beanpane.getChildren().add(circle23);
		Circle circle24 = new Circle(205,280,9,Color.BLACK);
		beanpane.getChildren().add(circle24);
		Circle circle25 = new Circle(255,280,9,Color.BLACK);
		beanpane.getChildren().add(circle25);
		Circle circle26 = new Circle(305,280,9,Color.BLACK);
		beanpane.getChildren().add(circle26);
		Circle circle27 = new Circle(355,280,9,Color.BLACK);
		beanpane.getChildren().add(circle27);
		Circle circle28 = new Circle(405,280,9,Color.BLACK);
		beanpane.getChildren().add(circle28);

		// create the scene
		Scene scene = new Scene(beanpane, 550, 400);
		primaryStage.setTitle("BeanMachine");
		primaryStage.setScene(scene);
		primaryStage.show();

		// new text
		Text text = new Text(10, 30,"click here to start!");
		text.setFill(Color.GRAY);
		text.setFont(Font.font(25));
		beanpane.getChildren().addAll(text);

		// add action(mousepressed)
		text.setOnMousePressed(e -> {
			// Use array to set the ball color at random
			Random random = new Random();
			Paint[] color = { Color.TOMATO, Color.SKYBLUE, Color.YELLOW, Color.PURPLE, Color.SPRINGGREEN };
			int ballcolor = random.nextInt(5);
			BallPath ball = new BallPath(255, 50, 6.5, (Paint) color[ballcolor]);
			beanpane.getChildren().add(ball);
			ball.RollBall();
		});
	}
}
