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
 * JobPostHowToApply
 */

@JsonTypeName("jobPost_howToApply")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T12:31:21.921085300-08:00[America/Los_Angeles]")
public class JobPostHowToApply implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * Gets or Sets applicationMethod
   */
  public enum ApplicationMethodEnum {
    EASY_APPLY("Easy Apply"),
    
    APPLY_ON_EMAIL("Apply On Email"),
    
    APPLY_ON_COMPANY_WEBSITE("Apply on company website");

    private String value;

    ApplicationMethodEnum(String value) {
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
    public static ApplicationMethodEnum fromValue(String value) {
      for (ApplicationMethodEnum b : ApplicationMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("applicationMethod")
  private ApplicationMethodEnum applicationMethod;

  @JsonProperty("email")
  private String email;

  @JsonProperty("website")
  private String website;

  public JobPostHowToApply applicationMethod(ApplicationMethodEnum applicationMethod) {
    this.applicationMethod = applicationMethod;
    return this;
  }

  /**
   * Get applicationMethod
   * @return applicationMethod
  */
  
  @Schema(name = "applicationMethod", required = false)
  public ApplicationMethodEnum getApplicationMethod() {
    return applicationMethod;
  }

  public void setApplicationMethod(ApplicationMethodEnum applicationMethod) {
    this.applicationMethod = applicationMethod;
  }

  public JobPostHowToApply email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  
  @Schema(name = "email", required = false)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public JobPostHowToApply website(String website) {
    this.website = website;
    return this;
  }

  /**
   * Get website
   * @return website
  */
  
  @Schema(name = "website", required = false)
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobPostHowToApply jobPostHowToApply = (JobPostHowToApply) o;
    return Objects.equals(this.applicationMethod, jobPostHowToApply.applicationMethod) &&
        Objects.equals(this.email, jobPostHowToApply.email) &&
        Objects.equals(this.website, jobPostHowToApply.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationMethod, email, website);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobPostHowToApply {\n");
    sb.append("    applicationMethod: ").append(toIndentedString(applicationMethod)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
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

