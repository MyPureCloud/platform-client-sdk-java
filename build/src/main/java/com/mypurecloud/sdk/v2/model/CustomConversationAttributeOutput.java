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
import com.mypurecloud.sdk.v2.model.ConversationAttributeSchema;
import com.mypurecloud.sdk.v2.model.CustomConversationAttributeUpdate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Conversation Custom Attribute updates applied to a single record during a guide session turn.
 */
@ApiModel(description = "Conversation Custom Attribute updates applied to a single record during a guide session turn.")

public class CustomConversationAttributeOutput  implements Serializable {
  
  private ConversationAttributeSchema schema = null;
  private String recordId = null;
  private List<CustomConversationAttributeUpdate> updates = null;

  public CustomConversationAttributeOutput() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      updates = new ArrayList<CustomConversationAttributeUpdate>();
    }
  }

  public CustomConversationAttributeOutput(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      updates = new ArrayList<CustomConversationAttributeUpdate>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The Conversation Custom Attributes schema the updates were applied to.")
  @JsonProperty("schema")
  public ConversationAttributeSchema getSchema() {
    return schema;
  }


  /**
   * The ID of the record that was updated.
   **/
  public CustomConversationAttributeOutput recordId(String recordId) {
    this.recordId = recordId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the record that was updated.")
  @JsonProperty("recordId")
  public String getRecordId() {
    return recordId;
  }
  public void setRecordId(String recordId) {
    this.recordId = recordId;
  }


  /**
   * The attribute updates made to this record during the turn.
   **/
  public CustomConversationAttributeOutput updates(List<CustomConversationAttributeUpdate> updates) {
    this.updates = updates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The attribute updates made to this record during the turn.")
  @JsonProperty("updates")
  public List<CustomConversationAttributeUpdate> getUpdates() {
    return updates;
  }
  public void setUpdates(List<CustomConversationAttributeUpdate> updates) {
    this.updates = updates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomConversationAttributeOutput customConversationAttributeOutput = (CustomConversationAttributeOutput) o;

    return Objects.equals(this.schema, customConversationAttributeOutput.schema) &&
            Objects.equals(this.recordId, customConversationAttributeOutput.recordId) &&
            Objects.equals(this.updates, customConversationAttributeOutput.updates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schema, recordId, updates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomConversationAttributeOutput {\n");
    
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
    sb.append("    updates: ").append(toIndentedString(updates)).append("\n");
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

