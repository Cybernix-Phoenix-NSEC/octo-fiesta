import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class resize {

    private static final int IMG_WIDTH = 128;
    private static final int IMG_HEIGHT = 64;

    public static void main(String[] args) throws IOException {

        Path source = Paths.get(args[0]);
        Path target = Paths.get(args[1]);

        try (InputStream is = new FileInputStream(source.toFile())) {
            resize(is, target, IMG_WIDTH, IMG_HEIGHT);
        }

    }

    private static void resize(InputStream input, Path target,
                               int width, int height) throws IOException {

        // read an image to BufferedImage for processing
        BufferedImage originalImage = ImageIO.read(input);

        // create a new BufferedImage for drawing
        BufferedImage newResizedImage
              = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = newResizedImage.createGraphics();

        // background transparent
        g.setComposite(AlphaComposite.Src);
        g.fillRect(0, 0, width, height);

		g.setRenderingHint(RenderingHints.KEY_RENDERING,
                              RenderingHints.VALUE_RENDER_QUALITY);

        // controls how image pixels are filtered or resampled
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                              RenderingHints.VALUE_INTERPOLATION_BILINEAR);

        // antialiasing, on
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                              RenderingHints.VALUE_ANTIALIAS_ON);

        Map<RenderingHints.Key,Object> hints = new HashMap<>();
        hints.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        hints.put(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        hints.put(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.addRenderingHints(hints);

        // puts the original image into the newResizedImage
        g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
        g.dispose();

        // get file extension
        String s = target.getFileName().toString();
        String fileExtension = s.substring(s.lastIndexOf(".") + 1);

        // we want image in png format
        ImageIO.write(newResizedImage, fileExtension, target.toFile());

    }

}