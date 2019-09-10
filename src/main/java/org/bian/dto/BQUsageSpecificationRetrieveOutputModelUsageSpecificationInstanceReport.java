package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQUsageSpecificationRetrieveOutputModelUsageSpecificationInstanceReport
 */
public class BQUsageSpecificationRetrieveOutputModelUsageSpecificationInstanceReport   {
  private Object usageSpecificationInstanceReportRecord = null;

  private String usageSpecificationInstanceReportType = null;

  private String usageSpecificationInstanceReportParameters = null;

  private Object usageSpecificationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return usageSpecificationInstanceReportRecord
  **/

  public Object getUsageSpecificationInstanceReportRecord() {
    return usageSpecificationInstanceReportRecord;
  }

  public void setUsageSpecificationInstanceReportRecord(Object usageSpecificationInstanceReportRecord) {
    this.usageSpecificationInstanceReportRecord = usageSpecificationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return usageSpecificationInstanceReportType
  **/

  public String getUsageSpecificationInstanceReportType() {
    return usageSpecificationInstanceReportType;
  }

  public void setUsageSpecificationInstanceReportType(String usageSpecificationInstanceReportType) {
    this.usageSpecificationInstanceReportType = usageSpecificationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return usageSpecificationInstanceReportParameters
  **/

  public String getUsageSpecificationInstanceReportParameters() {
    return usageSpecificationInstanceReportParameters;
  }

  public void setUsageSpecificationInstanceReportParameters(String usageSpecificationInstanceReportParameters) {
    this.usageSpecificationInstanceReportParameters = usageSpecificationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return usageSpecificationInstanceReport
  **/

  public Object getUsageSpecificationInstanceReport() {
    return usageSpecificationInstanceReport;
  }

  public void setUsageSpecificationInstanceReport(Object usageSpecificationInstanceReport) {
    this.usageSpecificationInstanceReport = usageSpecificationInstanceReport;
  }


}

