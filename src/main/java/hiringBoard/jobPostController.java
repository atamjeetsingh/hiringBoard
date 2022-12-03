package hiringBoard;


import co.pragra.api.JobApi;
import org.openapitools.model.JobPost;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class jobPostController implements JobApi {
    @Override
    public org.springframework.http.ResponseEntity<JobPost> createJob(JobPost jobPost) {
//        return JobApi.super.createJob(jobPost);
        return ResponseEntity.status(201).body(jobPost);
    }

    @Override
    public org.springframework.http.ResponseEntity<JobPost> deleteJobById(Long jobId) {
        return JobApi.super.deleteJobById(jobId);
    }

    @Override
    public org.springframework.http.ResponseEntity<JobPost> findJobById(Long jobId) {
        return JobApi.super.findJobById(jobId);
    }

    @Override
    public org.springframework.http.ResponseEntity<List<JobPost>> findJobs() {
        return JobApi.super.findJobs();
    }

    @Override
    public org.springframework.http.ResponseEntity<JobPost> updateJobPost(JobPost jobPost) {
        return JobApi.super.updateJobPost(jobPost);
    }
}
