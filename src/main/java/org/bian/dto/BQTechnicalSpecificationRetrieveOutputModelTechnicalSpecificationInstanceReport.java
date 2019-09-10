package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTechnicalSpecificationRetrieveOutputModelTechnicalSpecificationInstanceReport
 */
public class BQTechnicalSpecificationRetrieveOutputModelTechnicalSpecificationInstanceReport   {
  private Object technicalSpecificationInstanceReportRecord = null;

  private String technicalSpecificationInstanceReportType = null;

  private String technicalSpecificationInstanceReportParameters = null;

  private Object technicalSpecificationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return technicalSpecificationInstanceReportRecord
  **/

  public Object getTechnicalSpecificationInstanceReportRecord() {
    return technicalSpecificationInstanceReportRecord;
  }

  public void setTechnicalSpecificationInstanceReportRecord(Object technicalSpecificationInstanceReportRecord) {
    this.technicalSpecificationInstanceReportRecord = technicalSpecificationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return technicalSpecificationInstanceReportType
  **/

  public String getTechnicalSpecificationInstanceReportType() {
    return technicalSpecificationInstanceReportType;
  }

  public void setTechnicalSpecificationInstanceReportType(String technicalSpecificationInstanceReportType) {
    this.technicalSpecificationInstanceReportType = technicalSpecificationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return technicalSpecificationInstanceReportParameters
  **/

  public String getTechnicalSpecificationInstanceReportParameters() {
    return technicalSpecificationInstanceReportParameters;
  }

  public void setTechnicalSpecificationInstanceReportParameters(String technicalSpecificationInstanceReportParameters) {
    this.technicalSpecificationInstanceReportParameters = technicalSpecificationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return technicalSpecificationInstanceReport
  **/

  public Object getTechnicalSpecificationInstanceReport() {
    return technicalSpecificationInstanceReport;
  }

  public void setTechnicalSpecificationInstanceReport(Object technicalSpecificationInstanceReport) {
    this.technicalSpecificationInstanceReport = technicalSpecificationInstanceReport;
  }


}

