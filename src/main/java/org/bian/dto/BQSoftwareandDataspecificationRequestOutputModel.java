package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSoftwareandDataspecificationRequestInputModelSoftwareandDataSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQSoftwareandDataspecificationRequestOutputModel
 */
public class BQSoftwareandDataspecificationRequestOutputModel   {
  private BQSoftwareandDataspecificationRequestInputModelSoftwareandDataSpecificationInstanceRecord softwareandDataSpecificationInstanceRecord = null;

  private String softwareandDataspecificationRequestActionTaskReference = null;

  private Object softwareandDataspecificationRequestActionTaskRecord = null;

  private String softwareandDataspecificationRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get softwareandDataSpecificationInstanceRecord
   * @return softwareandDataSpecificationInstanceRecord
  **/

  public BQSoftwareandDataspecificationRequestInputModelSoftwareandDataSpecificationInstanceRecord getSoftwareandDataSpecificationInstanceRecord() {
    return softwareandDataSpecificationInstanceRecord;
  }

  public void setSoftwareandDataSpecificationInstanceRecord(BQSoftwareandDataspecificationRequestInputModelSoftwareandDataSpecificationInstanceRecord softwareandDataSpecificationInstanceRecord) {
    this.softwareandDataSpecificationInstanceRecord = softwareandDataSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Software and Data specification instance request service call 
   * @return softwareandDataspecificationRequestActionTaskReference
  **/

  public String getSoftwareandDataspecificationRequestActionTaskReference() {
    return softwareandDataspecificationRequestActionTaskReference;
  }

  public void setSoftwareandDataspecificationRequestActionTaskReference(String softwareandDataspecificationRequestActionTaskReference) {
    this.softwareandDataspecificationRequestActionTaskReference = softwareandDataspecificationRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return softwareandDataspecificationRequestActionTaskRecord
  **/

  public Object getSoftwareandDataspecificationRequestActionTaskRecord() {
    return softwareandDataspecificationRequestActionTaskRecord;
  }

  public void setSoftwareandDataspecificationRequestActionTaskRecord(Object softwareandDataspecificationRequestActionTaskRecord) {
    this.softwareandDataspecificationRequestActionTaskRecord = softwareandDataspecificationRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Software and Data specification service request record 
   * @return softwareandDataspecificationRequestRecordReference
  **/

  public String getSoftwareandDataspecificationRequestRecordReference() {
    return softwareandDataspecificationRequestRecordReference;
  }

  public void setSoftwareandDataspecificationRequestRecordReference(String softwareandDataspecificationRequestRecordReference) {
    this.softwareandDataspecificationRequestRecordReference = softwareandDataspecificationRequestRecordReference;
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

