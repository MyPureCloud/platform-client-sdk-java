package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.Edge;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * InstanceInfo
 */

public class InstanceInfo  implements Serializable {
  
  private String id = null;

  /**
   * State of the instance in AWS
   */
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    REBOOTING("rebooting"),
    PENDING("pending"),
    RUNNING("running"),
    TERMINATED("terminated"),
    STOPPING("stopping"),
    STOPPED("stopped");

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
  private Edge edge = null;
  private Integer assignedPhoneCount = null;
  private String ami = null;

  
  /**
   * Id of the ec2 instance.
   **/
  public InstanceInfo id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id of the ec2 instance.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * State of the instance in AWS
   **/
  public InstanceInfo state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "State of the instance in AWS")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   * Edge object that the instance is associated with.
   **/
  public InstanceInfo edge(Edge edge) {
    this.edge = edge;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Edge object that the instance is associated with.")
  @JsonProperty("edge")
  public Edge getEdge() {
    return edge;
  }
  public void setEdge(Edge edge) {
    this.edge = edge;
  }

  
  /**
   * Number of phones assigned to the edge.
   **/
  public InstanceInfo assignedPhoneCount(Integer assignedPhoneCount) {
    this.assignedPhoneCount = assignedPhoneCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of phones assigned to the edge.")
  @JsonProperty("assignedPhoneCount")
  public Integer getAssignedPhoneCount() {
    return assignedPhoneCount;
  }
  public void setAssignedPhoneCount(Integer assignedPhoneCount) {
    this.assignedPhoneCount = assignedPhoneCount;
  }

  
  /**
   * The image id of the instance.
   **/
  public InstanceInfo ami(String ami) {
    this.ami = ami;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The image id of the instance.")
  @JsonProperty("ami")
  public String getAmi() {
    return ami;
  }
  public void setAmi(String ami) {
    this.ami = ami;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceInfo instanceInfo = (InstanceInfo) o;
    return Objects.equals(this.id, instanceInfo.id) &&
        Objects.equals(this.state, instanceInfo.state) &&
        Objects.equals(this.edge, instanceInfo.edge) &&
        Objects.equals(this.assignedPhoneCount, instanceInfo.assignedPhoneCount) &&
        Objects.equals(this.ami, instanceInfo.ami);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, edge, assignedPhoneCount, ami);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    edge: ").append(toIndentedString(edge)).append("\n");
    sb.append("    assignedPhoneCount: ").append(toIndentedString(assignedPhoneCount)).append("\n");
    sb.append("    ami: ").append(toIndentedString(ami)).append("\n");
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

