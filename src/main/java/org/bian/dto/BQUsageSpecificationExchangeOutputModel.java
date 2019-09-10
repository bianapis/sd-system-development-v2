package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQUsageSpecificationExchangeOutputModel
 */
public class BQUsageSpecificationExchangeOutputModel   {
  private String usageSpecificationExchangeActionTaskReference = null;

  private Object usageSpecificationExchangeActionTaskRecord = null;

  private String usageSpecificationExchangeActionResponse = null;

  private String usageSpecificationInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Usage Specification instance exchange service call 
   * @return usageSpecificationExchangeActionTaskReference
  **/

  public String getUsageSpecificationExchangeActionTaskReference() {
    return usageSpecificationExchangeActionTaskReference;
  }

  public void setUsageSpecificationExchangeActionTaskReference(String usageSpecificationExchangeActionTaskReference) {
    this.usageSpecificationExchangeActionTaskReference = usageSpecificationExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return usageSpecificationExchangeActionTaskRecord
  **/

  public Object getUsageSpecificationExchangeActionTaskRecord() {
    return usageSpecificationExchangeActionTaskRecord;
  }

  public void setUsageSpecificationExchangeActionTaskRecord(Object usageSpecificationExchangeActionTaskRecord) {
    this.usageSpecificationExchangeActionTaskRecord = usageSpecificationExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return usageSpecificationExchangeActionResponse
  **/

  public String getUsageSpecificationExchangeActionResponse() {
    return usageSpecificationExchangeActionResponse;
  }

  public void setUsageSpecificationExchangeActionResponse(String usageSpecificationExchangeActionResponse) {
    this.usageSpecificationExchangeActionResponse = usageSpecificationExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Usage Specification instance (e.g. accepted, rejected, verified) 
   * @return usageSpecificationInstanceStatus
  **/

  public String getUsageSpecificationInstanceStatus() {
    return usageSpecificationInstanceStatus;
  }

  public void setUsageSpecificationInstanceStatus(String usageSpecificationInstanceStatus) {
    this.usageSpecificationInstanceStatus = usageSpecificationInstanceStatus;
  }


}

