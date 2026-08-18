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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * IntentClassifierInfo
 */

public class IntentClassifierInfo  implements Serializable {
  
  private String classifierId = null;
  private String version = null;

  private static class StateEnumDeserializer extends StdDeserializer<StateEnum> {
    public StateEnumDeserializer() {
      super(StateEnumDeserializer.class);
    }

    @Override
    public StateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The intent classifier state
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DRAFT("Draft"),
    TESTREADY("TestReady"),
    PRODUCTIONREADY("ProductionReady");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateEnum fromString(String key) {
      if (key == null) return null;

      for (StateEnum value : StateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateEnum state = null;

  public IntentClassifierInfo() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public IntentClassifierInfo(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The intent classifier ID
   **/
  public IntentClassifierInfo classifierId(String classifierId) {
    this.classifierId = classifierId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The intent classifier ID")
  @JsonProperty("classifierId")
  public String getClassifierId() {
    return classifierId;
  }
  public void setClassifierId(String classifierId) {
    this.classifierId = classifierId;
  }


  /**
   * The intent classifier version
   **/
  public IntentClassifierInfo version(String version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The intent classifier version")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }


  /**
   * The intent classifier state
   **/
  public IntentClassifierInfo state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The intent classifier state")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntentClassifierInfo intentClassifierInfo = (IntentClassifierInfo) o;

    return Objects.equals(this.classifierId, intentClassifierInfo.classifierId) &&
            Objects.equals(this.version, intentClassifierInfo.version) &&
            Objects.equals(this.state, intentClassifierInfo.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classifierId, version, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntentClassifierInfo {\n");
    
    sb.append("    classifierId: ").append(toIndentedString(classifierId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

