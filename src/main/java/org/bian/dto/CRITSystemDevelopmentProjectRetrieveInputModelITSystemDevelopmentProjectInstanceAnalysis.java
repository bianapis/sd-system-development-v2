package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRITSystemDevelopmentProjectRetrieveInputModelITSystemDevelopmentProjectInstanceAnalysis
 */
public class CRITSystemDevelopmentProjectRetrieveInputModelITSystemDevelopmentProjectInstanceAnalysis   {
  private String iTSystemDevelopmentProjectInstanceAnalysisReference = null;

  private String iTSystemDevelopmentProjectInstanceAnalysisReportType = null;

  private String iTSystemDevelopmentProjectInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return iTSystemDevelopmentProjectInstanceAnalysisReference
  **/

  public String getITSystemDevelopmentProjectInstanceAnalysisReference() {
    return iTSystemDevelopmentProjectInstanceAnalysisReference;
  }

  public void setITSystemDevelopmentProjectInstanceAnalysisReference(String iTSystemDevelopmentProjectInstanceAnalysisReference) {
    this.iTSystemDevelopmentProjectInstanceAnalysisReference = iTSystemDevelopmentProjectInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return iTSystemDevelopmentProjectInstanceAnalysisReportType
  **/

  public String getITSystemDevelopmentProjectInstanceAnalysisReportType() {
    return iTSystemDevelopmentProjectInstanceAnalysisReportType;
  }

  public void setITSystemDevelopmentProjectInstanceAnalysisReportType(String iTSystemDevelopmentProjectInstanceAnalysisReportType) {
    this.iTSystemDevelopmentProjectInstanceAnalysisReportType = iTSystemDevelopmentProjectInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return iTSystemDevelopmentProjectInstanceAnalysisParameters
  **/

  public String getITSystemDevelopmentProjectInstanceAnalysisParameters() {
    return iTSystemDevelopmentProjectInstanceAnalysisParameters;
  }

  public void setITSystemDevelopmentProjectInstanceAnalysisParameters(String iTSystemDevelopmentProjectInstanceAnalysisParameters) {
    this.iTSystemDevelopmentProjectInstanceAnalysisParameters = iTSystemDevelopmentProjectInstanceAnalysisParameters;
  }


}

