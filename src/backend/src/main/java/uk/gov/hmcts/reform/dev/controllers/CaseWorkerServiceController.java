package uk.gov.hmcts.reform.dev.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import uk.gov.hmcts.reform.dev.models.CaseWorker;
import uk.gov.hmcts.reform.dev.services.CaseWorkerService;

import static org.springframework.http.ResponseEntity.ok;

@RestController
public class CaseWorkerServiceController {

    private final CaseWorkerService caseWorkerService;

    // Constructor injection
    public CaseWorkerServiceController(CaseWorkerService caseWorkerService) {
        this.caseWorkerService = caseWorkerService;
    }

    // add new caseworker to the caseworker service
    @GetMapping(value = "/addCaseWorker", produces = "application/json")
    public ResponseEntity<String> addCaseWorker(
            @RequestParam int id,
            @RequestParam String firstName,
            @RequestParam String task) {

        CaseWorker newCaseWorker = new CaseWorker(id, firstName, task);
        caseWorkerService.addCaseWorker(newCaseWorker);
        return ok("Caseworker added scucessfully");
    }

    // gets specific CaseWorker from the CaseWorkerService
    @GetMapping(value = "/getCaseWorker", produces = "application/json")
    public ResponseEntity<String> getCaseWorker(@RequestParam int id) {
        CaseWorker caseWorker = caseWorkerService.getCaseWorker(id);
        return ok(String.format("ID: %d\nName: %s\nTask: %s", caseWorker.getId(), caseWorker.getName(),
                caseWorker.getTasks()));
    }
}
