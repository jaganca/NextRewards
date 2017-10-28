/**
 * NextConfig
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.nexteducation.nextresources.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * CustomFormElementRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-28T02:31:31.507+05:30")
public class CustomFormElementRequest   {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("branchId")
  private Long branchId = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("placeholder")
  private String placeholder = null;

  @SerializedName("customFieldId")
  private Long customFieldId = null;

  @SerializedName("formId")
  private Long formId = null;

  @SerializedName("entityName")
  private String entityName = null;

  @SerializedName("standardFieldId")
  private Long standardFieldId = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    @SerializedName("Active")
    ACTIVE("Active"),
    
    @SerializedName("Inactive")
    INACTIVE("Inactive");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("ifMandatory")
  private Boolean ifMandatory = false;

  @SerializedName("ifHide")
  private Boolean ifHide = false;

  public CustomFormElementRequest id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CustomFormElementRequest branchId(Long branchId) {
    this.branchId = branchId;
    return this;
  }

   /**
   * Get branchId
   * @return branchId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getBranchId() {
    return branchId;
  }

  public void setBranchId(Long branchId) {
    this.branchId = branchId;
  }

  public CustomFormElementRequest label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public CustomFormElementRequest placeholder(String placeholder) {
    this.placeholder = placeholder;
    return this;
  }

   /**
   * Get placeholder
   * @return placeholder
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPlaceholder() {
    return placeholder;
  }

  public void setPlaceholder(String placeholder) {
    this.placeholder = placeholder;
  }

  public CustomFormElementRequest customFieldId(Long customFieldId) {
    this.customFieldId = customFieldId;
    return this;
  }

   /**
   * Get customFieldId
   * @return customFieldId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getCustomFieldId() {
    return customFieldId;
  }

  public void setCustomFieldId(Long customFieldId) {
    this.customFieldId = customFieldId;
  }

  public CustomFormElementRequest formId(Long formId) {
    this.formId = formId;
    return this;
  }

   /**
   * Get formId
   * @return formId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getFormId() {
    return formId;
  }

  public void setFormId(Long formId) {
    this.formId = formId;
  }

  public CustomFormElementRequest entityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

   /**
   * Get entityName
   * @return entityName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEntityName() {
    return entityName;
  }

  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }

  public CustomFormElementRequest standardFieldId(Long standardFieldId) {
    this.standardFieldId = standardFieldId;
    return this;
  }

   /**
   * Get standardFieldId
   * @return standardFieldId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getStandardFieldId() {
    return standardFieldId;
  }

  public void setStandardFieldId(Long standardFieldId) {
    this.standardFieldId = standardFieldId;
  }

  public CustomFormElementRequest status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public CustomFormElementRequest ifMandatory(Boolean ifMandatory) {
    this.ifMandatory = ifMandatory;
    return this;
  }

   /**
   * Get ifMandatory
   * @return ifMandatory
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIfMandatory() {
    return ifMandatory;
  }

  public void setIfMandatory(Boolean ifMandatory) {
    this.ifMandatory = ifMandatory;
  }

  public CustomFormElementRequest ifHide(Boolean ifHide) {
    this.ifHide = ifHide;
    return this;
  }

   /**
   * Get ifHide
   * @return ifHide
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIfHide() {
    return ifHide;
  }

  public void setIfHide(Boolean ifHide) {
    this.ifHide = ifHide;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFormElementRequest customFormElementRequest = (CustomFormElementRequest) o;
    return Objects.equals(this.id, customFormElementRequest.id) &&
        Objects.equals(this.branchId, customFormElementRequest.branchId) &&
        Objects.equals(this.label, customFormElementRequest.label) &&
        Objects.equals(this.placeholder, customFormElementRequest.placeholder) &&
        Objects.equals(this.customFieldId, customFormElementRequest.customFieldId) &&
        Objects.equals(this.formId, customFormElementRequest.formId) &&
        Objects.equals(this.entityName, customFormElementRequest.entityName) &&
        Objects.equals(this.standardFieldId, customFormElementRequest.standardFieldId) &&
        Objects.equals(this.status, customFormElementRequest.status) &&
        Objects.equals(this.ifMandatory, customFormElementRequest.ifMandatory) &&
        Objects.equals(this.ifHide, customFormElementRequest.ifHide);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, branchId, label, placeholder, customFieldId, formId, entityName, standardFieldId, status, ifMandatory, ifHide);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFormElementRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    branchId: ").append(toIndentedString(branchId)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    placeholder: ").append(toIndentedString(placeholder)).append("\n");
    sb.append("    customFieldId: ").append(toIndentedString(customFieldId)).append("\n");
    sb.append("    formId: ").append(toIndentedString(formId)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    standardFieldId: ").append(toIndentedString(standardFieldId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    ifMandatory: ").append(toIndentedString(ifMandatory)).append("\n");
    sb.append("    ifHide: ").append(toIndentedString(ifHide)).append("\n");
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

