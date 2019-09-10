package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTechnicalSpecificationRetrieveOutputModelTechnicalSpecificationInstanceAnalysis
 */
public class BQTechnicalSpecificationRetrieveOutputModelTechnicalSpecificationInstanceAnalysis   {
  private Object technicalSpecificationInstanceAnalysisRecord = null;

  private String technicalSpecificationInstanceAnalysisReportType = null;

  private String technicalSpecificationInstanceAnalysisParameters = null;

  private Object technicalSpecificationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return technicalSpecificationInstanceAnalysisRecord
  **/

  public Object getTechnicalSpecificationInstanceAnalysisRecord() {
    return technicalSpecificationInstanceAnalysisRecord;
  }

  public void setTechnicalSpecificationInstanceAnalysisRecord(Object technicalSpecificationInstanceAnalysisRecord) {
    this.technicalSpecificationInstanceAnalysisRecord = technicalSpecificationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return technicalSpecificationInstanceAnalysisReportType
  **/

  public String getTechnicalSpecificationInstanceAnalysisReportType() {
    return technicalSpecificationInstanceAnalysisReportType;
  }

  public void setTechnicalSpecificationInstanceAnalysisReportType(String technicalSpecificationInstanceAnalysisReportType) {
    this.technicalSpecificationInstanceAnalysisReportType = technicalSpecificationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return technicalSpecificationInstanceAnalysisParameters
  **/

  public String getTechnicalSpecificationInstanceAnalysisParameters() {
    return technicalSpecificationInstanceAnalysisParameters;
  }

  public void setTechnicalSpecificationInstanceAnalysisParameters(String technicalSpecificationInstanceAnalysisParameters) {
    this.technicalSpecificationInstanceAnalysisParameters = technicalSpecificationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return technicalSpecificationInstanceAnalysisReport
  **/

  public Object getTechnicalSpecificationInstanceAnalysisReport() {
    return technicalSpecificationInstanceAnalysisReport;
  }

  public void setTechnicalSpecificationInstanceAnalysisReport(Object technicalSpecificationInstanceAnalysisReport) {
    this.technicalSpecificationInstanceAnalysisReport = technicalSpecificationInstanceAnalysisReport;
  }


}

