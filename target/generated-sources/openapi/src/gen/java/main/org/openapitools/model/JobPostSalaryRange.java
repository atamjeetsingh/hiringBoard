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
 * JobPostSalaryRange
 */

@JsonTypeName("jobPost_salaryRange")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T12:31:21.921085300-08:00[America/Los_Angeles]")
public class JobPostSalaryRange implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * Gets or Sets salaryType
   */
  public enum SalaryTypeEnum {
    ANNUALLY("Annually"),
    
    MONTHLY("monthly"),
    
    HOURLY("Hourly");

    private String value;

    SalaryTypeEnum(String value) {
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
    public static SalaryTypeEnum fromValue(String value) {
      for (SalaryTypeEnum b : SalaryTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("salaryType")
  private SalaryTypeEnum salaryType;

  @JsonProperty("salaryMinimum")
  private String salaryMinimum;

  @JsonProperty("salaryMaximum")
  private String salaryMaximum;

  @JsonProperty("wage")
  private String wage;

  public JobPostSalaryRange salaryType(SalaryTypeEnum salaryType) {
    this.salaryType = salaryType;
    return this;
  }

  /**
   * Get salaryType
   * @return salaryType
  */
  
  @Schema(name = "salaryType", required = false)
  public SalaryTypeEnum getSalaryType() {
    return salaryType;
  }

  public void setSalaryType(SalaryTypeEnum salaryType) {
    this.salaryType = salaryType;
  }

  public JobPostSalaryRange salaryMinimum(String salaryMinimum) {
    this.salaryMinimum = salaryMinimum;
    return this;
  }

  /**
   * Get salaryMinimum
   * @return salaryMinimum
  */
  
  @Schema(name = "salaryMinimum", required = false)
  public String getSalaryMinimum() {
    return salaryMinimum;
  }

  public void setSalaryMinimum(String salaryMinimum) {
    this.salaryMinimum = salaryMinimum;
  }

  public JobPostSalaryRange salaryMaximum(String salaryMaximum) {
    this.salaryMaximum = salaryMaximum;
    return this;
  }

  /**
   * Get salaryMaximum
   * @return salaryMaximum
  */
  
  @Schema(name = "salaryMaximum", required = false)
  public String getSalaryMaximum() {
    return salaryMaximum;
  }

  public void setSalaryMaximum(String salaryMaximum) {
    this.salaryMaximum = salaryMaximum;
  }

  public JobPostSalaryRange wage(String wage) {
    this.wage = wage;
    return this;
  }

  /**
   * Get wage
   * @return wage
  */
  
  @Schema(name = "wage", required = false)
  public String getWage() {
    return wage;
  }

  public void setWage(String wage) {
    this.wage = wage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobPostSalaryRange jobPostSalaryRange = (JobPostSalaryRange) o;
    return Objects.equals(this.salaryType, jobPostSalaryRange.salaryType) &&
        Objects.equals(this.salaryMinimum, jobPostSalaryRange.salaryMinimum) &&
        Objects.equals(this.salaryMaximum, jobPostSalaryRange.salaryMaximum) &&
        Objects.equals(this.wage, jobPostSalaryRange.wage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(salaryType, salaryMinimum, salaryMaximum, wage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobPostSalaryRange {\n");
    sb.append("    salaryType: ").append(toIndentedString(salaryType)).append("\n");
    sb.append("    salaryMinimum: ").append(toIndentedString(salaryMinimum)).append("\n");
    sb.append("    salaryMaximum: ").append(toIndentedString(salaryMaximum)).append("\n");
    sb.append("    wage: ").append(toIndentedString(wage)).append("\n");
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

