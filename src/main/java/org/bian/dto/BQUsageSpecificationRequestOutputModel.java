package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQUsageSpecificationRequestInputModelUsageSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQUsageSpecificationRequestOutputModel
 */
public class BQUsageSpecificationRequestOutputModel   {
  private BQUsageSpecificationRequestInputModelUsageSpecificationInstanceRecord usageSpecificationInstanceRecord = null;

  private String usageSpecificationRequestActionTaskReference = null;

  private Object usageSpecificationRequestActionTaskRecord = null;

  private String usageSpecificationRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get usageSpecificationInstanceRecord
   * @return usageSpecificationInstanceRecord
  **/

  public BQUsageSpecificationRequestInputModelUsageSpecificationInstanceRecord getUsageSpecificationInstanceRecord() {
    return usageSpecificationInstanceRecord;
  }

  public void setUsageSpecificationInstanceRecord(BQUsageSpecificationRequestInputModelUsageSpecificationInstanceRecord usageSpecificationInstanceRecord) {
    this.usageSpecificationInstanceRecord = usageSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Usage Specification instance request service call 
   * @return usageSpecificationRequestActionTaskReference
  **/

  public String getUsageSpecificationRequestActionTaskReference() {
    return usageSpecificationRequestActionTaskReference;
  }

  public void setUsageSpecificationRequestActionTaskReference(String usageSpecificationRequestActionTaskReference) {
    this.usageSpecificationRequestActionTaskReference = usageSpecificationRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return usageSpecificationRequestActionTaskRecord
  **/

  public Object getUsageSpecificationRequestActionTaskRecord() {
    return usageSpecificationRequestActionTaskRecord;
  }

  public void setUsageSpecificationRequestActionTaskRecord(Object usageSpecificationRequestActionTaskRecord) {
    this.usageSpecificationRequestActionTaskRecord = usageSpecificationRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Usage Specification service request record 
   * @return usageSpecificationRequestRecordReference
  **/

  public String getUsageSpecificationRequestRecordReference() {
    return usageSpecificationRequestRecordReference;
  }

  public void setUsageSpecificationRequestRecordReference(String usageSpecificationRequestRecordReference) {
    this.usageSpecificationRequestRecordReference = usageSpecificationRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

