package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTechnicalSpecificationRetrieveInputModelTechnicalSpecificationInstanceAnalysis
 */
public class BQTechnicalSpecificationRetrieveInputModelTechnicalSpecificationInstanceAnalysis   {
  private String technicalSpecificationInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return technicalSpecificationInstanceAnalysisReference
  **/

  public String getTechnicalSpecificationInstanceAnalysisReference() {
    return technicalSpecificationInstanceAnalysisReference;
  }

  public void setTechnicalSpecificationInstanceAnalysisReference(String technicalSpecificationInstanceAnalysisReference) {
    this.technicalSpecificationInstanceAnalysisReference = technicalSpecificationInstanceAnalysisReference;
  }


}

