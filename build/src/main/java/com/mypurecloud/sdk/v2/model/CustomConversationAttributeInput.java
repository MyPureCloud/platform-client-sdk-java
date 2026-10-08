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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * A Conversation Custom Attributes schema and its associated records made available to a guide session turn.
 */
@ApiModel(description = "A Conversation Custom Attributes schema and its associated records made available to a guide session turn.")

public class CustomConversationAttributeInput  implements Serializable {
  
  private String schemaId = null;
  private List<String> divisionIds = null;
  private List<String> recordIds = null;

  public CustomConversationAttributeInput() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      divisionIds = new ArrayList<String>();
      recordIds = new ArrayList<String>();
    }
  }

  public CustomConversationAttributeInput(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      divisionIds = new ArrayList<String>();
      recordIds = new ArrayList<String>();
    }
  }

  
  /**
   * The ID of the Conversation Custom Attributes schema.
   **/
  public CustomConversationAttributeInput schemaId(String schemaId) {
    this.schemaId = schemaId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the Conversation Custom Attributes schema.")
  @JsonProperty("schemaId")
  public String getSchemaId() {
    return schemaId;
  }
  public void setSchemaId(String schemaId) {
    this.schemaId = schemaId;
  }


  /**
   * The division IDs associated with this schema.
   **/
  public CustomConversationAttributeInput divisionIds(List<String> divisionIds) {
    this.divisionIds = divisionIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The division IDs associated with this schema.")
  @JsonProperty("divisionIds")
  public List<String> getDivisionIds() {
    return divisionIds;
  }
  public void setDivisionIds(List<String> divisionIds) {
    this.divisionIds = divisionIds;
  }


  /**
   * The record IDs associated with this schema.
   **/
  public CustomConversationAttributeInput recordIds(List<String> recordIds) {
    this.recordIds = recordIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The record IDs associated with this schema.")
  @JsonProperty("recordIds")
  public List<String> getRecordIds() {
    return recordIds;
  }
  public void setRecordIds(List<String> recordIds) {
    this.recordIds = recordIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomConversationAttributeInput customConversationAttributeInput = (CustomConversationAttributeInput) o;

    return Objects.equals(this.schemaId, customConversationAttributeInput.schemaId) &&
            Objects.equals(this.divisionIds, customConversationAttributeInput.divisionIds) &&
            Objects.equals(this.recordIds, customConversationAttributeInput.recordIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaId, divisionIds, recordIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomConversationAttributeInput {\n");
    
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
    sb.append("    divisionIds: ").append(toIndentedString(divisionIds)).append("\n");
    sb.append("    recordIds: ").append(toIndentedString(recordIds)).append("\n");
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

