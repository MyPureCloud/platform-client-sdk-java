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
import com.mypurecloud.sdk.v2.model.LocationAddress;
import com.mypurecloud.sdk.v2.model.LocationEmergencyNumber;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * LocationUpdateDefinition
 */

public class LocationUpdateDefinition  implements Serializable {
  
  private String name = null;
  private Integer version = null;

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
   * Current activity status of the location.
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVE("active"),
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
  private List<String> path = new ArrayList<String>();
  private String notes = null;
  private String contactUser = null;
  private LocationEmergencyNumber emergencyNumber = null;
  private LocationAddress address = null;

  
  /**
   * The name of the Location. Required for creates, not required for updates
   **/
  public LocationUpdateDefinition name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the Location. Required for creates, not required for updates")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Current version of the location
   **/
  public LocationUpdateDefinition version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Current version of the location")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  /**
   * Current activity status of the location.
   **/
  public LocationUpdateDefinition state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Current activity status of the location.")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   * A list of ancestor ids
   **/
  public LocationUpdateDefinition path(List<String> path) {
    this.path = path;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of ancestor ids")
  @JsonProperty("path")
  public List<String> getPath() {
    return path;
  }
  public void setPath(List<String> path) {
    this.path = path;
  }

  
  /**
   * Notes for the location
   **/
  public LocationUpdateDefinition notes(String notes) {
    this.notes = notes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Notes for the location")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

  
  /**
   * The user id of the location contact
   **/
  public LocationUpdateDefinition contactUser(String contactUser) {
    this.contactUser = contactUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user id of the location contact")
  @JsonProperty("contactUser")
  public String getContactUser() {
    return contactUser;
  }
  public void setContactUser(String contactUser) {
    this.contactUser = contactUser;
  }

  
  /**
   * Emergency number for the location
   **/
  public LocationUpdateDefinition emergencyNumber(LocationEmergencyNumber emergencyNumber) {
    this.emergencyNumber = emergencyNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Emergency number for the location")
  @JsonProperty("emergencyNumber")
  public LocationEmergencyNumber getEmergencyNumber() {
    return emergencyNumber;
  }
  public void setEmergencyNumber(LocationEmergencyNumber emergencyNumber) {
    this.emergencyNumber = emergencyNumber;
  }

  
  /**
   * Address of the location
   **/
  public LocationUpdateDefinition address(LocationAddress address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Address of the location")
  @JsonProperty("address")
  public LocationAddress getAddress() {
    return address;
  }
  public void setAddress(LocationAddress address) {
    this.address = address;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationUpdateDefinition locationUpdateDefinition = (LocationUpdateDefinition) o;
    return Objects.equals(this.name, locationUpdateDefinition.name) &&
        Objects.equals(this.version, locationUpdateDefinition.version) &&
        Objects.equals(this.state, locationUpdateDefinition.state) &&
        Objects.equals(this.path, locationUpdateDefinition.path) &&
        Objects.equals(this.notes, locationUpdateDefinition.notes) &&
        Objects.equals(this.contactUser, locationUpdateDefinition.contactUser) &&
        Objects.equals(this.emergencyNumber, locationUpdateDefinition.emergencyNumber) &&
        Objects.equals(this.address, locationUpdateDefinition.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version, state, path, notes, contactUser, emergencyNumber, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationUpdateDefinition {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    contactUser: ").append(toIndentedString(contactUser)).append("\n");
    sb.append("    emergencyNumber: ").append(toIndentedString(emergencyNumber)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

