package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTechnicalSpecificationRetrieveInputModelTechnicalSpecificationInstanceReport
 */
public class BQTechnicalSpecificationRetrieveInputModelTechnicalSpecificationInstanceReport   {
  private String technicalSpecificationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return technicalSpecificationInstanceReportReference
  **/

  public String getTechnicalSpecificationInstanceReportReference() {
    return technicalSpecificationInstanceReportReference;
  }

  public void setTechnicalSpecificationInstanceReportReference(String technicalSpecificationInstanceReportReference) {
    this.technicalSpecificationInstanceReportReference = technicalSpecificationInstanceReportReference;
  }


}

