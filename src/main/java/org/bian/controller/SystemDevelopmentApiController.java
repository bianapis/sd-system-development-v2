/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Develop;

@BianRestController
public class SystemDevelopmentApiController {

	@Autowired
	SystemDevelopmentApiService service;
	
	@Develop.Activate
	public BianResponse<SDSystemDevelopmentActivateOutputModel> activate(@RequestBody BianRequest<SDSystemDevelopmentActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@BQ("functionalspecification")
	@Develop.Capture
	public BianResponse<BQFunctionalSpecificationCaptureOutputModel> captureFunctionalspecification(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFunctionalSpecificationCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureFunctionalspecification(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("softwareanddataspecification")
	@Develop.Capture
	public BianResponse<BQSoftwareandDataspecificationCaptureOutputModel> captureSoftwareanddataspecification(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSoftwareandDataspecificationCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureSoftwareanddataspecification(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("technicalspecification")
	@Develop.Capture
	public BianResponse<BQTechnicalSpecificationCaptureOutputModel> captureTechnicalspecification(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTechnicalSpecificationCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureTechnicalspecification(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("testingspecification")
	@Develop.Capture
	public BianResponse<BQTestingSpecificationCaptureOutputModel> captureTestingspecification(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTestingSpecificationCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureTestingspecification(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("usagespecification")
	@Develop.Capture
	public BianResponse<BQUsageSpecificationCaptureOutputModel> captureUsagespecification(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQUsageSpecificationCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureUsagespecification(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Develop.Configure
	public BianResponse<SDSystemDevelopmentConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDSystemDevelopmentConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Develop.Control
	public BianResponse<CRITSystemDevelopmentProjectControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRITSystemDevelopmentProjectControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Develop.Create
	public BianResponse<CRITSystemDevelopmentProjectCreateOutputModel> create(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRITSystemDevelopmentProjectCreateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.create(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("functionalspecification")
	@Develop.Exchange
	public BianResponse<BQFunctionalSpecificationExchangeOutputModel> exchangeFunctionalspecification(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFunctionalSpecificationExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeFunctionalspecification(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("softwareanddataspecification")
	@Develop.Exchange
	public BianResponse<BQSoftwareandDataspecificationExchangeOutputModel> exchangeSoftwareanddataspecification(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSoftwareandDataspecificationExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeSoftwareanddataspecification(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("technicalspecification")
	@Develop.Exchange
	public BianResponse<BQTechnicalSpecificationExchangeOutputModel> exchangeTechnicalspecification(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTechnicalSpecificationExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeTechnicalspecification(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("testingspecification")
	@Develop.Exchange
	public BianResponse<BQTestingSpecificationExchangeOutputModel> exchangeTestingspecification(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTestingSpecificationExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeTestingspecification(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Develop.Exchange
	public BianResponse<CRITSystemDevelopmentProjectExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRITSystemDevelopmentProjectExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("usagespecification")
	@Develop.Exchange
	public BianResponse<BQUsageSpecificationExchangeOutputModel> exchangeUsagespecification(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQUsageSpecificationExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeUsagespecification(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Develop.Feedback
	public BianResponse<SDSystemDevelopmentFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDSystemDevelopmentFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("functionalspecification")
	@Develop.Request
	public BianResponse<BQFunctionalSpecificationRequestOutputModel> requestFunctionalspecification(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFunctionalSpecificationRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestFunctionalspecification(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("softwareanddataspecification")
	@Develop.Request
	public BianResponse<BQSoftwareandDataspecificationRequestOutputModel> requestSoftwareanddataspecification(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSoftwareandDataspecificationRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestSoftwareanddataspecification(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("technicalspecification")
	@Develop.Request
	public BianResponse<BQTechnicalSpecificationRequestOutputModel> requestTechnicalspecification(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTechnicalSpecificationRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestTechnicalspecification(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("testingspecification")
	@Develop.Request
	public BianResponse<BQTestingSpecificationRequestOutputModel> requestTestingspecification(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTestingSpecificationRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestTestingspecification(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Develop.Request
	public BianResponse<CRITSystemDevelopmentProjectRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRITSystemDevelopmentProjectRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("usagespecification")
	@Develop.Request
	public BianResponse<BQUsageSpecificationRequestOutputModel> requestUsagespecification(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQUsageSpecificationRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestUsagespecification(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("functionalspecification")
	@Develop.Retrieve
	public BianResponse<BQFunctionalSpecificationRetrieveOutputModel> retrieveFunctionalspecification(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFunctionalspecification(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("softwareanddataspecification")
	@Develop.Retrieve
	public BianResponse<BQSoftwareandDataspecificationRetrieveOutputModel> retrieveSoftwareanddataspecification(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveSoftwareanddataspecification(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("technicalspecification")
	@Develop.Retrieve
	public BianResponse<BQTechnicalSpecificationRetrieveOutputModel> retrieveTechnicalspecification(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveTechnicalspecification(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("testingspecification")
	@Develop.Retrieve
	public BianResponse<BQTestingSpecificationRetrieveOutputModel> retrieveTestingspecification(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveTestingspecification(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("usagespecification")
	@Develop.Retrieve
	public BianResponse<BQUsageSpecificationRetrieveOutputModel> retrieveUsagespecification(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveUsagespecification(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Develop.RetrieveSD
	public BianResponse<SDSystemDevelopmentRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Develop.Retrieve
	public BianResponse<CRITSystemDevelopmentProjectRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Develop.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Develop.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Develop.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Develop.Update
	public BianResponse<CRITSystemDevelopmentProjectUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRITSystemDevelopmentProjectUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("functionalspecification")
	@Develop.Update
	public BianResponse<BQFunctionalSpecificationUpdateOutputModel> updateFunctionalspecification(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFunctionalSpecificationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateFunctionalspecification(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("softwareanddataspecification")
	@Develop.Update
	public BianResponse<BQSoftwareandDataspecificationUpdateOutputModel> updateSoftwareanddataspecification(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSoftwareandDataspecificationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateSoftwareanddataspecification(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("technicalspecification")
	@Develop.Update
	public BianResponse<BQTechnicalSpecificationUpdateOutputModel> updateTechnicalspecification(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTechnicalSpecificationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateTechnicalspecification(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("testingspecification")
	@Develop.Update
	public BianResponse<BQTestingSpecificationUpdateOutputModel> updateTestingspecification(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTestingSpecificationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateTestingspecification(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("usagespecification")
	@Develop.Update
	public BianResponse<BQUsageSpecificationUpdateOutputModel> updateUsagespecification(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQUsageSpecificationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateUsagespecification(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
