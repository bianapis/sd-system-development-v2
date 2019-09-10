package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTechnicalSpecificationExchangeOutputModel
 */
public class BQTechnicalSpecificationExchangeOutputModel   {
  private String technicalSpecificationExchangeActionTaskReference = null;

  private Object technicalSpecificationExchangeActionTaskRecord = null;

  private String technicalSpecificationExchangeActionResponse = null;

  private String technicalSpecificationInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Technical Specification instance exchange service call 
   * @return technicalSpecificationExchangeActionTaskReference
  **/

  public String getTechnicalSpecificationExchangeActionTaskReference() {
    return technicalSpecificationExchangeActionTaskReference;
  }

  public void setTechnicalSpecificationExchangeActionTaskReference(String technicalSpecificationExchangeActionTaskReference) {
    this.technicalSpecificationExchangeActionTaskReference = technicalSpecificationExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return technicalSpecificationExchangeActionTaskRecord
  **/

  public Object getTechnicalSpecificationExchangeActionTaskRecord() {
    return technicalSpecificationExchangeActionTaskRecord;
  }

  public void setTechnicalSpecificationExchangeActionTaskRecord(Object technicalSpecificationExchangeActionTaskRecord) {
    this.technicalSpecificationExchangeActionTaskRecord = technicalSpecificationExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return technicalSpecificationExchangeActionResponse
  **/

  public String getTechnicalSpecificationExchangeActionResponse() {
    return technicalSpecificationExchangeActionResponse;
  }

  public void setTechnicalSpecificationExchangeActionResponse(String technicalSpecificationExchangeActionResponse) {
    this.technicalSpecificationExchangeActionResponse = technicalSpecificationExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Technical Specification instance (e.g. accepted, rejected, verified) 
   * @return technicalSpecificationInstanceStatus
  **/

  public String getTechnicalSpecificationInstanceStatus() {
    return technicalSpecificationInstanceStatus;
  }

  public void setTechnicalSpecificationInstanceStatus(String technicalSpecificationInstanceStatus) {
    this.technicalSpecificationInstanceStatus = technicalSpecificationInstanceStatus;
  }


}

