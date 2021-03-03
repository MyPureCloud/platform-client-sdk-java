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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AuditUser
 */

public class AuditUser  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String display = null;

  
  /**
   * The ID (UUID) of the user who initiated the action of this AuditMessage.
   **/
  public AuditUser id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID (UUID) of the user who initiated the action of this AuditMessage.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The full username of the user who initiated the action of this AuditMessage.
   **/
  public AuditUser name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The full username of the user who initiated the action of this AuditMessage.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The display name of the user who initiated the action of this AuditMessage.
   **/
  public AuditUser display(String display) {
    this.display = display;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The display name of the user who initiated the action of this AuditMessage.")
  @JsonProperty("display")
  public String getDisplay() {
    return display;
  }
  public void setDisplay(String display) {
    this.display = display;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditUser auditUser = (AuditUser) o;
    return Objects.equals(this.id, auditUser.id) &&
        Objects.equals(this.name, auditUser.name) &&
        Objects.equals(this.display, auditUser.display);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, display);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditUser {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
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

