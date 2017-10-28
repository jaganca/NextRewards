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
import com.nexteducation.nextresources.model.CasteCustomResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * CasteCustomResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-28T02:31:31.507+05:30")
public class CasteCustomResponse   {
  @SerializedName("branchId")
  private Long branchId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("createdBy")
  private Long createdBy = null;

  @SerializedName("createdOn")
  private Date createdOn = null;

  @SerializedName("modifiedBy")
  private Long modifiedBy = null;

  @SerializedName("modifiedOn")
  private Date modifiedOn = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("subCastes")
  private List<CasteCustomResponse> subCastes = new ArrayList<CasteCustomResponse>();

  public CasteCustomResponse branchId(Long branchId) {
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

  public CasteCustomResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CasteCustomResponse createdBy(Long createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Long createdBy) {
    this.createdBy = createdBy;
  }

  public CasteCustomResponse createdOn(Date createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Get createdOn
   * @return createdOn
  **/
  @ApiModelProperty(example = "null", value = "")
  public Date getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(Date createdOn) {
    this.createdOn = createdOn;
  }

  public CasteCustomResponse modifiedBy(Long modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

   /**
   * Get modifiedBy
   * @return modifiedBy
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(Long modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public CasteCustomResponse modifiedOn(Date modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

   /**
   * Get modifiedOn
   * @return modifiedOn
  **/
  @ApiModelProperty(example = "null", value = "")
  public Date getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(Date modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public CasteCustomResponse id(Long id) {
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

  public CasteCustomResponse subCastes(List<CasteCustomResponse> subCastes) {
    this.subCastes = subCastes;
    return this;
  }

  public CasteCustomResponse addSubCastesItem(CasteCustomResponse subCastesItem) {
    this.subCastes.add(subCastesItem);
    return this;
  }

   /**
   * Get subCastes
   * @return subCastes
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<CasteCustomResponse> getSubCastes() {
    return subCastes;
  }

  public void setSubCastes(List<CasteCustomResponse> subCastes) {
    this.subCastes = subCastes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CasteCustomResponse casteCustomResponse = (CasteCustomResponse) o;
    return Objects.equals(this.branchId, casteCustomResponse.branchId) &&
        Objects.equals(this.name, casteCustomResponse.name) &&
        Objects.equals(this.createdBy, casteCustomResponse.createdBy) &&
        Objects.equals(this.createdOn, casteCustomResponse.createdOn) &&
        Objects.equals(this.modifiedBy, casteCustomResponse.modifiedBy) &&
        Objects.equals(this.modifiedOn, casteCustomResponse.modifiedOn) &&
        Objects.equals(this.id, casteCustomResponse.id) &&
        Objects.equals(this.subCastes, casteCustomResponse.subCastes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchId, name, createdBy, createdOn, modifiedBy, modifiedOn, id, subCastes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CasteCustomResponse {\n");
    
    sb.append("    branchId: ").append(toIndentedString(branchId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    subCastes: ").append(toIndentedString(subCastes)).append("\n");
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
