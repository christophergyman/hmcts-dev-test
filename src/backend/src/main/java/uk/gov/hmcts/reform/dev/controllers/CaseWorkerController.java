package uk.gov.hmcts.reform.dev.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import uk.gov.hmcts.reform.dev.models.CaseWorker;

import static org.springframework.http.ResponseEntity.ok;

@RestController
public class CaseWorkerController {

    @GetMapping(value = "/createCaseworker", produces = "application/json")
    public ResponseEntity<String> createCaseWorker(
            @RequestParam int id,
            @RequestParam String firstName,
            @RequestParam String task) {

        CaseWorker newCaseWorker = new CaseWorker(id, firstName, task);

        // todo: need to add caseworker to CaseWorkerService

        return ok(String.format("ID: %d\nName: %s\nTask: %s", newCaseWorker.getId(), newCaseWorker.getName(),
                newCaseWorker.getTasks()));
    }
}
