package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSoftwareandDataspecificationExchangeOutputModel
 */
public class BQSoftwareandDataspecificationExchangeOutputModel   {
  private String softwareandDataspecificationExchangeActionTaskReference = null;

  private Object softwareandDataspecificationExchangeActionTaskRecord = null;

  private String softwareandDataspecificationExchangeActionResponse = null;

  private String softwareandDataspecificationInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Software and Data specification instance exchange service call 
   * @return softwareandDataspecificationExchangeActionTaskReference
  **/

  public String getSoftwareandDataspecificationExchangeActionTaskReference() {
    return softwareandDataspecificationExchangeActionTaskReference;
  }

  public void setSoftwareandDataspecificationExchangeActionTaskReference(String softwareandDataspecificationExchangeActionTaskReference) {
    this.softwareandDataspecificationExchangeActionTaskReference = softwareandDataspecificationExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return softwareandDataspecificationExchangeActionTaskRecord
  **/

  public Object getSoftwareandDataspecificationExchangeActionTaskRecord() {
    return softwareandDataspecificationExchangeActionTaskRecord;
  }

  public void setSoftwareandDataspecificationExchangeActionTaskRecord(Object softwareandDataspecificationExchangeActionTaskRecord) {
    this.softwareandDataspecificationExchangeActionTaskRecord = softwareandDataspecificationExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return softwareandDataspecificationExchangeActionResponse
  **/

  public String getSoftwareandDataspecificationExchangeActionResponse() {
    return softwareandDataspecificationExchangeActionResponse;
  }

  public void setSoftwareandDataspecificationExchangeActionResponse(String softwareandDataspecificationExchangeActionResponse) {
    this.softwareandDataspecificationExchangeActionResponse = softwareandDataspecificationExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Software and Data specification instance (e.g. accepted, rejected, verified) 
   * @return softwareandDataspecificationInstanceStatus
  **/

  public String getSoftwareandDataspecificationInstanceStatus() {
    return softwareandDataspecificationInstanceStatus;
  }

  public void setSoftwareandDataspecificationInstanceStatus(String softwareandDataspecificationInstanceStatus) {
    this.softwareandDataspecificationInstanceStatus = softwareandDataspecificationInstanceStatus;
  }


}

