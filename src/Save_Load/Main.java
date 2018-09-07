/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Save_Load;


import javafx.scene.Parent;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author hai
 */
public class Main extends Application{
    private Parent createContent(){
    TextField tfname = new TextField();
    TextField tfhp = new TextField();
    
    Button btnSave = new Button("Save");
   btnSave.setOnAction(event ->{
      Savedata data = new Savedata();
      data.name = tfname.getText();
      data.hp = Integer.parseInt(tfhp.getText());
      try{
          ResourceManager.save(data,"1.save");
      }
      catch(Exception e){
          System.out.println(e.getMessage());
      }
   });
    
    Button btnLoad = new Button("Load");
        btnLoad.setOnAction(event ->{
            try{
            Savedata data = (Savedata)ResourceManager.load("1.save");
            tfname.setText(data.name);
            tfhp.setText(String.valueOf(data.hp));
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        });
        VBox vBox = new VBox(10,tfname,tfhp,btnSave,btnLoad);
        return vBox;
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(createContent());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
