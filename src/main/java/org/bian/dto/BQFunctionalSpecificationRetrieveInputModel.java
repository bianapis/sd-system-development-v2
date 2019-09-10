package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFunctionalSpecificationRetrieveInputModelFunctionalSpecificationInstanceAnalysis;
import org.bian.dto.BQFunctionalSpecificationRetrieveInputModelFunctionalSpecificationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFunctionalSpecificationRetrieveInputModel
 */
public class BQFunctionalSpecificationRetrieveInputModel   {
  private Object functionalSpecificationRetrieveActionTaskRecord = null;

  private String functionalSpecificationRetrieveActionRequest = null;

  private BQFunctionalSpecificationRetrieveInputModelFunctionalSpecificationInstanceReport functionalSpecificationInstanceReport = null;

  private BQFunctionalSpecificationRetrieveInputModelFunctionalSpecificationInstanceAnalysis functionalSpecificationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return functionalSpecificationRetrieveActionTaskRecord
  **/

  public Object getFunctionalSpecificationRetrieveActionTaskRecord() {
    return functionalSpecificationRetrieveActionTaskRecord;
  }

  public void setFunctionalSpecificationRetrieveActionTaskRecord(Object functionalSpecificationRetrieveActionTaskRecord) {
    this.functionalSpecificationRetrieveActionTaskRecord = functionalSpecificationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return functionalSpecificationRetrieveActionRequest
  **/

  public String getFunctionalSpecificationRetrieveActionRequest() {
    return functionalSpecificationRetrieveActionRequest;
  }

  public void setFunctionalSpecificationRetrieveActionRequest(String functionalSpecificationRetrieveActionRequest) {
    this.functionalSpecificationRetrieveActionRequest = functionalSpecificationRetrieveActionRequest;
  }


  /**
   * Get functionalSpecificationInstanceReport
   * @return functionalSpecificationInstanceReport
  **/

  public BQFunctionalSpecificationRetrieveInputModelFunctionalSpecificationInstanceReport getFunctionalSpecificationInstanceReport() {
    return functionalSpecificationInstanceReport;
  }

  public void setFunctionalSpecificationInstanceReport(BQFunctionalSpecificationRetrieveInputModelFunctionalSpecificationInstanceReport functionalSpecificationInstanceReport) {
    this.functionalSpecificationInstanceReport = functionalSpecificationInstanceReport;
  }


  /**
   * Get functionalSpecificationInstanceAnalysis
   * @return functionalSpecificationInstanceAnalysis
  **/

  public BQFunctionalSpecificationRetrieveInputModelFunctionalSpecificationInstanceAnalysis getFunctionalSpecificationInstanceAnalysis() {
    return functionalSpecificationInstanceAnalysis;
  }

  public void setFunctionalSpecificationInstanceAnalysis(BQFunctionalSpecificationRetrieveInputModelFunctionalSpecificationInstanceAnalysis functionalSpecificationInstanceAnalysis) {
    this.functionalSpecificationInstanceAnalysis = functionalSpecificationInstanceAnalysis;
  }


}

