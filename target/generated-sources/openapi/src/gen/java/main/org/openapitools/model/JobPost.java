package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.JobPostCustomeQuestionList;
import org.openapitools.model.JobPostHowToApply;
import org.openapitools.model.JobPostSalaryRange;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * JobPost
 */

@JsonTypeName("jobPost")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T12:31:21.921085300-08:00[America/Los_Angeles]")
public class JobPost implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("userId")
  private Long userId;

  @JsonProperty("positionTitle")
  private String positionTitle;

  @JsonProperty("jobType")
  private String jobType;

  @JsonProperty("salaryRange")
  private JobPostSalaryRange salaryRange;

  @JsonProperty("closingDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate closingDate;

  @JsonProperty("requiredQualification")
  private String requiredQualification;

  @JsonProperty("jobCity")
  @Valid
  private List<String> jobCity = null;

  @JsonProperty("description")
  private String description;

  @JsonProperty("howToApply")
  private JobPostHowToApply howToApply;

  /**
   * Gets or Sets jobPostStatus
   */
  public enum JobPostStatusEnum {
    DRAFT("Draft"),
    
    ACTIVE("Active"),
    
    INACTIVE("inActive"),
    
    DELETED("deleted"),
    
    SUSPENDED("suspended"),
    
    EXPIRED("expired");

    private String value;

    JobPostStatusEnum(String value) {
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
    public static JobPostStatusEnum fromValue(String value) {
      for (JobPostStatusEnum b : JobPostStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("jobPostStatus")
  private JobPostStatusEnum jobPostStatus;

  @JsonProperty("customeQuestionList")
  @Valid
  private List<JobPostCustomeQuestionList> customeQuestionList = null;

  public JobPost id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "10", required = false)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public JobPost userId(Long userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  
  @Schema(name = "userId", example = "10", required = false)
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public JobPost positionTitle(String positionTitle) {
    this.positionTitle = positionTitle;
    return this;
  }

  /**
   * Get positionTitle
   * @return positionTitle
  */
  @Size(max = 30) 
  @Schema(name = "positionTitle", example = "Java Programmer", required = false)
  public String getPositionTitle() {
    return positionTitle;
  }

  public void setPositionTitle(String positionTitle) {
    this.positionTitle = positionTitle;
  }

  public JobPost jobType(String jobType) {
    this.jobType = jobType;
    return this;
  }

  /**
   * Full Time / Part Time / Contract / Co-op
   * @return jobType
  */
  @Size(max = 30) 
  @Schema(name = "jobType", example = "Full Time", description = "Full Time / Part Time / Contract / Co-op", required = false)
  public String getJobType() {
    return jobType;
  }

  public void setJobType(String jobType) {
    this.jobType = jobType;
  }

  public JobPost salaryRange(JobPostSalaryRange salaryRange) {
    this.salaryRange = salaryRange;
    return this;
  }

  /**
   * Get salaryRange
   * @return salaryRange
  */
  @Valid 
  @Schema(name = "salaryRange", required = false)
  public JobPostSalaryRange getSalaryRange() {
    return salaryRange;
  }

  public void setSalaryRange(JobPostSalaryRange salaryRange) {
    this.salaryRange = salaryRange;
  }

  public JobPost closingDate(LocalDate closingDate) {
    this.closingDate = closingDate;
    return this;
  }

  /**
   * Get closingDate
   * @return closingDate
  */
  @Valid 
  @Schema(name = "closingDate", required = false)
  public LocalDate getClosingDate() {
    return closingDate;
  }

  public void setClosingDate(LocalDate closingDate) {
    this.closingDate = closingDate;
  }

  public JobPost requiredQualification(String requiredQualification) {
    this.requiredQualification = requiredQualification;
    return this;
  }

  /**
   * Get requiredQualification
   * @return requiredQualification
  */
  
  @Schema(name = "requiredQualification", required = false)
  public String getRequiredQualification() {
    return requiredQualification;
  }

  public void setRequiredQualification(String requiredQualification) {
    this.requiredQualification = requiredQualification;
  }

  public JobPost jobCity(List<String> jobCity) {
    this.jobCity = jobCity;
    return this;
  }

  public JobPost addJobCityItem(String jobCityItem) {
    if (this.jobCity == null) {
      this.jobCity = new ArrayList<>();
    }
    this.jobCity.add(jobCityItem);
    return this;
  }

  /**
   * Get jobCity
   * @return jobCity
  */
  @Size(max = 3) 
  @Schema(name = "jobCity", required = false)
  public List<String> getJobCity() {
    return jobCity;
  }

  public void setJobCity(List<String> jobCity) {
    this.jobCity = jobCity;
  }

  public JobPost description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @Size(max = 255) 
  @Schema(name = "description", required = false)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public JobPost howToApply(JobPostHowToApply howToApply) {
    this.howToApply = howToApply;
    return this;
  }

  /**
   * Get howToApply
   * @return howToApply
  */
  @Valid 
  @Schema(name = "howToApply", required = false)
  public JobPostHowToApply getHowToApply() {
    return howToApply;
  }

  public void setHowToApply(JobPostHowToApply howToApply) {
    this.howToApply = howToApply;
  }

  public JobPost jobPostStatus(JobPostStatusEnum jobPostStatus) {
    this.jobPostStatus = jobPostStatus;
    return this;
  }

  /**
   * Get jobPostStatus
   * @return jobPostStatus
  */
  
  @Schema(name = "jobPostStatus", required = false)
  public JobPostStatusEnum getJobPostStatus() {
    return jobPostStatus;
  }

  public void setJobPostStatus(JobPostStatusEnum jobPostStatus) {
    this.jobPostStatus = jobPostStatus;
  }

  public JobPost customeQuestionList(List<JobPostCustomeQuestionList> customeQuestionList) {
    this.customeQuestionList = customeQuestionList;
    return this;
  }

  public JobPost addCustomeQuestionListItem(JobPostCustomeQuestionList customeQuestionListItem) {
    if (this.customeQuestionList == null) {
      this.customeQuestionList = new ArrayList<>();
    }
    this.customeQuestionList.add(customeQuestionListItem);
    return this;
  }

  /**
   * Get customeQuestionList
   * @return customeQuestionList
  */
  @Valid 
  @Schema(name = "customeQuestionList", required = false)
  public List<JobPostCustomeQuestionList> getCustomeQuestionList() {
    return customeQuestionList;
  }

  public void setCustomeQuestionList(List<JobPostCustomeQuestionList> customeQuestionList) {
    this.customeQuestionList = customeQuestionList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobPost jobPost = (JobPost) o;
    return Objects.equals(this.id, jobPost.id) &&
        Objects.equals(this.userId, jobPost.userId) &&
        Objects.equals(this.positionTitle, jobPost.positionTitle) &&
        Objects.equals(this.jobType, jobPost.jobType) &&
        Objects.equals(this.salaryRange, jobPost.salaryRange) &&
        Objects.equals(this.closingDate, jobPost.closingDate) &&
        Objects.equals(this.requiredQualification, jobPost.requiredQualification) &&
        Objects.equals(this.jobCity, jobPost.jobCity) &&
        Objects.equals(this.description, jobPost.description) &&
        Objects.equals(this.howToApply, jobPost.howToApply) &&
        Objects.equals(this.jobPostStatus, jobPost.jobPostStatus) &&
        Objects.equals(this.customeQuestionList, jobPost.customeQuestionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, positionTitle, jobType, salaryRange, closingDate, requiredQualification, jobCity, description, howToApply, jobPostStatus, customeQuestionList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobPost {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    positionTitle: ").append(toIndentedString(positionTitle)).append("\n");
    sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
    sb.append("    salaryRange: ").append(toIndentedString(salaryRange)).append("\n");
    sb.append("    closingDate: ").append(toIndentedString(closingDate)).append("\n");
    sb.append("    requiredQualification: ").append(toIndentedString(requiredQualification)).append("\n");
    sb.append("    jobCity: ").append(toIndentedString(jobCity)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    howToApply: ").append(toIndentedString(howToApply)).append("\n");
    sb.append("    jobPostStatus: ").append(toIndentedString(jobPostStatus)).append("\n");
    sb.append("    customeQuestionList: ").append(toIndentedString(customeQuestionList)).append("\n");
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

