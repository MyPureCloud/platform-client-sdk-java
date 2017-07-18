package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Reaction
 */

public class Reaction  implements Serializable {
  
  private String data = null;
  private String name = null;

  /**
   * Gets or Sets reactionType
   */
  public enum ReactionTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    HANGUP("hangup"),
    TRANSFER("transfer"),
    TRANSFER_FLOW("transfer_flow"),
    PLAY_FILE("play_file");

    private String value;

    ReactionTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ReactionTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ReactionTypeEnum value : ReactionTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ReactionTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ReactionTypeEnum reactionType = null;

  
  /**
   **/
  public Reaction data(String data) {
    this.data = data;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("data")
  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }

  
  /**
   **/
  public Reaction name(String name) {
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
  public Reaction reactionType(ReactionTypeEnum reactionType) {
    this.reactionType = reactionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reactionType")
  public ReactionTypeEnum getReactionType() {
    return reactionType;
  }
  public void setReactionType(ReactionTypeEnum reactionType) {
    this.reactionType = reactionType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reaction reaction = (Reaction) o;
    return Objects.equals(this.data, reaction.data) &&
        Objects.equals(this.name, reaction.name) &&
        Objects.equals(this.reactionType, reaction.reactionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, name, reactionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reaction {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reactionType: ").append(toIndentedString(reactionType)).append("\n");
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

