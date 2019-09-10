package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSoftwareandDataspecificationRetrieveOutputModelSoftwareandDataspecificationInstanceAnalysis
 */
public class BQSoftwareandDataspecificationRetrieveOutputModelSoftwareandDataspecificationInstanceAnalysis   {
  private Object softwareandDataspecificationInstanceAnalysisRecord = null;

  private String softwareandDataspecificationInstanceAnalysisReportType = null;

  private String softwareandDataspecificationInstanceAnalysisParameters = null;

  private Object softwareandDataspecificationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return softwareandDataspecificationInstanceAnalysisRecord
  **/

  public Object getSoftwareandDataspecificationInstanceAnalysisRecord() {
    return softwareandDataspecificationInstanceAnalysisRecord;
  }

  public void setSoftwareandDataspecificationInstanceAnalysisRecord(Object softwareandDataspecificationInstanceAnalysisRecord) {
    this.softwareandDataspecificationInstanceAnalysisRecord = softwareandDataspecificationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return softwareandDataspecificationInstanceAnalysisReportType
  **/

  public String getSoftwareandDataspecificationInstanceAnalysisReportType() {
    return softwareandDataspecificationInstanceAnalysisReportType;
  }

  public void setSoftwareandDataspecificationInstanceAnalysisReportType(String softwareandDataspecificationInstanceAnalysisReportType) {
    this.softwareandDataspecificationInstanceAnalysisReportType = softwareandDataspecificationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return softwareandDataspecificationInstanceAnalysisParameters
  **/

  public String getSoftwareandDataspecificationInstanceAnalysisParameters() {
    return softwareandDataspecificationInstanceAnalysisParameters;
  }

  public void setSoftwareandDataspecificationInstanceAnalysisParameters(String softwareandDataspecificationInstanceAnalysisParameters) {
    this.softwareandDataspecificationInstanceAnalysisParameters = softwareandDataspecificationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return softwareandDataspecificationInstanceAnalysisReport
  **/

  public Object getSoftwareandDataspecificationInstanceAnalysisReport() {
    return softwareandDataspecificationInstanceAnalysisReport;
  }

  public void setSoftwareandDataspecificationInstanceAnalysisReport(Object softwareandDataspecificationInstanceAnalysisReport) {
    this.softwareandDataspecificationInstanceAnalysisReport = softwareandDataspecificationInstanceAnalysisReport;
  }


}

