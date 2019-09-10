package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTestingSpecificationRequestInputModelTestingSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTestingSpecificationRequestOutputModel
 */
public class BQTestingSpecificationRequestOutputModel   {
  private BQTestingSpecificationRequestInputModelTestingSpecificationInstanceRecord testingSpecificationInstanceRecord = null;

  private String testingSpecificationRequestActionTaskReference = null;

  private Object testingSpecificationRequestActionTaskRecord = null;

  private String testingSpecificationRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get testingSpecificationInstanceRecord
   * @return testingSpecificationInstanceRecord
  **/

  public BQTestingSpecificationRequestInputModelTestingSpecificationInstanceRecord getTestingSpecificationInstanceRecord() {
    return testingSpecificationInstanceRecord;
  }

  public void setTestingSpecificationInstanceRecord(BQTestingSpecificationRequestInputModelTestingSpecificationInstanceRecord testingSpecificationInstanceRecord) {
    this.testingSpecificationInstanceRecord = testingSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Testing Specification instance request service call 
   * @return testingSpecificationRequestActionTaskReference
  **/

  public String getTestingSpecificationRequestActionTaskReference() {
    return testingSpecificationRequestActionTaskReference;
  }

  public void setTestingSpecificationRequestActionTaskReference(String testingSpecificationRequestActionTaskReference) {
    this.testingSpecificationRequestActionTaskReference = testingSpecificationRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return testingSpecificationRequestActionTaskRecord
  **/

  public Object getTestingSpecificationRequestActionTaskRecord() {
    return testingSpecificationRequestActionTaskRecord;
  }

  public void setTestingSpecificationRequestActionTaskRecord(Object testingSpecificationRequestActionTaskRecord) {
    this.testingSpecificationRequestActionTaskRecord = testingSpecificationRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Testing Specification service request record 
   * @return testingSpecificationRequestRecordReference
  **/

  public String getTestingSpecificationRequestRecordReference() {
    return testingSpecificationRequestRecordReference;
  }

  public void setTestingSpecificationRequestRecordReference(String testingSpecificationRequestRecordReference) {
    this.testingSpecificationRequestRecordReference = testingSpecificationRequestRecordReference;
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

