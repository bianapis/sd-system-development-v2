package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTestingSpecificationRetrieveOutputModelTestingSpecificationInstanceAnalysis
 */
public class BQTestingSpecificationRetrieveOutputModelTestingSpecificationInstanceAnalysis   {
  private Object testingSpecificationInstanceAnalysisRecord = null;

  private String testingSpecificationInstanceAnalysisReportType = null;

  private String testingSpecificationInstanceAnalysisParameters = null;

  private Object testingSpecificationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return testingSpecificationInstanceAnalysisRecord
  **/

  public Object getTestingSpecificationInstanceAnalysisRecord() {
    return testingSpecificationInstanceAnalysisRecord;
  }

  public void setTestingSpecificationInstanceAnalysisRecord(Object testingSpecificationInstanceAnalysisRecord) {
    this.testingSpecificationInstanceAnalysisRecord = testingSpecificationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return testingSpecificationInstanceAnalysisReportType
  **/

  public String getTestingSpecificationInstanceAnalysisReportType() {
    return testingSpecificationInstanceAnalysisReportType;
  }

  public void setTestingSpecificationInstanceAnalysisReportType(String testingSpecificationInstanceAnalysisReportType) {
    this.testingSpecificationInstanceAnalysisReportType = testingSpecificationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return testingSpecificationInstanceAnalysisParameters
  **/

  public String getTestingSpecificationInstanceAnalysisParameters() {
    return testingSpecificationInstanceAnalysisParameters;
  }

  public void setTestingSpecificationInstanceAnalysisParameters(String testingSpecificationInstanceAnalysisParameters) {
    this.testingSpecificationInstanceAnalysisParameters = testingSpecificationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return testingSpecificationInstanceAnalysisReport
  **/

  public Object getTestingSpecificationInstanceAnalysisReport() {
    return testingSpecificationInstanceAnalysisReport;
  }

  public void setTestingSpecificationInstanceAnalysisReport(Object testingSpecificationInstanceAnalysisReport) {
    this.testingSpecificationInstanceAnalysisReport = testingSpecificationInstanceAnalysisReport;
  }


}

