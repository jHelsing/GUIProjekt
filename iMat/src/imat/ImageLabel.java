package imat;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.imageio.ImageIO;
import javax.swing.JLabel;

/**
 * 
 * A Label that acts as a image with scaling. DOES NOT draw any text.
 *
 * @author Jonathan Helsing
 */
public class ImageLabel extends JLabel{
    
    private BufferedImage displayedImage;
    private BufferedImage normalImage;
    private BufferedImage pressedImage;
    private BufferedImage hoverImage;
    
     /**
     * Creates a new JLabel with an image.
     * 
     * @param normal - the  name of the image that will be displayed when
     * the ImageLabel isn't hovered over or pressed. Must be placed in the
     * imat.resources!
     */
    
    public ImageLabel(String normal) {
        super();
        try {
            File f = new File(getClass().getResource("/imat/resources/" + normal).toURI());
            normalImage = ImageIO.read(f);
            pressedImage = ImageIO.read(f);
            hoverImage = ImageIO.read(f);
        } catch(URISyntaxException | IOException e) {
            e.printStackTrace();
        }
        
    }
    
    /**
     * Creates a new JLabel with an image.
     * 
     * @param normal - the  name of the image that will be displayed when
     * the ImageLabel isn't hovered over or pressed. Must be placed in the
     * imat.resources!
     * @param pressed - the file name of the image that will be displayed when
     * the ImageLabel is pressed. Must be placed in the
     * imat.resources!
     * @param hover - the file name of the image that will be displayed when
     * the mouse is hovering over the ImageLabel. Must be placed in the
     * imat.resources!
     */
    
    public ImageLabel(String normal, String pressed, String hover) {
        super();
        try {
            File f = new File(getClass().getResource("/imat/resources/" + normal).toURI());
            normalImage = ImageIO.read(f);
            f = new File(getClass().getResource("/imat/resources/" + pressed).toURI());
            pressedImage = ImageIO.read(f);
            f = new File(getClass().getResource("/imat/resources/" + hover).toURI());
            hoverImage = ImageIO.read(f);
        } catch(URISyntaxException | IOException e) {
            e.printStackTrace();
        }
        
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(displayedImage, 0, 0, getWidth(), getHeight(), this);
    }
    
    public void imagePressed() {
        displayedImage = pressedImage;
        repaint();
    }
    
    public void imageNormal() {
        displayedImage = normalImage;
        repaint();
    }
    
    public void imageHover() {
        displayedImage = hoverImage;
        repaint();
    }
    
}
