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
import com.mypurecloud.sdk.v2.model.Attachment;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CopyAttachmentsRequest
 */

public class CopyAttachmentsRequest  implements Serializable {
  
  private DomainEntityRef sourceMessage = null;
  private List<Attachment> attachments = new ArrayList<Attachment>();

  
  /**
   * A reference to the email message within the current conversation that owns the attachments to be copied
   **/
  public CopyAttachmentsRequest sourceMessage(DomainEntityRef sourceMessage) {
    this.sourceMessage = sourceMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the email message within the current conversation that owns the attachments to be copied")
  @JsonProperty("sourceMessage")
  public DomainEntityRef getSourceMessage() {
    return sourceMessage;
  }
  public void setSourceMessage(DomainEntityRef sourceMessage) {
    this.sourceMessage = sourceMessage;
  }

  
  /**
   * A list of attachments that will be copied from the source message to the current draft
   **/
  public CopyAttachmentsRequest attachments(List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of attachments that will be copied from the source message to the current draft")
  @JsonProperty("attachments")
  public List<Attachment> getAttachments() {
    return attachments;
  }
  public void setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CopyAttachmentsRequest copyAttachmentsRequest = (CopyAttachmentsRequest) o;
    return Objects.equals(this.sourceMessage, copyAttachmentsRequest.sourceMessage) &&
        Objects.equals(this.attachments, copyAttachmentsRequest.attachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceMessage, attachments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CopyAttachmentsRequest {\n");
    
    sb.append("    sourceMessage: ").append(toIndentedString(sourceMessage)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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

