package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTechnicalSpecificationRetrieveInputModelTechnicalSpecificationInstanceAnalysis;
import org.bian.dto.BQTechnicalSpecificationRetrieveInputModelTechnicalSpecificationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTechnicalSpecificationRetrieveInputModel
 */
public class BQTechnicalSpecificationRetrieveInputModel   {
  private Object technicalSpecificationRetrieveActionTaskRecord = null;

  private String technicalSpecificationRetrieveActionRequest = null;

  private BQTechnicalSpecificationRetrieveInputModelTechnicalSpecificationInstanceReport technicalSpecificationInstanceReport = null;

  private BQTechnicalSpecificationRetrieveInputModelTechnicalSpecificationInstanceAnalysis technicalSpecificationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return technicalSpecificationRetrieveActionTaskRecord
  **/

  public Object getTechnicalSpecificationRetrieveActionTaskRecord() {
    return technicalSpecificationRetrieveActionTaskRecord;
  }

  public void setTechnicalSpecificationRetrieveActionTaskRecord(Object technicalSpecificationRetrieveActionTaskRecord) {
    this.technicalSpecificationRetrieveActionTaskRecord = technicalSpecificationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return technicalSpecificationRetrieveActionRequest
  **/

  public String getTechnicalSpecificationRetrieveActionRequest() {
    return technicalSpecificationRetrieveActionRequest;
  }

  public void setTechnicalSpecificationRetrieveActionRequest(String technicalSpecificationRetrieveActionRequest) {
    this.technicalSpecificationRetrieveActionRequest = technicalSpecificationRetrieveActionRequest;
  }


  /**
   * Get technicalSpecificationInstanceReport
   * @return technicalSpecificationInstanceReport
  **/

  public BQTechnicalSpecificationRetrieveInputModelTechnicalSpecificationInstanceReport getTechnicalSpecificationInstanceReport() {
    return technicalSpecificationInstanceReport;
  }

  public void setTechnicalSpecificationInstanceReport(BQTechnicalSpecificationRetrieveInputModelTechnicalSpecificationInstanceReport technicalSpecificationInstanceReport) {
    this.technicalSpecificationInstanceReport = technicalSpecificationInstanceReport;
  }


  /**
   * Get technicalSpecificationInstanceAnalysis
   * @return technicalSpecificationInstanceAnalysis
  **/

  public BQTechnicalSpecificationRetrieveInputModelTechnicalSpecificationInstanceAnalysis getTechnicalSpecificationInstanceAnalysis() {
    return technicalSpecificationInstanceAnalysis;
  }

  public void setTechnicalSpecificationInstanceAnalysis(BQTechnicalSpecificationRetrieveInputModelTechnicalSpecificationInstanceAnalysis technicalSpecificationInstanceAnalysis) {
    this.technicalSpecificationInstanceAnalysis = technicalSpecificationInstanceAnalysis;
  }


}

