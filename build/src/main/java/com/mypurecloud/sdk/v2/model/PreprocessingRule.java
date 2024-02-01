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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * PreprocessingRule
 */

public class PreprocessingRule  implements Serializable {
  
  private String find = null;
  private String replaceWith = null;
  private Boolean global = null;
  private Boolean ignoreCase = null;

  
  /**
   * The regular expression to which file lines are to be matched.
   **/
  public PreprocessingRule find(String find) {
    this.find = find;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The regular expression to which file lines are to be matched.")
  @JsonProperty("find")
  public String getFind() {
    return find;
  }
  public void setFind(String find) {
    this.find = find;
  }


  /**
   * The string to be substituted for each match.
   **/
  public PreprocessingRule replaceWith(String replaceWith) {
    this.replaceWith = replaceWith;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The string to be substituted for each match.")
  @JsonProperty("replaceWith")
  public String getReplaceWith() {
    return replaceWith;
  }
  public void setReplaceWith(String replaceWith) {
    this.replaceWith = replaceWith;
  }


  /**
   * Replaces all matching substrings in every line.
   **/
  public PreprocessingRule global(Boolean global) {
    this.global = global;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Replaces all matching substrings in every line.")
  @JsonProperty("global")
  public Boolean getGlobal() {
    return global;
  }
  public void setGlobal(Boolean global) {
    this.global = global;
  }


  /**
   * Enables case-insensitive matching
   **/
  public PreprocessingRule ignoreCase(Boolean ignoreCase) {
    this.ignoreCase = ignoreCase;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Enables case-insensitive matching")
  @JsonProperty("ignoreCase")
  public Boolean getIgnoreCase() {
    return ignoreCase;
  }
  public void setIgnoreCase(Boolean ignoreCase) {
    this.ignoreCase = ignoreCase;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreprocessingRule preprocessingRule = (PreprocessingRule) o;

    return Objects.equals(this.find, preprocessingRule.find) &&
            Objects.equals(this.replaceWith, preprocessingRule.replaceWith) &&
            Objects.equals(this.global, preprocessingRule.global) &&
            Objects.equals(this.ignoreCase, preprocessingRule.ignoreCase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(find, replaceWith, global, ignoreCase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreprocessingRule {\n");
    
    sb.append("    find: ").append(toIndentedString(find)).append("\n");
    sb.append("    replaceWith: ").append(toIndentedString(replaceWith)).append("\n");
    sb.append("    global: ").append(toIndentedString(global)).append("\n");
    sb.append("    ignoreCase: ").append(toIndentedString(ignoreCase)).append("\n");
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

