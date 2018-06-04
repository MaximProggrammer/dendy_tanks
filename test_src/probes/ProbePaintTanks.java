package probes;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class ProbePaintTanks {
    public static void main(String[] args) throws Exception{

        BufferedImage tanks = ImageIO.read(ProbePaintTanks.class.getResourceAsStream("/tanks.png"));

        BufferedImage holst = new BufferedImage(1024,600,BufferedImage.TYPE_INT_ARGB);

        {
            Graphics2D g = (Graphics2D) holst.getGraphics();

            g.setColor(Color.GREEN);
            g.fillRect(0,0,holst.getWidth(),holst.getHeight());

            g.drawImage(tanks,10,10,null);

            g.dispose();
        }

        ImageIO.write(holst,"png",new File("build/holst.png"));
    }
}
