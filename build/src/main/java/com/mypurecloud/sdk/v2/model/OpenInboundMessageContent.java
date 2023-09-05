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
import com.mypurecloud.sdk.v2.model.OpenContentAttachment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Message content element.
 */
@ApiModel(description = "Message content element.")

public class OpenInboundMessageContent  implements Serializable {
  
  private OpenContentAttachment attachment = null;

  
  /**
   * Attachment content.
   **/
  public OpenInboundMessageContent attachment(OpenContentAttachment attachment) {
    this.attachment = attachment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attachment content.")
  @JsonProperty("attachment")
  public OpenContentAttachment getAttachment() {
    return attachment;
  }
  public void setAttachment(OpenContentAttachment attachment) {
    this.attachment = attachment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenInboundMessageContent openInboundMessageContent = (OpenInboundMessageContent) o;

    return Objects.equals(this.attachment, openInboundMessageContent.attachment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenInboundMessageContent {\n");
    
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
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

