package dev.etrayed.skinmappings;

/**
 * @author Etrayed
 */
public final class SkinMappings {

    @SuppressWarnings("WeakerAccess")
    public static final SkinArea
            AREA_HEAD_TOP = area(8, 0, 8),
            AREA_HEAD_BOTTOM = area(16, 0, 8),
            AREA_HAT_TOP = area(40, 0, 8),
            AREA_HAT_BOTTOM = area(48, 0, 8),
            AREA_HEAD_RIGHT = area(0, 8, 8),
            AREA_HEAD_FRONT = area(8, 8, 8),
            AREA_HEAD_LEFT = area(16, 8, 8),
            AREA_HEAD_BACK = area(24, 8, 8),
            AREA_HAT_RIGHT = area(32, 8, 8),
            AREA_HAT_FRONT = area(40, 8, 8),
            AREA_HAT_LEFT = area(48, 8, 8),
            AREA_HAT_BACK = area(56, 8, 8),
            AREA_RIGHT_LEG_TOP = area(4, 16, 4),
            AREA_RIGHT_LEG_BOTTOM = area(8, 16, 4),
            AREA_BODY_TOP = area(28, 16, 8, 4),
            AREA_BODY_BOTTOM = area(36, 16, 8, 4),
            AREA_RIGHT_ARM_TOP = classic4x4Square(44, 16),
            AREA_RIGHT_ARM_TOP_SLIM = slim3x4Rectangle(44, 16),
            AREA_RIGHT_ARM_BOTTOM = classic4x4Square(48, 16),
            AREA_RIGHT_ARM_BOTTOM_SLIM = slim3x4Rectangle(47, 16),
            AREA_RIGHT_LEG_RIGHT = area(0, 20, 4, 12),
            AREA_RIGHT_LEG_FRONT = area(4, 20, 4, 12),
            AREA_RIGHT_LEG_LEFT = area(8, 20, 4, 12),
            AREA_RIGHT_LEG_BACK = area(12, 20, 4, 12),
            AREA_BODY_RIGHT = area(16, 20, 4, 12),
            AREA_BODY_FRONT = area(20, 20, 8, 12),
            AREA_BODY_LEFT = area(28, 20, 4, 12),
            AREA_BODY_BACK = area(32, 20, 8, 12),
            AREA_RIGHT_ARM_RIGHT = area(40, 20, 4, 12),
            AREA_RIGHT_ARM_FRONT = area(44, 20, 4, 12, false),
            AREA_RIGHT_ARM_FRONT_SLIM = area(44, 20, 3, 12, true),
            AREA_RIGHT_ARM_LEFT = area(48, 20, 4, 12, false),
            AREA_RIGHT_ARM_LEFT_SLIM = area(47, 20, 3, 12, true),
            AREA_RIGHT_ARM_BACK = area(52, 20, 4, 12, false),
            AREA_RIGHT_ARM_BACK_SLIM = area(50, 20, 3, 12, true),
            AREA_RIGHT_PANT_TOP = area(4, 32, 4),
            AREA_RIGHT_PANT_BOTTOM = area(8, 32, 4),
            AREA_JACKET_TOP = area(20, 32, 8, 4),
            AREA_JACKET_BOTTOM = area(28, 32, 8, 4),
            AREA_RIGHT_SLEEVE_TOP = classic4x4Square(44, 32),
            AREA_RIGHT_SLEEVE_TOP_SLIM = slim3x4Rectangle(44, 32),
            AREA_RIGHT_SLEEVE_BOTTOM = classic4x4Square(48, 32),
            AREA_RIGHT_SLEEVE_BOTTOM_SLIM = slim3x4Rectangle(47, 32),
            AREA_RIGHT_PANT_RIGHT = area(0, 36, 4, 12),
            AREA_RIGHT_PANT_FRONT = area(4, 36, 4, 12),
            AREA_RIGHT_PANT_LEFT = area(8, 36, 4, 12),
            AREA_RIGHT_PANT_BACK = area(12, 36, 4, 12),
            AREA_JACKET_RIGHT = area(16, 36, 4, 12),
            AREA_JACKET_FRONT = area(20, 36, 8, 12),
            AREA_JACKET_LEFT = area(28, 36, 4, 12),
            AREA_JACKET_BACK = area(32, 36, 8, 12),
            AREA_RIGHT_SLEEVE_RIGHT = area(40, 36, 4, 12),
            AREA_RIGHT_SLEEVE_FRONT = area(44, 36, 4, 12, false),
            AREA_RIGHT_SLEEVE_FRONT_SLIM = area(44, 36, 3, 12, true),
            AREA_RIGHT_SLEEVE_LEFT = area(48, 36, 4, 12, false),
            AREA_RIGHT_SLEEVE_LEFT_SLIM = area(47, 36, 4, 12, true),
            AREA_RIGHT_SLEEVE_BACK = area(52, 36, 4, 12, false),
            AREA_RIGHT_SLEEVE_BACK_SLIM = area(50, 36, 3, 12, true),
            AREA_LEFT_PANT_TOP = area(4, 48, 4),
            AREA_LEFT_PANT_BOTTOM = area(8, 48, 4),
            AREA_LEFT_LEG_TOP = area(20, 48, 4),
            AREA_LEFT_LEG_BOTTOM = area(24, 48, 4),
            AREA_LEFT_ARM_TOP = classic4x4Square(36, 48),
            AREA_LEFT_ARM_TOP_SLIM = slim3x4Rectangle(36, 48),
            AREA_LEFT_ARM_BOTTOM = classic4x4Square(40, 48),
            AREA_LEFT_ARM_BOTTOM_SLIM = slim3x4Rectangle(39, 48),
            AREA_LEFT_SLEEVE_TOP = classic4x4Square(52, 48),
            AREA_LEFT_SLEEVE_TOP_SLIM = slim3x4Rectangle(52, 48),
            AREA_LEFT_SLEEVE_BOTTOM = classic4x4Square(56, 48),
            AREA_LEFT_SLEEVE_BOTTOM_SLIM = slim3x4Rectangle(55, 48),
            AREA_LEFT_PANT_RIGHT = area(0, 52, 4, 12),
            AREA_LEFT_PANT_FRONT = area(4, 52, 4, 12),
            AREA_LEFT_PANT_LEFT = area(8, 52, 4, 12),
            AREA_LEFT_PANT_BACK = area(12, 52, 4, 12),
            AREA_LEFT_LEG_RIGHT = area(16, 52, 4, 12),
            AREA_LEFT_LEG_FRONT = area(20, 52, 4, 12),
            AREA_LEFT_LEG_LEFT = area(24, 52, 4, 12),
            AREA_LEFT_LEG_BACK = area(28, 52, 4, 12),
            AREA_LEFT_ARM_RIGHT = area(32, 52, 4, 12),
            AREA_LEFT_ARM_FRONT = area(36, 52, 4, 12, false),
            AREA_LEFT_ARM_FRONT_SLIM = area(36, 52, 3, 12, true),
            AREA_LEFT_ARM_LEFT = area(40, 52, 4, 12, false),
            AREA_LEFT_ARM_LEFT_SLIM = area(39, 52, 4, 12, true),
            AREA_LEFT_ARM_BACK = area(44, 52, 4, 12, false),
            AREA_LEFT_ARM_BACK_SLIM = area(43, 52, 3, 12, true),
            AREA_LEFT_SLEEVE_RIGHT = area(48, 52, 4, 12),
            AREA_LEFT_SLEEVE_FRONT = area(52, 52, 4, 12, false),
            AREA_LEFT_SLEEVE_FRONT_SLIM = area(52, 52, 3, 12, true),
            AREA_LEFT_SLEEVE_LEFT = area(56, 52, 4, 12, false),
            AREA_LEFT_SLEEVE_LEFT_SLIM = area(55, 52, 4, 12, true),
            AREA_LEFT_SLEEVE_BACK = area(60, 52, 4, 12, false),
            AREA_LEFT_SLEEVE_BACK_SLIM = area(59, 52, 3, 12, true);

    @SuppressWarnings("WeakerAccess")
    public static final SkinPart
            PART_HEAD = new SkinPart(AREA_HEAD_TOP, AREA_HEAD_BOTTOM, AREA_HEAD_RIGHT, AREA_HEAD_FRONT, AREA_HEAD_LEFT, AREA_HEAD_BACK, false),
            PART_HAT = new SkinPart(AREA_HAT_TOP, AREA_HAT_BOTTOM, AREA_HAT_RIGHT, AREA_HAT_FRONT, AREA_HAT_LEFT, AREA_HAT_BACK, true),
            PART_BODY = new SkinPart(AREA_BODY_TOP, AREA_BODY_BOTTOM, AREA_BODY_RIGHT, AREA_BODY_FRONT, AREA_BODY_LEFT, AREA_BODY_BACK, false),
            PART_JACKET = new SkinPart(AREA_JACKET_TOP, AREA_JACKET_BOTTOM, AREA_JACKET_RIGHT, AREA_JACKET_FRONT, AREA_JACKET_LEFT, AREA_JACKET_BACK, true),
            PART_LEFT_ARM = new SkinPart(AREA_LEFT_ARM_TOP, AREA_LEFT_ARM_BOTTOM, AREA_LEFT_ARM_RIGHT, AREA_LEFT_ARM_FRONT, AREA_LEFT_ARM_LEFT, AREA_LEFT_ARM_BACK, false),
            PART_LEFT_ARM_SLIM = new SkinPart(AREA_LEFT_ARM_TOP_SLIM, AREA_LEFT_ARM_BOTTOM_SLIM, AREA_LEFT_ARM_RIGHT, AREA_LEFT_ARM_FRONT_SLIM, AREA_LEFT_ARM_LEFT_SLIM, AREA_LEFT_ARM_BACK_SLIM, false),
            PART_LEFT_SLEEVE = new SkinPart(AREA_LEFT_SLEEVE_TOP, AREA_LEFT_SLEEVE_BOTTOM, AREA_LEFT_SLEEVE_RIGHT, AREA_LEFT_SLEEVE_FRONT, AREA_LEFT_SLEEVE_LEFT, AREA_LEFT_SLEEVE_BACK, true),
            PART_LEFT_SLEEVE_SLIM = new SkinPart(AREA_LEFT_SLEEVE_TOP_SLIM, AREA_LEFT_SLEEVE_BOTTOM_SLIM, AREA_LEFT_SLEEVE_RIGHT, AREA_LEFT_SLEEVE_FRONT_SLIM, AREA_LEFT_SLEEVE_LEFT_SLIM, AREA_LEFT_SLEEVE_BACK_SLIM, true),
            PART_RIGHT_ARM = new SkinPart(AREA_RIGHT_ARM_TOP, AREA_RIGHT_ARM_BOTTOM, AREA_RIGHT_ARM_RIGHT, AREA_RIGHT_ARM_FRONT, AREA_RIGHT_ARM_LEFT, AREA_RIGHT_ARM_BACK, false),
            PART_RIGHT_ARM_SLIM = new SkinPart(AREA_RIGHT_ARM_TOP_SLIM, AREA_RIGHT_ARM_BOTTOM_SLIM, AREA_RIGHT_ARM_RIGHT, AREA_RIGHT_ARM_FRONT_SLIM, AREA_RIGHT_ARM_LEFT_SLIM, AREA_RIGHT_ARM_BACK_SLIM, false),
            PART_RIGHT_SLEEVE = new SkinPart(AREA_RIGHT_SLEEVE_TOP, AREA_RIGHT_SLEEVE_BOTTOM, AREA_RIGHT_SLEEVE_RIGHT, AREA_RIGHT_SLEEVE_FRONT, AREA_RIGHT_SLEEVE_LEFT, AREA_RIGHT_SLEEVE_BACK, true),
            PART_RIGHT_SLEEVE_SLIM = new SkinPart(AREA_RIGHT_SLEEVE_TOP_SLIM, AREA_RIGHT_SLEEVE_BOTTOM_SLIM, AREA_RIGHT_SLEEVE_RIGHT, AREA_RIGHT_SLEEVE_FRONT_SLIM, AREA_RIGHT_SLEEVE_LEFT_SLIM, AREA_RIGHT_SLEEVE_BACK_SLIM, true),
            PART_LEFT_LEG = new SkinPart(AREA_LEFT_LEG_TOP, AREA_LEFT_LEG_BOTTOM, AREA_LEFT_LEG_RIGHT, AREA_LEFT_LEG_FRONT, AREA_LEFT_LEG_LEFT, AREA_LEFT_LEG_BACK, false),
            PART_LEFT_PANT = new SkinPart(AREA_LEFT_PANT_TOP, AREA_LEFT_PANT_BOTTOM, AREA_LEFT_PANT_RIGHT, AREA_LEFT_PANT_FRONT, AREA_LEFT_PANT_LEFT, AREA_LEFT_PANT_BACK, true),
            PART_RIGHT_LEG = new SkinPart(AREA_RIGHT_LEG_TOP, AREA_RIGHT_LEG_BOTTOM, AREA_RIGHT_LEG_RIGHT, AREA_RIGHT_LEG_FRONT, AREA_RIGHT_LEG_LEFT, AREA_RIGHT_LEG_BACK, false),
            PART_RIGHT_PANT = new SkinPart(AREA_RIGHT_PANT_TOP, AREA_RIGHT_PANT_BOTTOM, AREA_RIGHT_PANT_RIGHT, AREA_RIGHT_PANT_FRONT, AREA_RIGHT_PANT_LEFT, AREA_RIGHT_PANT_BACK, true);

    public static final WrappedSkinPart
            WRAPPED_HEAD = new WrappedSkinPart(PART_HEAD, PART_HAT),
            WRAPPED_BODY = new WrappedSkinPart(PART_BODY, PART_JACKET),
            WRAPPED_LEFT_ARM = new WrappedSkinPart(PART_LEFT_ARM, PART_LEFT_SLEEVE, PART_LEFT_ARM_SLIM, PART_LEFT_SLEEVE_SLIM),
            WRAPPED_RIGHT_ARM = new WrappedSkinPart(PART_RIGHT_ARM, PART_RIGHT_SLEEVE, PART_RIGHT_ARM_SLIM, PART_RIGHT_SLEEVE_SLIM),
            WRAPPED_LEFT_LEG = new WrappedSkinPart(PART_LEFT_LEG, PART_LEFT_PANT),
            WRAPPED_RIGHT_LEG = new WrappedSkinPart(PART_RIGHT_LEG, PART_RIGHT_PANT);

    private static SkinArea classic4x4Square(int startX, int startY) {
        return area(startX, startY, 4, 4, false);
    }

    private static SkinArea slim3x4Rectangle(int startX, int startY) {
        return area(startX, startY, 3, 4, true);
    }

    private static SkinArea area(int startX, int startY, int length) {
        return area(startX, startY, length, length);
    }

    private static SkinArea area(int startX, int startY, int width, int height) {
        return area(startX, startY, width, height, null);
    }

    private static SkinArea area(int startX, int startY, int width, int height, Boolean slim) {
        return new SkinArea(startX, startY, width, height, slim);
    }

    private SkinMappings() {}
}
