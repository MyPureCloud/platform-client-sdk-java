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
import com.mypurecloud.sdk.v2.model.Operand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ConversationCategory
 */

public class ConversationCategory  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;

  private static class InteractionTypeEnumDeserializer extends StdDeserializer<InteractionTypeEnum> {
    public InteractionTypeEnumDeserializer() {
      super(InteractionTypeEnumDeserializer.class);
    }

    @Override
    public InteractionTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return InteractionTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of interaction the category will apply to
   */
 @JsonDeserialize(using = InteractionTypeEnumDeserializer.class)
  public enum InteractionTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    VOICE("Voice"),
    DIGITAL("Digital"),
    ALL("All");

    private String value;

    InteractionTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static InteractionTypeEnum fromString(String key) {
      if (key == null) return null;

      for (InteractionTypeEnum value : InteractionTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return InteractionTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private InteractionTypeEnum interactionType = null;
  private Operand criteria = null;

  
  /**
   * The id of the category
   **/
  public ConversationCategory id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the category")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The name of the category
   **/
  public ConversationCategory name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the category")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The description of the category
   **/
  public ConversationCategory description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description of the category")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The type of interaction the category will apply to
   **/
  public ConversationCategory interactionType(InteractionTypeEnum interactionType) {
    this.interactionType = interactionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of interaction the category will apply to")
  @JsonProperty("interactionType")
  public InteractionTypeEnum getInteractionType() {
    return interactionType;
  }
  public void setInteractionType(InteractionTypeEnum interactionType) {
    this.interactionType = interactionType;
  }


  /**
   * A collection of conditions joined together by logical operation to provide more refined filtering of conversations
   **/
  public ConversationCategory criteria(Operand criteria) {
    this.criteria = criteria;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A collection of conditions joined together by logical operation to provide more refined filtering of conversations")
  @JsonProperty("criteria")
  public Operand getCriteria() {
    return criteria;
  }
  public void setCriteria(Operand criteria) {
    this.criteria = criteria;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationCategory conversationCategory = (ConversationCategory) o;

    return Objects.equals(this.id, conversationCategory.id) &&
            Objects.equals(this.name, conversationCategory.name) &&
            Objects.equals(this.description, conversationCategory.description) &&
            Objects.equals(this.interactionType, conversationCategory.interactionType) &&
            Objects.equals(this.criteria, conversationCategory.criteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, interactionType, criteria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationCategory {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    interactionType: ").append(toIndentedString(interactionType)).append("\n");
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
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

