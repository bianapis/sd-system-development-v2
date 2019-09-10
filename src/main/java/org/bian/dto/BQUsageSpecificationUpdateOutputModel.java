package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQUsageSpecificationUpdateInputModelUsageSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQUsageSpecificationUpdateOutputModel
 */
public class BQUsageSpecificationUpdateOutputModel   {
  private BQUsageSpecificationUpdateInputModelUsageSpecificationInstanceRecord usageSpecificationInstanceRecord = null;

  private String usageSpecificationUpdateActionTaskReference = null;

  private Object usageSpecificationUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return usageSpecificationUpdateActionTaskReference
  **/

  public String getUsageSpecificationUpdateActionTaskReference() {
    return usageSpecificationUpdateActionTaskReference;
  }

  public void setUsageSpecificationUpdateActionTaskReference(String usageSpecificationUpdateActionTaskReference) {
    this.usageSpecificationUpdateActionTaskReference = usageSpecificationUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

