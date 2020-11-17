package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * The postback object result of a user clicking in a button
 */
@ApiModel(description = "The postback object result of a user clicking in a button")

public class ContentPostback  implements Serializable {
  
  private String id = null;
  private String text = null;
  private String payload = null;

  
  /**
   * An ID assigned to the postback reply. Each object inside the content array has a unique ID.
   **/
  public ContentPostback id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An ID assigned to the postback reply. Each object inside the content array has a unique ID.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The text inside the button clicked (in the structured message template)
   **/
  public ContentPostback text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The text inside the button clicked (in the structured message template)")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   * Content of the textback payload after clicking a quick reply
   **/
  public ContentPostback payload(String payload) {
    this.payload = payload;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Content of the textback payload after clicking a quick reply")
  @JsonProperty("payload")
  public String getPayload() {
    return payload;
  }
  public void setPayload(String payload) {
    this.payload = payload;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentPostback contentPostback = (ContentPostback) o;
    return Objects.equals(this.id, contentPostback.id) &&
        Objects.equals(this.text, contentPostback.text) &&
        Objects.equals(this.payload, contentPostback.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, text, payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentPostback {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

