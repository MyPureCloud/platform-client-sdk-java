package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.LineStatus;
import com.mypurecloud.sdk.v2.model.ProvisionInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * PhoneStatus
 */

public class PhoneStatus  implements Serializable {
  
  private String id = null;
  private String name = null;

  private static class OperationalStatusEnumDeserializer extends StdDeserializer<OperationalStatusEnum> {
    public OperationalStatusEnumDeserializer() {
      super(OperationalStatusEnumDeserializer.class);
    }

    @Override
    public OperationalStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OperationalStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The Operational Status of this phone
   */
 @JsonDeserialize(using = OperationalStatusEnumDeserializer.class)
  public enum OperationalStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    OPERATIONAL("OPERATIONAL"),
    DEGRADED("DEGRADED"),
    OFFLINE("OFFLINE"),
    UNKNOWN("UNKNOWN");

    private String value;

    OperationalStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OperationalStatusEnum fromString(String key) {
      if (key == null) return null;

      for (OperationalStatusEnum value : OperationalStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OperationalStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OperationalStatusEnum operationalStatus = null;

  private static class EdgesStatusEnumDeserializer extends StdDeserializer<EdgesStatusEnum> {
    public EdgesStatusEnumDeserializer() {
      super(EdgesStatusEnumDeserializer.class);
    }

    @Override
    public EdgesStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return EdgesStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The status of the primary or secondary Edges assigned to the phone lines.
   */
 @JsonDeserialize(using = EdgesStatusEnumDeserializer.class)
  public enum EdgesStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    IN_SERVICE("IN_SERVICE"),
    MIXED_SERVICE("MIXED_SERVICE"),
    OUT_OF_SERVICE("OUT_OF_SERVICE"),
    NO_EDGES("NO_EDGES");

    private String value;

    EdgesStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static EdgesStatusEnum fromString(String key) {
      if (key == null) return null;

      for (EdgesStatusEnum value : EdgesStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return EdgesStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private EdgesStatusEnum edgesStatus = null;
  private String eventCreationTime = null;
  private ProvisionInfo provision = null;
  private List<LineStatus> lineStatuses = new ArrayList<LineStatus>();

  private static class PhoneAssignmentToEdgeTypeEnumDeserializer extends StdDeserializer<PhoneAssignmentToEdgeTypeEnum> {
    public PhoneAssignmentToEdgeTypeEnumDeserializer() {
      super(PhoneAssignmentToEdgeTypeEnumDeserializer.class);
    }

    @Override
    public PhoneAssignmentToEdgeTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return PhoneAssignmentToEdgeTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The phone status's edge assignment type.
   */
 @JsonDeserialize(using = PhoneAssignmentToEdgeTypeEnumDeserializer.class)
  public enum PhoneAssignmentToEdgeTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PRIMARY("PRIMARY"),
    SECONDARY("SECONDARY");

    private String value;

    PhoneAssignmentToEdgeTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static PhoneAssignmentToEdgeTypeEnum fromString(String key) {
      if (key == null) return null;

      for (PhoneAssignmentToEdgeTypeEnum value : PhoneAssignmentToEdgeTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return PhoneAssignmentToEdgeTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private PhoneAssignmentToEdgeTypeEnum phoneAssignmentToEdgeType = null;
  private DomainEntityRef edge = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public PhoneStatus name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The Operational Status of this phone
   **/
  public PhoneStatus operationalStatus(OperationalStatusEnum operationalStatus) {
    this.operationalStatus = operationalStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Operational Status of this phone")
  @JsonProperty("operationalStatus")
  public OperationalStatusEnum getOperationalStatus() {
    return operationalStatus;
  }
  public void setOperationalStatus(OperationalStatusEnum operationalStatus) {
    this.operationalStatus = operationalStatus;
  }

  
  /**
   * The status of the primary or secondary Edges assigned to the phone lines.
   **/
  public PhoneStatus edgesStatus(EdgesStatusEnum edgesStatus) {
    this.edgesStatus = edgesStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of the primary or secondary Edges assigned to the phone lines.")
  @JsonProperty("edgesStatus")
  public EdgesStatusEnum getEdgesStatus() {
    return edgesStatus;
  }
  public void setEdgesStatus(EdgesStatusEnum edgesStatus) {
    this.edgesStatus = edgesStatus;
  }

  
  /**
   * Event Creation Time represents an ISO-8601 string. For example: UTC, UTC+01:00, or Europe/London
   **/
  public PhoneStatus eventCreationTime(String eventCreationTime) {
    this.eventCreationTime = eventCreationTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Event Creation Time represents an ISO-8601 string. For example: UTC, UTC+01:00, or Europe/London")
  @JsonProperty("eventCreationTime")
  public String getEventCreationTime() {
    return eventCreationTime;
  }
  public void setEventCreationTime(String eventCreationTime) {
    this.eventCreationTime = eventCreationTime;
  }

  
  /**
   * Provision information for this phone
   **/
  public PhoneStatus provision(ProvisionInfo provision) {
    this.provision = provision;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Provision information for this phone")
  @JsonProperty("provision")
  public ProvisionInfo getProvision() {
    return provision;
  }
  public void setProvision(ProvisionInfo provision) {
    this.provision = provision;
  }

  
  /**
   * A list of LineStatus information for each of the lines of this phone
   **/
  public PhoneStatus lineStatuses(List<LineStatus> lineStatuses) {
    this.lineStatuses = lineStatuses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of LineStatus information for each of the lines of this phone")
  @JsonProperty("lineStatuses")
  public List<LineStatus> getLineStatuses() {
    return lineStatuses;
  }
  public void setLineStatuses(List<LineStatus> lineStatuses) {
    this.lineStatuses = lineStatuses;
  }

  
  /**
   * The phone status's edge assignment type.
   **/
  public PhoneStatus phoneAssignmentToEdgeType(PhoneAssignmentToEdgeTypeEnum phoneAssignmentToEdgeType) {
    this.phoneAssignmentToEdgeType = phoneAssignmentToEdgeType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The phone status's edge assignment type.")
  @JsonProperty("phoneAssignmentToEdgeType")
  public PhoneAssignmentToEdgeTypeEnum getPhoneAssignmentToEdgeType() {
    return phoneAssignmentToEdgeType;
  }
  public void setPhoneAssignmentToEdgeType(PhoneAssignmentToEdgeTypeEnum phoneAssignmentToEdgeType) {
    this.phoneAssignmentToEdgeType = phoneAssignmentToEdgeType;
  }

  
  /**
   * The URI of the edge that provided this status information.
   **/
  public PhoneStatus edge(DomainEntityRef edge) {
    this.edge = edge;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URI of the edge that provided this status information.")
  @JsonProperty("edge")
  public DomainEntityRef getEdge() {
    return edge;
  }
  public void setEdge(DomainEntityRef edge) {
    this.edge = edge;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneStatus phoneStatus = (PhoneStatus) o;
    return Objects.equals(this.id, phoneStatus.id) &&
        Objects.equals(this.name, phoneStatus.name) &&
        Objects.equals(this.operationalStatus, phoneStatus.operationalStatus) &&
        Objects.equals(this.edgesStatus, phoneStatus.edgesStatus) &&
        Objects.equals(this.eventCreationTime, phoneStatus.eventCreationTime) &&
        Objects.equals(this.provision, phoneStatus.provision) &&
        Objects.equals(this.lineStatuses, phoneStatus.lineStatuses) &&
        Objects.equals(this.phoneAssignmentToEdgeType, phoneStatus.phoneAssignmentToEdgeType) &&
        Objects.equals(this.edge, phoneStatus.edge) &&
        Objects.equals(this.selfUri, phoneStatus.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, operationalStatus, edgesStatus, eventCreationTime, provision, lineStatuses, phoneAssignmentToEdgeType, edge, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneStatus {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operationalStatus: ").append(toIndentedString(operationalStatus)).append("\n");
    sb.append("    edgesStatus: ").append(toIndentedString(edgesStatus)).append("\n");
    sb.append("    eventCreationTime: ").append(toIndentedString(eventCreationTime)).append("\n");
    sb.append("    provision: ").append(toIndentedString(provision)).append("\n");
    sb.append("    lineStatuses: ").append(toIndentedString(lineStatuses)).append("\n");
    sb.append("    phoneAssignmentToEdgeType: ").append(toIndentedString(phoneAssignmentToEdgeType)).append("\n");
    sb.append("    edge: ").append(toIndentedString(edge)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

