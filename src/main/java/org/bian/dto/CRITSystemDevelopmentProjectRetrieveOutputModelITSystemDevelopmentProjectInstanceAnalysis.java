package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRITSystemDevelopmentProjectRetrieveOutputModelITSystemDevelopmentProjectInstanceAnalysis
 */
public class CRITSystemDevelopmentProjectRetrieveOutputModelITSystemDevelopmentProjectInstanceAnalysis   {
  private String iTSystemDevelopmentProjectInstanceAnalysisData = null;

  private String iTSystemDevelopmentProjectInstanceAnalysisReportType = null;

  private Object iTSystemDevelopmentProjectInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return iTSystemDevelopmentProjectInstanceAnalysisData
  **/

  public String getITSystemDevelopmentProjectInstanceAnalysisData() {
    return iTSystemDevelopmentProjectInstanceAnalysisData;
  }
   @JsonProperty("iTSystemDevelopmentProjectInstanceAnalysisData")
  public void setITSystemDevelopmentProjectInstanceAnalysisData(String iTSystemDevelopmentProjectInstanceAnalysisData) {
    this.iTSystemDevelopmentProjectInstanceAnalysisData = iTSystemDevelopmentProjectInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return iTSystemDevelopmentProjectInstanceAnalysisReportType
  **/

  public String getITSystemDevelopmentProjectInstanceAnalysisReportType() {
    return iTSystemDevelopmentProjectInstanceAnalysisReportType;
  }
  
  @JsonProperty("iTSystemDevelopmentProjectInstanceAnalysisReportType")
  public void setITSystemDevelopmentProjectInstanceAnalysisReportType(String iTSystemDevelopmentProjectInstanceAnalysisReportType) {
    this.iTSystemDevelopmentProjectInstanceAnalysisReportType = iTSystemDevelopmentProjectInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return iTSystemDevelopmentProjectInstanceAnalysisReport
  **/

  public Object getITSystemDevelopmentProjectInstanceAnalysisReport() {
    return iTSystemDevelopmentProjectInstanceAnalysisReport;
  }
   
  @JsonProperty("iTSystemDevelopmentProjectInstanceAnalysisReport")
  public void setITSystemDevelopmentProjectInstanceAnalysisReport(Object iTSystemDevelopmentProjectInstanceAnalysisReport) {
    this.iTSystemDevelopmentProjectInstanceAnalysisReport = iTSystemDevelopmentProjectInstanceAnalysisReport;
  }


}

