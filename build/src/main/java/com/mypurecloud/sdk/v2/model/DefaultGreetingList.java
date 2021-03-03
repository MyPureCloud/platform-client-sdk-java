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
import com.mypurecloud.sdk.v2.model.Greeting;
import com.mypurecloud.sdk.v2.model.GreetingOwner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * DefaultGreetingList
 */

public class DefaultGreetingList  implements Serializable {
  
  private String id = null;
  private String name = null;
  private GreetingOwner owner = null;

  private static class OwnerTypeEnumDeserializer extends StdDeserializer<OwnerTypeEnum> {
    public OwnerTypeEnumDeserializer() {
      super(OwnerTypeEnumDeserializer.class);
    }

    @Override
    public OwnerTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OwnerTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets ownerType
   */
 @JsonDeserialize(using = OwnerTypeEnumDeserializer.class)
  public enum OwnerTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    USER("USER"),
    ORGANIZATION("ORGANIZATION"),
    GROUP("GROUP");

    private String value;

    OwnerTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OwnerTypeEnum fromString(String key) {
      if (key == null) return null;

      for (OwnerTypeEnum value : OwnerTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OwnerTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OwnerTypeEnum ownerType = null;
  private Map<String, Greeting> greetings = null;
  private Date createdDate = null;
  private String createdBy = null;
  private Date modifiedDate = null;
  private String modifiedBy = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public DefaultGreetingList name(String name) {
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
   **/
  public DefaultGreetingList owner(GreetingOwner owner) {
    this.owner = owner;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("owner")
  public GreetingOwner getOwner() {
    return owner;
  }
  public void setOwner(GreetingOwner owner) {
    this.owner = owner;
  }

  
  /**
   **/
  public DefaultGreetingList ownerType(OwnerTypeEnum ownerType) {
    this.ownerType = ownerType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ownerType")
  public OwnerTypeEnum getOwnerType() {
    return ownerType;
  }
  public void setOwnerType(OwnerTypeEnum ownerType) {
    this.ownerType = ownerType;
  }

  
  /**
   **/
  public DefaultGreetingList greetings(Map<String, Greeting> greetings) {
    this.greetings = greetings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("greetings")
  public Map<String, Greeting> getGreetings() {
    return greetings;
  }
  public void setGreetings(Map<String, Greeting> greetings) {
    this.greetings = greetings;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public DefaultGreetingList createdDate(Date createdDate) {
    this.createdDate = createdDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("createdDate")
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  
  /**
   **/
  public DefaultGreetingList createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdBy")
  public String getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public DefaultGreetingList modifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("modifiedDate")
  public Date getModifiedDate() {
    return modifiedDate;
  }
  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  
  /**
   **/
  public DefaultGreetingList modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifiedBy")
  public String getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
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
    DefaultGreetingList defaultGreetingList = (DefaultGreetingList) o;
    return Objects.equals(this.id, defaultGreetingList.id) &&
        Objects.equals(this.name, defaultGreetingList.name) &&
        Objects.equals(this.owner, defaultGreetingList.owner) &&
        Objects.equals(this.ownerType, defaultGreetingList.ownerType) &&
        Objects.equals(this.greetings, defaultGreetingList.greetings) &&
        Objects.equals(this.createdDate, defaultGreetingList.createdDate) &&
        Objects.equals(this.createdBy, defaultGreetingList.createdBy) &&
        Objects.equals(this.modifiedDate, defaultGreetingList.modifiedDate) &&
        Objects.equals(this.modifiedBy, defaultGreetingList.modifiedBy) &&
        Objects.equals(this.selfUri, defaultGreetingList.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, owner, ownerType, greetings, createdDate, createdBy, modifiedDate, modifiedBy, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultGreetingList {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
    sb.append("    greetings: ").append(toIndentedString(greetings)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
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

