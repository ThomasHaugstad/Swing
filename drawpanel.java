import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class drawpanel extends JPanel {

    private static int grids_size = 10;
    private final Random random = new Random();


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        Graphics2D g2d = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();
        int cellwidth = width / grids_size;
        int cellheight = height / grids_size;


        //Draw vertical lines

        for(int i = 0; i < grids_size; i++){
            int x = i * cellwidth;
            g.drawLine(x,0,x,height);


        }

        for(int j = 0; j < grids_size; j++){
            int y = j * cellheight;
            g.drawLine(0,y,width,y);
        }

        for(int i = 0; i < 5; i++){
            int x1 = random.nextInt(width);
            int x2 = x1;
            int y1 = 1000;
            int y2 = random.nextInt(height);

            Color randomcolor = new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256));
            g.setColor(randomcolor);
            float use = 10f;
            BasicStroke bs = new BasicStroke(use);
            ((Graphics2D) g).setStroke(bs);
            g.drawLine(x1,y1,x2,y2);
        }

    }

    private int randRed() {
        return 0;
    }
    private int randGreen() {
        return 0;
    }
    private int randBlue(){
        return 0;
    }

}