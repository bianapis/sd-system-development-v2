package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQUsageSpecificationRetrieveOutputModelUsageSpecificationInstanceAnalysis
 */
public class BQUsageSpecificationRetrieveOutputModelUsageSpecificationInstanceAnalysis   {
  private Object usageSpecificationInstanceAnalysisRecord = null;

  private String usageSpecificationInstanceAnalysisReportType = null;

  private String usageSpecificationInstanceAnalysisParameters = null;

  private Object usageSpecificationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return usageSpecificationInstanceAnalysisRecord
  **/

  public Object getUsageSpecificationInstanceAnalysisRecord() {
    return usageSpecificationInstanceAnalysisRecord;
  }

  public void setUsageSpecificationInstanceAnalysisRecord(Object usageSpecificationInstanceAnalysisRecord) {
    this.usageSpecificationInstanceAnalysisRecord = usageSpecificationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return usageSpecificationInstanceAnalysisReportType
  **/

  public String getUsageSpecificationInstanceAnalysisReportType() {
    return usageSpecificationInstanceAnalysisReportType;
  }

  public void setUsageSpecificationInstanceAnalysisReportType(String usageSpecificationInstanceAnalysisReportType) {
    this.usageSpecificationInstanceAnalysisReportType = usageSpecificationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return usageSpecificationInstanceAnalysisParameters
  **/

  public String getUsageSpecificationInstanceAnalysisParameters() {
    return usageSpecificationInstanceAnalysisParameters;
  }

  public void setUsageSpecificationInstanceAnalysisParameters(String usageSpecificationInstanceAnalysisParameters) {
    this.usageSpecificationInstanceAnalysisParameters = usageSpecificationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return usageSpecificationInstanceAnalysisReport
  **/

  public Object getUsageSpecificationInstanceAnalysisReport() {
    return usageSpecificationInstanceAnalysisReport;
  }

  public void setUsageSpecificationInstanceAnalysisReport(Object usageSpecificationInstanceAnalysisReport) {
    this.usageSpecificationInstanceAnalysisReport = usageSpecificationInstanceAnalysisReport;
  }


}

