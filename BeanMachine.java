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
		Circle circle1 = new Circle();
		circle1.setCenterX(255.0f);
		circle1.setCenterY(100.0f);
		circle1.setRadius(9.0f);
		circle1.setFill(Color.BLACK);
		beanpane.getChildren().add(circle1);

		// row 2
		Circle circle2 = new Circle();
		circle2.setCenterX(230.0f);
		circle2.setCenterY(130.0f);
		circle2.setRadius(9.0f);
		circle2.setFill(Color.BLACK);
		beanpane.getChildren().add(circle2);

		Circle circle3 = new Circle();
		circle3.setCenterX(280.0f);
		circle3.setCenterY(130.0f);
		circle3.setRadius(9.0f);
		circle3.setFill(Color.BLACK);
		beanpane.getChildren().add(circle3);

		// row 3
		Circle circle4 = new Circle();
		circle4.setCenterX(205.0f);
		circle4.setCenterY(160.0f);
		circle4.setRadius(9.0f);
		circle4.setFill(Color.BLACK);
		beanpane.getChildren().add(circle4);

		Circle circle5 = new Circle();
		circle5.setCenterX(255.0f);
		circle5.setCenterY(160.0f);
		circle5.setRadius(9.0f);
		circle5.setFill(Color.BLACK);
		beanpane.getChildren().add(circle5);

		Circle circle6 = new Circle();
		circle6.setCenterX(305.0f);
		circle6.setCenterY(160.0f);
		circle6.setRadius(9.0f);
		circle6.setFill(Color.BLACK);
		beanpane.getChildren().add(circle6);

		// row 4
		Circle circle7 = new Circle();
		circle7.setCenterX(180.0f);
		circle7.setCenterY(190.0f);
		circle7.setRadius(9.0f);
		circle7.setFill(Color.BLACK);
		beanpane.getChildren().add(circle7);

		Circle circle8 = new Circle();
		circle8.setCenterX(230.0f);
		circle8.setCenterY(190.0f);
		circle8.setRadius(9.0f);
		circle8.setFill(Color.BLACK);
		beanpane.getChildren().add(circle8);

		Circle circle9 = new Circle();
		circle9.setCenterX(280.0f);
		circle9.setCenterY(190.0f);
		circle9.setRadius(9.0f);
		circle9.setFill(Color.BLACK);
		beanpane.getChildren().add(circle9);

		Circle circle10 = new Circle();
		circle10.setCenterX(330.0f);
		circle10.setCenterY(190.0f);
		circle10.setRadius(9.0f);
		circle10.setFill(Color.BLACK);
		beanpane.getChildren().add(circle10);

		// row 5
		Circle circle11 = new Circle();
		circle11.setCenterX(155.0f);
		circle11.setCenterY(220.0f);
		circle11.setRadius(9.0f);
		circle11.setFill(Color.BLACK);
		beanpane.getChildren().add(circle11);

		Circle circle12 = new Circle();
		circle12.setCenterX(205.0f);
		circle12.setCenterY(220.0f);
		circle12.setRadius(9.0f);
		circle12.setFill(Color.BLACK);
		beanpane.getChildren().add(circle12);

		Circle circle13 = new Circle();
		circle13.setCenterX(255.0f);
		circle13.setCenterY(220.0f);
		circle13.setRadius(9.0f);
		circle13.setFill(Color.BLACK);
		beanpane.getChildren().add(circle13);

		Circle circle14 = new Circle();
		circle14.setCenterX(305.0f);
		circle14.setCenterY(220.0f);
		circle14.setRadius(9.0f);
		circle14.setFill(Color.BLACK);
		beanpane.getChildren().add(circle14);

		Circle circle15 = new Circle();
		circle15.setCenterX(355.0f);
		circle15.setCenterY(220.0f);
		circle15.setRadius(9.0f);
		circle15.setFill(Color.BLACK);
		beanpane.getChildren().add(circle15);

		// row 6
		Circle circle16 = new Circle();
		circle16.setCenterX(130.0f);
		circle16.setCenterY(250.0f);
		circle16.setRadius(9.0f);
		circle16.setFill(Color.BLACK);
		beanpane.getChildren().add(circle16);

		Circle circle17 = new Circle();
		circle17.setCenterX(180.0f);
		circle17.setCenterY(250.0f);
		circle17.setRadius(9.0f);
		circle17.setFill(Color.BLACK);
		beanpane.getChildren().add(circle17);

		Circle circle18 = new Circle();
		circle18.setCenterX(230.0f);
		circle18.setCenterY(250.0f);
		circle18.setRadius(9.0f);
		circle18.setFill(Color.BLACK);
		beanpane.getChildren().add(circle18);

		Circle circle19 = new Circle();
		circle19.setCenterX(280.0f);
		circle19.setCenterY(250.0f);
		circle19.setRadius(9.0f);
		circle19.setFill(Color.BLACK);
		beanpane.getChildren().add(circle19);

		Circle circle20 = new Circle();
		circle20.setCenterX(330.0f);
		circle20.setCenterY(250.0f);
		circle20.setRadius(9.0f);
		circle20.setFill(Color.BLACK);
		beanpane.getChildren().add(circle20);

		Circle circle21 = new Circle();
		circle21.setCenterX(380.0f);
		circle21.setCenterY(250.0f);
		circle21.setRadius(9.0f);
		circle21.setFill(Color.BLACK);
		beanpane.getChildren().add(circle21);

		// row 7
		Circle circle22 = new Circle();
		circle22.setCenterX(105.0f);
		circle22.setCenterY(280.0f);
		circle22.setRadius(9.0f);
		circle22.setFill(Color.BLACK);
		beanpane.getChildren().add(circle22);

		Circle circle23 = new Circle();
		circle23.setCenterX(155.0f);
		circle23.setCenterY(280.0f);
		circle23.setRadius(9.0f);
		circle23.setFill(Color.BLACK);
		beanpane.getChildren().add(circle23);

		Circle circle24 = new Circle();
		circle24.setCenterX(205.0f);
		circle24.setCenterY(280.0f);
		circle24.setRadius(9.0f);
		circle24.setFill(Color.BLACK);
		beanpane.getChildren().add(circle24);

		Circle circle25 = new Circle();
		circle25.setCenterX(255.0f);
		circle25.setCenterY(280.0f);
		circle25.setRadius(9.0f);
		circle25.setFill(Color.BLACK);
		beanpane.getChildren().add(circle25);

		Circle circle26 = new Circle();
		circle26.setCenterX(305.0f);
		circle26.setCenterY(280.0f);
		circle26.setRadius(9.0f);
		circle26.setFill(Color.BLACK);
		beanpane.getChildren().add(circle26);

		Circle circle27 = new Circle();
		circle27.setCenterX(355.0f);
		circle27.setCenterY(280.0f);
		circle27.setRadius(9.0f);
		circle27.setFill(Color.BLACK);
		beanpane.getChildren().add(circle27);

		Circle circle28 = new Circle();
		circle28.setCenterX(405.0f);
		circle28.setCenterY(280.0f);
		circle28.setRadius(9.0f);
		circle28.setFill(Color.BLACK);
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
