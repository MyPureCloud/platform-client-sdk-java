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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.WfmIntegrationsHrisTimeOffTypesJobTopicErrorBody;
import com.mypurecloud.sdk.v2.model.WfmIntegrationsHrisTimeOffTypesJobTopicHrisTimeOffType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WfmIntegrationsHrisTimeOffTypesJobTopicHrisTimeOffTypesJobNotification
 */

public class WfmIntegrationsHrisTimeOffTypesJobTopicHrisTimeOffTypesJobNotification  implements Serializable {
  
  private String id = null;
  private List<WfmIntegrationsHrisTimeOffTypesJobTopicHrisTimeOffType> entities = new ArrayList<WfmIntegrationsHrisTimeOffTypesJobTopicHrisTimeOffType>();

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets status
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PROCESSING("Processing"),
    COMPLETE("Complete"),
    ERROR("Error");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;
  private WfmIntegrationsHrisTimeOffTypesJobTopicErrorBody error = null;

  
  /**
   **/
  public WfmIntegrationsHrisTimeOffTypesJobTopicHrisTimeOffTypesJobNotification id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public WfmIntegrationsHrisTimeOffTypesJobTopicHrisTimeOffTypesJobNotification entities(List<WfmIntegrationsHrisTimeOffTypesJobTopicHrisTimeOffType> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<WfmIntegrationsHrisTimeOffTypesJobTopicHrisTimeOffType> getEntities() {
    return entities;
  }
  public void setEntities(List<WfmIntegrationsHrisTimeOffTypesJobTopicHrisTimeOffType> entities) {
    this.entities = entities;
  }


  /**
   **/
  public WfmIntegrationsHrisTimeOffTypesJobTopicHrisTimeOffTypesJobNotification status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   **/
  public WfmIntegrationsHrisTimeOffTypesJobTopicHrisTimeOffTypesJobNotification error(WfmIntegrationsHrisTimeOffTypesJobTopicErrorBody error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("error")
  public WfmIntegrationsHrisTimeOffTypesJobTopicErrorBody getError() {
    return error;
  }
  public void setError(WfmIntegrationsHrisTimeOffTypesJobTopicErrorBody error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmIntegrationsHrisTimeOffTypesJobTopicHrisTimeOffTypesJobNotification wfmIntegrationsHrisTimeOffTypesJobTopicHrisTimeOffTypesJobNotification = (WfmIntegrationsHrisTimeOffTypesJobTopicHrisTimeOffTypesJobNotification) o;

    return Objects.equals(this.id, wfmIntegrationsHrisTimeOffTypesJobTopicHrisTimeOffTypesJobNotification.id) &&
            Objects.equals(this.entities, wfmIntegrationsHrisTimeOffTypesJobTopicHrisTimeOffTypesJobNotification.entities) &&
            Objects.equals(this.status, wfmIntegrationsHrisTimeOffTypesJobTopicHrisTimeOffTypesJobNotification.status) &&
            Objects.equals(this.error, wfmIntegrationsHrisTimeOffTypesJobTopicHrisTimeOffTypesJobNotification.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, entities, status, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmIntegrationsHrisTimeOffTypesJobTopicHrisTimeOffTypesJobNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

