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
import com.nexteducation.nextresources.model.Chapter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * LoginCustomResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-28T02:31:31.507+05:30")
public class LoginCustomResponse   {
  @SerializedName("chapterList")
  private List<Chapter> chapterList = new ArrayList<Chapter>();

  @SerializedName("studentId")
  private Long studentId = null;

  @SerializedName("classId")
  private Long classId = null;

  public LoginCustomResponse chapterList(List<Chapter> chapterList) {
    this.chapterList = chapterList;
    return this;
  }

  public LoginCustomResponse addChapterListItem(Chapter chapterListItem) {
    this.chapterList.add(chapterListItem);
    return this;
  }

   /**
   * Get chapterList
   * @return chapterList
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Chapter> getChapterList() {
    return chapterList;
  }

  public void setChapterList(List<Chapter> chapterList) {
    this.chapterList = chapterList;
  }

  public LoginCustomResponse studentId(Long studentId) {
    this.studentId = studentId;
    return this;
  }

   /**
   * Get studentId
   * @return studentId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getStudentId() {
    return studentId;
  }

  public void setStudentId(Long studentId) {
    this.studentId = studentId;
  }

  public LoginCustomResponse classId(Long classId) {
    this.classId = classId;
    return this;
  }

   /**
   * Get classId
   * @return classId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getClassId() {
    return classId;
  }

  public void setClassId(Long classId) {
    this.classId = classId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginCustomResponse loginCustomResponse = (LoginCustomResponse) o;
    return Objects.equals(this.chapterList, loginCustomResponse.chapterList) &&
        Objects.equals(this.studentId, loginCustomResponse.studentId) &&
        Objects.equals(this.classId, loginCustomResponse.classId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chapterList, studentId, classId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginCustomResponse {\n");
    
    sb.append("    chapterList: ").append(toIndentedString(chapterList)).append("\n");
    sb.append("    studentId: ").append(toIndentedString(studentId)).append("\n");
    sb.append("    classId: ").append(toIndentedString(classId)).append("\n");
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

