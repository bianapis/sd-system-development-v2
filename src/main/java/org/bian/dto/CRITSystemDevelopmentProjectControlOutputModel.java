package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRITSystemDevelopmentProjectControlOutputModel
 */
public class CRITSystemDevelopmentProjectControlOutputModel   {
  private String iTSystemDevelopmentProjectControlActionTaskReference = null;

  private Object iTSystemDevelopmentProjectControlActionTaskRecord = null;

  private String iTSystemDevelopmentProjectControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a IT System Development Project instance control processing service call 
   * @return iTSystemDevelopmentProjectControlActionTaskReference
  **/

  public String getITSystemDevelopmentProjectControlActionTaskReference() {
    return iTSystemDevelopmentProjectControlActionTaskReference;
  }
 
  @JsonProperty("iTSystemDevelopmentProjectControlActionTaskReference")
  public void setITSystemDevelopmentProjectControlActionTaskReference(String iTSystemDevelopmentProjectControlActionTaskReference) {
    this.iTSystemDevelopmentProjectControlActionTaskReference = iTSystemDevelopmentProjectControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return iTSystemDevelopmentProjectControlActionTaskRecord
  **/

  public Object getITSystemDevelopmentProjectControlActionTaskRecord() {
    return iTSystemDevelopmentProjectControlActionTaskRecord;
  }
   @JsonProperty("iTSystemDevelopmentProjectControlActionTaskRecord")
  public void setITSystemDevelopmentProjectControlActionTaskRecord(Object iTSystemDevelopmentProjectControlActionTaskRecord) {
    this.iTSystemDevelopmentProjectControlActionTaskRecord = iTSystemDevelopmentProjectControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return iTSystemDevelopmentProjectControlActionResponse
  **/

  public String getITSystemDevelopmentProjectControlActionResponse() {
    return iTSystemDevelopmentProjectControlActionResponse;
  }
   
  @JsonProperty("iTSystemDevelopmentProjectControlActionResponse")
  public void setITSystemDevelopmentProjectControlActionResponse(String iTSystemDevelopmentProjectControlActionResponse) {
    this.iTSystemDevelopmentProjectControlActionResponse = iTSystemDevelopmentProjectControlActionResponse;
  }


}

