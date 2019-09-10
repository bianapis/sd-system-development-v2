package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFunctionalSpecificationExchangeOutputModel
 */
public class BQFunctionalSpecificationExchangeOutputModel   {
  private String functionalSpecificationExchangeActionTaskReference = null;

  private Object functionalSpecificationExchangeActionTaskRecord = null;

  private String functionalSpecificationExchangeActionResponse = null;

  private String functionalSpecificationInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Functional Specification instance exchange service call 
   * @return functionalSpecificationExchangeActionTaskReference
  **/

  public String getFunctionalSpecificationExchangeActionTaskReference() {
    return functionalSpecificationExchangeActionTaskReference;
  }

  public void setFunctionalSpecificationExchangeActionTaskReference(String functionalSpecificationExchangeActionTaskReference) {
    this.functionalSpecificationExchangeActionTaskReference = functionalSpecificationExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return functionalSpecificationExchangeActionTaskRecord
  **/

  public Object getFunctionalSpecificationExchangeActionTaskRecord() {
    return functionalSpecificationExchangeActionTaskRecord;
  }

  public void setFunctionalSpecificationExchangeActionTaskRecord(Object functionalSpecificationExchangeActionTaskRecord) {
    this.functionalSpecificationExchangeActionTaskRecord = functionalSpecificationExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return functionalSpecificationExchangeActionResponse
  **/

  public String getFunctionalSpecificationExchangeActionResponse() {
    return functionalSpecificationExchangeActionResponse;
  }

  public void setFunctionalSpecificationExchangeActionResponse(String functionalSpecificationExchangeActionResponse) {
    this.functionalSpecificationExchangeActionResponse = functionalSpecificationExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Functional Specification instance (e.g. accepted, rejected, verified) 
   * @return functionalSpecificationInstanceStatus
  **/

  public String getFunctionalSpecificationInstanceStatus() {
    return functionalSpecificationInstanceStatus;
  }

  public void setFunctionalSpecificationInstanceStatus(String functionalSpecificationInstanceStatus) {
    this.functionalSpecificationInstanceStatus = functionalSpecificationInstanceStatus;
  }


}

