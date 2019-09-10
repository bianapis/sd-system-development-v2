package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTestingSpecificationExchangeOutputModel
 */
public class BQTestingSpecificationExchangeOutputModel   {
  private String testingSpecificationExchangeActionTaskReference = null;

  private Object testingSpecificationExchangeActionTaskRecord = null;

  private String testingSpecificationExchangeActionResponse = null;

  private String testingSpecificationInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Testing Specification instance exchange service call 
   * @return testingSpecificationExchangeActionTaskReference
  **/

  public String getTestingSpecificationExchangeActionTaskReference() {
    return testingSpecificationExchangeActionTaskReference;
  }

  public void setTestingSpecificationExchangeActionTaskReference(String testingSpecificationExchangeActionTaskReference) {
    this.testingSpecificationExchangeActionTaskReference = testingSpecificationExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return testingSpecificationExchangeActionTaskRecord
  **/

  public Object getTestingSpecificationExchangeActionTaskRecord() {
    return testingSpecificationExchangeActionTaskRecord;
  }

  public void setTestingSpecificationExchangeActionTaskRecord(Object testingSpecificationExchangeActionTaskRecord) {
    this.testingSpecificationExchangeActionTaskRecord = testingSpecificationExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return testingSpecificationExchangeActionResponse
  **/

  public String getTestingSpecificationExchangeActionResponse() {
    return testingSpecificationExchangeActionResponse;
  }

  public void setTestingSpecificationExchangeActionResponse(String testingSpecificationExchangeActionResponse) {
    this.testingSpecificationExchangeActionResponse = testingSpecificationExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Testing Specification instance (e.g. accepted, rejected, verified) 
   * @return testingSpecificationInstanceStatus
  **/

  public String getTestingSpecificationInstanceStatus() {
    return testingSpecificationInstanceStatus;
  }

  public void setTestingSpecificationInstanceStatus(String testingSpecificationInstanceStatus) {
    this.testingSpecificationInstanceStatus = testingSpecificationInstanceStatus;
  }


}

