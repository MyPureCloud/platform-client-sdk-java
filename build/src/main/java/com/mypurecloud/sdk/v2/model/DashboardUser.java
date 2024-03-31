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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DashboardUser
 */

public class DashboardUser  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Integer dashboardCount = null;
  private Integer publicDashboardCount = null;

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
   * The state of the user
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVE("active"),
    INACTIVE("inactive");

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
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public DashboardUser name(String name) {
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
   * The count of dashboards for the user
   **/
  public DashboardUser dashboardCount(Integer dashboardCount) {
    this.dashboardCount = dashboardCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The count of dashboards for the user")
  @JsonProperty("dashboardCount")
  public Integer getDashboardCount() {
    return dashboardCount;
  }
  public void setDashboardCount(Integer dashboardCount) {
    this.dashboardCount = dashboardCount;
  }


  /**
   * The count of public dashboards for the user
   **/
  public DashboardUser publicDashboardCount(Integer publicDashboardCount) {
    this.publicDashboardCount = publicDashboardCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The count of public dashboards for the user")
  @JsonProperty("publicDashboardCount")
  public Integer getPublicDashboardCount() {
    return publicDashboardCount;
  }
  public void setPublicDashboardCount(Integer publicDashboardCount) {
    this.publicDashboardCount = publicDashboardCount;
  }


  /**
   * The state of the user
   **/
  public DashboardUser state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The state of the user")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
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
    DashboardUser dashboardUser = (DashboardUser) o;

    return Objects.equals(this.id, dashboardUser.id) &&
            Objects.equals(this.name, dashboardUser.name) &&
            Objects.equals(this.dashboardCount, dashboardUser.dashboardCount) &&
            Objects.equals(this.publicDashboardCount, dashboardUser.publicDashboardCount) &&
            Objects.equals(this.state, dashboardUser.state) &&
            Objects.equals(this.selfUri, dashboardUser.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dashboardCount, publicDashboardCount, state, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardUser {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dashboardCount: ").append(toIndentedString(dashboardCount)).append("\n");
    sb.append("    publicDashboardCount: ").append(toIndentedString(publicDashboardCount)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

