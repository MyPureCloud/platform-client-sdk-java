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
import com.mypurecloud.sdk.v2.model.WfmTimeOffBalanceJobTopicErrorBody;
import com.mypurecloud.sdk.v2.model.WfmTimeOffBalanceJobTopicTimeOffBalance;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WfmTimeOffBalanceJobTopicTimeOffBalanceJobNotification
 */

public class WfmTimeOffBalanceJobTopicTimeOffBalanceJobNotification  implements Serializable {
  
  private String id = null;
  private List<WfmTimeOffBalanceJobTopicTimeOffBalance> entities = null;

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
  private WfmTimeOffBalanceJobTopicErrorBody error = null;

  public WfmTimeOffBalanceJobTopicTimeOffBalanceJobNotification() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      entities = new ArrayList<WfmTimeOffBalanceJobTopicTimeOffBalance>();
    }
  }

  
  /**
   **/
  public WfmTimeOffBalanceJobTopicTimeOffBalanceJobNotification id(String id) {
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
  public WfmTimeOffBalanceJobTopicTimeOffBalanceJobNotification entities(List<WfmTimeOffBalanceJobTopicTimeOffBalance> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<WfmTimeOffBalanceJobTopicTimeOffBalance> getEntities() {
    return entities;
  }
  public void setEntities(List<WfmTimeOffBalanceJobTopicTimeOffBalance> entities) {
    this.entities = entities;
  }


  /**
   **/
  public WfmTimeOffBalanceJobTopicTimeOffBalanceJobNotification status(StatusEnum status) {
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
  public WfmTimeOffBalanceJobTopicTimeOffBalanceJobNotification error(WfmTimeOffBalanceJobTopicErrorBody error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("error")
  public WfmTimeOffBalanceJobTopicErrorBody getError() {
    return error;
  }
  public void setError(WfmTimeOffBalanceJobTopicErrorBody error) {
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
    WfmTimeOffBalanceJobTopicTimeOffBalanceJobNotification wfmTimeOffBalanceJobTopicTimeOffBalanceJobNotification = (WfmTimeOffBalanceJobTopicTimeOffBalanceJobNotification) o;

    return Objects.equals(this.id, wfmTimeOffBalanceJobTopicTimeOffBalanceJobNotification.id) &&
            Objects.equals(this.entities, wfmTimeOffBalanceJobTopicTimeOffBalanceJobNotification.entities) &&
            Objects.equals(this.status, wfmTimeOffBalanceJobTopicTimeOffBalanceJobNotification.status) &&
            Objects.equals(this.error, wfmTimeOffBalanceJobTopicTimeOffBalanceJobNotification.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, entities, status, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmTimeOffBalanceJobTopicTimeOffBalanceJobNotification {\n");
    
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

