package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.util.ArrayList;
import java.io.IOException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ArchitectJobMessageDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * ArchitectJobMessage
 */

public class ArchitectJobMessage  implements Serializable {
  
  private Date dateTime = null;

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The message type.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ERROR("Error"),
    WARNING("Warning"),
    UNKNOWN("Unknown");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private String text = null;
  private List<ArchitectJobMessageDetail> details = null;

  public ArchitectJobMessage() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      details = new ArrayList<ArchitectJobMessageDetail>();
    }
  }

  public ArchitectJobMessage(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      details = new ArrayList<ArchitectJobMessageDetail>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The DateTime when the message was generated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateTime")
  public Date getDateTime() {
    return dateTime;
  }


  @ApiModelProperty(example = "null", value = "The message type.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }


  @ApiModelProperty(example = "null", value = "The text of the message.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }


  @ApiModelProperty(example = "null", value = "Structured information about the message, absent from the large majority of messages. Populated only by publish jobs, and only on errors raised when a Genesys Cloud entity reference in the flow definition could not be resolved. Export and validate jobs resolve an existing flow by id rather than processing a flow definition, so they never return it. Holds one entry per request captured within the failing lookup, ordered oldest request first, and more than one entry is normal. Entries for requests that succeeded are included alongside the request that failed. A lookup failure usually also produces a separate message with similar text and no details.")
  @JsonProperty("details")
  public List<ArchitectJobMessageDetail> getDetails() {
    return details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArchitectJobMessage architectJobMessage = (ArchitectJobMessage) o;

    return Objects.equals(this.dateTime, architectJobMessage.dateTime) &&
            Objects.equals(this.type, architectJobMessage.type) &&
            Objects.equals(this.text, architectJobMessage.text) &&
            Objects.equals(this.details, architectJobMessage.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, type, text, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArchitectJobMessage {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

