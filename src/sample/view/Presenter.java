package sample.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import sample.model.Model;

public class Presenter {
    private Model model;
    private View view;

    public Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
        addEventHandlers();
    }

    private void addEventHandlers() {
        //for(int i = 0 ; i < model.SIZE ; i++) {
          //  final int index = i;
            view.getButtonArrayList().get(0).setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    int indexHole = model.getIndexHole(view.getImageViewArrayList(), view.getImageArrayList());
                    if(model.canMove(0,indexHole)) {
                        Image tempImage = view.getImageViewArrayList().get(0).getImage();
                        view.getImageViewArrayList().get(0).setImage(view.getImageArrayList().get(3));
                        view.getImageViewArrayList().get(indexHole).setImage(tempImage);
                    }
                }
            });
        //}


        view.getButton1().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int indexHole = model.getIndexHole(view.getImageViewArrayList(), view.getImageArrayList());
                if(model.canMove(1,indexHole)) {
                    Image tempImage = view.getImageView1().getImage();
                    view.getImageView1().setImage(view.getImage3());
                    view.getImageViewArrayList().get(indexHole).setImage(tempImage);
                }
            }
        });

        view.getButton2().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int indexHole = model.getIndexHole(view.getImageViewArrayList(), view.getImageArrayList());
                if(model.canMove(2,indexHole)) {
                    Image tempImage = view.getImageView2().getImage();
                    view.getImageView2().setImage(view.getImage3());
                    view.getImageViewArrayList().get(indexHole).setImage(tempImage);
                }
            }
        });

        view.getButton3().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int indexHole = model.getIndexHole(view.getImageViewArrayList(), view.getImageArrayList());
                if(model.canMove(3,indexHole)) {
                    Image tempImage = view.getImageView3().getImage();
                    view.getImageView3().setImage(view.getImage3());
                    view.getImageViewArrayList().get(indexHole).setImage(tempImage);
                }
            }
        });

    }


}
