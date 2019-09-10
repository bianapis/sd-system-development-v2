package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRITSystemDevelopmentProjectExchangeOutputModel
 */
public class CRITSystemDevelopmentProjectExchangeOutputModel   {
  private String iTSystemDevelopmentProjectExchangeActionTaskReference = null;

  private Object iTSystemDevelopmentProjectExchangeActionTaskRecord = null;

  private String iTSystemDevelopmentProjectExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a IT System Development Project instance exchange service call 
   * @return iTSystemDevelopmentProjectExchangeActionTaskReference
  **/

  public String getITSystemDevelopmentProjectExchangeActionTaskReference() {
    return iTSystemDevelopmentProjectExchangeActionTaskReference;
  }
 
  @JsonProperty("iTSystemDevelopmentProjectExchangeActionTaskReference")
  public void setITSystemDevelopmentProjectExchangeActionTaskReference(String iTSystemDevelopmentProjectExchangeActionTaskReference) {
    this.iTSystemDevelopmentProjectExchangeActionTaskReference = iTSystemDevelopmentProjectExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return iTSystemDevelopmentProjectExchangeActionTaskRecord
  **/

  public Object getITSystemDevelopmentProjectExchangeActionTaskRecord() {
    return iTSystemDevelopmentProjectExchangeActionTaskRecord;
  }
   @JsonProperty("iTSystemDevelopmentProjectExchangeActionTaskRecord")
  public void setITSystemDevelopmentProjectExchangeActionTaskRecord(Object iTSystemDevelopmentProjectExchangeActionTaskRecord) {
    this.iTSystemDevelopmentProjectExchangeActionTaskRecord = iTSystemDevelopmentProjectExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return iTSystemDevelopmentProjectExchangeActionResponse
  **/

  public String getITSystemDevelopmentProjectExchangeActionResponse() {
    return iTSystemDevelopmentProjectExchangeActionResponse;
  }
  @JsonProperty("iTSystemDevelopmentProjectExchangeActionResponse")
  public void setITSystemDevelopmentProjectExchangeActionResponse(String iTSystemDevelopmentProjectExchangeActionResponse) {
    this.iTSystemDevelopmentProjectExchangeActionResponse = iTSystemDevelopmentProjectExchangeActionResponse;
  }


}

