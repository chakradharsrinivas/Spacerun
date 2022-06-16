package Spacerun;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javafx.animation.AnimationTimer;
import javafx.application.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
public class Asteroids extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	static String path=System.getenv("ProgramFiles(X86)")+"\\Spacerun";

	int a=0,score=0;
	 int shipcount=5;
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setTitle("Sunnys Game");
		BorderPane root = new BorderPane();
		
		Image img = new Image(new FileInputStream(path+"\\home.gif"));
        BackgroundImage bImg = new BackgroundImage(img,
                                                   BackgroundRepeat.NO_REPEAT,
                                                   BackgroundRepeat.NO_REPEAT,
                                                   BackgroundPosition.DEFAULT,
                                                   BackgroundSize.DEFAULT);
        Background bGround = new Background(bImg);
	    Button button1= new Button("Play Game");
	    button1.setLayoutX(600);
	    button1.setLayoutY(80);
	    Button button2= new Button("About Game");
	    button2.setLayoutX(600);
	    button2.setLayoutY(120);
	    Button button3= new Button("Credits");
	    button3.setLayoutX(600);
	    button3.setLayoutY(160);
	    Button button4= new Button("Lets Play");
	    button4.setLayoutX(340);
	    button4.setLayoutY(300);
   		button4.setStyle("-fx-text-fill: #ffffff;-fx-background-color: #33cc33;-fx-font-size: 2em;-fx-border-color: #ffffff; -fx-border-width: 1px;");
	    Button buttoncff= new Button("Buy Now");
	   Pane Home = new Pane();
      Home.getChildren().addAll(button1,button2,button3);
      Home.setBackground(bGround);
      Scene HomeScene = new Scene(Home,800,400);
      HomeScene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
		Scene mainScene = new Scene(root);
		button3.setOnAction(eve ->{
			try {
		       Text headingLabel = new Text("Credits");
		       headingLabel.setFont(Font.font("Arial",FontWeight.BOLD,FontPosture.ITALIC, 45));
		       headingLabel.setTranslateY(50);
		       headingLabel.setTranslateX(270); 
		       headingLabel.setFill(Color.color(1, 1, 1));
			   headingLabel.setStroke(Color.color(0.34, 0.178, 0.173));
		       Label text = new Label("Hey!!! Hope you had fun by playing this, Myself Chakradhar"+"\r\n"+"Pursuing a B.Tech degree in Computer Science and Engineering"+"\r\n"+"from IIIT VADODARA. A certified DJANGO, JAVA Developer and"+"\r\n"+"Search Engine Optimizer. "
		       		+ "\r\n"
		       		+ "A great motivational and public speaker.");
	     	  text.setTextFill(Color.color(1, 1, 1));
	     	  text.setFont(Font.font("Tarrget", 20));
	          text.setTranslateX(10);
	     	  text.setTranslateY(70);
	     	  text.setTextFill(Color.color(1, 1, 1));
	          Label text1 = new Label("Buy me a coffee if you like or enjoy my work");
		     	  text1.setTextFill(Color.color(1, 1, 1));
		     	  text1.setFont(Font.font("Tarrget",FontWeight.BOLD,FontPosture.ITALIC, 20));
		          text1.setTranslateX(10);
		     	  text1.setTranslateY(250);
		     	  text1.setTextFill(Color.color(1, 1, 1));
		    	    buttoncff.setLayoutX(300);
		    	    buttoncff.setLayoutY(320);
		    		buttoncff.setStyle("-fx-text-fill: #ffffff;-fx-background-color: #33cc33;-fx-font-size: 2em;-fx-border-color: #ffffff; -fx-border-width: 1px;");
		    	     	 Image imageme = new Image(new FileInputStream(path+"//me1.jpg"));
	         ImageView imageViewme = new ImageView(imageme); 
	         imageViewme.setX(585); 
	         imageViewme.setY(50); 
	         imageViewme.setFitHeight(250); 
	         imageViewme.setFitWidth(200); 
		   	   Pane Credits = new Pane();
		       Credits.getChildren().addAll(imageViewme,headingLabel,text,text1,buttoncff);
		       Credits.setBackground(bGround);
		       Scene AboutCredits = new Scene(Credits,800,400);
		    	primaryStage.setScene(AboutCredits);
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}  

		});
	      button2.setOnAction(e ->{
	       Text headingLabel = new Text("Welcome to Spacerun");
	       headingLabel.setFont(Font.font("Arial",FontWeight.BOLD,FontPosture.ITALIC, 30));
	       headingLabel.setTranslateY(30);
	       headingLabel.setTranslateX(240); 
	       headingLabel.setFill(Color.color(1, 1, 1));
		   headingLabel.setStroke(Color.color(0.34, 0.178, 0.173));
	       Label text = new Label("Here are the instructions for playing the game...\r\n"
	       		+ "     1. Press up arrow for moving in the forward direction.\r\n"
	       		+ "     2. Press the right arrow to rotate clockwise and left arrow to rotate anticlockwise.\r\n"
	       		+ "     3. You can shoot laser beams by pressing the spacebar.\r\n"
	       		+ "     4. The game ends when you hit a demon ship or laser beam.\r\n"
	       		+ "     5. Hit as many demon ships as possible to increase your score.\r\n"
	       		+ "     6. Finally, most importantly, have fun!!\r\n"
	       		+ "\r\n"
	       		+ "Thanks for downloading the game...\r\n");
     	       text.setTextFill(Color.color(1, 1, 1));
     	   text.setFont(Font.font("Arial", 20));
     	  text.setAlignment(Pos.CENTER);
     	  text.setTranslateY(70);
     	  text.setTextFill(Color.color(1, 1, 1));   		 
	   	   Pane About = new Pane();
	       About.getChildren().addAll(button4,headingLabel,text);
	       About.setBackground(bGround);
	       Scene AboutScene = new Scene(About,800,400);
	    	primaryStage.setScene(AboutScene);
	        AboutScene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

	      });
		Canvas canvas = new Canvas(800,600);
		GraphicsContext context = canvas.getGraphicsContext2D();
		root.setCenter(canvas);
		ArrayList<String> keypressedlist = new ArrayList<String>();
		ArrayList<String> keyjustpressedlist = new ArrayList<String>();		
		mainScene.setOnKeyPressed(
				(KeyEvent event) ->
				{
					String keyName=event.getCode().toString();
					if(!keypressedlist.contains(keyName))
						keypressedlist.add(keyName);
						keyjustpressedlist.add(keyName);

				});
		mainScene.setOnKeyReleased(
				(KeyEvent event) ->
				{
					String keyName=event.getCode().toString();
					if(keypressedlist.contains(keyName))
						keypressedlist.remove(keyName);
				});

       Sprite background  = new Sprite("file:///"+path+"\\bg_red.jpg");
       background.position.set(400, 300);
       Sprite spaceship = new Sprite("file:///"+path+"\\player.png");
       spaceship.position.set(100,300);
  ArrayList<Sprite> laserList = new ArrayList<Sprite>();
  ArrayList<Sprite> shipList = new ArrayList<Sprite>();
	for(int n=0;n<shipcount;n++)
	  {
		  Sprite asteroid = new Sprite("file:///"+path+"\\baddie-1.png");
		  double x=500*Math.random()+300;
		  double y=400*Math.random()+100;
		 asteroid.position.set(x, y);
		 double angle=360*Math.random();
		 asteroid.velocity.setlength(50);
		 asteroid.velocity.setAngle(angle);
		 shipList.add(asteroid);
		  
	  }
  
  AnimationTimer gameloop = new AnimationTimer()
  
    {
	  
		public void handle(long now) {
		  
			if(keypressedlist.contains("LEFT"))
				spaceship.rotation-=3;
			if(keypressedlist.contains("RIGHT"))
				spaceship.rotation+=3;
			if(keypressedlist.contains("UP"))
			{	
				spaceship.velocity.setlength(150);
				spaceship.velocity.setAngle(spaceship.rotation);
			}
			else
			{
			spaceship.velocity.setlength(0);
			}
			if(keypressedlist.contains("SPACE")) 
			{
			Sprite laser = new Sprite("file:///"+path+"\\test.png");
			laser.position.set(spaceship.position.x, spaceship.position.y);
			laser.velocity.setlength(400);
			laser.velocity.setAngle(spaceship.rotation);
			laserList.add(laser);
			}
		keyjustpressedlist.clear();
			spaceship.update(1/60.0);
			for(Sprite asteroid : shipList)
				asteroid.update(1/60.0);
			for(int n=0;n<laserList.size();n++)
			{	
				Sprite laser = laserList.get(n);
				laser.update(1/60.0);
				if(laser.elapsedtime>1.5)
					laserList.remove(n);
			}
			for(int asteroidNum=0;asteroidNum<shipList.size();asteroidNum++)
			{
			Sprite asteroid =shipList.get(asteroidNum);
			if(asteroid.elapsedtime>60) {
				shipList.remove(asteroidNum);
			}
			}
			while(shipList.size()<3) {
				for(int n=0;n<3;n++)
				  {
					  Sprite asteroid1 = new Sprite("file:///"+path+"\\baddie-1.png");
					  double x=500*Math.random()+400;
					  double y=400*Math.random()+100;
					 asteroid1.position.set(x, y);
					 double angle=360*Math.random();
					 asteroid1.velocity.setlength(50);
					 asteroid1.velocity.setAngle(angle);
					 shipList.add(asteroid1);
				  }}

			for(int laserNum=0; laserNum<laserList.size();laserNum++) 
			{
				Sprite laser=laserList.get(laserNum);
				for(int asteroidNum=0;asteroidNum<shipList.size();asteroidNum++)
				{
				Sprite asteroid =shipList.get(asteroidNum);
			
				if(laser.overlaps(asteroid))
				{
					laserList.remove(laserNum);
					shipList.remove(asteroidNum);
				score+=100;

				}
				}
			}
			for(int asteroidNum=0;asteroidNum<shipList.size();asteroidNum++)
			{
			Sprite asteroid =shipList.get(asteroidNum);
			if(asteroid.overlaps(spaceship))
			{
				a=1;
				System.out.println("hii");
			}}			
			background.render(context);
			if(a!=1)
		    spaceship.render(context);
			else
			{	try {
				
			       Text text2 = new Text("Your Score : "+score);
		     	   text2.setFont(Font.font("Arial", 40));
		     	  text2.setTextAlignment(TextAlignment.CENTER);
		     	  text2.setTranslateX(190);
		     	  text2.setTranslateY(350);
					text2.setFill(Color.WHITE);
					text2.setStroke(Color.GREEN);
				   Pane ext = new Pane();
					Image img2 = new Image(new FileInputStream(path+"\\gamover1.gif"));
				    BackgroundImage bImg2 = new BackgroundImage(img2,
			                                                   BackgroundRepeat.NO_REPEAT,
			                                                   BackgroundRepeat.NO_REPEAT,
			                                                   BackgroundPosition.DEFAULT,
			                                                   BackgroundSize.DEFAULT);
			        Background bGround2 = new Background(bImg2);
				    
			       ext.getChildren().addAll(text2);
			       ext.setBackground(bGround2);
			       Scene Aboutext = new Scene(ext,700,500);
			    	primaryStage.setScene(Aboutext);
			        Aboutext.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
	    
			}			
			for(Sprite laser : laserList)
				laser.render(context);
			for(Sprite asteroid : shipList)
				asteroid.render(context);
			context.setFill(Color.WHITE);
			context.setStroke(Color.GREEN);
			context.setFont(new Font("Arial Black",40));
			String text = "Score: "+score;
			int textX=500;
			int textY=50;
			context.fillText(text, textX, textY);
			context.strokeText(text, textX, textY);
		 }   };
	      button1.setOnAction(e ->{
	    	  primaryStage.setScene(mainScene);
	     	 gameloop.start();

	      });
	       button4.setOnAction(event123->{
			   primaryStage.setScene(mainScene);	    	   
		      	 gameloop.start();
		       });
			buttoncff.setOnAction(even ->{
		        Dialog<String> dialog = new Dialog<String>();
		        dialog.setTitle("Thanks you");
		        dialog.setContentText("Account number - 50100455430362\r\n"
		        		+ "Account Holder -CHINIGEPALLI CHAKRADHAR SRINIVAS\r\n"
		        		+ "Bank - HDFC\r\n"
		        		+ "Branch - Chirala\r\n"
		        		+ "IFSC - HDFC0002392");
		        ButtonType type = new ButtonType("Done, lets Play", ButtonData.OK_DONE);
		        dialog.getDialogPane().getButtonTypes().add(type);
		        dialog.showAndWait();
		    	  primaryStage.setScene(mainScene);	    	   
		      	 gameloop.start();
    		});		   	   
 		 primaryStage.setScene(HomeScene);
		 primaryStage.show();
		
	}

}
