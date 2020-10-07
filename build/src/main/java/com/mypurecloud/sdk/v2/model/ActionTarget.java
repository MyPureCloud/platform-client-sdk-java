package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.KeyValue;
import com.mypurecloud.sdk.v2.model.ServiceLevel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * ActionTarget
 */

public class ActionTarget  implements Serializable {
  
  private String id = null;
  private String name = null;
  private List<KeyValue> userData = new ArrayList<KeyValue>();

  /**
   * Gets or Sets supportedMediaTypes
   */
  public enum SupportedMediaTypesEnum {
    CALLBACK("callback"),
    CALL("call"),
    EMAIL("email"),
    GENERIC("generic"),
    MESSAGING("messaging"),
    SOCIAL("social"),
    WEBCHAT("webchat");

    private String value;

    SupportedMediaTypesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SupportedMediaTypesEnum fromString(String key) {
      if (key == null) return null;

      for (SupportedMediaTypesEnum value : SupportedMediaTypesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SupportedMediaTypesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<SupportedMediaTypesEnum> supportedMediaTypes = new ArrayList<SupportedMediaTypesEnum>();

  /**
   * Indicates the state of the target.
   */
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVE("active"),
    INACTIVE("inactive"),
    DELETED("deleted");

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
  private String description = null;
  private ServiceLevel serviceLevel = null;
  private String selfUri = null;
  private Date createdDate = null;
  private Date modifiedDate = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public ActionTarget name(String name) {
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
   * Additional user data associated with the target in key/value format.
   **/
  public ActionTarget userData(List<KeyValue> userData) {
    this.userData = userData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional user data associated with the target in key/value format.")
  @JsonProperty("userData")
  public List<KeyValue> getUserData() {
    return userData;
  }
  public void setUserData(List<KeyValue> userData) {
    this.userData = userData;
  }

  
  /**
   * Supported media types of the target.
   **/
  public ActionTarget supportedMediaTypes(List<SupportedMediaTypesEnum> supportedMediaTypes) {
    this.supportedMediaTypes = supportedMediaTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Supported media types of the target.")
  @JsonProperty("supportedMediaTypes")
  public List<SupportedMediaTypesEnum> getSupportedMediaTypes() {
    return supportedMediaTypes;
  }
  public void setSupportedMediaTypes(List<SupportedMediaTypesEnum> supportedMediaTypes) {
    this.supportedMediaTypes = supportedMediaTypes;
  }

  
  /**
   * Indicates the state of the target.
   **/
  public ActionTarget state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates the state of the target.")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   * Description of the target.
   **/
  public ActionTarget description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of the target.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Service Level of the action target. Chat offers for the target will be throttled with the aim of achieving this service level.
   **/
  public ActionTarget serviceLevel(ServiceLevel serviceLevel) {
    this.serviceLevel = serviceLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Service Level of the action target. Chat offers for the target will be throttled with the aim of achieving this service level.")
  @JsonProperty("serviceLevel")
  public ServiceLevel getServiceLevel() {
    return serviceLevel;
  }
  public void setServiceLevel(ServiceLevel serviceLevel) {
    this.serviceLevel = serviceLevel;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  
  /**
   * The date the target was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public ActionTarget createdDate(Date createdDate) {
    this.createdDate = createdDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date the target was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("createdDate")
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  
  /**
   * The date the target was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public ActionTarget modifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date the target was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("modifiedDate")
  public Date getModifiedDate() {
    return modifiedDate;
  }
  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionTarget actionTarget = (ActionTarget) o;
    return Objects.equals(this.id, actionTarget.id) &&
        Objects.equals(this.name, actionTarget.name) &&
        Objects.equals(this.userData, actionTarget.userData) &&
        Objects.equals(this.supportedMediaTypes, actionTarget.supportedMediaTypes) &&
        Objects.equals(this.state, actionTarget.state) &&
        Objects.equals(this.description, actionTarget.description) &&
        Objects.equals(this.serviceLevel, actionTarget.serviceLevel) &&
        Objects.equals(this.selfUri, actionTarget.selfUri) &&
        Objects.equals(this.createdDate, actionTarget.createdDate) &&
        Objects.equals(this.modifiedDate, actionTarget.modifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, userData, supportedMediaTypes, state, description, serviceLevel, selfUri, createdDate, modifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionTarget {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
    sb.append("    supportedMediaTypes: ").append(toIndentedString(supportedMediaTypes)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    serviceLevel: ").append(toIndentedString(serviceLevel)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
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

