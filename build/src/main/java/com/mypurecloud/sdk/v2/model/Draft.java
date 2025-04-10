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
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.DraftIntents;
import com.mypurecloud.sdk.v2.model.DraftTopics;
import com.mypurecloud.sdk.v2.model.Miner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * Draft
 */

public class Draft  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Miner miner = null;
  private List<DraftIntents> intents = null;
  private List<DraftTopics> topics = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private String selfUri = null;

  public Draft() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      intents = new ArrayList<DraftIntents>();
      topics = new ArrayList<DraftTopics>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Draft name
   **/
  public Draft name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Draft name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @ApiModelProperty(example = "null", value = "Miner to which the draft belongs.")
  @JsonProperty("miner")
  public Miner getMiner() {
    return miner;
  }


  @ApiModelProperty(example = "null", value = "Draft intent object.")
  @JsonProperty("intents")
  public List<DraftIntents> getIntents() {
    return intents;
  }


  @ApiModelProperty(example = "null", value = "Draft topic object.")
  @JsonProperty("topics")
  public List<DraftTopics> getTopics() {
    return topics;
  }


  @ApiModelProperty(example = "null", value = "Date when the draft was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "Date when the draft was updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
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
    Draft draft = (Draft) o;

    return Objects.equals(this.id, draft.id) &&
            Objects.equals(this.name, draft.name) &&
            Objects.equals(this.miner, draft.miner) &&
            Objects.equals(this.intents, draft.intents) &&
            Objects.equals(this.topics, draft.topics) &&
            Objects.equals(this.dateCreated, draft.dateCreated) &&
            Objects.equals(this.dateModified, draft.dateModified) &&
            Objects.equals(this.selfUri, draft.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, miner, intents, topics, dateCreated, dateModified, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Draft {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    miner: ").append(toIndentedString(miner)).append("\n");
    sb.append("    intents: ").append(toIndentedString(intents)).append("\n");
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
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

