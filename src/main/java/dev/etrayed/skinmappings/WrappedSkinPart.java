package dev.etrayed.skinmappings;

import java.util.Optional;

/**
 * @author Etrayed
 */
public final class WrappedSkinPart {

    private final SkinPart basePart, overlayPart;

    private final SkinPart slimBasePart, slimOverlayPart;

    WrappedSkinPart(SkinPart basePart, SkinPart overlayPart) {
        this(basePart, overlayPart, null, null);
    }

    WrappedSkinPart(SkinPart basePart, SkinPart overlayPart, SkinPart slimBasePart, SkinPart slimOverlayPart) {
        this.basePart = basePart;
        this.overlayPart = overlayPart;
        this.slimBasePart = slimBasePart;
        this.slimOverlayPart = slimOverlayPart;
    }

    public SkinPart basePart() {
        return basePart;
    }

    public SkinPart overlayPart() {
        return overlayPart;
    }

    public boolean isAffectedByModel() {
        return slimBasePart != null || slimOverlayPart != null;
    }

    public Optional<SkinPart> slimBasePart() {
        return Optional.ofNullable(slimBasePart);
    }

    public Optional<SkinPart> slimOverlayPart() {
        return Optional.ofNullable(slimOverlayPart);
    }
}
