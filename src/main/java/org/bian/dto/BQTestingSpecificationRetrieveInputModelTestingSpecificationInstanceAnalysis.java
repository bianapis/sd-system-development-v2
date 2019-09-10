package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTestingSpecificationRetrieveInputModelTestingSpecificationInstanceAnalysis
 */
public class BQTestingSpecificationRetrieveInputModelTestingSpecificationInstanceAnalysis   {
  private String testingSpecificationInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return testingSpecificationInstanceAnalysisReference
  **/

  public String getTestingSpecificationInstanceAnalysisReference() {
    return testingSpecificationInstanceAnalysisReference;
  }

  public void setTestingSpecificationInstanceAnalysisReference(String testingSpecificationInstanceAnalysisReference) {
    this.testingSpecificationInstanceAnalysisReference = testingSpecificationInstanceAnalysisReference;
  }


}

