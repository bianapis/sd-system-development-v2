package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecordSystemDevelopmentImplementationPlanDateType;

import javax.validation.Valid;
  
/**
 * CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecordSystemDevelopmentImplementationPlan
 */
public class CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecordSystemDevelopmentImplementationPlan   {
  private String systemDevelopmentBudget = null;

  private String systemDevelopmentProjectOrganization = null;

  private String systemDevelopmentProjectSchedule = null;

  private CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecordSystemDevelopmentImplementationPlanDateType dateType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The financial considerations for the deployment (includes planning and execution) 
   * @return systemDevelopmentBudget
  **/

  public String getSystemDevelopmentBudget() {
    return systemDevelopmentBudget;
  }

  public void setSystemDevelopmentBudget(String systemDevelopmentBudget) {
    this.systemDevelopmentBudget = systemDevelopmentBudget;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The organizational aspects of the deployment effort (includes planning and execution) 
   * @return systemDevelopmentProjectOrganization
  **/

  public String getSystemDevelopmentProjectOrganization() {
    return systemDevelopmentProjectOrganization;
  }

  public void setSystemDevelopmentProjectOrganization(String systemDevelopmentProjectOrganization) {
    this.systemDevelopmentProjectOrganization = systemDevelopmentProjectOrganization;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The deployment schedule of events, planned and actual (includes planning and execution tasks) 
   * @return systemDevelopmentProjectSchedule
  **/

  public String getSystemDevelopmentProjectSchedule() {
    return systemDevelopmentProjectSchedule;
  }

  public void setSystemDevelopmentProjectSchedule(String systemDevelopmentProjectSchedule) {
    this.systemDevelopmentProjectSchedule = systemDevelopmentProjectSchedule;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecordSystemDevelopmentImplementationPlanDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecordSystemDevelopmentImplementationPlanDateType dateType) {
    this.dateType = dateType;
  }


}

