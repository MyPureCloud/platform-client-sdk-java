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
  private Boolean preview = null;

  public ChecklistInferenceJobPayload() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      conversationContext = new ArrayList<ConversationContext>();
    }
  }

  public ChecklistInferenceJobPayload(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
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


  /**
   * Whether this checklist session is a preview. Preview sessions use shorter TTL and do not publish runtime events.
   **/
  public ChecklistInferenceJobPayload preview(Boolean preview) {
    this.preview = preview;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Whether this checklist session is a preview. Preview sessions use shorter TTL and do not publish runtime events.")
  @JsonProperty("preview")
  public Boolean getPreview() {
    return preview;
  }
  public void setPreview(Boolean preview) {
    this.preview = preview;
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

    return Objects.equals(this.conversationContext, checklistInferenceJobPayload.conversationContext) &&
            Objects.equals(this.preview, checklistInferenceJobPayload.preview);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationContext, preview);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChecklistInferenceJobPayload {\n");
    
    sb.append("    conversationContext: ").append(toIndentedString(conversationContext)).append("\n");
    sb.append("    preview: ").append(toIndentedString(preview)).append("\n");
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

