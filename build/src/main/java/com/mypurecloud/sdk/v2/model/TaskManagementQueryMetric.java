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
 * TaskManagementQueryMetric
 */

public class TaskManagementQueryMetric  implements Serializable {
  

  private static class NameEnumDeserializer extends StdDeserializer<NameEnum> {
    public NameEnumDeserializer() {
      super(NameEnumDeserializer.class);
    }

    @Override
    public NameEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return NameEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The requested metric name
   */
 @JsonDeserialize(using = NameEnumDeserializer.class)
  public enum NameEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    OWORKITEMSUNASSIGNED("oWorkitemsUnassigned"),
    OWORKITEMSASSIGNED("oWorkitemsAssigned"),
    OWORKITEMSCONNECTED("oWorkitemsConnected"),
    OWORKITEMSPARKED("oWorkitemsParked"),
    OWORKITEMSHELD("oWorkitemsHeld"),
    OWORKITEMSACDSTARTED("oWorkitemsAcdStarted"),
    OWORKITEMSDECLINED("oWorkitemsDeclined"),
    OWORKITEMSIDLE("oWorkitemsIdle"),
    OWORKITEMSDISCONNECTED("oWorkitemsDisconnected"),
    OWORKITEMSACDEXPIRED("oWorkitemsAcdExpired"),
    OWORKITEMSDUE("oWorkitemsDue"),
    OWORKITEMSOVERDUE("oWorkitemsOverDue"),
    OWORKITEMOLDESTUNASSIGNED("oWorkitemOldestUnassigned"),
    OWORKITEMOLDESTASSIGNED("oWorkitemOldestAssigned");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static NameEnum fromString(String key) {
      if (key == null) return null;

      for (NameEnum value : NameEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return NameEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private NameEnum name = null;

  private static class QualifierEnumDeserializer extends StdDeserializer<QualifierEnum> {
    public QualifierEnumDeserializer() {
      super(QualifierEnumDeserializer.class);
    }

    @Override
    public QualifierEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return QualifierEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Qualifier for duration based metrics. Required when requesting oWorkitemsDue
   */
 @JsonDeserialize(using = QualifierEnumDeserializer.class)
  public enum QualifierEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    HOURS24("Hours24"),
    HOURS72("Hours72");

    private String value;

    QualifierEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static QualifierEnum fromString(String key) {
      if (key == null) return null;

      for (QualifierEnum value : QualifierEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return QualifierEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private QualifierEnum qualifier = null;

  public TaskManagementQueryMetric() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public TaskManagementQueryMetric(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The requested metric name
   **/
  public TaskManagementQueryMetric name(NameEnum name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The requested metric name")
  @JsonProperty("name")
  public NameEnum getName() {
    return name;
  }
  public void setName(NameEnum name) {
    this.name = name;
  }


  /**
   * Qualifier for duration based metrics. Required when requesting oWorkitemsDue
   **/
  public TaskManagementQueryMetric qualifier(QualifierEnum qualifier) {
    this.qualifier = qualifier;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Qualifier for duration based metrics. Required when requesting oWorkitemsDue")
  @JsonProperty("qualifier")
  public QualifierEnum getQualifier() {
    return qualifier;
  }
  public void setQualifier(QualifierEnum qualifier) {
    this.qualifier = qualifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskManagementQueryMetric taskManagementQueryMetric = (TaskManagementQueryMetric) o;

    return Objects.equals(this.name, taskManagementQueryMetric.name) &&
            Objects.equals(this.qualifier, taskManagementQueryMetric.qualifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, qualifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskManagementQueryMetric {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    qualifier: ").append(toIndentedString(qualifier)).append("\n");
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

