package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRITSystemDevelopmentProjectRetrieveOutputModelITSystemDevelopmentProjectInstanceReportRecord
 */
public class CRITSystemDevelopmentProjectRetrieveOutputModelITSystemDevelopmentProjectInstanceReportRecord   {
  private String iTSystemDevelopmentProjectInstanceReportData = null;

  private String iTSystemDevelopmentProjectInstanceReportType = null;

  private Object iTSystemDevelopmentProjectInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return iTSystemDevelopmentProjectInstanceReportData
  **/

  public String getITSystemDevelopmentProjectInstanceReportData() {
    return iTSystemDevelopmentProjectInstanceReportData;
  }
  
  @JsonProperty("iTSystemDevelopmentProjectInstanceReportData")
  public void setITSystemDevelopmentProjectInstanceReportData(String iTSystemDevelopmentProjectInstanceReportData) {
    this.iTSystemDevelopmentProjectInstanceReportData = iTSystemDevelopmentProjectInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return iTSystemDevelopmentProjectInstanceReportType
  **/

  public String getITSystemDevelopmentProjectInstanceReportType() {
    return iTSystemDevelopmentProjectInstanceReportType;
  }
   
  @JsonProperty("iTSystemDevelopmentProjectInstanceReportType")
  public void setITSystemDevelopmentProjectInstanceReportType(String iTSystemDevelopmentProjectInstanceReportType) {
    this.iTSystemDevelopmentProjectInstanceReportType = iTSystemDevelopmentProjectInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return iTSystemDevelopmentProjectInstanceReport
  **/

  public Object getITSystemDevelopmentProjectInstanceReport() {
    return iTSystemDevelopmentProjectInstanceReport;
  }
   
  @JsonProperty("iTSystemDevelopmentProjectInstanceReport")
  public void setITSystemDevelopmentProjectInstanceReport(Object iTSystemDevelopmentProjectInstanceReport) {
    this.iTSystemDevelopmentProjectInstanceReport = iTSystemDevelopmentProjectInstanceReport;
  }


}

