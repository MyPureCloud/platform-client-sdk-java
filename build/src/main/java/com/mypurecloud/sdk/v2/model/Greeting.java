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
import com.mypurecloud.sdk.v2.model.DomainEntity;
import com.mypurecloud.sdk.v2.model.GreetingAudioFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Greeting
 */

public class Greeting  implements Serializable {
  
  private String id = null;
  private String name = null;

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Greeting type
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    STATION("STATION"),
    VOICEMAIL("VOICEMAIL"),
    NAME("NAME");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;

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
   * Greeting owner type
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
  private DomainEntity owner = null;
  private GreetingAudioFile audioFile = null;
  private String audioTTS = null;
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
  public Greeting name(String name) {
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
   * Greeting type
   **/
  public Greeting type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Greeting type")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * Greeting owner type
   **/
  public Greeting ownerType(OwnerTypeEnum ownerType) {
    this.ownerType = ownerType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Greeting owner type")
  @JsonProperty("ownerType")
  public OwnerTypeEnum getOwnerType() {
    return ownerType;
  }
  public void setOwnerType(OwnerTypeEnum ownerType) {
    this.ownerType = ownerType;
  }

  
  /**
   * Greeting owner
   **/
  public Greeting owner(DomainEntity owner) {
    this.owner = owner;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Greeting owner")
  @JsonProperty("owner")
  public DomainEntity getOwner() {
    return owner;
  }
  public void setOwner(DomainEntity owner) {
    this.owner = owner;
  }

  
  /**
   **/
  public Greeting audioFile(GreetingAudioFile audioFile) {
    this.audioFile = audioFile;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("audioFile")
  public GreetingAudioFile getAudioFile() {
    return audioFile;
  }
  public void setAudioFile(GreetingAudioFile audioFile) {
    this.audioFile = audioFile;
  }

  
  /**
   **/
  public Greeting audioTTS(String audioTTS) {
    this.audioTTS = audioTTS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("audioTTS")
  public String getAudioTTS() {
    return audioTTS;
  }
  public void setAudioTTS(String audioTTS) {
    this.audioTTS = audioTTS;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Greeting createdDate(Date createdDate) {
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
  public Greeting createdBy(String createdBy) {
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
  public Greeting modifiedDate(Date modifiedDate) {
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
  public Greeting modifiedBy(String modifiedBy) {
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
    Greeting greeting = (Greeting) o;
    return Objects.equals(this.id, greeting.id) &&
        Objects.equals(this.name, greeting.name) &&
        Objects.equals(this.type, greeting.type) &&
        Objects.equals(this.ownerType, greeting.ownerType) &&
        Objects.equals(this.owner, greeting.owner) &&
        Objects.equals(this.audioFile, greeting.audioFile) &&
        Objects.equals(this.audioTTS, greeting.audioTTS) &&
        Objects.equals(this.createdDate, greeting.createdDate) &&
        Objects.equals(this.createdBy, greeting.createdBy) &&
        Objects.equals(this.modifiedDate, greeting.modifiedDate) &&
        Objects.equals(this.modifiedBy, greeting.modifiedBy) &&
        Objects.equals(this.selfUri, greeting.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, ownerType, owner, audioFile, audioTTS, createdDate, createdBy, modifiedDate, modifiedBy, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Greeting {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    audioFile: ").append(toIndentedString(audioFile)).append("\n");
    sb.append("    audioTTS: ").append(toIndentedString(audioTTS)).append("\n");
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

