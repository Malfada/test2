package sample.view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;

public class View extends BorderPane {
    private Label label;
    private GridPane gridPane;

    private Button button0, button1, button2, button3;
    private ImageView imageView0, imageView1, imageView2, imageView3;
    private Image image0, image1, image2, image3;
    private String url0, url1, url2, url3;

    private ArrayList<Button> buttonArrayList;
    private ArrayList<ImageView> imageViewArrayList;
    private ArrayList<Image> imageArrayList;
    private ArrayList<String> urlArrayList;

    public View() {
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        this.label = new Label("temp");

        this.buttonArrayList = new ArrayList<>();
        this.imageViewArrayList = new ArrayList<>();
        this.imageArrayList = new ArrayList<>();
        this.urlArrayList = new ArrayList<>();

        this.url0 = "sample/view/images/nr_0.gif";
        this.urlArrayList.add(url0);
        this.image0 = new Image(url0);
        this.imageArrayList.add(image0);
        this.imageView0 = new ImageView(image0);
        this.imageViewArrayList.add(imageView0);
        this.button0 = new Button("", imageView0);
        this.buttonArrayList.add(button0);

        this.url1 = "sample/view/images/nr_1.gif";
        this.urlArrayList.add(url1);
        this.image1 = new Image(url1);
        this.imageArrayList.add(image1);
        this.imageView1 = new ImageView(image1);
        this.imageViewArrayList.add(imageView1);
        this.button1 = new Button("", imageView1);
        this.buttonArrayList.add(button1);


        this.url2 = "sample/view/images/nr_2.gif";
        this.urlArrayList.add(url2);
        this.image2 = new Image(url2);
        this.imageArrayList.add(image2);
        this.imageView2 = new ImageView(image2);
        this.imageViewArrayList.add(imageView2);
        this.button2 = new Button("", imageView2);
        this.buttonArrayList.add(button2);

        this.url3 = "sample/view/images/nr_3.gif";
        this.urlArrayList.add(url3);
        this.image3 = new Image(url3);
        this.imageArrayList.add(image3);
        this.imageView3 = new ImageView(image3);
        this.imageViewArrayList.add(imageView3);
        this.button3 = new Button("", imageView3);
        this.buttonArrayList.add(button3);

        this.gridPane = new GridPane();
    }

    private void layoutNodes() {
        this.setTop(label);
        this.setCenter(gridPane);
        this.gridPane.add(button0,0,0);
        this.gridPane.add(button1,1,0);
        this.gridPane.add(button2,0,1);
        this.gridPane.add(button3,1,1);
    }

    Button getButton0()     {return button0; }

    Button getButton1()     {return button1; }

    Button getButton2()     {return button2; }

    Button getButton3()     {return button3; }

    ImageView getImageView0() {return imageView0;}

    ImageView getImageView1() {return imageView1;}

    ImageView getImageView2() {return imageView2;}

    ImageView getImageView3() {return imageView3;}

    Image getImage0() {return image0;}

    Image getImage1() {return image1;}

    Image getImage2() {return image2;}

    Image getImage3() {return image3;}

    ArrayList<String> getUrlArrayList()         {return urlArrayList;       }

    ArrayList<Image> getImageArrayList()        {return imageArrayList;     }

    ArrayList<ImageView> getImageViewArrayList(){return imageViewArrayList; }

    ArrayList<Button> getButtonArrayList()      {return buttonArrayList;    }

    Label  getLabel()       {return label;   }

    GridPane getGridPane()  {return gridPane;}
}
