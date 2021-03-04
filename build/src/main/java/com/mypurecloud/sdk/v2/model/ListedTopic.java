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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * ListedTopic
 */

public class ListedTopic  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private Boolean published = null;

  private static class StrictnessEnumDeserializer extends StdDeserializer<StrictnessEnum> {
    public StrictnessEnumDeserializer() {
      super(StrictnessEnumDeserializer.class);
    }

    @Override
    public StrictnessEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StrictnessEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets strictness
   */
 @JsonDeserialize(using = StrictnessEnumDeserializer.class)
  public enum StrictnessEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    _1("1"),
    _55("55"),
    _65("65"),
    _72("72"),
    _85("85"),
    _90("90");

    private String value;

    StrictnessEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StrictnessEnum fromString(String key) {
      if (key == null) return null;

      for (StrictnessEnum value : StrictnessEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StrictnessEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StrictnessEnum strictness = null;
  private Integer programsCount = null;
  private List<String> tags = new ArrayList<String>();
  private String dialect = null;

  private static class ParticipantsEnumDeserializer extends StdDeserializer<ParticipantsEnum> {
    public ParticipantsEnumDeserializer() {
      super(ParticipantsEnumDeserializer.class);
    }

    @Override
    public ParticipantsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ParticipantsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets participants
   */
 @JsonDeserialize(using = ParticipantsEnumDeserializer.class)
  public enum ParticipantsEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EXTERNAL("External"),
    INTERNAL("Internal"),
    ALL("All");

    private String value;

    ParticipantsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ParticipantsEnum fromString(String key) {
      if (key == null) return null;

      for (ParticipantsEnum value : ParticipantsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ParticipantsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ParticipantsEnum participants = null;
  private Integer phrasesCount = null;
  private AddressableEntityRef modifiedBy = null;
  private Date dateModified = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public ListedTopic name(String name) {
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
  public ListedTopic description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  public ListedTopic published(Boolean published) {
    this.published = published;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("published")
  public Boolean getPublished() {
    return published;
  }
  public void setPublished(Boolean published) {
    this.published = published;
  }

  
  /**
   **/
  public ListedTopic strictness(StrictnessEnum strictness) {
    this.strictness = strictness;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("strictness")
  public StrictnessEnum getStrictness() {
    return strictness;
  }
  public void setStrictness(StrictnessEnum strictness) {
    this.strictness = strictness;
  }

  
  /**
   **/
  public ListedTopic programsCount(Integer programsCount) {
    this.programsCount = programsCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("programsCount")
  public Integer getProgramsCount() {
    return programsCount;
  }
  public void setProgramsCount(Integer programsCount) {
    this.programsCount = programsCount;
  }

  
  /**
   **/
  public ListedTopic tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  
  /**
   **/
  public ListedTopic dialect(String dialect) {
    this.dialect = dialect;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dialect")
  public String getDialect() {
    return dialect;
  }
  public void setDialect(String dialect) {
    this.dialect = dialect;
  }

  
  /**
   **/
  public ListedTopic participants(ParticipantsEnum participants) {
    this.participants = participants;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("participants")
  public ParticipantsEnum getParticipants() {
    return participants;
  }
  public void setParticipants(ParticipantsEnum participants) {
    this.participants = participants;
  }

  
  /**
   **/
  public ListedTopic phrasesCount(Integer phrasesCount) {
    this.phrasesCount = phrasesCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("phrasesCount")
  public Integer getPhrasesCount() {
    return phrasesCount;
  }
  public void setPhrasesCount(Integer phrasesCount) {
    this.phrasesCount = phrasesCount;
  }

  
  /**
   **/
  public ListedTopic modifiedBy(AddressableEntityRef modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifiedBy")
  public AddressableEntityRef getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(AddressableEntityRef modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ListedTopic dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
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
    ListedTopic listedTopic = (ListedTopic) o;
    return Objects.equals(this.id, listedTopic.id) &&
        Objects.equals(this.name, listedTopic.name) &&
        Objects.equals(this.description, listedTopic.description) &&
        Objects.equals(this.published, listedTopic.published) &&
        Objects.equals(this.strictness, listedTopic.strictness) &&
        Objects.equals(this.programsCount, listedTopic.programsCount) &&
        Objects.equals(this.tags, listedTopic.tags) &&
        Objects.equals(this.dialect, listedTopic.dialect) &&
        Objects.equals(this.participants, listedTopic.participants) &&
        Objects.equals(this.phrasesCount, listedTopic.phrasesCount) &&
        Objects.equals(this.modifiedBy, listedTopic.modifiedBy) &&
        Objects.equals(this.dateModified, listedTopic.dateModified) &&
        Objects.equals(this.selfUri, listedTopic.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, published, strictness, programsCount, tags, dialect, participants, phrasesCount, modifiedBy, dateModified, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListedTopic {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    strictness: ").append(toIndentedString(strictness)).append("\n");
    sb.append("    programsCount: ").append(toIndentedString(programsCount)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    dialect: ").append(toIndentedString(dialect)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    phrasesCount: ").append(toIndentedString(phrasesCount)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
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

