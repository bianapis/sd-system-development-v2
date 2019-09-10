package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQUsageSpecificationUpdateInputModelUsageSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQUsageSpecificationUpdateInputModel
 */
public class BQUsageSpecificationUpdateInputModel   {
  private String iTSystemDevelopmentProjectInstanceReference = null;

  private String usageSpecificationInstanceReference = null;

  private BQUsageSpecificationUpdateInputModelUsageSpecificationInstanceRecord usageSpecificationInstanceRecord = null;

  private Object usageSpecificationUpdateActionTaskRecord = null;

  private String usageSpecificationUpdateActionRequest = null;


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
   * Get usageSpecificationInstanceRecord
   * @return usageSpecificationInstanceRecord
  **/

  public BQUsageSpecificationUpdateInputModelUsageSpecificationInstanceRecord getUsageSpecificationInstanceRecord() {
    return usageSpecificationInstanceRecord;
  }

  public void setUsageSpecificationInstanceRecord(BQUsageSpecificationUpdateInputModelUsageSpecificationInstanceRecord usageSpecificationInstanceRecord) {
    this.usageSpecificationInstanceRecord = usageSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return usageSpecificationUpdateActionTaskRecord
  **/

  public Object getUsageSpecificationUpdateActionTaskRecord() {
    return usageSpecificationUpdateActionTaskRecord;
  }

  public void setUsageSpecificationUpdateActionTaskRecord(Object usageSpecificationUpdateActionTaskRecord) {
    this.usageSpecificationUpdateActionTaskRecord = usageSpecificationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return usageSpecificationUpdateActionRequest
  **/

  public String getUsageSpecificationUpdateActionRequest() {
    return usageSpecificationUpdateActionRequest;
  }

  public void setUsageSpecificationUpdateActionRequest(String usageSpecificationUpdateActionRequest) {
    this.usageSpecificationUpdateActionRequest = usageSpecificationUpdateActionRequest;
  }


}

