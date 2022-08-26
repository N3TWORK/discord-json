package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;


@Value.Immutable
@JsonSerialize(as = ImmutablePartialInviteData.class)
@JsonDeserialize(as = ImmutablePartialInviteData.class)
public interface PartialInviteData {

    static ImmutablePartialInviteData.Builder builder() {
        return ImmutablePartialInviteData.builder();
    }

    String code();

    @JsonProperty("uses")
    Integer uses();
}
