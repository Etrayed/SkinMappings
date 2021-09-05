package dev.etrayed.skinmappings.texture;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;

/**
 * @author Etrayed
 */
public final class Skin {

    private final URL textureURL;

    private final boolean slim;

    private BufferedImage cachedImage;

    Skin(URL textureURL, boolean slim) {
        this.textureURL = textureURL;
        this.slim = slim;
    }

    public URL textureURL() {
        return textureURL;
    }

    public boolean isSlim() {
        return slim;
    }

    public BufferedImage downloadTexture() throws IOException {
        if(cachedImage != null) {
            return cachedImage;
        }

        return cachedImage = ImageIO.read(textureURL);
    }

    @Override
    public String toString() {
        return "Skin{" +
                "textureURL=" + textureURL +
                ", slim=" + slim +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if(obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Skin skin = (Skin) obj;

        return slim == skin.slim && Objects.equals(textureURL, skin.textureURL);
    }

    @SuppressWarnings("ObjectInstantiationInEqualsHashCode")
    @Override
    public int hashCode() {
        return Objects.hash(textureURL, slim);
    }
}
