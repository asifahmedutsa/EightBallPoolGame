
package genuinecoderlistview;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class FXMLDocumentController implements Initializable {  

    @FXML
    private AnchorPane pane;
    @FXML
    private JFXListView<Label> listview;
    @FXML
    private JFXButton button1;
    @FXML
    private JFXButton button2;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        for(int i=0;i<4;i++){
           
            Label label=new Label("Item "+ i);
            // label.setGraphic(new ImageView(new Image(new FileInputStream("C:\\Users\\Public\\Pictures\\Sample Pictures\\Tulips.jpg"))));
            listview.getItems().add(label);
        }
    }    

    @FXML
    private void toggleItem(ActionEvent event) {
        if(!listview.isExpanded()){
           listview.setExpanded(true);
           listview.depthProperty().set(1);
        }
        else{
            listview.setExpanded(false);
            listview.depthProperty().set(0);
        }
    }
    @FXML
    private void addNode(ActionEvent event) {
    }
    
}
