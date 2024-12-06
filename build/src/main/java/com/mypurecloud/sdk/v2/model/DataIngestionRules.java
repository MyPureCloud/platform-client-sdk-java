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
import com.mypurecloud.sdk.v2.model.FacebookDataIngestionRuleResponse;
import com.mypurecloud.sdk.v2.model.OpenDataIngestionRuleResponse;
import com.mypurecloud.sdk.v2.model.TwitterDataIngestionRuleResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DataIngestionRules
 */

public class DataIngestionRules  implements Serializable {
  
  private List<TwitterDataIngestionRuleResponse> twitter = new ArrayList<TwitterDataIngestionRuleResponse>();
  private List<OpenDataIngestionRuleResponse> open = new ArrayList<OpenDataIngestionRuleResponse>();
  private List<FacebookDataIngestionRuleResponse> facebook = new ArrayList<FacebookDataIngestionRuleResponse>();

  
  /**
   * A list of X (formally Twitter) data ingestion rules.
   **/
  public DataIngestionRules twitter(List<TwitterDataIngestionRuleResponse> twitter) {
    this.twitter = twitter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of X (formally Twitter) data ingestion rules.")
  @JsonProperty("twitter")
  public List<TwitterDataIngestionRuleResponse> getTwitter() {
    return twitter;
  }
  public void setTwitter(List<TwitterDataIngestionRuleResponse> twitter) {
    this.twitter = twitter;
  }


  /**
   * A list of Open data ingestion rules.
   **/
  public DataIngestionRules open(List<OpenDataIngestionRuleResponse> open) {
    this.open = open;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of Open data ingestion rules.")
  @JsonProperty("open")
  public List<OpenDataIngestionRuleResponse> getOpen() {
    return open;
  }
  public void setOpen(List<OpenDataIngestionRuleResponse> open) {
    this.open = open;
  }


  /**
   * A list of Facebook data ingestion rules.
   **/
  public DataIngestionRules facebook(List<FacebookDataIngestionRuleResponse> facebook) {
    this.facebook = facebook;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of Facebook data ingestion rules.")
  @JsonProperty("facebook")
  public List<FacebookDataIngestionRuleResponse> getFacebook() {
    return facebook;
  }
  public void setFacebook(List<FacebookDataIngestionRuleResponse> facebook) {
    this.facebook = facebook;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataIngestionRules dataIngestionRules = (DataIngestionRules) o;

    return Objects.equals(this.twitter, dataIngestionRules.twitter) &&
            Objects.equals(this.open, dataIngestionRules.open) &&
            Objects.equals(this.facebook, dataIngestionRules.facebook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(twitter, open, facebook);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataIngestionRules {\n");
    
    sb.append("    twitter: ").append(toIndentedString(twitter)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    facebook: ").append(toIndentedString(facebook)).append("\n");
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

