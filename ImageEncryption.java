import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ImageEncryption {

    static int key = 123; // encryption key

    public static void encryptDecrypt(String input, String output) throws Exception {

        BufferedImage img = ImageIO.read(new File(input));

        int width = img.getWidth();
        int height = img.getHeight();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                int pixel = img.getRGB(x, y);

                int r = (pixel >> 16) & 0xff;
                int g = (pixel >> 8) & 0xff;
                int b = pixel & 0xff;

                // XOR encryption
                r = r ^ key;
                g = g ^ key;
                b = b ^ key;

                int newPixel = (r << 16) | (g << 8) | b;

                img.setRGB(x, y, newPixel);
            }
        }

        ImageIO.write(img, "jpg", new File(output));
    }

    public static void main(String[] args) {
        try {

            encryptDecrypt("input.jpg", "encrypted.jpg");

            // running again decrypts because XOR reverses itself
            encryptDecrypt("encrypted.jpg", "decrypted.jpg");

            System.out.println("Encryption and Decryption completed!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}