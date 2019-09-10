package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQUsageSpecificationRequestInputModelUsageSpecificationInstanceRecord;
import org.bian.dto.CRITSystemDevelopmentProjectRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQUsageSpecificationRequestInputModel
 */
public class BQUsageSpecificationRequestInputModel   {
  private String iTSystemDevelopmentProjectInstanceReference = null;

  private String usageSpecificationInstanceReference = null;

  private BQUsageSpecificationRequestInputModelUsageSpecificationInstanceRecord usageSpecificationInstanceRecord = null;

  private Object usageSpecificationRequestActionTaskRecord = null;

  private CRITSystemDevelopmentProjectRequestInputModelRequestRecordType requestRecordType = null;


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

  public BQUsageSpecificationRequestInputModelUsageSpecificationInstanceRecord getUsageSpecificationInstanceRecord() {
    return usageSpecificationInstanceRecord;
  }

  public void setUsageSpecificationInstanceRecord(BQUsageSpecificationRequestInputModelUsageSpecificationInstanceRecord usageSpecificationInstanceRecord) {
    this.usageSpecificationInstanceRecord = usageSpecificationInstanceRecord;
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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRITSystemDevelopmentProjectRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRITSystemDevelopmentProjectRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

