package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFunctionalSpecificationRetrieveOutputModelFunctionalSpecificationInstanceAnalysis
 */
public class BQFunctionalSpecificationRetrieveOutputModelFunctionalSpecificationInstanceAnalysis   {
  private Object functionalSpecificationInstanceAnalysisRecord = null;

  private String functionalSpecificationInstanceAnalysisReportType = null;

  private String functionalSpecificationInstanceAnalysisParameters = null;

  private Object functionalSpecificationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return functionalSpecificationInstanceAnalysisRecord
  **/

  public Object getFunctionalSpecificationInstanceAnalysisRecord() {
    return functionalSpecificationInstanceAnalysisRecord;
  }

  public void setFunctionalSpecificationInstanceAnalysisRecord(Object functionalSpecificationInstanceAnalysisRecord) {
    this.functionalSpecificationInstanceAnalysisRecord = functionalSpecificationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return functionalSpecificationInstanceAnalysisReportType
  **/

  public String getFunctionalSpecificationInstanceAnalysisReportType() {
    return functionalSpecificationInstanceAnalysisReportType;
  }

  public void setFunctionalSpecificationInstanceAnalysisReportType(String functionalSpecificationInstanceAnalysisReportType) {
    this.functionalSpecificationInstanceAnalysisReportType = functionalSpecificationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return functionalSpecificationInstanceAnalysisParameters
  **/

  public String getFunctionalSpecificationInstanceAnalysisParameters() {
    return functionalSpecificationInstanceAnalysisParameters;
  }

  public void setFunctionalSpecificationInstanceAnalysisParameters(String functionalSpecificationInstanceAnalysisParameters) {
    this.functionalSpecificationInstanceAnalysisParameters = functionalSpecificationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return functionalSpecificationInstanceAnalysisReport
  **/

  public Object getFunctionalSpecificationInstanceAnalysisReport() {
    return functionalSpecificationInstanceAnalysisReport;
  }

  public void setFunctionalSpecificationInstanceAnalysisReport(Object functionalSpecificationInstanceAnalysisReport) {
    this.functionalSpecificationInstanceAnalysisReport = functionalSpecificationInstanceAnalysisReport;
  }


}

