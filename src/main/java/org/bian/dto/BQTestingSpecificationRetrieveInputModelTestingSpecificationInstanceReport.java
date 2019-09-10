package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTestingSpecificationRetrieveInputModelTestingSpecificationInstanceReport
 */
public class BQTestingSpecificationRetrieveInputModelTestingSpecificationInstanceReport   {
  private String testingSpecificationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return testingSpecificationInstanceReportReference
  **/

  public String getTestingSpecificationInstanceReportReference() {
    return testingSpecificationInstanceReportReference;
  }

  public void setTestingSpecificationInstanceReportReference(String testingSpecificationInstanceReportReference) {
    this.testingSpecificationInstanceReportReference = testingSpecificationInstanceReportReference;
  }


}

