package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSoftwareandDataspecificationUpdateInputModelSoftwareandDataSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQSoftwareandDataspecificationUpdateOutputModel
 */
public class BQSoftwareandDataspecificationUpdateOutputModel   {
  private BQSoftwareandDataspecificationUpdateInputModelSoftwareandDataSpecificationInstanceRecord softwareandDataSpecificationInstanceRecord = null;

  private String softwareandDataspecificationUpdateActionTaskReference = null;

  private Object softwareandDataspecificationUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get softwareandDataSpecificationInstanceRecord
   * @return softwareandDataSpecificationInstanceRecord
  **/

  public BQSoftwareandDataspecificationUpdateInputModelSoftwareandDataSpecificationInstanceRecord getSoftwareandDataSpecificationInstanceRecord() {
    return softwareandDataSpecificationInstanceRecord;
  }

  public void setSoftwareandDataSpecificationInstanceRecord(BQSoftwareandDataspecificationUpdateInputModelSoftwareandDataSpecificationInstanceRecord softwareandDataSpecificationInstanceRecord) {
    this.softwareandDataSpecificationInstanceRecord = softwareandDataSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return softwareandDataspecificationUpdateActionTaskReference
  **/

  public String getSoftwareandDataspecificationUpdateActionTaskReference() {
    return softwareandDataspecificationUpdateActionTaskReference;
  }

  public void setSoftwareandDataspecificationUpdateActionTaskReference(String softwareandDataspecificationUpdateActionTaskReference) {
    this.softwareandDataspecificationUpdateActionTaskReference = softwareandDataspecificationUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return softwareandDataspecificationUpdateActionTaskRecord
  **/

  public Object getSoftwareandDataspecificationUpdateActionTaskRecord() {
    return softwareandDataspecificationUpdateActionTaskRecord;
  }

  public void setSoftwareandDataspecificationUpdateActionTaskRecord(Object softwareandDataspecificationUpdateActionTaskRecord) {
    this.softwareandDataspecificationUpdateActionTaskRecord = softwareandDataspecificationUpdateActionTaskRecord;
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

