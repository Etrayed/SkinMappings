package dev.etrayed.skinmappings;

import java.util.Optional;

/**
 * @author Etrayed
 */
public final class SkinPart {

    private final SkinArea top, bottom, right, front, left, back;

    private final boolean overlay;

    SkinPart(SkinArea top, SkinArea bottom, SkinArea right, SkinArea front, SkinArea left, SkinArea back, boolean overlay) {
        this.top = top;
        this.bottom = bottom;
        this.right = right;
        this.front = front;
        this.left = left;
        this.back = back;
        this.overlay = overlay;
    }

    public SkinArea top() {
        return top;
    }

    public SkinArea bottom() {
        return bottom;
    }

    public SkinArea right() {
        return right;
    }

    public SkinArea front() {
        return front;
    }

    public SkinArea left() {
        return left;
    }

    public SkinArea back() {
        return back;
    }

    public boolean isOverlay() {
        return overlay;
    }

    public boolean isSlim() {
        return !isModelAffected() || top.slim == Boolean.TRUE;
    }

    public boolean isClassic() {
        return !isModelAffected() || top.slim == Boolean.FALSE;
    }

    @SuppressWarnings({"BooleanMethodIsAlwaysInverted", "WeakerAccess"})
    public boolean isModelAffected() {
        return top.slim != null;
    }

    public Optional<Boolean> slimRaw() {
        return Optional.ofNullable(top.slim);
    }
}
