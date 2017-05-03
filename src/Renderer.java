/**
 * Created by joginderpal on 03-05-2017.
 */
import java.awt.Graphics;

import javax.swing.JPanel;

public class Renderer extends JPanel
{

    private static final long serialVersionUID = 1L;

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        FlappyBird.flappyBird.repaint(g);
    }

}
