package imat;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * A JFrame with background
 * 
 * @author jonathan
 */
public class BackgroundPanel extends JPanel {
    
    private BufferedImage img;
    
    public BackgroundPanel() {}
    
    /**
     * Creates a new JPanel with a background image.
     * 
     * @param s - the file name, must be placed in imat.resources!
     */
    public BackgroundPanel(String s) {
        // load the background image
        try {
            File f = new File(getClass().getResource("/imat/resources/" + s).toURI());
            img = ImageIO.read(f);
        } catch(URISyntaxException | IOException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // paint the background image and scale it to fill the entire space
        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    }
    
}
