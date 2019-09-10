package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRITSystemDevelopmentProjectExchangeInputModelITSystemDevelopmentProjectExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQUsageSpecificationExchangeInputModel
 */
public class BQUsageSpecificationExchangeInputModel   {
  private String iTSystemDevelopmentProjectInstanceReference = null;

  private String usageSpecificationInstanceReference = null;

  private Object usageSpecificationExchangeActionTaskRecord = null;

  private CRITSystemDevelopmentProjectExchangeInputModelITSystemDevelopmentProjectExchangeActionRequest usageSpecificationExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Usage Specification instance 
   * @return usageSpecificationInstanceReference
  **/

  public String getUsageSpecificationInstanceReference() {
    return usageSpecificationInstanceReference;
  }

  public void setUsageSpecificationInstanceReference(String usageSpecificationInstanceReference) {
    this.usageSpecificationInstanceReference = usageSpecificationInstanceReference;
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
   * Get usageSpecificationExchangeActionRequest
   * @return usageSpecificationExchangeActionRequest
  **/

  public CRITSystemDevelopmentProjectExchangeInputModelITSystemDevelopmentProjectExchangeActionRequest getUsageSpecificationExchangeActionRequest() {
    return usageSpecificationExchangeActionRequest;
  }

  public void setUsageSpecificationExchangeActionRequest(CRITSystemDevelopmentProjectExchangeInputModelITSystemDevelopmentProjectExchangeActionRequest usageSpecificationExchangeActionRequest) {
    this.usageSpecificationExchangeActionRequest = usageSpecificationExchangeActionRequest;
  }


}

