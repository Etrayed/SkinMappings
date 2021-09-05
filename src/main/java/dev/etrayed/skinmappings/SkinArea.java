package dev.etrayed.skinmappings;

import java.util.Optional;

/**
 * @author Etrayed
 */
public final class SkinArea {

    private final int startX, startY, width, height;

    final Boolean slim;

    SkinArea(int startX, int startY, int width, int height, Boolean slim) {
        this.startX = startX;
        this.startY = startY;
        this.width = width;
        this.height = height;
        this.slim = slim;
    }

    public int startX() {
        return startX;
    }

    public int startY() {
        return startY;
    }

    public int width() {
        return width;
    }

    public int height() {
        return height;
    }

    public boolean isSlim() {
        return !isModelAffected() || slim == Boolean.TRUE;
    }

    public boolean isClassic() {
        return !isModelAffected() || slim == Boolean.FALSE;
    }

    @SuppressWarnings({"BooleanMethodIsAlwaysInverted", "WeakerAccess"})
    public boolean isModelAffected() {
        return slim != null;
    }

    public Optional<Boolean> slimRaw() {
        return Optional.ofNullable(slim);
    }
}
