package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * JobPostCustomeQuestionList
 */

@JsonTypeName("jobPost_customeQuestionList")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T12:31:21.921085300-08:00[America/Los_Angeles]")
public class JobPostCustomeQuestionList implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("question")
  private String question;

  /**
   * Gets or Sets answereType
   */
  public enum AnswereTypeEnum {
    TEXT("text"),
    
    NUMBER("number");

    private String value;

    AnswereTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AnswereTypeEnum fromValue(String value) {
      for (AnswereTypeEnum b : AnswereTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("answereType")
  private AnswereTypeEnum answereType;

  public JobPostCustomeQuestionList question(String question) {
    this.question = question;
    return this;
  }

  /**
   * Get question
   * @return question
  */
  
  @Schema(name = "question", required = false)
  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public JobPostCustomeQuestionList answereType(AnswereTypeEnum answereType) {
    this.answereType = answereType;
    return this;
  }

  /**
   * Get answereType
   * @return answereType
  */
  
  @Schema(name = "answereType", required = false)
  public AnswereTypeEnum getAnswereType() {
    return answereType;
  }

  public void setAnswereType(AnswereTypeEnum answereType) {
    this.answereType = answereType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobPostCustomeQuestionList jobPostCustomeQuestionList = (JobPostCustomeQuestionList) o;
    return Objects.equals(this.question, jobPostCustomeQuestionList.question) &&
        Objects.equals(this.answereType, jobPostCustomeQuestionList.answereType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(question, answereType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobPostCustomeQuestionList {\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
    sb.append("    answereType: ").append(toIndentedString(answereType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

