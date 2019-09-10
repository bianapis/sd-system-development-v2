package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSoftwareandDataspecificationRetrieveOutputModelSoftwareandDataspecificationInstanceReport
 */
public class BQSoftwareandDataspecificationRetrieveOutputModelSoftwareandDataspecificationInstanceReport   {
  private Object softwareandDataspecificationInstanceReportRecord = null;

  private String softwareandDataspecificationInstanceReportType = null;

  private String softwareandDataspecificationInstanceReportParameters = null;

  private Object softwareandDataspecificationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return softwareandDataspecificationInstanceReportRecord
  **/

  public Object getSoftwareandDataspecificationInstanceReportRecord() {
    return softwareandDataspecificationInstanceReportRecord;
  }

  public void setSoftwareandDataspecificationInstanceReportRecord(Object softwareandDataspecificationInstanceReportRecord) {
    this.softwareandDataspecificationInstanceReportRecord = softwareandDataspecificationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return softwareandDataspecificationInstanceReportType
  **/

  public String getSoftwareandDataspecificationInstanceReportType() {
    return softwareandDataspecificationInstanceReportType;
  }

  public void setSoftwareandDataspecificationInstanceReportType(String softwareandDataspecificationInstanceReportType) {
    this.softwareandDataspecificationInstanceReportType = softwareandDataspecificationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return softwareandDataspecificationInstanceReportParameters
  **/

  public String getSoftwareandDataspecificationInstanceReportParameters() {
    return softwareandDataspecificationInstanceReportParameters;
  }

  public void setSoftwareandDataspecificationInstanceReportParameters(String softwareandDataspecificationInstanceReportParameters) {
    this.softwareandDataspecificationInstanceReportParameters = softwareandDataspecificationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return softwareandDataspecificationInstanceReport
  **/

  public Object getSoftwareandDataspecificationInstanceReport() {
    return softwareandDataspecificationInstanceReport;
  }

  public void setSoftwareandDataspecificationInstanceReport(Object softwareandDataspecificationInstanceReport) {
    this.softwareandDataspecificationInstanceReport = softwareandDataspecificationInstanceReport;
  }


}

