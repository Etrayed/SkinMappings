package dev.etrayed.skinmappings.texture;

import com.google.gson.Gson;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @author Etrayed
 */
public final class TextureValueExtrator {

    private static final Gson GSON = new Gson();

    private TextureValueExtrator() {}

    @SuppressWarnings("WeakerAccess")
    public static TextureValue extractBase64(String base64Encoded) {
        return extract(new String(Base64.getDecoder().decode(base64Encoded), StandardCharsets.UTF_8));
    }

    @SuppressWarnings("WeakerAccess")
    public static TextureValue extract(String input) {
        return GSON.fromJson(input, TextureValue.class);
    }
}
