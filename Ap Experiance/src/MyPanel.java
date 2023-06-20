import jdk.javadoc.doclet.DocletEnvironment;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener{
    final int PANEl_WIDTH = 1300;
    final int PANEL_HEIGHT = 600;
    Image a1;
    Image a2;
    Image b1;
    Image b2;
    Image c1;
    Image c2;
    Image d1;
    Image d2;

    Image wall0;
    Image wall1;
    Image wall2;
    Image wall3;
    Image wall4;
    Image wall5;
    Image wall6;
    Image wall7;
    Image wall8;
    Image wall9;
    Image wall10;
    Image wall11;
    Image wall12;
    Image wall13;
    Image wall14;
    Image wall15;
    Image wall16;
    Image wall17;
    Image wall18;
    Image wall19;
    Image wall20;
    Image wall21;
    Image wall22;
    Image wall23;
    Image wall24;
    Image wall25;
    Image wall26;
    Image wall27;
    Image wall28;
    Image wall29;
    Image wall30;
    Image wall31;
    Image wall32;
    Image wall33;
    Image wall34;
    Image wall35;
    Image wall36;
    Image wall37;
    Image wall38;

    int x = 0;
    int y = 0;

    static int a1x  = 300;
    static int a1y = 200;

    static int a2x = 700;
    static int a2y = 300;

    static int b1x = 300;
    static int b1y = 300;

    static int b2x = 900;
    static int b2y = 300;

    static int c1x = 500;
    static int c1y = 200;

    static int c2x = 700;
    static int c2y = 200;

    static int d1x = 500;
    static int d1y = 300;

    static int d2x = 900;
    static int d2y = 200;
    static int xVelocity = 2;
    static int yVelocity = 2;

    static Timer timer;
    MyPanel() {
        this.setPreferredSize(new Dimension(PANEl_WIDTH, PANEL_HEIGHT));

        this.setBackground(Color.blue);

        a1 = new ImageIcon("src/Resources/Orange Blob.png").getImage();
        a2 = new ImageIcon("src/Resources/Orange Blob.png").getImage();

        b1 = new ImageIcon("src/Resources/Red Blob.png").getImage();
        b2 = new ImageIcon("src/Resources/Red Blob.png").getImage();

        c1 = new ImageIcon("src/Resources/Tan Blob.png").getImage();
        c2 = new ImageIcon("src/Resources/Tan Blob.png").getImage();

        d1 = new ImageIcon("src/Resources/Yellow Blob.png").getImage();
        d2 = new ImageIcon("src/Resources/Yellow Blob.png").getImage();


        wall0 = new ImageIcon("src/Resources/Wall Texture.png").getImage();
        wall1 = new ImageIcon("src/Resources/Wall Texture.png").getImage();
        wall2 = new ImageIcon("src/Resources/Wall Texture.png").getImage();
        wall3 = new ImageIcon("src/Resources/Wall Texture.png").getImage();
        wall4 = new ImageIcon("src/Resources/Wall Texture.png").getImage();
        wall5 = new ImageIcon("src/Resources/Wall Texture.png").getImage();
        wall6 = new ImageIcon("src/Resources/Wall Texture.png").getImage();
        wall7 = new ImageIcon("src/Resources/Wall Texture.png").getImage();
        wall8 = new ImageIcon("src/Resources/Wall Texture.png").getImage();
        wall9 = new ImageIcon("src/Resources/Wall Texture.png").getImage();
        wall10 = new ImageIcon("src/Resources/Wall Texture.png").getImage();
        wall11 = new ImageIcon("src/Resources/Wall Texture.png").getImage();
        wall12 = new ImageIcon("src/Resources/Wall Texture.png").getImage();
        wall13 = new ImageIcon("src/Resources/Wall Texture.png").getImage();
        wall14 = new ImageIcon("src/Resources/Wall Texture.png").getImage();
        wall15 = new ImageIcon("src/Resources/Wall Texture.png").getImage();
        wall16 = new ImageIcon("src/Resources/Wall Texture.png").getImage();
        wall17 = new ImageIcon("src/Resources/Wall Texture.png").getImage();
        wall18 = new ImageIcon("src/Resources/Wall Texture.png").getImage();
        wall19 = new ImageIcon("src/Resources/Wall Texture.png").getImage();
        wall20 = new ImageIcon("src/Resources/Wall Texture.png").getImage();
        wall21 = new ImageIcon("src/Resources/Wall Texture.png").getImage();
        wall22 = new ImageIcon("src/Resources/Wall Texture.png").getImage();
        wall23 = new ImageIcon("src/Resources/Wall Texture.png").getImage();
        wall24 = new ImageIcon("src/Resources/Wall Texture.png").getImage();
        wall25 = new ImageIcon("src/Resources/Wall Texture.png").getImage();
        wall26 = new ImageIcon("src/Resources/Wall Texture.png").getImage();
        wall27 = new ImageIcon("src/Resources/Wall Texture.png").getImage();
        wall28 = new ImageIcon("src/Resources/Wall Texture.png").getImage();
        wall29 = new ImageIcon("src/Resources/Wall Texture.png").getImage();
        wall30 = new ImageIcon("src/Resources/Wall Texture.png").getImage();
        wall31 = new ImageIcon("src/Resources/Wall Texture.png").getImage();
        wall32 = new ImageIcon("src/Resources/Wall Texture.png").getImage();
        wall33 = new ImageIcon("src/Resources/Wall Texture.png").getImage();
        wall34 = new ImageIcon("src/Resources/Wall Texture.png").getImage();
        wall35 = new ImageIcon("src/Resources/Wall Texture.png").getImage();
        wall36 = new ImageIcon("src/Resources/Wall Texture.png").getImage();
        wall37 = new ImageIcon("src/Resources/Wall Texture.png").getImage();
        wall38 = new ImageIcon("src/Resources/Wall Texture.png").getImage();

        timer = new Timer(100,  this);
        timer.start();
    }


    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D) g;

        super.paint(g);

        g2D.drawImage(a1, a1x ,a1y, null);
        g2D.drawImage(a2, a2x ,a2y, null);

        g2D.drawImage(b1, b1x ,b1y, null);
        g2D.drawImage(b2, b2x ,b2y, null);

        g2D.drawImage(c1, c1x ,c1y, null);
        g2D.drawImage(c2, c2x ,c2y, null);

        g2D.drawImage(d1, d1x ,d1y, null);
        g2D.drawImage(d2, d2x ,d2y, null);


        g2D.drawImage(wall0, 0 ,0, null);
        g2D.drawImage(wall1, 100 ,0, null);
        g2D.drawImage(wall2, 200 ,0, null);
        g2D.drawImage(wall3,300 ,0, null);
        g2D.drawImage(wall4, 400 ,0, null);
        g2D.drawImage(wall5, 500 ,0, null);
        g2D.drawImage(wall6, 600 ,0, null);
        g2D.drawImage(wall7, 700 ,0, null);
        g2D.drawImage(wall8, 800 ,0, null);
        g2D.drawImage(wall9, 900 ,0, null);
        g2D.drawImage(wall10, 1000 ,0, null);
        g2D.drawImage(wall11, 1100 ,0, null);
        g2D.drawImage(wall12, 1200 ,0, null);
        g2D.drawImage(wall13, 1300 ,0, null);
        g2D.drawImage(wall14, 0 ,100, null);
        g2D.drawImage(wall15, 0 ,200, null);
        g2D.drawImage(wall16, 100 ,200, null);
        g2D.drawImage(wall17, 200 ,200, null);
        g2D.drawImage(wall18, 200 ,300, null);
        g2D.drawImage(wall19, 200 ,400, null);
        g2D.drawImage(wall20, 300 ,400, null);
        g2D.drawImage(wall21, 400 ,400, null);
        g2D.drawImage(wall22, 500 ,400, null);
        g2D.drawImage(wall23, 600 ,400, null);
        g2D.drawImage(wall24, 700 ,400, null);
        g2D.drawImage(wall25, 800 ,400, null);
        g2D.drawImage(wall26, 900 ,400, null);
        g2D.drawImage(wall27, 1000 ,400, null);
        g2D.drawImage(wall28, 1000 ,300, null);
        g2D.drawImage(wall29, 1000 ,200, null);
        g2D.drawImage(wall30, 1100 ,200, null);
        g2D.drawImage(wall31, 1200 ,200, null);
        g2D.drawImage(wall32, 1200 ,100, null);
        g2D.drawImage(wall33, 400 ,200, null);
        g2D.drawImage(wall34, 400 ,300, null);
        g2D.drawImage(wall35, 600 ,200, null);
        g2D.drawImage(wall36, 600 ,300, null);
        g2D.drawImage(wall37, 800 ,200, null);
        g2D.drawImage(wall38, 800 ,300, null);
    }
    public static void moveX(int val)
    {
        ImageIcon i;
        if(i.equals())
        for(int i = 1; i < val; i += xVelocity)
        {

        }
    }

    public static void moveY(int val)
    {
        for(int i = 1; i < val; i += yVelocity)
        {

        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

}
