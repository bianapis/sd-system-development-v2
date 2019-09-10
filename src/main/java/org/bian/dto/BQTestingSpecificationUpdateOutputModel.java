package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTestingSpecificationUpdateInputModelTestingSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTestingSpecificationUpdateOutputModel
 */
public class BQTestingSpecificationUpdateOutputModel   {
  private BQTestingSpecificationUpdateInputModelTestingSpecificationInstanceRecord testingSpecificationInstanceRecord = null;

  private String testingSpecificationUpdateActionTaskReference = null;

  private Object testingSpecificationUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get testingSpecificationInstanceRecord
   * @return testingSpecificationInstanceRecord
  **/

  public BQTestingSpecificationUpdateInputModelTestingSpecificationInstanceRecord getTestingSpecificationInstanceRecord() {
    return testingSpecificationInstanceRecord;
  }

  public void setTestingSpecificationInstanceRecord(BQTestingSpecificationUpdateInputModelTestingSpecificationInstanceRecord testingSpecificationInstanceRecord) {
    this.testingSpecificationInstanceRecord = testingSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return testingSpecificationUpdateActionTaskReference
  **/

  public String getTestingSpecificationUpdateActionTaskReference() {
    return testingSpecificationUpdateActionTaskReference;
  }

  public void setTestingSpecificationUpdateActionTaskReference(String testingSpecificationUpdateActionTaskReference) {
    this.testingSpecificationUpdateActionTaskReference = testingSpecificationUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return testingSpecificationUpdateActionTaskRecord
  **/

  public Object getTestingSpecificationUpdateActionTaskRecord() {
    return testingSpecificationUpdateActionTaskRecord;
  }

  public void setTestingSpecificationUpdateActionTaskRecord(Object testingSpecificationUpdateActionTaskRecord) {
    this.testingSpecificationUpdateActionTaskRecord = testingSpecificationUpdateActionTaskRecord;
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

