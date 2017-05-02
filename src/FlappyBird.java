import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by joginderpal on 02-05-2017.
 */
public class FlappyBird implements ActionListener, MouseListener, KeyListener {

    int WIDTH=800,HEIGHT=200;

    Rectangle bird;
    ArrayList<Rectangle> coloumn;

    Random rand;

   FlappyBird(){

       JFrame jFrame=new JFrame();
       Timer timer=new Timer(20,this);

       rand=new Random();

        jFrame.setTitle("Flappy Bird");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(WIDTH,HEIGHT);
        jFrame.addMouseListener(this);
        jFrame.addKeyListener(this);
       jFrame.setResizable(false);
       jFrame.setVisible(true);
       bird=new Rectangle(WIDTH/2-10,HEIGHT/2-10,20,20);
       coloumn=new ArrayList<>();
       timer.start();
   }


   public void addColoumn(boolean start){

       int space=300;
       int width=100;
       int height=50+rand.nextInt(300);
       if(start){
           coloumn.add(new Rectangle(WIDTH+width+coloumn.size()*300,HEIGHT-height-120,width,height));
           coloumn.add(new Rectangle(WIDTH+width+(coloumn.size()-1)*300,HEIGHT-height-space,width,height));
       }

   }



    public static void main(String[] args){


    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
