package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRITSystemDevelopmentProjectExchangeInputModelITSystemDevelopmentProjectExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRITSystemDevelopmentProjectExchangeInputModel
 */
public class CRITSystemDevelopmentProjectExchangeInputModel   {
  private String systemDevelopmentServicingSessionReference = null;

  private String iTSystemDevelopmentProjectInstanceReference = null;

  private Object iTSystemDevelopmentProjectExchangeActionTaskRecord = null;

  private CRITSystemDevelopmentProjectExchangeInputModelITSystemDevelopmentProjectExchangeActionRequest iTSystemDevelopmentProjectExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return systemDevelopmentServicingSessionReference
  **/

  public String getSystemDevelopmentServicingSessionReference() {
    return systemDevelopmentServicingSessionReference;
  }

  public void setSystemDevelopmentServicingSessionReference(String systemDevelopmentServicingSessionReference) {
    this.systemDevelopmentServicingSessionReference = systemDevelopmentServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the IT System Development Project instance 
   * @return iTSystemDevelopmentProjectInstanceReference
  **/

  public String getITSystemDevelopmentProjectInstanceReference() {
    return iTSystemDevelopmentProjectInstanceReference;
  }

  public void setITSystemDevelopmentProjectInstanceReference(String iTSystemDevelopmentProjectInstanceReference) {
    this.iTSystemDevelopmentProjectInstanceReference = iTSystemDevelopmentProjectInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return iTSystemDevelopmentProjectExchangeActionTaskRecord
  **/

  public Object getITSystemDevelopmentProjectExchangeActionTaskRecord() {
    return iTSystemDevelopmentProjectExchangeActionTaskRecord;
  }

  public void setITSystemDevelopmentProjectExchangeActionTaskRecord(Object iTSystemDevelopmentProjectExchangeActionTaskRecord) {
    this.iTSystemDevelopmentProjectExchangeActionTaskRecord = iTSystemDevelopmentProjectExchangeActionTaskRecord;
  }


  /**
   * Get iTSystemDevelopmentProjectExchangeActionRequest
   * @return iTSystemDevelopmentProjectExchangeActionRequest
  **/

  public CRITSystemDevelopmentProjectExchangeInputModelITSystemDevelopmentProjectExchangeActionRequest getITSystemDevelopmentProjectExchangeActionRequest() {
    return iTSystemDevelopmentProjectExchangeActionRequest;
  }

  public void setITSystemDevelopmentProjectExchangeActionRequest(CRITSystemDevelopmentProjectExchangeInputModelITSystemDevelopmentProjectExchangeActionRequest iTSystemDevelopmentProjectExchangeActionRequest) {
    this.iTSystemDevelopmentProjectExchangeActionRequest = iTSystemDevelopmentProjectExchangeActionRequest;
  }


}

