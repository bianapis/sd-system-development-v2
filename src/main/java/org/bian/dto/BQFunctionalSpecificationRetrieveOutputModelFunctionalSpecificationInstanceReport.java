package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFunctionalSpecificationRetrieveOutputModelFunctionalSpecificationInstanceReport
 */
public class BQFunctionalSpecificationRetrieveOutputModelFunctionalSpecificationInstanceReport   {
  private Object functionalSpecificationInstanceReportRecord = null;

  private String functionalSpecificationInstanceReportType = null;

  private String functionalSpecificationInstanceReportParameters = null;

  private Object functionalSpecificationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return functionalSpecificationInstanceReportRecord
  **/

  public Object getFunctionalSpecificationInstanceReportRecord() {
    return functionalSpecificationInstanceReportRecord;
  }

  public void setFunctionalSpecificationInstanceReportRecord(Object functionalSpecificationInstanceReportRecord) {
    this.functionalSpecificationInstanceReportRecord = functionalSpecificationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return functionalSpecificationInstanceReportType
  **/

  public String getFunctionalSpecificationInstanceReportType() {
    return functionalSpecificationInstanceReportType;
  }

  public void setFunctionalSpecificationInstanceReportType(String functionalSpecificationInstanceReportType) {
    this.functionalSpecificationInstanceReportType = functionalSpecificationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return functionalSpecificationInstanceReportParameters
  **/

  public String getFunctionalSpecificationInstanceReportParameters() {
    return functionalSpecificationInstanceReportParameters;
  }

  public void setFunctionalSpecificationInstanceReportParameters(String functionalSpecificationInstanceReportParameters) {
    this.functionalSpecificationInstanceReportParameters = functionalSpecificationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return functionalSpecificationInstanceReport
  **/

  public Object getFunctionalSpecificationInstanceReport() {
    return functionalSpecificationInstanceReport;
  }

  public void setFunctionalSpecificationInstanceReport(Object functionalSpecificationInstanceReport) {
    this.functionalSpecificationInstanceReport = functionalSpecificationInstanceReport;
  }


}

