package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRITSystemDevelopmentProjectExchangeInputModelITSystemDevelopmentProjectExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQSoftwareandDataspecificationExchangeInputModel
 */
public class BQSoftwareandDataspecificationExchangeInputModel   {
  private String iTSystemDevelopmentProjectInstanceReference = null;

  private String softwareandDataspecificationInstanceReference = null;

  private Object softwareandDataspecificationExchangeActionTaskRecord = null;

  private CRITSystemDevelopmentProjectExchangeInputModelITSystemDevelopmentProjectExchangeActionRequest softwareandDataspecificationExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent IT System Development Project instance 
   * @return iTSystemDevelopmentProjectInstanceReference
  **/

  public String getITSystemDevelopmentProjectInstanceReference() {
    return iTSystemDevelopmentProjectInstanceReference;
  }

  public void setITSystemDevelopmentProjectInstanceReference(String iTSystemDevelopmentProjectInstanceReference) {
    this.iTSystemDevelopmentProjectInstanceReference = iTSystemDevelopmentProjectInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Software and Data specification instance 
   * @return softwareandDataspecificationInstanceReference
  **/

  public String getSoftwareandDataspecificationInstanceReference() {
    return softwareandDataspecificationInstanceReference;
  }

  public void setSoftwareandDataspecificationInstanceReference(String softwareandDataspecificationInstanceReference) {
    this.softwareandDataspecificationInstanceReference = softwareandDataspecificationInstanceReference;
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
   * Get softwareandDataspecificationExchangeActionRequest
   * @return softwareandDataspecificationExchangeActionRequest
  **/

  public CRITSystemDevelopmentProjectExchangeInputModelITSystemDevelopmentProjectExchangeActionRequest getSoftwareandDataspecificationExchangeActionRequest() {
    return softwareandDataspecificationExchangeActionRequest;
  }

  public void setSoftwareandDataspecificationExchangeActionRequest(CRITSystemDevelopmentProjectExchangeInputModelITSystemDevelopmentProjectExchangeActionRequest softwareandDataspecificationExchangeActionRequest) {
    this.softwareandDataspecificationExchangeActionRequest = softwareandDataspecificationExchangeActionRequest;
  }


}

