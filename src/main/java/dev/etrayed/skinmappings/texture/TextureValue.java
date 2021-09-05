package dev.etrayed.skinmappings.texture;

import com.google.gson.*;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

/**
 * @author Etrayed
 */
public final class TextureValue {

    @SerializedName("timestamp")
    private final long uploadedAt;

    @JsonAdapter(DashIndependentUUIDDeserializer.class)
    private final UUID profileId;

    private final String profileName;

    @SerializedName("textures")
    @JsonAdapter(SkinDeserializer.class)
    private final Skin skin;

    public TextureValue(long uploadedAt, UUID profileId, String profileName, Skin skin) {
        this.uploadedAt = uploadedAt;
        this.profileId = profileId;
        this.profileName = profileName;
        this.skin = skin;
    }

    public long uploadedAtEpocheMilli() {
        return uploadedAt;
    }

    public Instant uploadedAtInstant() {
        return Instant.ofEpochMilli(uploadedAt);
    }

    public UUID profileId() {
        return profileId;
    }

    public String profileName() {
        return profileName;
    }

    public Skin skin() {
        return skin;
    }

    @Override
    public String toString() {
        return "TextureValue{" +
                "uploadedAt=" + uploadedAt +
                ", profileId=" + profileId +
                ", profileName='" + profileName + '\'' +
                ", skin=" + skin +
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

        TextureValue value = (TextureValue) obj;

        return uploadedAt == value.uploadedAt && Objects.equals(profileId, value.profileId) && Objects.equals(profileName, value.profileName) && Objects.equals(skin, value.skin);
    }

    @SuppressWarnings("ObjectInstantiationInEqualsHashCode")
    @Override
    public int hashCode() {
        return Objects.hash(uploadedAt, profileId, profileName, skin);
    }

    private static final class DashIndependentUUIDDeserializer implements JsonDeserializer<UUID> {

        @Override
        public UUID deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
            if(json == null) {
                return null;
            }

            if(!json.isJsonPrimitive()) {
                throw new JsonParseException("Cannot deserialize UUID from " + json.getClass().getSimpleName());
            }

            String str = json.getAsString();

            return new UUID(parseUnsignedLongHex(str.substring(0, 16)), parseUnsignedLongHex(str.substring(16)));
        }

        // GSON: UnsignedLongs - all checks and exceptions removed as we expect only valid input
        private long parseUnsignedLongHex(String input) {
            long value = 0;

            for (int pos = 0; pos < input.length(); pos++) {
                value = (value * 16) + Character.digit(input.charAt(pos), 16);
            }

            return value;
        }
    }

    private static final class SkinDeserializer implements JsonDeserializer<Skin> {

        @Override
        public Skin deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
            if(json == null) {
                return null;
            }

            if(!json.isJsonObject()) {
                throw new JsonParseException("Cannot deserialize Skin from " + json.getClass().getSimpleName());
            }

            JsonObject object = json.getAsJsonObject();

            if(!object.has("SKIN")) {
                return null;
            }

            object = object.getAsJsonObject("SKIN");

            if(!object.has("url")) {
                return null;
            }

            try {
                return new Skin(new URL(object.get("url").getAsString()), object.has("metadata")
                        && (object = object.getAsJsonObject("metadata")).has("model")
                        && object.get("model").getAsString().equals("slim"));
            } catch (MalformedURLException e) {
                throw new JsonParseException(e);
            }
        }
    }
}
