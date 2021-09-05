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

    public static void main(String[] args) {
        TextureValue value = extractBase64("ewogICJ0aW1lc3RhbXAiIDogMTYzMDgzNTEzMTg5MiwKICAicHJvZmlsZUlkIiA6ICIwOTVkZDFkZTQ4MzM0ZjMwYTgzMTEzZGU4NGJjNGJjZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJFdHJheWVkIiwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2MyZTMxNDcxYzQzZDQzMmIzN2EwOWMyMTA2Njg1ZjA1MTBmMWYwNDk2YTMxODNiMzVlNWY4M2E5Yzc0NDAxNzEiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==");

        System.out.println(value);
    }
}
