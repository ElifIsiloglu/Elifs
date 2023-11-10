package PokePong;

import PokePong.Controller.GameState;
import PokePong.Controller.PongController;
import PokePong.Model.Player;
import PokePong.Model.Ball;
import PokePong.Model.PongData;
import PokePong.Model.PongModel;
import PokePong.View.pongView;
import processing.core.PApplet;
import processing.core.PImage;
import processing.event.KeyEvent;

public class Main extends PApplet {
    public static void main(String[]args){
        final int SizeWidth=900;
        final int SizeHeight=600;
        var model=new PongModel(SizeWidth,SizeHeight);
        var controller=new PongController(SizeHeight);
        var view=new pongView(SizeWidth,SizeHeight);

        controller.setModel(model);
        controller.setView(view);
        view.setController(controller);

        PApplet.runSketch(new String[]{"pongView"},view);
    }
}
