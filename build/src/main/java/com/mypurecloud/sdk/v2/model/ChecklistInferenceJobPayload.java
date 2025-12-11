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
import com.mypurecloud.sdk.v2.model.ConversationContext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ChecklistInferenceJobPayload
 */

public class ChecklistInferenceJobPayload  implements Serializable {
  
  private List<ConversationContext> conversationContext = null;

  public ChecklistInferenceJobPayload() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      conversationContext = new ArrayList<ConversationContext>();
    }
  }

  
  /**
   * List of conversations on which checklist evaluation is to be done.
   **/
  public ChecklistInferenceJobPayload conversationContext(List<ConversationContext> conversationContext) {
    this.conversationContext = conversationContext;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of conversations on which checklist evaluation is to be done.")
  @JsonProperty("conversationContext")
  public List<ConversationContext> getConversationContext() {
    return conversationContext;
  }
  public void setConversationContext(List<ConversationContext> conversationContext) {
    this.conversationContext = conversationContext;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChecklistInferenceJobPayload checklistInferenceJobPayload = (ChecklistInferenceJobPayload) o;

    return Objects.equals(this.conversationContext, checklistInferenceJobPayload.conversationContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChecklistInferenceJobPayload {\n");
    
    sb.append("    conversationContext: ").append(toIndentedString(conversationContext)).append("\n");
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

