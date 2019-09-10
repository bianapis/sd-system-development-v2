package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFunctionalSpecificationRetrieveInputModelFunctionalSpecificationInstanceReport
 */
public class BQFunctionalSpecificationRetrieveInputModelFunctionalSpecificationInstanceReport   {
  private String functionalSpecificationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return functionalSpecificationInstanceReportReference
  **/

  public String getFunctionalSpecificationInstanceReportReference() {
    return functionalSpecificationInstanceReportReference;
  }

  public void setFunctionalSpecificationInstanceReportReference(String functionalSpecificationInstanceReportReference) {
    this.functionalSpecificationInstanceReportReference = functionalSpecificationInstanceReportReference;
  }


}

