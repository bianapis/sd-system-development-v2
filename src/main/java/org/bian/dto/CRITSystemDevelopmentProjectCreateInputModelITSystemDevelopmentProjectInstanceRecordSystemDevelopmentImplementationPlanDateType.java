package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecordSystemDevelopmentImplementationPlanDateType
 */
public class CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecordSystemDevelopmentImplementationPlanDateType   {
  private String date = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: Value of the specific date type 
   * @return date
  **/

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


}

