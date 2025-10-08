package ghost;
import processing.core.PImage;
import processing.core.PApplet;

/**
 * Wall objects which waka or ghost cannot walk through
 */
public class Wall extends Cell{
    public String wallType;
    public Wall(App app,String wallType){
        this.app=app;
        this.wallType=wallType;
        
    }
    
    //note that this method is never called because waka can never collide with wall
    public void collide(Waka waka){
    }
    public boolean passable(){
        return false;
    }
public void loadImage() {
    if (this.wallType.equals("1")) {
        this.sprite = app.loadImage(getClass().getResource("/horizontal.png").toString());
    }
    if (this.wallType.equals("2")) {
        this.sprite = app.loadImage(getClass().getResource("/vertical.png").toString());
    }
    if (this.wallType.equals("3")) {
        this.sprite = app.loadImage(getClass().getResource("/upLeft.png").toString());
    }
    if (this.wallType.equals("4")) {
        this.sprite = app.loadImage(getClass().getResource("/upRight.png").toString());
    }
    if (this.wallType.equals("5")) {
        this.sprite = app.loadImage(getClass().getResource("/downLeft.png").toString());
    }
    if (this.wallType.equals("6")) {
        this.sprite = app.loadImage(getClass().getResource("/downRight.png").toString());
    }
}


}