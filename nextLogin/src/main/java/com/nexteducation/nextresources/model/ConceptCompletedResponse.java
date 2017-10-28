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
import com.nexteducation.nextresources.model.ChapterResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * ConceptCompletedResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-28T02:31:31.507+05:30")
public class ConceptCompletedResponse   {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("chapterResponse")
  private ChapterResponse chapterResponse = null;

  public ConceptCompletedResponse id(Long id) {
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

  public ConceptCompletedResponse chapterResponse(ChapterResponse chapterResponse) {
    this.chapterResponse = chapterResponse;
    return this;
  }

   /**
   * Get chapterResponse
   * @return chapterResponse
  **/
  @ApiModelProperty(example = "null", value = "")
  public ChapterResponse getChapterResponse() {
    return chapterResponse;
  }

  public void setChapterResponse(ChapterResponse chapterResponse) {
    this.chapterResponse = chapterResponse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConceptCompletedResponse conceptCompletedResponse = (ConceptCompletedResponse) o;
    return Objects.equals(this.id, conceptCompletedResponse.id) &&
        Objects.equals(this.chapterResponse, conceptCompletedResponse.chapterResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, chapterResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConceptCompletedResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    chapterResponse: ").append(toIndentedString(chapterResponse)).append("\n");
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

